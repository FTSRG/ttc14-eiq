package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.movies.MoviesFactory
import hu.bme.mit.ttc.imdb.queries.Imdb
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.incquery.runtime.api.IncQueryEngine

class Transformation {

	protected Resource r

	extension MoviesFactory = MoviesFactory.eINSTANCE
	extension Imdb = Imdb.instance

	def createCouples() {
		val engine = IncQueryEngine.on(r)
		val coupleMatcher = getPersonsToCouple(engine)
		val commonMoviesMatcher = getCommonMoviesToCouple(engine);

		coupleMatcher.forEachMatch [
			val couple = createCouple()
			couple.setP1(p1)
			couple.setP2(p2)
			var sumRating = 0.0
			val commonMovies = commonMoviesMatcher.allValuesOfm
			for ( m : commonMovies ) {
				couple.commonMovies += m
				sumRating = sumRating + m.rating
			}
			val n = commonMovies.size
			couple.avgRating = sumRating / n
			
			r.contents += couple
		]
	}
	
	def createCliques() {
		val engine = IncQueryEngine.on(r)
		val nextCliquesMatcher = getNextCliques(engine)
		val memberOfGroupMatcher = getMemberOfGroup(engine)

		nextCliquesMatcher.forEachMatch [
			val clique = createClique()
		
			val gPersons = memberOfGroupMatcher.getAllValuesOfp(g)
			
			clique.commonMovies.addAll(g.commonMovies)
			clique.commonMovies.retainAll(p.movies)
			clique.persons.addAll(gPersons)
			clique.persons.add(p)
			
			r.contents += clique
		]
	}
}

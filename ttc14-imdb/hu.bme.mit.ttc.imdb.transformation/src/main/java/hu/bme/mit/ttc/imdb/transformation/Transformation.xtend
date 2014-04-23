package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.movies.Couple
import hu.bme.mit.ttc.imdb.movies.Movie
import hu.bme.mit.ttc.imdb.movies.MoviesFactory
import hu.bme.mit.ttc.imdb.queries.Imdb
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.incquery.runtime.api.IncQueryEngine
import hu.bme.mit.ttc.imdb.movies.Group
import java.util.Collection
import org.eclipse.incquery.runtime.api.GenericPatternGroup
import org.eclipse.incquery.runtime.api.IQuerySpecification
import java.util.HashSet

class Transformation {

	protected Resource r

	extension MoviesFactory = MoviesFactory.eINSTANCE
	extension Imdb = Imdb.instance

	def createCouples() {
		val x = new HashSet<IQuerySpecification<?>>
		x += #{personsToCouple, commonMoviesToCouple, personName}
		val group = new GenericPatternGroup(x)
		
		val engine = IncQueryEngine.on(r)
		group.prepare(engine);
		val coupleMatcher = engine.personsToCouple
		val commonMoviesMatcher = engine.commonMoviesToCouple
		val personNameMatcher = engine.personName

		coupleMatcher.forEachMatch [
			val couple = createCouple()
			
			val p1 = personNameMatcher.getAllValuesOfp(p1name).head
			val p2 = personNameMatcher.getAllValuesOfp(p2name).head
			
			couple.setP1(p1)
			couple.setP2(p2)
			
			val commonMovies = commonMoviesMatcher.getAllValuesOfm(p1name, p2name)
			couple.commonMovies.addAll(commonMovies)
			calculateAvgRating(commonMovies, couple)
			
			r.contents += couple
		]
	}
	
	def calculateAvgRating(Collection<Movie> commonMovies, Group group) {
		var sumRating = 0.0
		
		for ( m : commonMovies ) {
			sumRating = sumRating + m.rating
		}
		val n = commonMovies.size
		group.avgRating = sumRating / n
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
			calculateAvgRating(clique.commonMovies, clique)
			
			clique.persons.addAll(gPersons)
			clique.persons.add(p)
			
			r.contents += clique
		]
	}
}
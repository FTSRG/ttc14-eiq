package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.movies.Clique
import hu.bme.mit.ttc.imdb.movies.ContainedElement
import hu.bme.mit.ttc.imdb.movies.Couple
import hu.bme.mit.ttc.imdb.movies.Group
import hu.bme.mit.ttc.imdb.movies.Movie
import hu.bme.mit.ttc.imdb.movies.MoviesFactory
import hu.bme.mit.ttc.imdb.movies.Person
import hu.bme.mit.ttc.imdb.movies.Root
import hu.bme.mit.ttc.imdb.queries.Imdb
import hu.bme.mit.ttc.imdb.transformation.configuration.BenchmarkResults
import java.util.Collection
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine
import org.eclipse.incquery.runtime.api.IncQueryEngine

class Transformation {

	/**
	 * Initialize the transformation processor on a resource.
	 * The runtime of the transformation steps are logged.
	 * @param r The target resource of the transformation.
	 * @param bmr The benchmark logger.
	 */
	new (Resource r, BenchmarkResults bmr) {
		this.r = r;
		this.bmr = bmr;
		this.root = r.contents.get(0) as Root
	}
	
	protected val BenchmarkResults bmr;
	protected Resource r
	
	////// Resources Management
	protected val Root root;
	/**
	 * Helper function to add elements to the target resource.
	 * @param
	 */
	def addElementToResource(ContainedElement containedElement) {
		root.children.add(containedElement)
	}
	def addElementsToResource(Collection<? extends ContainedElement> containedElements) {
		root.children.addAll(containedElements)
	}
	def getElementsFromResource() {
		root.children
	}
	////////////////////////////
	
	extension MoviesFactory = MoviesFactory.eINSTANCE
	extension Imdb = Imdb.instance

	public def createCouples() {
		val engine = AdvancedIncQueryEngine.createUnmanagedEngine(r)
		
		val coupleMatcher = engine.personsToCouple
		
		val commonMoviesMatcher = engine.commonMoviesToCouple
		
		val personNameMatcher = engine.personName
		
		val newCouples = new LinkedList<Couple>
		coupleMatcher.forEachMatch [
			val couple = createCouple()
			val p1 = personNameMatcher.getAllValuesOfp(p1name).head
			val p2 = personNameMatcher.getAllValuesOfp(p2name).head
			couple.setP1(p1)
			couple.setP2(p2)
			val commonMovies = commonMoviesMatcher.getAllValuesOfm(p1name, p2name)
			couple.commonMovies.addAll(commonMovies)
				
			newCouples += couple
		]
		
		println("# of couples = " + newCouples.size)
		
		engine.dispose

		addElementsToResource(newCouples);
	}

	def topGroupByRating(int size) {
		println("Top-15 by Average Rating")
		println("========================")
		val n = 15;
		
		val engine = IncQueryEngine.on(r)
		
		val coupleWithRatingMatcher = engine.groupSize
		
		val rankedCouples = coupleWithRatingMatcher.getAllValuesOfgroup(size).sort(
			new GroupAVGComparator)

		printCouples(n, rankedCouples)
	}

	def topGroupByCommonMovies(int size) {
		println("Top-15 by Number of Common Movies")
		println("=================================")

		val n = 15;
		val engine = IncQueryEngine.on(r)
		
		val coupleWithRatingMatcher = engine.groupSize
		
		val rankedCouples = coupleWithRatingMatcher.getAllValuesOfgroup(size).sort(
			new GroupSizeComparator
		)

		printCouples(n, rankedCouples)
	}

	def printCouples(int n, List<Group> rankedCouples) {
		(0 .. n - 1).forEach [
			if(it < rankedCouples.size) {
				val c = rankedCouples.get(it);
				println(c.printGroup(it + 1))
			}
		]
	}
	
	def printGroup(Group group, int lineNumber) {
		if(group instanceof Couple) {
			val couple = group as Couple
			return '''«lineNumber». Couple avgRating «group.avgRating», «group.commonMovies.size» movies («couple.p1.name»; «couple.p2.name»)'''
		}
		else {
			val clique = group as Clique
			return '''«lineNumber». «clique.persons.size»-Clique avgRating «group.avgRating», «group.commonMovies.size» movies («
				FOR person : clique.persons SEPARATOR ", "»«person.name»«ENDFOR»)'''
		}
	}
	
	def calculateAvgRatings() {
		getElementsFromResource.filter(typeof(Group)).forEach[x|calculateAvgRating(x.commonMovies, x)]
	}

	protected def calculateAvgRating(Collection<Movie> commonMovies, Group group) {
		var sumRating = 0.0

		for (m : commonMovies) {
			sumRating = sumRating + m.rating
		}
		val n = commonMovies.size
		group.avgRating = sumRating / n
	}

	public def createCliques(int cliques) {
		val engine = AdvancedIncQueryEngine.createUnmanagedEngine(r)
		
		val personMatcher = getPersonName(engine)
		
		var Collection<Clique> newCliques
		
		if(cliques == 3) {
			val clique3 = getPersonsTo3Clique(engine)
			
			newCliques = clique3.allMatches.map[x|generateClique(
				personMatcher.getOneArbitraryMatch(null,x.p1).p,
				personMatcher.getOneArbitraryMatch(null,x.p2).p,
				personMatcher.getOneArbitraryMatch(null,x.p3).p)].toList;			
		}
		else if(cliques == 4) {
			val clique4 = getPersonsTo4Clique(engine)
			
			newCliques = clique4.allMatches.map[x|generateClique(
				personMatcher.getOneArbitraryMatch(null,x.p1).p,
				personMatcher.getOneArbitraryMatch(null,x.p2).p,
				personMatcher.getOneArbitraryMatch(null,x.p3).p,
				personMatcher.getOneArbitraryMatch(null,x.p4).p)].toList;
		}
		else if(cliques == 5) {
			val clique5 = getPersonsTo5Clique(engine)
			
			newCliques = clique5.allMatches.map[x|generateClique(
				personMatcher.getOneArbitraryMatch(null,x.p1).p,
				personMatcher.getOneArbitraryMatch(null,x.p2).p,
				personMatcher.getOneArbitraryMatch(null,x.p3).p,
				personMatcher.getOneArbitraryMatch(null,x.p4).p,
				personMatcher.getOneArbitraryMatch(null,x.p5).p)].toList;
		}
		
		println("# of "+cliques+"-cliques = " + newCliques.size)
		
		engine.dispose
		
		newCliques.forEach[x|x.commonMovies.addAll(x.collectCommonMovies)]
		
		addElementsToResource(newCliques);
	}
	
	protected def generateClique(Person... persons) {
		val c = createClique
		c.persons += persons
		return c
	}
	
	protected def collectCommonMovies(Clique clique) {
		var Set<Movie> commonMovies = null;
		for(personMovies : clique.persons.map[movies]) {
			if(commonMovies == null) {
				commonMovies = personMovies.toSet;
			}
			else {
				commonMovies.retainAll(personMovies)
			}
		}
		return commonMovies
	}
}

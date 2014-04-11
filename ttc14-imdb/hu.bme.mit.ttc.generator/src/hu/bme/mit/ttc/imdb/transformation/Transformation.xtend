package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.movies.MoviesFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.incquery.runtime.api.IncQueryEngineManager
import org.eclipse.incquery.runtime.api.IncQueryEngine
import hu.bme.mit.ttc.imdb.queries.Imdb

class Transformation {

	protected Resource r

	extension MoviesFactory = MoviesFactory.eINSTANCE
	extension Imdb = Imdb.instance
	
	def createCouples() {
		val engine = IncQueryEngine.on(r)
		val coupleMatcher = getCouple(engine)
		
		coupleMatcher.forEachMatch[
			println(it.prettyPrint)
		]
	}
}

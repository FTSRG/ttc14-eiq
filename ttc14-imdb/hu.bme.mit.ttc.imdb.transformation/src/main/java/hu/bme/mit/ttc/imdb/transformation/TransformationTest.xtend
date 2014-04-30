package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.movies.ContainedElement
import hu.bme.mit.ttc.imdb.movies.MoviesFactory
import hu.bme.mit.ttc.imdb.movies.Root
import hu.bme.mit.ttc.imdb.transformation.configuration.BenchmarkResults
import hu.bme.mit.ttc.imdb.transformation.configuration.TransformationConfiguration
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class TransformationTest {

	def xform(TransformationConfiguration config, String name) {
		val bmr = new BenchmarkResults(name, config.first)

		// read instance model
		bmr.startStopper("Load/Generate")
		val model = init(config, bmr)
		bmr.endStopper("Load/Generate")

		// transform model
		bmr.startStopper("Transform")
		model.execute(config, bmr);
		bmr.endStopper("Transform")

		// persist model
		bmr.startStopper("Save")
		model.finalize(config, bmr)
		bmr.endStopper("Save")

		bmr.printResults
	}

	def protected init(TransformationConfiguration config, BenchmarkResults bmr) {
		val instanceModelPath = URI.createFileURI(config.instanceModelPath)

		val ResourceSet rs = new ResourceSetImpl
		val r = rs.getResource(instanceModelPath, true)

		bmr.startStopper("resourceRestructure1")
		val root = MoviesFactory.eINSTANCE.createRoot()

		val c = new ArrayList(r.contents)
		bmr.setName("" + c.size)
		root.children.addAll(c.filter(typeof(ContainedElement)))

		r.contents += root
		bmr.endStopper("resourceRestructure1")

		return r
	}

	// Task dependencies:
	// t2 -> t3 -> et1a 
	//  |       -> et1b
	//  v
	// et2(n) -> et3 -> et4a
	//               -> et4b
	def protected void execute(Resource r, TransformationConfiguration config, BenchmarkResults bmr) {
		val transformation = new Transformation(r, bmr)

		// Couple generation
		if (config.task.contains("[t2]")) { // 2-cliques (t2 and others) 
			bmr.startStopper("[t2]")
			transformation.createCouples()
			bmr.endStopper("[t2]")
		}

		// Average calculation for each groups
		if (config.task.contains("[t3]")) {
			bmr.startStopper("[t3]")
			transformation.calculateAvgRatings
			bmr.endStopper("[t3]")
		}

		// Couple Toplist
		if (config.task.contains("[et1a]")) {
			bmr.startStopper("[et1a]")
			transformation.topGroupByRating(2)
			bmr.endStopper("[et1a]")
		}

		if (config.task.contains("[et1b]")) {
			bmr.startStopper("[et1b]")
			transformation.topGroupByCommonMovies(2)
			bmr.endStopper("[et1b]")
		}

		// Clique generation
		if (config.task.contains("[et2]")) {
			bmr.startStopper("[et2]")
			transformation.createCliques(config.cliques) // n-cliques
			bmr.endStopper("[et2]")
		}

		if (config.task.contains("[et3]")) {
			bmr.startStopper("[et3]")
			transformation.calculateAvgRatings
			bmr.endStopper("[et3]")
		}

		if (config.task.contains("[et4a]")) {
			bmr.startStopper("[et4a]")
			transformation.topGroupByRating(config.cliques)
			bmr.endStopper("[et4a]")
		}

		if (config.task.contains("[et4b]")) {
			bmr.startStopper("[et4b]")
			transformation.topGroupByCommonMovies(config.cliques)
			bmr.endStopper("[et4b]")
		}
	}

	def protected void finalize(Resource r, TransformationConfiguration config, BenchmarkResults bmr) {
		bmr.startStopper("resourceRestructure2")
		val root = r.contents.get(0) as Root
		val children = root.children
		r.contents.remove(root)
		r.contents.addAll(children)
		bmr.endStopper("resourceRestructure2")

		//r.save(emptyMap)
	}
}

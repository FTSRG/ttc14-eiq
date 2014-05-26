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
import hu.bme.mit.ttc.imdb.generator.Generator

class TransformationTest {

	def xform(TransformationConfiguration config, String name) {
		val bmr = new BenchmarkResults(name, config.first)

		// read instance model
		val model = init(config, bmr)

		// transform model
		bmr.startStopper("Transform")
		model.execute(config, bmr);
		bmr.endStopper("Transform")

		bmr.printResults
	}

	def protected init(TransformationConfiguration config, BenchmarkResults bmr) {
		val ResourceSet rs = new ResourceSetImpl
		var Resource r;

		if (config.n == -1) {
			val instanceModelPath = URI.createFileURI(config.instanceModelPath)
			r = rs.getResource(instanceModelPath, true)

			val root = MoviesFactory.eINSTANCE.createRoot()

			val c = new ArrayList(r.contents)

			// bmr.setName("" + c.size)
			root.children.addAll(c.filter(typeof(ContainedElement)))

			r.contents += root

			return r
		} else {
			bmr.startStopper("Generate")
			val instanceModelPath = URI.createFileURI("dummy://synthetic.movies")
			r = rs.createResource(instanceModelPath)

			val root = MoviesFactory.eINSTANCE.createRoot()

			val generator = new Generator
			generator.r = r
			generator.generate(config.n)

			val c = new ArrayList(r.contents)

			// bmr.setName("" + c.size)
			root.children.addAll(c.filter(typeof(ContainedElement)))

			r.contents += root

			bmr.endStopper("Generate")
			return r
		}
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
			transformation.createCouples()
		}

		// Average calculation for each groups
		if (config.task.contains("[t3]")) {
			transformation.calculateAvgRatings
		}

		// Couple Toplist
		if (config.task.contains("[et1a]")) {
			transformation.topGroupByRating(2)
		}

		if (config.task.contains("[et1b]")) {
			transformation.topGroupByCommonMovies(2)
		}

		// Clique generation
		if (config.task.contains("[et2]")) {
			transformation.createCliques(config.cliques) // n-cliques
		}

		if (config.task.contains("[et3]")) {
			transformation.calculateAvgRatings
		}

		if (config.task.contains("[et4a]")) {
			transformation.topGroupByRating(config.cliques)
		}

		if (config.task.contains("[et4b]")) {
			transformation.topGroupByCommonMovies(config.cliques)
		}
	}

	def protected void finalize(Resource r, TransformationConfiguration config, BenchmarkResults bmr) {
		val root = r.contents.get(0) as Root
		val children = root.children
		r.contents.remove(root)
		r.contents.addAll(children)

		if (config.save) {
			r.save(emptyMap)
		}
	}
}

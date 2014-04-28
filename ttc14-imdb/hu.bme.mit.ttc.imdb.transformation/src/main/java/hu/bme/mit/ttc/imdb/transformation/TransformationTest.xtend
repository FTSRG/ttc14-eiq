package hu.bme.mit.ttc.imdb.transformation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import hu.bme.mit.ttc.imdb.util.Configuration
import hu.bme.mit.ttc.imdb.util.BenchmarkResults

class TransformationTest {

// Task dependencies:
// t2 -> t3 -> et1a 
//  |       -> et1b
//  v
// et2(n) -> et3 -> et4a
//               -> et4b
	
	def xform(Configuration config, String name) {
		val bmr = new BenchmarkResults(name)
		
		// read instance model
		bmr.startStopper("Load/Generate")
		val model = init(config,bmr)
		bmr.endStopper("Load/Generate")
		
		// transform model
		bmr.startStopper("Transform")
		model.execute(config,bmr);
		bmr.endStopper("Transform")
		
		// persist model
		bmr.startStopper("Save")
		model.finalize(config,bmr)
		bmr.endStopper("Save")
		
		bmr.printResults
	}
	
	def protected init(Configuration config, BenchmarkResults bmr) {
		val instanceModelPath = URI.createFileURI(config.instanceModelPath)
		
		bmr.printImmediately = config.printImmediately
		val ResourceSet rs = new ResourceSetImpl
		return rs.getResource(instanceModelPath, true)
	}
	
	def protected void execute(Resource r, Configuration config, BenchmarkResults bmr) {
		val transformation = new Transformation(r,bmr)
		
		val calcAVGRating = config.AVGRating
		
		transformation.createCouples(calcAVGRating) // 2-cliques (t2 and others)
		
		if ((config.task == "et2") || (config.task == "et3") || (config.task == "et4a") || (config.task == "et4b"))
				transformation.createCliques(calcAVGRating, config.cliques) // n-cliques
		
		if (config.task == "et1a") // et4a?
			transformation.topCouplesByRating
		if (config.task == "et1b") // et4b?
			transformation.topCouplesByCommonMovies
	}
	
	def protected void finalize(Resource r, Configuration config, BenchmarkResults bmr) {
		r.save(emptyMap)
	}
}

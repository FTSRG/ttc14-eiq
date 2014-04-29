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
		
		// Couple generation
		if(config.task == "t2") // 2-cliques (t2 and others)
			transformation.createCouples()
		
		// Clique generation
		else if ((config.task == "et2") /*|| (config.task == "et3") || (config.task == "et4a") || (config.task == "et4b")*/)
				transformation.createCliques(config.cliques) // n-cliques
		
		// Average calculation for each groups
		else if (config.task == "t3" || config.task == "et3")
			transformation.calculateAvgRatings
		
		// Couple Toplist
		else if (config.task == "et1a") // et4a?
			transformation.topGroupByRating(2)
		else if (config.task == "et4a")
			transformation.topGroupByRating(config.cliques)
		else if (config.task == "et1b") // et4b?
			transformation.topGroupByCommonMovies(2)
		else if (config.task == "et4b")
			transformation.topGroupByCommonMovies(config.cliques)
		else throw new UnsupportedOperationException("Unknown task")
	}
	
	def protected void finalize(Resource r, Configuration config, BenchmarkResults bmr) {
		r.save(emptyMap)
	}
}

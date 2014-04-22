package hu.bme.mit.ttc.imdb.transformation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import hu.bme.mit.ttc.imdb.util.Configuration
import hu.bme.mit.ttc.imdb.util.BenchmarkResults

class TransformationTest {

	ResourceSet rs;
	Resource r;

	@Test
	def void testSyntheticMovies() {
		val config = new Configuration
		config.instanceModel = "hu.bme.mit.ttc.imdb.instance/model/synthetic.movies"
		config.instanceModelURI = URI.createPlatformResourceURI(config.instanceModel, true)
		xform(config)
	}

	
	def xform(Configuration config) {
		val bmr = new BenchmarkResults
		
		// read instance model
		bmr.startStopper
		rs = new ResourceSetImpl;
		r = rs.getResource(config.instanceModelURI, true);
		bmr.setReadTime
		
		// transform model
		bmr.startStopper
		val transformation = new Transformation
		transformation.r = r
		transformation.createCouples // 2-cliques
		transformation.createCliques // 3-cliques
		transformation.createCliques // 4-cliques
		transformation.createCliques // 5-cliques
		bmr.setXFormTime
		
		// persist model
		bmr.startStopper
		r.save(emptyMap)
		bmr.setSaveTime
		
		bmr.printResults
	}

}

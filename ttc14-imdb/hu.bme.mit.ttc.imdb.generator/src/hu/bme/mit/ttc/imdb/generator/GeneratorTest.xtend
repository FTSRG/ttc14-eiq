package hu.bme.mit.ttc.imdb.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import hu.bme.mit.ttc.imdb.util.Configuration

class GeneratorTest {

	ResourceSet rs;
	Resource r;

	@Test
	def test() {
		val config = new Configuration
		config.n = 1
		config.instanceModelURI = URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true)
		generate(config)
	}
	
	def generate(Configuration config) {
		rs = new ResourceSetImpl;
		r = rs.createResource(config.instanceModelURI);
		
		val generator = new Generator
		generator.r = r
		generator.generate(config.n)
		
		r.save(emptyMap)
	}

}

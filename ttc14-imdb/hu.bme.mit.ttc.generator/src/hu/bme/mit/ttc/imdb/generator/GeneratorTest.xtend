package hu.bme.mit.ttc.imdb.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test

class GeneratorTest {

	ResourceSet rs;
	Resource r;

	@Test
	def test() {
		rs = new ResourceSetImpl;
		r = rs.createResource(URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true));
		
		val generator = new Generator
		generator.r = r
		generator.generate(1)
		
		r.save(emptyMap)
	}

}

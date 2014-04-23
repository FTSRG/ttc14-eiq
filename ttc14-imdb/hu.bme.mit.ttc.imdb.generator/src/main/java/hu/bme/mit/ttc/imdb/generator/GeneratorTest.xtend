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

	def generate(Configuration config) {
		val instanceModelURI = URI.createFileURI(config.instanceModelDir + "/synthetic-" + config.n + ".movies")
		
		rs = new ResourceSetImpl
		r = rs.createResource(instanceModelURI)
		
		val generator = new Generator
		generator.r = r
		generator.generate(config.n)
		
		r.save(emptyMap)
	}

}

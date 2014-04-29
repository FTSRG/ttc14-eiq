package hu.bme.mit.ttc.imdb.generator

import hu.bme.mit.ttc.imdb.generator.configuration.GeneratorConfiguration
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class GeneratorTest {

	ResourceSet rs;
	Resource r;

	def generate(GeneratorConfiguration config) {
		val instanceModelURI = URI.createFileURI(config.instanceModelPath)		
		
		rs = new ResourceSetImpl
		r = rs.createResource(instanceModelURI)
		
		val generator = new Generator
		generator.r = r
		generator.generate(config.n)
		
		r.save(emptyMap)
	}

}

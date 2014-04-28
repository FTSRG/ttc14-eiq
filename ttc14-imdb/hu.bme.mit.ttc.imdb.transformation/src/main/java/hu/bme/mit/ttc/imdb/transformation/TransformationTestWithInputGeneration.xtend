package hu.bme.mit.ttc.imdb.transformation

import hu.bme.mit.ttc.imdb.util.Configuration
import hu.bme.mit.ttc.imdb.util.BenchmarkResults
import hu.bme.mit.ttc.imdb.generator.Generator
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

class TransformationTestWithInputGeneration extends TransformationTest{
	
	val int N;
	
	new (int N) {
		this.N = N;
	}
	
	override protected init(Configuration config, BenchmarkResults bmr) {
		val instanceModelURI = URI.createFileURI(config.instanceModelPath)
		
		val rs = new ResourceSetImpl
		val r = rs.createResource(instanceModelURI)
		
		val generator = new Generator
		generator.r = r
		
		generator.generate(N);
		
		return r
	}
	
	override protected finalize(Resource r, Configuration config, BenchmarkResults bmr) {
		
	}
	
}
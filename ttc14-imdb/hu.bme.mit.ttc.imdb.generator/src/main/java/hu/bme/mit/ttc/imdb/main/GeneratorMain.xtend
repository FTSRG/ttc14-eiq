package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.generator.GeneratorTest
import hu.bme.mit.ttc.imdb.generator.configuration.GeneratorConfiguration
import hu.bme.mit.ttc.imdb.movies.MoviesPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

public class GeneratorMain {

	def public static main(String[] args) {
		val config = new GeneratorConfiguration(args);
		//
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new XMIResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new XMIResourceFactoryImplWithUUID());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new Resource.Factory() {
//
//			public Resource createResource(URI arg0) {
//					return new BinaryResourceImpl(arg0);				
//			}
//			
//		});
		MoviesPackage.eINSTANCE.eClass();
		
		
		val generator = new GeneratorTest();
		generator.generate(config);
	}

}

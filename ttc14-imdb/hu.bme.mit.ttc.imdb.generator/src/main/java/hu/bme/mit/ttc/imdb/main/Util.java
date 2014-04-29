package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.movies.MoviesPackage;
//import hu.bme.mit.ttc.imdb.util.XMIResourceFactoryImplWithUUID;


import hu.bme.mit.ttc.imdb.util.XMIResourceFactoryImplWithUUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Util {
	
	public static void registerStandaloneEMFPackages() {
		
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
	}

}
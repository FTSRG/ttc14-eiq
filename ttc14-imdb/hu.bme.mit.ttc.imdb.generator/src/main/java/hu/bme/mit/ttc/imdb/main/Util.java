package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.movies.MoviesPackage;
import hu.bme.mit.ttc.imdb.util.XMIResourceFactoryImplWithUUID;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Util {
	
	public static void registerStandaloneEMFPackages() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new XMIResourceFactoryImplWithUUID());
		MoviesPackage.eINSTANCE.eClass();
	}

}

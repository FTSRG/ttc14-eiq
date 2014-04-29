package hu.bme.mit.ttc.imdb.transformation.configuration

import hu.bme.mit.ttc.imdb.movies.MoviesPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

public class Util {
	
	def public static registerStandaloneEMFPackages() {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl())
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new XMIResourceFactoryImpl())
		MoviesPackage.eINSTANCE.eClass()
	}

}
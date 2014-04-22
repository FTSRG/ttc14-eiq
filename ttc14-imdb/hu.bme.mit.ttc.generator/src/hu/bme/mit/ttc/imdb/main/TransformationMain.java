package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.movies.MoviesPackage;
import hu.bme.mit.ttc.imdb.transformation.TransformationTest;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;

public class TransformationMain {

	public static void main(String[] args) throws ParseException {
		Configuration config = new Configuration(args);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("movies", new XMIResourceFactoryImpl());
		MoviesPackage mp = MoviesPackage.eINSTANCE;
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		TransformationTest tt = new TransformationTest();
		tt.xform(URI.createFileURI(config.getInstanceModel()));
	}

}

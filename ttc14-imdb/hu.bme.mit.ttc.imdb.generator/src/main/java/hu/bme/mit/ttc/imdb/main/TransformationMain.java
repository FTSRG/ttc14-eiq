package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.transformation.TransformationTest;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;

public class TransformationMain {

	public static void main(String[] args) throws ParseException {
		Configuration config = new Configuration(args);
		
		Util.registerStandaloneEMFPackages();
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		TransformationTest tt = new TransformationTest();
		config.setInstanceModelURI(URI.createFileURI(config.getInstanceModel()));
		tt.xform(config);
	}

}

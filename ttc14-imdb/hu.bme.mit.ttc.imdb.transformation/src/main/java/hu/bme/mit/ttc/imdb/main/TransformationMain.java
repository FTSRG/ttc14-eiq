package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.transformation.TransformationTest;
import hu.bme.mit.ttc.imdb.transformation.TransformationTestWithInputGeneration;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;

public class TransformationMain {

	public static void main(String[] args) throws ParseException, InterruptedException {
		Configuration config = new Configuration(args);
		
		Util.registerStandaloneEMFPackages();
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		//*
			TransformationTest tt = new TransformationTest();
			tt.xform(config,"test");
		/*/
		for(int i : new int[]{1000, 2000, 3000, 4000, 5000, 10000, 50000 , 100000, 200000}) {
			//System.out.println();
			TransformationTest tt = new TransformationTestWithInputGeneration(i);
			tt.xform(config,"size="+i);
			
			System.gc();
			Thread.sleep(1000);
		}
		//*/
	}

}

package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;

public class GeneratorMain {

	public static void main(String[] args) throws ParseException {
		Configuration config = new Configuration(args);
		Util.registerStandaloneEMFPackages();
		
//		GeneratorTest generator = new GeneratorTest();
//		config.setInstanceModelURI(URI.createFileURI(config.getInstanceModel()));
//		generator.generate(config);
	}

}

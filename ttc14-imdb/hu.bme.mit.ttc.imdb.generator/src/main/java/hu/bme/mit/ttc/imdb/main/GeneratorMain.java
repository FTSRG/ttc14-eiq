package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.generator.GeneratorTest;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;

public class GeneratorMain {

	public static void main(String[] args) throws ParseException {
		Configuration config = new Configuration(args);
		Util.registerStandaloneEMFPackages();
		
		GeneratorTest generator = new GeneratorTest();
		generator.generate(config);
	}

}

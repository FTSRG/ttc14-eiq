package hu.bme.mit.ttc.imdb.main;

import hu.bme.mit.ttc.imdb.generator.GeneratorTest
import hu.bme.mit.ttc.imdb.util.Configuration

public class GeneratorMain {

	def public static main(String[] args) {
		val config = new Configuration(args);
		Util::registerStandaloneEMFPackages();
		
		val generator = new GeneratorTest();
		generator.generate(config);
	}

}

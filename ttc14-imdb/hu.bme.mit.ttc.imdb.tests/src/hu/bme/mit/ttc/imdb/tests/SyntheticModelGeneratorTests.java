package hu.bme.mit.ttc.imdb.tests;

import hu.bme.mit.ttc.imdb.generator.GeneratorTest;
import hu.bme.mit.ttc.imdb.main.Util;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.junit.Before;
import org.junit.Test;

public class SyntheticModelGeneratorTests {

	GeneratorTest gen = null;
	static final String ARGS = "-instanceModelDir ../hu.bme.mit.ttc.imdb.instance/model -N ";
	
	@Before
	public void setUp() {
		Util.registerStandaloneEMFPackages();
		gen = new GeneratorTest();
	}
	
	@Test
	public void syntethic_gen_1000() throws ParseException {
		String [] arg = (ARGS + "1000").split(" ");
		gen.generate(new Configuration(arg));
	}

	@Test
	public void syntethic_gen_2000() throws ParseException {
		String [] arg = (ARGS + "2000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
	@Test
	public void syntethic_gen_3000() throws ParseException {
		String [] arg = (ARGS + "3000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
	@Test
	public void syntethic_gen_4000() throws ParseException {
		String [] arg = (ARGS + "4000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
	@Test
	public void syntethic_gen_5000() throws ParseException {
		String [] arg = (ARGS + "5000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
	@Test
	public void syntethic_gen_10000() throws ParseException {
		String [] arg = (ARGS + "10000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
	@Test
	public void syntethic_gen_50000() throws ParseException {
		String [] arg = (ARGS + "50000").split(" ");
		gen.generate(new Configuration(arg));
	}
	
//	@Test
//	public void syntethic_gen_100000() throws ParseException {
//		String [] arg = (ARGS + "100000").split(" ");
//		gen.generate(new Configuration(arg));
//	}
//	
//	@Test
//	public void syntethic_gen_200000() throws ParseException {
//		String [] arg = (ARGS + "200000").split(" ");
//		gen.generate(new Configuration(arg));
//	}	
}

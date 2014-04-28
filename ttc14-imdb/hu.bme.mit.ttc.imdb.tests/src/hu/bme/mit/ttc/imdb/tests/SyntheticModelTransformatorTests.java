package hu.bme.mit.ttc.imdb.tests;

import hu.bme.mit.ttc.imdb.main.Util;
import hu.bme.mit.ttc.imdb.transformation.TransformationTest;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.junit.Before;
import org.junit.Test;

public class SyntheticModelTransformatorTests {

	TransformationTest tran = null;
	static final String ARGS = "-instanceModelPath ../hu.bme.mit.ttc.imdb.instance/model/synthetic-%s.movies";
	
	@Before
	public void setUp() {
		Util.registerStandaloneEMFPackages();
		tran = new TransformationTest();
	}
		
	@Test
	public void syntethic_tran_1000() throws ParseException {
		String [] arg = String.format(ARGS, "1000").split(" ");
		tran.xform(new Configuration(arg), "tran1000");
	}

	@Test
	public void syntethic_tran_2000() throws ParseException {
		String [] arg = String.format(ARGS, "2000").split(" ");
		tran.xform(new Configuration(arg), "tran2000");
	}

	@Test
	public void syntethic_tran_3000() throws ParseException {
		String [] arg = String.format(ARGS, "3000").split(" ");
		tran.xform(new Configuration(arg), "tran3000");
	}

	@Test
	public void syntethic_tran_4000() throws ParseException {
		String [] arg = String.format(ARGS, "4000").split(" ");
		tran.xform(new Configuration(arg), "tran4000");
	}

	@Test
	public void syntethic_tran_5000() throws ParseException {
		String [] arg = String.format(ARGS, "5000").split(" ");
		tran.xform(new Configuration(arg), "tran5000");
	}

	@Test
	public void syntethic_tran_10000() throws ParseException {
		String [] arg = String.format(ARGS, "10000").split(" ");
		tran.xform(new Configuration(arg), "tran10000");
	}

	@Test
	public void syntethic_tran_50000() throws ParseException {
		String [] arg = String.format(ARGS, "50000").split(" ");
		tran.xform(new Configuration(arg), "tran50000");
	}

//	@Test
//	public void syntethic_tran_100000() throws ParseException {
//		String [] arg = String.format(ARGS, "100000").split(" ");
//		tran.xform(new Configuration(arg));
//	}
//	
//
//	@Test
//	public void syntethic_tran_200000() throws ParseException {
//		String [] arg = String.format(ARGS, "200000").split(" ");
//		tran.xform(new Configuration(arg));
//	}

}

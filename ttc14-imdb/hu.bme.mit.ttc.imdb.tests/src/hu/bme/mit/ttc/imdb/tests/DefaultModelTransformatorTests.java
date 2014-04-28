package hu.bme.mit.ttc.imdb.tests;

import hu.bme.mit.ttc.imdb.main.Util;
import hu.bme.mit.ttc.imdb.transformation.TransformationTest;
import hu.bme.mit.ttc.imdb.util.Configuration;

import org.apache.commons.cli.ParseException;
import org.junit.Before;
import org.junit.Test;

public class DefaultModelTransformatorTests {

	String[] models = new String[] { "imdb-0005000-49930.movies",
			"imdb-0010000-98168.movies", "imdb-0030000-207420.movies",
			"imdb-0045000-299504.movies", "imdb-0065000-404920.movies",
			"imdb-0085000-499995.movies", "imdb-0130000-709551.movies",
			"imdb-0200000-1004463.movies", "imdb-0340000-1505143.movies",
			"imdb-0495000-2000900.movies", "imdb-0660000-2501893.movies",
			"imdb-all-3257145.movies" };

	TransformationTest tran = null;
	static final String ARGS = "-instanceModelPath ../hu.bme.mit.ttc.imdb.instance/defaultmodel/%s";
	
	@Before
	public void setUp() {
		Util.registerStandaloneEMFPackages();
		tran = new TransformationTest();
	}
	
	@Test
	public void default_tran_0() throws ParseException {
		String [] arg = String.format(ARGS, models[0]).split(" ");
		tran.xform(new Configuration(arg), models[0]);
	}

	@Test
	public void default_tran_1() throws ParseException {
		String [] arg = String.format(ARGS, models[1]).split(" ");
		tran.xform(new Configuration(arg), models[1]);
	}
	
	@Test
	public void default_tran_2() throws ParseException {
		String [] arg = String.format(ARGS, models[2]).split(" ");
		tran.xform(new Configuration(arg), models[2]);
	}
	
	@Test
	public void default_tran_3() throws ParseException {
		String [] arg = String.format(ARGS, models[3]).split(" ");
		tran.xform(new Configuration(arg), models[3]);
	}
	
	@Test
	public void default_tran_4() throws ParseException {
		String [] arg = String.format(ARGS, models[4]).split(" ");
		tran.xform(new Configuration(arg), models[4]);
	}
	
	@Test
	public void default_tran_5() throws ParseException {
		String [] arg = String.format(ARGS, models[5]).split(" ");
		tran.xform(new Configuration(arg), models[5]);
	}
	
	@Test
	public void default_tran_6() throws ParseException {
		String [] arg = String.format(ARGS, models[6]).split(" ");
		tran.xform(new Configuration(arg), models[6]);
	}
	
	@Test
	public void default_tran_7() throws ParseException {
		String [] arg = String.format(ARGS, models[7]).split(" ");
		tran.xform(new Configuration(arg), models[7]);
	}
	
	@Test
	public void default_tran_8() throws ParseException {
		String [] arg = String.format(ARGS, models[8]).split(" ");
		tran.xform(new Configuration(arg), models[8]);
	}
	
	@Test
	public void default_tran_9() throws ParseException {
		String [] arg = String.format(ARGS, models[9]).split(" ");
		tran.xform(new Configuration(arg), models[9]);
	}
	
	@Test
	public void default_tran_10() throws ParseException {
		String [] arg = String.format(ARGS, models[10]).split(" ");
		tran.xform(new Configuration(arg), models[10]);
	}
	
	@Test
	public void default_tran_11() throws ParseException {
		String [] arg = String.format(ARGS, models[11]).split(" ");
		tran.xform(new Configuration(arg), models[11]);
	}
}

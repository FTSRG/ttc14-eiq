package hu.bme.mit.ttc.imdb.util;

import java.util.Arrays;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

public class Configuration {

	protected final Options options = new Options();
	protected final CommandLineParser parser = new PosixParser();
	protected CommandLine cmd;
	protected Integer n;

	protected String instanceModelPath;
	protected String instanceModelDir;

	public Configuration() {
		initOptions();
	}

	public Configuration(String args[]) throws ParseException {
		initOptions();

		if (Arrays.asList(args).contains("-help")) {
			printHelp();
			System.exit(0);
		}

		processArguments(args);
	}

	protected void initOptions() {
		options.addOption("help", false, "displays this text");
		// for the generator
		options.addOption("instanceModelDir", true, "instance model directory");
		options.addOption("N", true, "model size");
		// for the transformation
		options.addOption("instanceModelPath", true, "instance model path");
	}

	protected void processArguments(String[] args) throws ParseException {
		cmd = parser.parse(options, args);

		instanceModelPath = cmd.getOptionValue("instanceModelPath");
		instanceModelDir = cmd.getOptionValue("instanceModelDir");
		
		if (cmd.hasOption("N")) {
			n = new Integer(cmd.getOptionValue("N"));
		}
	}

	// shorthand for generating required options
	protected static Option requiredOption(String name, String description) {
		Option option = new Option(name, true, description);
		option.setRequired(true);
		return option;
	}

	public void printHelp() {
		HelpFormatter formatter = new HelpFormatter();
		formatter.setWidth(120);

		formatter.printHelp("java -jar ttc14-solution.jar [options]",
				"options:", options, "", false);
		System.out.println();
	}

	public Integer getN() {
		return n;
	}
	
	public String getInstanceModelDir() {
		return instanceModelDir;
	}
	
	public String getInstanceModelPath() {
		return instanceModelPath;
	}

}

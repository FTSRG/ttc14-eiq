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

	protected String instanceModel;
	

	public Configuration(String args[]) throws ParseException  {
		initOptions();

		if (Arrays.asList(args).contains("-help")) {
			printHelp();
			System.exit(0);
		}

		processArguments(args);

	}

	protected void initOptions() {
		options.addOption("help", false, "displays this text");
		options.addOption(requiredOption("instanceModel", "instance model as PlatformResourceURI"));
	}

	protected void processArguments(String[] args) throws ParseException {
		cmd = parser.parse(options, args);

		instanceModel = cmd.getOptionValue("instanceModel");
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

		formatter.printHelp("java -jar trainbenchmark-project-jarfile.jar [options]", "options:", options, "", false);
		System.out.println();
	}

	public String getInstanceModel() {
		return instanceModel;
	}


}

package hu.bme.mit.ttc.imdb.generator.configuration;

import java.util.Arrays
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.PosixParser

public class GeneratorConfiguration {

	protected final Options options = new Options()
	protected final CommandLineParser parser = new PosixParser()
	protected CommandLine cmd

	String instanceModelDir
	Integer n

	public new() {
		initOptions()
	}

	public new(String[] args) {
		initOptions()

		if (Arrays.asList(args).contains("-help")) {
			printHelp()
			System.exit(0)
		}

		processArguments(args)
	}

	def protected initOptions() {
		options.addOption("help", false, "displays this text")
		options.addOption("instanceModelDir", true, "instance model directory")
	}

	def protected processArguments(String[] args) {
		cmd = parser.parse(options, args)

		if (cmd.hasOption("instanceModelDir"))
			instanceModelDir = cmd.getOptionValue("instanceModelDir")
		if (cmd.hasOption("N"))
			n = new Integer(cmd.getOptionValue("N"))
	}

	// shorthand for generating required options
	def protected static Option requiredOption(String name, String description) {
		val option = new Option(name, true, description)
		option.setRequired(true)
		return option
	}

	def public void printHelp() {
		val formatter = new HelpFormatter()
		formatter.setWidth(120)

		formatter.printHelp("java -jar ttc14-solution.jar [options]", "options:", options, "", false)
		println
	}

	def public String instanceModelPath() {
		instanceModelDir + "/synthetic-" + n + ".movies"
	}
	
	def public getN() {
		n
	}

}

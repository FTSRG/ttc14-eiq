package hu.bme.mit.ttc.imdb.transformation.configuration

import java.util.Arrays
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.PosixParser

public class TransformationConfiguration {

	protected final Options options = new Options()
	protected final CommandLineParser parser = new PosixParser()
	protected CommandLine cmd

	Integer cliques
	String instanceModelPath
	String task
	boolean first

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

		options.addOption("instanceModelPath", true, "instance model path")
		options.addOption("task", true, "task id: [t2|t3|et1a|et1b|et2|et3|et4a|et4b]")
		options.addOption("cliques", true, "clique size for extension tasks 2-4")
		options.addOption("first", false, "defines if this is the first run (if results header should be generated)")
	}

	def protected processArguments(String[] args) {
		cmd = parser.parse(options, args)

		if (cmd.hasOption("instanceModelPath"))
			instanceModelPath = cmd.getOptionValue("instanceModelPath")
		if (cmd.hasOption("task"))
			task = cmd.getOptionValue("task")
		if (cmd.hasOption("cliques"))
			cliques = new Integer(cmd.getOptionValue("cliques"))
		first = cmd.hasOption("first");		
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

	def public String getInstanceModelPath() {
		instanceModelPath
	}

	def public String getTask() {
		return task
	}

	def public Integer getCliques() {
		return cliques
	}

	def public boolean getAVGRating() {
		if (task.equals("t3") || task.equals("et3") || task.equals("et1a") || task.equals("et4a")) {
			return true
		}
		return false
	}

	def public boolean getFirst() {
		return first
	}	

}

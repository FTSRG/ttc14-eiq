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
	protected Integer cliques;

	protected String instanceModelPath;
	protected String instanceModelDir;
	protected String task;
	
	// extra
	protected boolean printImmediately = false;

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
		options.addOption("task", true, "task id: [t2|t3|et1a|et1b|et2|et3|et4a|et4b]");
		options.addOption("cliques", true, "clique size for extension tasks 2-4");
		
		// extra
		options.addOption("printImmediately", false, "print results printImmediately");
	}

	protected void processArguments(String[] args) throws ParseException {
		cmd = parser.parse(options, args);

		if (cmd.hasOption("instanceModelPath"))
			instanceModelPath = cmd.getOptionValue("instanceModelPath");
		if (cmd.hasOption("instanceModelDir"))
			instanceModelDir = cmd.getOptionValue("instanceModelDir");
		if (cmd.hasOption("task"))
			task = cmd.getOptionValue("task");
		if (cmd.hasOption("N"))
			n = new Integer(cmd.getOptionValue("N"));
		if (cmd.hasOption("cliques"))
			cliques = new Integer(cmd.getOptionValue("cliques"));
		if (cmd.hasOption("printImmediately"))
			printImmediately = true;
		else
			printImmediately = false;
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
		String path;
		if (instanceModelPath == null)
			path = instanceModelDir + "/synthetic-" + n + ".movies";
		else
			path = instanceModelPath;
		return path;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Integer getCliques() {
		return cliques;
	}

	public void setCliques(Integer cliques) {
		this.cliques = cliques;
	}
	
	public boolean getAVGRating() {
		boolean calcAVGRating = false;
		if ((task == "t2") || (task == "et2") || (task == "et1b") || (task == "et4b"))
			calcAVGRating = false;
		else if ((task == "t3") || (task == "et3") || (task == "et1a") || (task == "et4a"))
			calcAVGRating = true;
		return calcAVGRating;
	}

	public boolean isPrintImmediately() {
		return printImmediately;
	}

	public void setPrintImmediately(boolean printImmediately) {
		this.printImmediately = printImmediately;
	}

}

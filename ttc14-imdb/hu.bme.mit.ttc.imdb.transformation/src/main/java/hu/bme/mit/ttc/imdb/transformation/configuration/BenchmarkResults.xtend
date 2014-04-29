package hu.bme.mit.ttc.imdb.transformation.configuration

import hu.bme.mit.ttc.imdb.transformation.configuration.StatisticEntry
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map

class BenchmarkResults {

	val separator = ";"

	var String name
	var boolean printHeader

	new(String name, boolean printHeader) {
		this.name = name
		this.printHeader = printHeader
	}

	def setName(String name) {
		this.name = name
	}

	val List<String> statNames = new LinkedList;
	val Map<String, StatisticEntry> statValues = new HashMap;

	def printResults() {
		if (printHeader) {
			System::err.println('''id«separator»«FOR statName : statNames SEPARATOR separator»«statName»«ENDFOR»''')
		}
		System::err.println(
			'''«name»«separator»«FOR statName : statNames SEPARATOR separator»«statValues.get(statName).time»«ENDFOR»''')
	}

	def startStopper(String name) {
		statNames.add(name)
		statValues.put(name, new StatisticEntry(name))
	}

	def endStopper(String name) {
		statValues.get(name).end
	}
}

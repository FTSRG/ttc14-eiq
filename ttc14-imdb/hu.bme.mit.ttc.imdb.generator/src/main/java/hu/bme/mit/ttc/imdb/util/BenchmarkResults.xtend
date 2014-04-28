package hu.bme.mit.ttc.imdb.util

import java.util.LinkedList
import java.util.List
import java.util.HashMap
import java.util.Map
import hu.bme.mit.ttc.imdb.generator.StatisticEntry

class BenchmarkResults {
	
	val separator = ";\t"
	
	val List<String> statNames = new LinkedList;
	val Map<String,StatisticEntry> statValues = new HashMap;
	public boolean printImmediately = false
	
	def printResults() {
		println('''«FOR statName : statNames SEPARATOR separator»«statName»«ENDFOR»''');
		println('''«FOR statName : statNames SEPARATOR separator»«statValues.get(statName).time»«ENDFOR»''');
	}

	def startStopper(String name) {
		statNames.add(name)
		statValues.put(name, new StatisticEntry(name))
	}

	def endStopper(String name) {
		statValues.get(name).end
		if(printImmediately) println(name + " = " + statValues.get(name).time)
	}
}

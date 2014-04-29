package hu.bme.mit.ttc.imdb.util

import java.util.LinkedList
import java.util.List
import java.util.HashMap
import java.util.Map
import hu.bme.mit.ttc.imdb.generator.StatisticEntry

class BenchmarkResults {
	
	val separator = ";"
	
	var String name;
	new (String name) {
		this.name = name
	}
	
	def setName(String name) {
		this.name = name
	}
	
	val List<String> statNames = new LinkedList;
	val Map<String,StatisticEntry> statValues = new HashMap;
	public boolean printImmediately = false
	
	def printResults() {
		System::err.println('''id«separator»«FOR statName : statNames SEPARATOR separator»«statName»«ENDFOR»''');
		System::err.println('''«name»«separator»«FOR statName : statNames SEPARATOR separator»«statValues.get(statName).time»«ENDFOR»''');
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

package hu.bme.mit.ttc.imdb.generator

public class StatisticEntry {
	String name;
	long startTime;
	long endTime;
	
	new (String name) {
		super();
		this.name = name;
		this.startTime = System.nanoTime();
	}
	
	def public void end() {
		this.endTime = System.nanoTime();
	}
	
	def public long getTime() {
		return (this.endTime - this.startTime)/1000000;
	}}
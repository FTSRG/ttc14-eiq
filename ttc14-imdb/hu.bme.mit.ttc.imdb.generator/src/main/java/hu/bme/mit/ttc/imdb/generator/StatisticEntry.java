package hu.bme.mit.ttc.imdb.generator;

public class StatisticEntry {
	String name;
	long startTime;
	long endTime;
	
	public StatisticEntry(String name) {
		super();
		this.name = name;
		this.startTime = System.nanoTime();
	}
	
	public void end() {
		this.endTime = System.nanoTime();
	}
	
	public long getTime() {
		return (this.endTime - this.startTime)/1000000;
	}
}

package hu.bme.mit.ttc.imdb.util

class BenchmarkResults {
	Long startTime;
	Long readTime;
	Long xformTime;
	
	def printResults() {
		println(readTime + " " + xformTime);
	}
	
	def startStopper() {
		startTime = System.nanoTime();
	}
	
	def setReadTime() {
		readTime = System.nanoTime();
	}
	
	def setXFormTime() {
		xformTime = System.nanoTime();
	}
	
}
package hu.bme.mit.ttc.imdb.util

class BenchmarkResults {
	Long startTime;
	Long readTime;
	Long xformTime;
	Long saveTime;
	
	public boolean printImmediately
	
	def printResults() {
		println(
			"Read: " + readTime / 1000000 + " ms XForm: " + xformTime / 1000000 + " ms Save: " + saveTime / 1000000 +
				" ms");
	}

	def startStopper() {
		startTime = System.nanoTime();
	}

	def setReadTime() {
		readTime = System.nanoTime() - startTime
		if (printImmediately) println("Read: " + readTime / 1000000 )
	}

	def setXFormTime() {
		xformTime = System.nanoTime() - startTime
		if (printImmediately) println("XForm: " + xformTime / 1000000 )
	}

	def setSaveTime() {
		saveTime = System.nanoTime() - startTime
		if (printImmediately) println("Save: " + saveTime / 1000000 )
	}

}

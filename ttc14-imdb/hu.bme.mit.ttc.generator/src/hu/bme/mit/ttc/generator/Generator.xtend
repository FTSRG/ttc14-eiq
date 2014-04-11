package hu.bme.mit.ttc.generator

class Generator {

	def createExample(int N)
	{
		(0..N-1).forEach[createTest(it)]		
	}
	
	def createTest(int n) {
		println(n)		
	}
	
}

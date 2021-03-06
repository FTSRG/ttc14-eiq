class Generator {

	public Resource r
	
	extension MoviesFactory = MoviesFactory.eINSTANCE

	def generate(int N) {
		createExample(N);
	}

	def createExample(int N) {
		(0 .. N - 1).forEach[createTest(it)]
	}

	def createTest(int n) {
		createPositive(n)
		createNegative(n)
	}

	def createPositive(int n) {
		val movies = newArrayList()
		(0 .. 4).forEach[movies += createMovie(10 * n + it)]

		val a =   createActor("a" + (10 * n))
		val b =   createActor("a" + (10 * n + 1))
		val c =   createActor("a" + (10 * n + 2))
		val d = createActress("a" + (10 * n + 3))
		val e = createActress("a" + (10 * n + 4))

		val actors   = #[a, b, c, d, e]
		val firstTwo = #[a, b]
		val lastTwo  = #[         d, e]

		movies.get(0).persons += firstTwo;
		(1 .. 3).forEach[movies.get(it).persons += actors]
		movies.get(4).persons += lastTwo
		
		r.contents += actors
		r.contents += movies
	}

	def createNegative(int n) {
		val movies = newArrayList()
		(5 .. 9).forEach[movies += createMovie(10 * n + it)]

		val a =   createActor("a" + (10 * n + 5))
		val b =   createActor("a" + (10 * n + 6))
		val c = createActress("a" + (10 * n + 7))
		val d = createActress("a" + (10 * n + 8))
		val e = createActress("a" + (10 * n + 9))

		val actors =             #[a, b, c, d, e]
		movies.get(0).persons += #[a, b]
		movies.get(1).persons += #[a, b, c]
		movies.get(2).persons += #[   b, c, d]
		movies.get(3).persons += #[      c, d, e]
		movies.get(4).persons += #[         d, e]
		
		r.contents += actors
		r.contents += movies
	}

	def createMovie(int rating) {
		val movie = createMovie
		movie.rating = rating
		movie
	}

	def createActor(String name) {
		val actor = createActor
		actor.name = name
		actor
	}

	def createActress(String name) {
		val actress = createActress
		actress.name = name
		actress
	}

}

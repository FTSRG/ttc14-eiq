package hu.bme.mit.ttc.imdb.transformation

import java.util.Comparator
import hu.bme.mit.ttc.imdb.queries.CoupleWithRatingMatch

class CoupleComparatorForCommonMovies implements Comparator<CoupleWithRatingMatch> {

	override compare(CoupleWithRatingMatch o1, CoupleWithRatingMatch o2) {
		if (o2.c.commonMovies.size > o1.c.commonMovies.size) {
			return 1
		} else {
			return -1
		}
	}

	override equals(Object obj) {
		return this.equals(obj)
	}

}

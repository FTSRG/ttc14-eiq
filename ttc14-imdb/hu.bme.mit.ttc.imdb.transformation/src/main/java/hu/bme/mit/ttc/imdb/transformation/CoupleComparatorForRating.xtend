package hu.bme.mit.ttc.imdb.transformation

import java.util.Comparator
import hu.bme.mit.ttc.imdb.queries.CoupleWithRatingMatch

class CoupleComparatorForRating implements Comparator<CoupleWithRatingMatch> {

	override compare(CoupleWithRatingMatch o1, CoupleWithRatingMatch o2) {		
		if (o2.avgRating > o1.avgRating) {
			return 1
		} else {
			return -1
		}
	}

	override equals(Object obj) {
		return this.equals(obj)
	}

}

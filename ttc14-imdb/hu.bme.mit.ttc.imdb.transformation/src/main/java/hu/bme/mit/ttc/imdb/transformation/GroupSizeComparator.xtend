package hu.bme.mit.ttc.imdb.transformation

import java.util.Comparator
import hu.bme.mit.ttc.imdb.movies.Group

class GroupSizeComparator implements Comparator<Group>{
	
	override compare(Group arg0, Group arg1) {
		if (arg0.commonMovies.size < arg1.commonMovies.size) {return 1}
		else if (arg0.commonMovies.size == arg1.commonMovies.size) {return 0}
		else return -1;
	}
}
package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.CoupleWithRatingMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.coupleWithRating pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CoupleWithRatingProcessor implements IMatchProcessor<CoupleWithRatingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1 the value of pattern parameter p1 in the currently processed match
   * @param pP2 the value of pattern parameter p2 in the currently processed match
   * @param pAvgRating the value of pattern parameter avgRating in the currently processed match
   * 
   */
  public abstract void process(final Person pP1, final Person pP2, final Double pAvgRating);
  
  @Override
  public void process(final CoupleWithRatingMatch match) {
    process(match.getP1(), match.getP2(), match.getAvgRating());
    
  }
}

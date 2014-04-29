package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Couple;
import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesOfCoupleMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.commonMoviesOfCouple pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CommonMoviesOfCoupleProcessor implements IMatchProcessor<CommonMoviesOfCoupleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter c in the currently processed match
   * @param pM the value of pattern parameter m in the currently processed match
   * 
   */
  public abstract void process(final Couple pC, final Movie pM);
  
  @Override
  public void process(final CommonMoviesOfCoupleMatch match) {
    process(match.getC(), match.getM());
    
  }
}

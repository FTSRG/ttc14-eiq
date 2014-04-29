package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesToCoupleMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.commonMoviesToCouple pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CommonMoviesToCoupleProcessor implements IMatchProcessor<CommonMoviesToCoupleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1name the value of pattern parameter p1name in the currently processed match
   * @param pP2name the value of pattern parameter p2name in the currently processed match
   * @param pM the value of pattern parameter m in the currently processed match
   * 
   */
  public abstract void process(final String pP1name, final String pP2name, final Movie pM);
  
  @Override
  public void process(final CommonMoviesToCoupleMatch match) {
    process(match.getP1name(), match.getP2name(), match.getM());
    
  }
}

package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.CastMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.cast pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CastProcessor implements IMatchProcessor<CastMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pName the value of pattern parameter name in the currently processed match
   * @param pM the value of pattern parameter M in the currently processed match
   * 
   */
  public abstract void process(final String pName, final Movie pM);
  
  @Override
  public void process(final CastMatch match) {
    process(match.getName(), match.getM());
    
  }
}

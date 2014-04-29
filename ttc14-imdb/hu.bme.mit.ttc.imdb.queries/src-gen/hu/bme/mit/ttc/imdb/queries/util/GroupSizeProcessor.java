package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Group;
import hu.bme.mit.ttc.imdb.queries.GroupSizeMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.groupSize pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GroupSizeProcessor implements IMatchProcessor<GroupSizeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pGroup the value of pattern parameter group in the currently processed match
   * @param pS the value of pattern parameter S in the currently processed match
   * 
   */
  public abstract void process(final Group pGroup, final Integer pS);
  
  @Override
  public void process(final GroupSizeMatch match) {
    process(match.getGroup(), match.getS());
    
  }
}

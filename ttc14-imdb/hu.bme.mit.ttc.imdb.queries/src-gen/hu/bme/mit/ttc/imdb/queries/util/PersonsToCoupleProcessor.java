package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.queries.PersonsToCoupleMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.personsToCouple pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsToCoupleProcessor implements IMatchProcessor<PersonsToCoupleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1name the value of pattern parameter p1name in the currently processed match
   * @param pP2name the value of pattern parameter p2name in the currently processed match
   * 
   */
  public abstract void process(final String pP1name, final String pP2name);
  
  @Override
  public void process(final PersonsToCoupleMatch match) {
    process(match.getP1name(), match.getP2name());
    
  }
}

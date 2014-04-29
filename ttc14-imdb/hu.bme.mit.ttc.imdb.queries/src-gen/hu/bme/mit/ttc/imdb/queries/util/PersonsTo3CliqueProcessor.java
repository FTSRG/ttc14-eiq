package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.queries.PersonsTo3CliqueMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.personsTo3Clique pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsTo3CliqueProcessor implements IMatchProcessor<PersonsTo3CliqueMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1 the value of pattern parameter P1 in the currently processed match
   * @param pP2 the value of pattern parameter P2 in the currently processed match
   * @param pP3 the value of pattern parameter P3 in the currently processed match
   * 
   */
  public abstract void process(final String pP1, final String pP2, final String pP3);
  
  @Override
  public void process(final PersonsTo3CliqueMatch match) {
    process(match.getP1(), match.getP2(), match.getP3());
    
  }
}

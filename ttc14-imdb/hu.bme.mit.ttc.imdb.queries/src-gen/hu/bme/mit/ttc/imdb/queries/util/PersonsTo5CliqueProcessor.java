package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.queries.PersonsTo5CliqueMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.personsTo5Clique pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsTo5CliqueProcessor implements IMatchProcessor<PersonsTo5CliqueMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1 the value of pattern parameter P1 in the currently processed match
   * @param pP2 the value of pattern parameter P2 in the currently processed match
   * @param pP3 the value of pattern parameter P3 in the currently processed match
   * @param pP4 the value of pattern parameter P4 in the currently processed match
   * @param pP5 the value of pattern parameter P5 in the currently processed match
   * 
   */
  public abstract void process(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5);
  
  @Override
  public void process(final PersonsTo5CliqueMatch match) {
    process(match.getP1(), match.getP2(), match.getP3(), match.getP4(), match.getP5());
    
  }
}

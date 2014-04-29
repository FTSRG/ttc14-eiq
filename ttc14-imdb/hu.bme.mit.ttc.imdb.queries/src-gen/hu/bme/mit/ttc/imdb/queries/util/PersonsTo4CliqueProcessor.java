package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.queries.PersonsTo4CliqueMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.personsTo4Clique pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsTo4CliqueProcessor implements IMatchProcessor<PersonsTo4CliqueMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP1 the value of pattern parameter P1 in the currently processed match
   * @param pP2 the value of pattern parameter P2 in the currently processed match
   * @param pP3 the value of pattern parameter P3 in the currently processed match
   * @param pP4 the value of pattern parameter P4 in the currently processed match
   * 
   */
  public abstract void process(final String pP1, final String pP2, final String pP3, final String pP4);
  
  @Override
  public void process(final PersonsTo4CliqueMatch match) {
    process(match.getP1(), match.getP2(), match.getP3(), match.getP4());
    
  }
}

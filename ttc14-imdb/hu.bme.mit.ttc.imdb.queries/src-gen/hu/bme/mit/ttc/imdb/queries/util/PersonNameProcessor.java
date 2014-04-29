package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.PersonNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.personName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PersonNameProcessor implements IMatchProcessor<PersonNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pP the value of pattern parameter p in the currently processed match
   * @param pPName the value of pattern parameter pName in the currently processed match
   * 
   */
  public abstract void process(final Person pP, final String pPName);
  
  @Override
  public void process(final PersonNameMatch match) {
    process(match.getP(), match.getPName());
    
  }
}

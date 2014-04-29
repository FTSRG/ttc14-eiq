package hu.bme.mit.ttc.imdb.queries.util;

import hu.bme.mit.ttc.imdb.movies.Group;
import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.MemberOfGroupMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.ttc.imdb.queries.memberOfGroup pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MemberOfGroupProcessor implements IMatchProcessor<MemberOfGroupMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPerson the value of pattern parameter person in the currently processed match
   * @param pGroup the value of pattern parameter group in the currently processed match
   * 
   */
  public abstract void process(final Person pPerson, final Group pGroup);
  
  @Override
  public void process(final MemberOfGroupMatch match) {
    process(match.getPerson(), match.getGroup());
    
  }
}

package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.CastMatcher;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesOfCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesToCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.CountOfCommonMoviesOfCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.GroupSizeMatcher;
import hu.bme.mit.ttc.imdb.queries.MemberOfGroupMatcher;
import hu.bme.mit.ttc.imdb.queries.PersonNameMatcher;
import hu.bme.mit.ttc.imdb.queries.PersonsTo3CliqueMatcher;
import hu.bme.mit.ttc.imdb.queries.PersonsTo4CliqueMatcher;
import hu.bme.mit.ttc.imdb.queries.PersonsTo5CliqueMatcher;
import hu.bme.mit.ttc.imdb.queries.PersonsToCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.util.CastQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.CommonMoviesOfCoupleQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.CommonMoviesToCoupleQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.CountOfCommonMoviesOfCoupleQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.GroupSizeQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.MemberOfGroupQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.PersonNameQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.PersonsTo3CliqueQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.PersonsTo4CliqueQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.PersonsTo5CliqueQuerySpecification;
import hu.bme.mit.ttc.imdb.queries.util.PersonsToCoupleQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in imdb.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file imdb.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.ttc.imdb.queries, the group contains the definition of the following patterns: <ul>
 * <li>personName</li>
 * <li>cast</li>
 * <li>commonMoviesOfCouple</li>
 * <li>memberOfGroup</li>
 * <li>groupSize</li>
 * <li>personsToCouple</li>
 * <li>commonMoviesToCouple</li>
 * <li>countOfCommonMoviesOfCouple</li>
 * <li>personsTo3Clique</li>
 * <li>personsTo4Clique</li>
 * <li>personsTo5Clique</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Imdb extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Imdb instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Imdb();
    }
    return INSTANCE;
    
  }
  
  private static Imdb INSTANCE;
  
  private Imdb() throws IncQueryException {
    querySpecifications.add(PersonNameQuerySpecification.instance());
    querySpecifications.add(CastQuerySpecification.instance());
    querySpecifications.add(CommonMoviesOfCoupleQuerySpecification.instance());
    querySpecifications.add(MemberOfGroupQuerySpecification.instance());
    querySpecifications.add(GroupSizeQuerySpecification.instance());
    querySpecifications.add(PersonsToCoupleQuerySpecification.instance());
    querySpecifications.add(CommonMoviesToCoupleQuerySpecification.instance());
    querySpecifications.add(CountOfCommonMoviesOfCoupleQuerySpecification.instance());
    querySpecifications.add(PersonsTo3CliqueQuerySpecification.instance());
    querySpecifications.add(PersonsTo4CliqueQuerySpecification.instance());
    querySpecifications.add(PersonsTo5CliqueQuerySpecification.instance());
    
  }
  
  public PersonNameQuerySpecification getPersonName() throws IncQueryException {
    return PersonNameQuerySpecification.instance();
  }
  
  public PersonNameMatcher getPersonName(final IncQueryEngine engine) throws IncQueryException {
    return PersonNameMatcher.on(engine);
  }
  
  public CastQuerySpecification getCast() throws IncQueryException {
    return CastQuerySpecification.instance();
  }
  
  public CastMatcher getCast(final IncQueryEngine engine) throws IncQueryException {
    return CastMatcher.on(engine);
  }
  
  public CommonMoviesOfCoupleQuerySpecification getCommonMoviesOfCouple() throws IncQueryException {
    return CommonMoviesOfCoupleQuerySpecification.instance();
  }
  
  public CommonMoviesOfCoupleMatcher getCommonMoviesOfCouple(final IncQueryEngine engine) throws IncQueryException {
    return CommonMoviesOfCoupleMatcher.on(engine);
  }
  
  public MemberOfGroupQuerySpecification getMemberOfGroup() throws IncQueryException {
    return MemberOfGroupQuerySpecification.instance();
  }
  
  public MemberOfGroupMatcher getMemberOfGroup(final IncQueryEngine engine) throws IncQueryException {
    return MemberOfGroupMatcher.on(engine);
  }
  
  public GroupSizeQuerySpecification getGroupSize() throws IncQueryException {
    return GroupSizeQuerySpecification.instance();
  }
  
  public GroupSizeMatcher getGroupSize(final IncQueryEngine engine) throws IncQueryException {
    return GroupSizeMatcher.on(engine);
  }
  
  public PersonsToCoupleQuerySpecification getPersonsToCouple() throws IncQueryException {
    return PersonsToCoupleQuerySpecification.instance();
  }
  
  public PersonsToCoupleMatcher getPersonsToCouple(final IncQueryEngine engine) throws IncQueryException {
    return PersonsToCoupleMatcher.on(engine);
  }
  
  public CommonMoviesToCoupleQuerySpecification getCommonMoviesToCouple() throws IncQueryException {
    return CommonMoviesToCoupleQuerySpecification.instance();
  }
  
  public CommonMoviesToCoupleMatcher getCommonMoviesToCouple(final IncQueryEngine engine) throws IncQueryException {
    return CommonMoviesToCoupleMatcher.on(engine);
  }
  
  public CountOfCommonMoviesOfCoupleQuerySpecification getCountOfCommonMoviesOfCouple() throws IncQueryException {
    return CountOfCommonMoviesOfCoupleQuerySpecification.instance();
  }
  
  public CountOfCommonMoviesOfCoupleMatcher getCountOfCommonMoviesOfCouple(final IncQueryEngine engine) throws IncQueryException {
    return CountOfCommonMoviesOfCoupleMatcher.on(engine);
  }
  
  public PersonsTo3CliqueQuerySpecification getPersonsTo3Clique() throws IncQueryException {
    return PersonsTo3CliqueQuerySpecification.instance();
  }
  
  public PersonsTo3CliqueMatcher getPersonsTo3Clique(final IncQueryEngine engine) throws IncQueryException {
    return PersonsTo3CliqueMatcher.on(engine);
  }
  
  public PersonsTo4CliqueQuerySpecification getPersonsTo4Clique() throws IncQueryException {
    return PersonsTo4CliqueQuerySpecification.instance();
  }
  
  public PersonsTo4CliqueMatcher getPersonsTo4Clique(final IncQueryEngine engine) throws IncQueryException {
    return PersonsTo4CliqueMatcher.on(engine);
  }
  
  public PersonsTo5CliqueQuerySpecification getPersonsTo5Clique() throws IncQueryException {
    return PersonsTo5CliqueQuerySpecification.instance();
  }
  
  public PersonsTo5CliqueMatcher getPersonsTo5Clique(final IncQueryEngine engine) throws IncQueryException {
    return PersonsTo5CliqueMatcher.on(engine);
  }
}

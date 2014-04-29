package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.PersonNameMatch;
import hu.bme.mit.ttc.imdb.queries.util.PersonNameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.personName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PersonNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Shorthand patterns
 * pattern personName(p, pName) {
 * 	Person.name(p, pName);
 * }
 * </pre></code>
 * 
 * @see PersonNameMatch
 * @see PersonNameProcessor
 * @see PersonNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PersonNameMatcher extends BaseMatcher<PersonNameMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PersonNameMatcher> querySpecification() throws IncQueryException {
    return PersonNameQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PersonNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PersonNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PersonNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P = 0;
  
  private final static int POSITION_PNAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PersonNameMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PersonNameMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PersonNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return matches represented as a PersonNameMatch object.
   * 
   */
  public Collection<PersonNameMatch> getAllMatches(final Person pP, final String pPName) {
    return rawGetAllMatches(new Object[]{pP, pPName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return a match represented as a PersonNameMatch object, or null if no match is found.
   * 
   */
  public PersonNameMatch getOneArbitraryMatch(final Person pP, final String pPName) {
    return rawGetOneArbitraryMatch(new Object[]{pP, pPName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Person pP, final String pPName) {
    return rawHasMatch(new Object[]{pP, pPName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Person pP, final String pPName) {
    return rawCountMatches(new Object[]{pP, pPName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Person pP, final String pPName, final IMatchProcessor<? super PersonNameMatch> processor) {
    rawForEachMatch(new Object[]{pP, pPName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Person pP, final String pPName, final IMatchProcessor<? super PersonNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP, pPName}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PersonNameMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Person pP, final String pPName) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP, pPName});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP the fixed value of pattern parameter p, or null if not bound.
   * @param pPName the fixed value of pattern parameter pName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PersonNameMatch newMatch(final Person pP, final String pPName) {
    return new PersonNameMatch.Immutable(pP, pPName);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for p.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Person> rawAccumulateAllValuesOfp(final Object[] parameters) {
    Set<Person> results = new HashSet<Person>();
    rawAccumulateAllValues(POSITION_P, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp() {
    return rawAccumulateAllValuesOfp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp(final PersonNameMatch partialMatch) {
    return rawAccumulateAllValuesOfp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp(final String pPName) {
    return rawAccumulateAllValuesOfp(new Object[]{null, pPName});
  }
  
  /**
   * Retrieve the set of values that occur in matches for pName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfpName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_PNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for pName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpName() {
    return rawAccumulateAllValuesOfpName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpName(final PersonNameMatch partialMatch) {
    return rawAccumulateAllValuesOfpName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpName(final Person pP) {
    return rawAccumulateAllValuesOfpName(new Object[]{pP, null});
  }
  
  @Override
  protected PersonNameMatch tupleToMatch(final Tuple t) {
    try {
      return new PersonNameMatch.Immutable((hu.bme.mit.ttc.imdb.movies.Person) t.get(POSITION_P), (java.lang.String) t.get(POSITION_PNAME));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonNameMatch arrayToMatch(final Object[] match) {
    try {
      return new PersonNameMatch.Immutable((hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P], (java.lang.String) match[POSITION_PNAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonNameMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new PersonNameMatch.Mutable((hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P], (java.lang.String) match[POSITION_PNAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

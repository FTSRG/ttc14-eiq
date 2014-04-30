package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.PersonsTo3CliqueMatch;
import hu.bme.mit.ttc.imdb.queries.util.PersonsTo3CliqueQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.personsTo3Clique pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PersonsTo3CliqueMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Clique patterns
 * 
 *   Similarly to the couple pattern, this pattern looks for 3-cliques.
 *  
 * pattern personsTo3Clique(P1, P2, P3) {
 * 	find cast(P1, M1); find cast(P2, M1); find cast(P3, M1);
 * 	find cast(P1, M2); find cast(P2, M2); find cast(P3, M2);
 * 	find cast(P1, M3); find cast(P2, M3); find cast(P3, M3);
 * 	
 * 	M1 != M2; M2 != M3; M1 != M3;
 * 	
 * 	check(P1 {@literal <} P2); check(P1 {@literal <} P3);
 * 	check(P2 {@literal <} P3);
 * }
 * </pre></code>
 * 
 * @see PersonsTo3CliqueMatch
 * @see PersonsTo3CliqueProcessor
 * @see PersonsTo3CliqueQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PersonsTo3CliqueMatcher extends BaseMatcher<PersonsTo3CliqueMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PersonsTo3CliqueMatcher> querySpecification() throws IncQueryException {
    return PersonsTo3CliqueQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PersonsTo3CliqueMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PersonsTo3CliqueMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PersonsTo3CliqueMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P1 = 0;
  
  private final static int POSITION_P2 = 1;
  
  private final static int POSITION_P3 = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PersonsTo3CliqueMatcher.class);
  
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
  public PersonsTo3CliqueMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public PersonsTo3CliqueMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return matches represented as a PersonsTo3CliqueMatch object.
   * 
   */
  public Collection<PersonsTo3CliqueMatch> getAllMatches(final String pP1, final String pP2, final String pP3) {
    return rawGetAllMatches(new Object[]{pP1, pP2, pP3});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return a match represented as a PersonsTo3CliqueMatch object, or null if no match is found.
   * 
   */
  public PersonsTo3CliqueMatch getOneArbitraryMatch(final String pP1, final String pP2, final String pP3) {
    return rawGetOneArbitraryMatch(new Object[]{pP1, pP2, pP3});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pP1, final String pP2, final String pP3) {
    return rawHasMatch(new Object[]{pP1, pP2, pP3});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pP1, final String pP2, final String pP3) {
    return rawCountMatches(new Object[]{pP1, pP2, pP3});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pP1, final String pP2, final String pP3, final IMatchProcessor<? super PersonsTo3CliqueMatch> processor) {
    rawForEachMatch(new Object[]{pP1, pP2, pP3}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pP1, final String pP2, final String pP3, final IMatchProcessor<? super PersonsTo3CliqueMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP1, pP2, pP3}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PersonsTo3CliqueMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pP1, final String pP2, final String pP3) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP1, pP2, pP3});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PersonsTo3CliqueMatch newMatch(final String pP1, final String pP2, final String pP3) {
    return new PersonsTo3CliqueMatch.Immutable(pP1, pP2, pP3);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for P1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfP1(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP1() {
    return rawAccumulateAllValuesOfP1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP1(final PersonsTo3CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP1(final String pP2, final String pP3) {
    return rawAccumulateAllValuesOfP1(new Object[]{null, pP2, pP3});
  }
  
  /**
   * Retrieve the set of values that occur in matches for P2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfP2(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP2() {
    return rawAccumulateAllValuesOfP2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP2(final PersonsTo3CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP2(final String pP1, final String pP3) {
    return rawAccumulateAllValuesOfP2(new Object[]{pP1, null, pP3});
  }
  
  /**
   * Retrieve the set of values that occur in matches for P3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfP3(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P3, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP3() {
    return rawAccumulateAllValuesOfP3(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP3(final PersonsTo3CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP3(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP3(final String pP1, final String pP2) {
    return rawAccumulateAllValuesOfP3(new Object[]{pP1, pP2, null});
  }
  
  @Override
  protected PersonsTo3CliqueMatch tupleToMatch(final Tuple t) {
    try {
      return new PersonsTo3CliqueMatch.Immutable((java.lang.String) t.get(POSITION_P1), (java.lang.String) t.get(POSITION_P2), (java.lang.String) t.get(POSITION_P3));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsTo3CliqueMatch arrayToMatch(final Object[] match) {
    try {
      return new PersonsTo3CliqueMatch.Immutable((java.lang.String) match[POSITION_P1], (java.lang.String) match[POSITION_P2], (java.lang.String) match[POSITION_P3]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsTo3CliqueMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new PersonsTo3CliqueMatch.Mutable((java.lang.String) match[POSITION_P1], (java.lang.String) match[POSITION_P2], (java.lang.String) match[POSITION_P3]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.PersonsTo5CliqueMatch;
import hu.bme.mit.ttc.imdb.queries.util.PersonsTo5CliqueQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.personsTo5Clique pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PersonsTo5CliqueMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * Similarly to the couple pattern, this pattern looks for 5-cliques.
 *  
 * pattern personsTo5Clique(P1, P2, P3, P4, P5) {
 * 	find cast(P1, M1); find cast(P2, M1); find cast(P3, M1); find cast(P4, M1); find cast(P5, M1);
 * 	find cast(P1, M2); find cast(P2, M2); find cast(P3, M2); find cast(P4, M2); find cast(P5, M2);
 * 	find cast(P1, M3); find cast(P2, M3); find cast(P3, M3); find cast(P4, M3); find cast(P5, M3);
 * 	
 * 	M1 != M2; M2 != M3; M1 != M3;
 * 	
 * 	check(P1 {@literal <} P2); check(P2 {@literal <} P3); check(P3 {@literal <} P4); check(P4 {@literal <} P5);
 * }
 * </pre></code>
 * 
 * @see PersonsTo5CliqueMatch
 * @see PersonsTo5CliqueProcessor
 * @see PersonsTo5CliqueQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PersonsTo5CliqueMatcher extends BaseMatcher<PersonsTo5CliqueMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PersonsTo5CliqueMatcher> querySpecification() throws IncQueryException {
    return PersonsTo5CliqueQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PersonsTo5CliqueMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PersonsTo5CliqueMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PersonsTo5CliqueMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P1 = 0;
  
  private final static int POSITION_P2 = 1;
  
  private final static int POSITION_P3 = 2;
  
  private final static int POSITION_P4 = 3;
  
  private final static int POSITION_P5 = 4;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PersonsTo5CliqueMatcher.class);
  
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
  public PersonsTo5CliqueMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public PersonsTo5CliqueMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return matches represented as a PersonsTo5CliqueMatch object.
   * 
   */
  public Collection<PersonsTo5CliqueMatch> getAllMatches(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawGetAllMatches(new Object[]{pP1, pP2, pP3, pP4, pP5});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return a match represented as a PersonsTo5CliqueMatch object, or null if no match is found.
   * 
   */
  public PersonsTo5CliqueMatch getOneArbitraryMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawGetOneArbitraryMatch(new Object[]{pP1, pP2, pP3, pP4, pP5});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawHasMatch(new Object[]{pP1, pP2, pP3, pP4, pP5});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawCountMatches(new Object[]{pP1, pP2, pP3, pP4, pP5});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5, final IMatchProcessor<? super PersonsTo5CliqueMatch> processor) {
    rawForEachMatch(new Object[]{pP1, pP2, pP3, pP4, pP5}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5, final IMatchProcessor<? super PersonsTo5CliqueMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP1, pP2, pP3, pP4, pP5}, processor);
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
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PersonsTo5CliqueMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP1, pP2, pP3, pP4, pP5});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @param pP4 the fixed value of pattern parameter P4, or null if not bound.
   * @param pP5 the fixed value of pattern parameter P5, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PersonsTo5CliqueMatch newMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    return new PersonsTo5CliqueMatch.Immutable(pP1, pP2, pP3, pP4, pP5);
    
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
  public Set<String> getAllValuesOfP1(final PersonsTo5CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP1(final String pP2, final String pP3, final String pP4, final String pP5) {
    return rawAccumulateAllValuesOfP1(new Object[]{null, pP2, pP3, pP4, pP5});
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
  public Set<String> getAllValuesOfP2(final PersonsTo5CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP2(final String pP1, final String pP3, final String pP4, final String pP5) {
    return rawAccumulateAllValuesOfP2(new Object[]{pP1, null, pP3, pP4, pP5});
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
  public Set<String> getAllValuesOfP3(final PersonsTo5CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP3(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P3.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP3(final String pP1, final String pP2, final String pP4, final String pP5) {
    return rawAccumulateAllValuesOfP3(new Object[]{pP1, pP2, null, pP4, pP5});
  }
  
  /**
   * Retrieve the set of values that occur in matches for P4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfP4(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P4, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP4() {
    return rawAccumulateAllValuesOfP4(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP4(final PersonsTo5CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP4(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P4.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP4(final String pP1, final String pP2, final String pP3, final String pP5) {
    return rawAccumulateAllValuesOfP4(new Object[]{pP1, pP2, pP3, null, pP5});
  }
  
  /**
   * Retrieve the set of values that occur in matches for P5.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfP5(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P5, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for P5.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP5() {
    return rawAccumulateAllValuesOfP5(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P5.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP5(final PersonsTo5CliqueMatch partialMatch) {
    return rawAccumulateAllValuesOfP5(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for P5.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfP5(final String pP1, final String pP2, final String pP3, final String pP4) {
    return rawAccumulateAllValuesOfP5(new Object[]{pP1, pP2, pP3, pP4, null});
  }
  
  @Override
  protected PersonsTo5CliqueMatch tupleToMatch(final Tuple t) {
    try {
      return new PersonsTo5CliqueMatch.Immutable((java.lang.String) t.get(POSITION_P1), (java.lang.String) t.get(POSITION_P2), (java.lang.String) t.get(POSITION_P3), (java.lang.String) t.get(POSITION_P4), (java.lang.String) t.get(POSITION_P5));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsTo5CliqueMatch arrayToMatch(final Object[] match) {
    try {
      return new PersonsTo5CliqueMatch.Immutable((java.lang.String) match[POSITION_P1], (java.lang.String) match[POSITION_P2], (java.lang.String) match[POSITION_P3], (java.lang.String) match[POSITION_P4], (java.lang.String) match[POSITION_P5]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsTo5CliqueMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new PersonsTo5CliqueMatch.Mutable((java.lang.String) match[POSITION_P1], (java.lang.String) match[POSITION_P2], (java.lang.String) match[POSITION_P3], (java.lang.String) match[POSITION_P4], (java.lang.String) match[POSITION_P5]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

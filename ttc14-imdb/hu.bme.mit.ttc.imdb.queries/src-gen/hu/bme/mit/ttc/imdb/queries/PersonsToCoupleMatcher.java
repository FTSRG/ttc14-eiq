package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.PersonsToCoupleMatch;
import hu.bme.mit.ttc.imdb.queries.util.PersonsToCoupleQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.personsToCouple pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PersonsToCoupleMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Couple patterns
 * 
 *   This pattern looks for two person names (p1name, p2name), who were in the cast of three different movies (M1, M2, M3).
 *   The names are ordered lexicographically in order to list the same pair only one
 *   (the match set contains only {(a1, a2)} instead of {(a1, a2), (a2, a1)}. 
 *  
 * pattern personsToCouple(p1name, p2name) {
 * 	find cast(p1name, M1); find cast(p2name, M1);
 * 	find cast(p1name, M2); find cast(p2name, M2);
 * 	find cast(p1name, M3); find cast(p2name, M3);
 * 	
 * 	M1 != M2; M2 != M3; M1 != M3;
 * 	
 * 	check(p1name {@literal <} p2name);
 * }
 * </pre></code>
 * 
 * @see PersonsToCoupleMatch
 * @see PersonsToCoupleProcessor
 * @see PersonsToCoupleQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PersonsToCoupleMatcher extends BaseMatcher<PersonsToCoupleMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PersonsToCoupleMatcher> querySpecification() throws IncQueryException {
    return PersonsToCoupleQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PersonsToCoupleMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PersonsToCoupleMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PersonsToCoupleMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P1NAME = 0;
  
  private final static int POSITION_P2NAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PersonsToCoupleMatcher.class);
  
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
  public PersonsToCoupleMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public PersonsToCoupleMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return matches represented as a PersonsToCoupleMatch object.
   * 
   */
  public Collection<PersonsToCoupleMatch> getAllMatches(final String pP1name, final String pP2name) {
    return rawGetAllMatches(new Object[]{pP1name, pP2name});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return a match represented as a PersonsToCoupleMatch object, or null if no match is found.
   * 
   */
  public PersonsToCoupleMatch getOneArbitraryMatch(final String pP1name, final String pP2name) {
    return rawGetOneArbitraryMatch(new Object[]{pP1name, pP2name});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pP1name, final String pP2name) {
    return rawHasMatch(new Object[]{pP1name, pP2name});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pP1name, final String pP2name) {
    return rawCountMatches(new Object[]{pP1name, pP2name});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pP1name, final String pP2name, final IMatchProcessor<? super PersonsToCoupleMatch> processor) {
    rawForEachMatch(new Object[]{pP1name, pP2name}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pP1name, final String pP2name, final IMatchProcessor<? super PersonsToCoupleMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP1name, pP2name}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PersonsToCoupleMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pP1name, final String pP2name) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP1name, pP2name});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PersonsToCoupleMatch newMatch(final String pP1name, final String pP2name) {
    return new PersonsToCoupleMatch.Immutable(pP1name, pP2name);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfp1name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P1NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp1name() {
    return rawAccumulateAllValuesOfp1name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp1name(final PersonsToCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp1name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp1name(final String pP2name) {
    return rawAccumulateAllValuesOfp1name(new Object[]{null, pP2name});
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfp2name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_P2NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp2name() {
    return rawAccumulateAllValuesOfp2name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp2name(final PersonsToCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp2name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp2name(final String pP1name) {
    return rawAccumulateAllValuesOfp2name(new Object[]{pP1name, null});
  }
  
  @Override
  protected PersonsToCoupleMatch tupleToMatch(final Tuple t) {
    try {
      return new PersonsToCoupleMatch.Immutable((java.lang.String) t.get(POSITION_P1NAME), (java.lang.String) t.get(POSITION_P2NAME));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsToCoupleMatch arrayToMatch(final Object[] match) {
    try {
      return new PersonsToCoupleMatch.Immutable((java.lang.String) match[POSITION_P1NAME], (java.lang.String) match[POSITION_P2NAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PersonsToCoupleMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new PersonsToCoupleMatch.Mutable((java.lang.String) match[POSITION_P1NAME], (java.lang.String) match[POSITION_P2NAME]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

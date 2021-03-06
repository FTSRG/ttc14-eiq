package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.CountOfCommonMoviesOfCoupleMatch;
import hu.bme.mit.ttc.imdb.queries.util.CountOfCommonMoviesOfCoupleQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.countOfCommonMoviesOfCouple pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CountOfCommonMoviesOfCoupleMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * Returns with the number of common movies of a couple. 
 *  
 * pattern countOfCommonMoviesOfCouple(p1, p2, n) {
 * 	Couple.p1(c, p1);
 * 	Couple.p2(c, p2);
 * 	n == count find commonMoviesOfCouple(c, _m);
 * }
 * </pre></code>
 * 
 * @see CountOfCommonMoviesOfCoupleMatch
 * @see CountOfCommonMoviesOfCoupleProcessor
 * @see CountOfCommonMoviesOfCoupleQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CountOfCommonMoviesOfCoupleMatcher extends BaseMatcher<CountOfCommonMoviesOfCoupleMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CountOfCommonMoviesOfCoupleMatcher> querySpecification() throws IncQueryException {
    return CountOfCommonMoviesOfCoupleQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CountOfCommonMoviesOfCoupleMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CountOfCommonMoviesOfCoupleMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CountOfCommonMoviesOfCoupleMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P1 = 0;
  
  private final static int POSITION_P2 = 1;
  
  private final static int POSITION_N = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CountOfCommonMoviesOfCoupleMatcher.class);
  
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
  public CountOfCommonMoviesOfCoupleMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CountOfCommonMoviesOfCoupleMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return matches represented as a CountOfCommonMoviesOfCoupleMatch object.
   * 
   */
  public Collection<CountOfCommonMoviesOfCoupleMatch> getAllMatches(final Person pP1, final Person pP2, final Integer pN) {
    return rawGetAllMatches(new Object[]{pP1, pP2, pN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return a match represented as a CountOfCommonMoviesOfCoupleMatch object, or null if no match is found.
   * 
   */
  public CountOfCommonMoviesOfCoupleMatch getOneArbitraryMatch(final Person pP1, final Person pP2, final Integer pN) {
    return rawGetOneArbitraryMatch(new Object[]{pP1, pP2, pN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Person pP1, final Person pP2, final Integer pN) {
    return rawHasMatch(new Object[]{pP1, pP2, pN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Person pP1, final Person pP2, final Integer pN) {
    return rawCountMatches(new Object[]{pP1, pP2, pN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Person pP1, final Person pP2, final Integer pN, final IMatchProcessor<? super CountOfCommonMoviesOfCoupleMatch> processor) {
    rawForEachMatch(new Object[]{pP1, pP2, pN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Person pP1, final Person pP2, final Integer pN, final IMatchProcessor<? super CountOfCommonMoviesOfCoupleMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP1, pP2, pN}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<CountOfCommonMoviesOfCoupleMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Person pP1, final Person pP2, final Integer pN) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP1, pP2, pN});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CountOfCommonMoviesOfCoupleMatch newMatch(final Person pP1, final Person pP2, final Integer pN) {
    return CountOfCommonMoviesOfCoupleMatch.newMatch(pP1, pP2, pN);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Person> rawAccumulateAllValuesOfp1(final Object[] parameters) {
    Set<Person> results = new HashSet<Person>();
    rawAccumulateAllValues(POSITION_P1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp1() {
    return rawAccumulateAllValuesOfp1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp1(final CountOfCommonMoviesOfCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp1(final Person pP2, final Integer pN) {
    return rawAccumulateAllValuesOfp1(new Object[]{null, pP2, pN});
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Person> rawAccumulateAllValuesOfp2(final Object[] parameters) {
    Set<Person> results = new HashSet<Person>();
    rawAccumulateAllValues(POSITION_P2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp2() {
    return rawAccumulateAllValuesOfp2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp2(final CountOfCommonMoviesOfCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Person> getAllValuesOfp2(final Person pP1, final Integer pN) {
    return rawAccumulateAllValuesOfp2(new Object[]{pP1, null, pN});
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfn(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_N, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfn() {
    return rawAccumulateAllValuesOfn(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfn(final CountOfCommonMoviesOfCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for n.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfn(final Person pP1, final Person pP2) {
    return rawAccumulateAllValuesOfn(new Object[]{pP1, pP2, null});
  }
  
  @Override
  protected CountOfCommonMoviesOfCoupleMatch tupleToMatch(final Tuple t) {
    try {
      return CountOfCommonMoviesOfCoupleMatch.newMatch((hu.bme.mit.ttc.imdb.movies.Person) t.get(POSITION_P1), (hu.bme.mit.ttc.imdb.movies.Person) t.get(POSITION_P2), (java.lang.Integer) t.get(POSITION_N));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CountOfCommonMoviesOfCoupleMatch arrayToMatch(final Object[] match) {
    try {
      return CountOfCommonMoviesOfCoupleMatch.newMatch((hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P1], (hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P2], (java.lang.Integer) match[POSITION_N]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CountOfCommonMoviesOfCoupleMatch arrayToMatchMutable(final Object[] match) {
    try {
      return CountOfCommonMoviesOfCoupleMatch.newMutableMatch((hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P1], (hu.bme.mit.ttc.imdb.movies.Person) match[POSITION_P2], (java.lang.Integer) match[POSITION_N]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

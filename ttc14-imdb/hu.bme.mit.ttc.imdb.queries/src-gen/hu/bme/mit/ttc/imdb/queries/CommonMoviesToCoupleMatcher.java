package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesToCoupleMatch;
import hu.bme.mit.ttc.imdb.queries.util.CommonMoviesToCoupleQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.commonMoviesToCouple pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CommonMoviesToCoupleMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * This pattern looks for the common movies of a couple. The couple is determined with the personsToCouple pattern. 
 *  
 * pattern commonMoviesToCouple(p1name, p2name, m) {
 * 	find personsToCouple(p1name, p2name);
 * 	
 * 	Person.movies(p1, m);
 * 	Person.movies(p2, m);
 * 	Person.name(p1,p1name);
 * 	Person.name(p2,p2name);
 * 
 * 	check(p1name {@literal <} p2name);
 * }
 * </pre></code>
 * 
 * @see CommonMoviesToCoupleMatch
 * @see CommonMoviesToCoupleProcessor
 * @see CommonMoviesToCoupleQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CommonMoviesToCoupleMatcher extends BaseMatcher<CommonMoviesToCoupleMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CommonMoviesToCoupleMatcher> querySpecification() throws IncQueryException {
    return CommonMoviesToCoupleQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CommonMoviesToCoupleMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CommonMoviesToCoupleMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CommonMoviesToCoupleMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_P1NAME = 0;
  
  private final static int POSITION_P2NAME = 1;
  
  private final static int POSITION_M = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CommonMoviesToCoupleMatcher.class);
  
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
  public CommonMoviesToCoupleMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CommonMoviesToCoupleMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return matches represented as a CommonMoviesToCoupleMatch object.
   * 
   */
  public Collection<CommonMoviesToCoupleMatch> getAllMatches(final String pP1name, final String pP2name, final Movie pM) {
    return rawGetAllMatches(new Object[]{pP1name, pP2name, pM});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return a match represented as a CommonMoviesToCoupleMatch object, or null if no match is found.
   * 
   */
  public CommonMoviesToCoupleMatch getOneArbitraryMatch(final String pP1name, final String pP2name, final Movie pM) {
    return rawGetOneArbitraryMatch(new Object[]{pP1name, pP2name, pM});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pP1name, final String pP2name, final Movie pM) {
    return rawHasMatch(new Object[]{pP1name, pP2name, pM});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pP1name, final String pP2name, final Movie pM) {
    return rawCountMatches(new Object[]{pP1name, pP2name, pM});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pP1name, final String pP2name, final Movie pM, final IMatchProcessor<? super CommonMoviesToCoupleMatch> processor) {
    rawForEachMatch(new Object[]{pP1name, pP2name, pM}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pP1name, final String pP2name, final Movie pM, final IMatchProcessor<? super CommonMoviesToCoupleMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pP1name, pP2name, pM}, processor);
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
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<CommonMoviesToCoupleMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pP1name, final String pP2name, final Movie pM) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pP1name, pP2name, pM});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1name the fixed value of pattern parameter p1name, or null if not bound.
   * @param pP2name the fixed value of pattern parameter p2name, or null if not bound.
   * @param pM the fixed value of pattern parameter m, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CommonMoviesToCoupleMatch newMatch(final String pP1name, final String pP2name, final Movie pM) {
    return CommonMoviesToCoupleMatch.newMatch(pP1name, pP2name, pM);
    
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
  public Set<String> getAllValuesOfp1name(final CommonMoviesToCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp1name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p1name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp1name(final String pP2name, final Movie pM) {
    return rawAccumulateAllValuesOfp1name(new Object[]{null, pP2name, pM});
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
  public Set<String> getAllValuesOfp2name(final CommonMoviesToCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfp2name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for p2name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfp2name(final String pP1name, final Movie pM) {
    return rawAccumulateAllValuesOfp2name(new Object[]{pP1name, null, pM});
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Movie> rawAccumulateAllValuesOfm(final Object[] parameters) {
    Set<Movie> results = new HashSet<Movie>();
    rawAccumulateAllValues(POSITION_M, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfm() {
    return rawAccumulateAllValuesOfm(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfm(final CommonMoviesToCoupleMatch partialMatch) {
    return rawAccumulateAllValuesOfm(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for m.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfm(final String pP1name, final String pP2name) {
    return rawAccumulateAllValuesOfm(new Object[]{pP1name, pP2name, null});
  }
  
  @Override
  protected CommonMoviesToCoupleMatch tupleToMatch(final Tuple t) {
    try {
      return CommonMoviesToCoupleMatch.newMatch((java.lang.String) t.get(POSITION_P1NAME), (java.lang.String) t.get(POSITION_P2NAME), (hu.bme.mit.ttc.imdb.movies.Movie) t.get(POSITION_M));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CommonMoviesToCoupleMatch arrayToMatch(final Object[] match) {
    try {
      return CommonMoviesToCoupleMatch.newMatch((java.lang.String) match[POSITION_P1NAME], (java.lang.String) match[POSITION_P2NAME], (hu.bme.mit.ttc.imdb.movies.Movie) match[POSITION_M]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CommonMoviesToCoupleMatch arrayToMatchMutable(final Object[] match) {
    try {
      return CommonMoviesToCoupleMatch.newMutableMatch((java.lang.String) match[POSITION_P1NAME], (java.lang.String) match[POSITION_P2NAME], (hu.bme.mit.ttc.imdb.movies.Movie) match[POSITION_M]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

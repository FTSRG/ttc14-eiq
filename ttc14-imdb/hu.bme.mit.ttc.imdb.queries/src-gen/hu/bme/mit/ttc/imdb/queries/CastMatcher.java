package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.CastMatch;
import hu.bme.mit.ttc.imdb.queries.util.CastQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.imdb.queries.cast pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CastMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern cast(name, M) {
 * 	Movie.persons.name(M, name);
 * }
 * </pre></code>
 * 
 * @see CastMatch
 * @see CastProcessor
 * @see CastQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CastMatcher extends BaseMatcher<CastMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CastMatcher> querySpecification() throws IncQueryException {
    return CastQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CastMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CastMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CastMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_NAME = 0;
  
  private final static int POSITION_M = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CastMatcher.class);
  
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
  public CastMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CastMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return matches represented as a CastMatch object.
   * 
   */
  public Collection<CastMatch> getAllMatches(final String pName, final Movie pM) {
    return rawGetAllMatches(new Object[]{pName, pM});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return a match represented as a CastMatch object, or null if no match is found.
   * 
   */
  public CastMatch getOneArbitraryMatch(final String pName, final Movie pM) {
    return rawGetOneArbitraryMatch(new Object[]{pName, pM});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pName, final Movie pM) {
    return rawHasMatch(new Object[]{pName, pM});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pName, final Movie pM) {
    return rawCountMatches(new Object[]{pName, pM});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pName, final Movie pM, final IMatchProcessor<? super CastMatch> processor) {
    rawForEachMatch(new Object[]{pName, pM}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pName, final Movie pM, final IMatchProcessor<? super CastMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pName, pM}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<CastMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final String pName, final Movie pM) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pName, pM});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CastMatch newMatch(final String pName, final Movie pM) {
    return CastMatch.newMatch(pName, pM);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname() {
    return rawAccumulateAllValuesOfname(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final CastMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final Movie pM) {
    return rawAccumulateAllValuesOfname(new Object[]{null, pM});
  }
  
  /**
   * Retrieve the set of values that occur in matches for M.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Movie> rawAccumulateAllValuesOfM(final Object[] parameters) {
    Set<Movie> results = new HashSet<Movie>();
    rawAccumulateAllValues(POSITION_M, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for M.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfM() {
    return rawAccumulateAllValuesOfM(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for M.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfM(final CastMatch partialMatch) {
    return rawAccumulateAllValuesOfM(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for M.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Movie> getAllValuesOfM(final String pName) {
    return rawAccumulateAllValuesOfM(new Object[]{pName, null});
  }
  
  @Override
  protected CastMatch tupleToMatch(final Tuple t) {
    try {
      return CastMatch.newMatch((java.lang.String) t.get(POSITION_NAME), (hu.bme.mit.ttc.imdb.movies.Movie) t.get(POSITION_M));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CastMatch arrayToMatch(final Object[] match) {
    try {
      return CastMatch.newMatch((java.lang.String) match[POSITION_NAME], (hu.bme.mit.ttc.imdb.movies.Movie) match[POSITION_M]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CastMatch arrayToMatchMutable(final Object[] match) {
    try {
      return CastMatch.newMutableMatch((java.lang.String) match[POSITION_NAME], (hu.bme.mit.ttc.imdb.movies.Movie) match[POSITION_M]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}

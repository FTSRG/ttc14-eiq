package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.CountOfCommonMoviesOfCoupleMatch;
import hu.bme.mit.ttc.imdb.queries.CountOfCommonMoviesOfCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.util.CommonMoviesOfCoupleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CountOfCommonMoviesOfCoupleMatcher in a type-safe way.
 * 
 * @see CountOfCommonMoviesOfCoupleMatcher
 * @see CountOfCommonMoviesOfCoupleMatch
 * 
 */
@SuppressWarnings("all")
public final class CountOfCommonMoviesOfCoupleQuerySpecification extends BaseGeneratedQuerySpecification<CountOfCommonMoviesOfCoupleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CountOfCommonMoviesOfCoupleQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CountOfCommonMoviesOfCoupleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CountOfCommonMoviesOfCoupleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.countOfCommonMoviesOfCouple";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("p1","p2","n");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("p1", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("p2", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("n", "java.lang.Integer"));
  }
  
  @Override
  public CountOfCommonMoviesOfCoupleMatch newEmptyMatch() {
    return CountOfCommonMoviesOfCoupleMatch.newEmptyMatch();
  }
  
  @Override
  public CountOfCommonMoviesOfCoupleMatch newMatch(final Object... parameters) {
    return CountOfCommonMoviesOfCoupleMatch.newMatch((hu.bme.mit.ttc.imdb.movies.Person) parameters[0], (hu.bme.mit.ttc.imdb.movies.Person) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_p1 = body.getOrCreateVariableByName("p1");
      PVariable var_p2 = body.getOrCreateVariableByName("p2");
      PVariable var_n = body.getOrCreateVariableByName("n");
      PVariable var_c = body.getOrCreateVariableByName("c");
      PVariable var__m = body.getOrCreateVariableByName("_m");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_p1, "p1"), 
        new ExportedParameter(body, var_p2, "p2"), 
        new ExportedParameter(body, var_n, "n")
      ));
      
      
      
      new TypeBinary(body, CONTEXT, var_c, var_p1, getFeatureLiteral("http://movies/1.0", "Couple", "p1"), "http://movies/1.0/Couple.p1");
      new TypeBinary(body, CONTEXT, var_c, var_p2, getFeatureLiteral("http://movies/1.0", "Couple", "p2"), "http://movies/1.0/Couple.p2");
      new PatternMatchCounter(body, new FlatTuple(var_c, var__m), CommonMoviesOfCoupleQuerySpecification.instance().instance(), var_n);
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CountOfCommonMoviesOfCoupleQuerySpecification INSTANCE = make();
    
    public static CountOfCommonMoviesOfCoupleQuerySpecification make() {
      return new CountOfCommonMoviesOfCoupleQuerySpecification();					
      
    }
  }
}

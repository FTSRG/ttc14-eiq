package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.CastMatch;
import hu.bme.mit.ttc.imdb.queries.CastMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate CastMatcher in a type-safe way.
 * 
 * @see CastMatcher
 * @see CastMatch
 * 
 */
@SuppressWarnings("all")
public final class CastQuerySpecification extends BaseGeneratedQuerySpecification<CastMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CastQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CastMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CastMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.cast";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("name","M");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("name", "java.lang.String"),new PParameter("M", "hu.bme.mit.ttc.imdb.movies.Movie"));
  }
  
  @Override
  public CastMatch newEmptyMatch() {
    return CastMatch.newEmptyMatch();
  }
  
  @Override
  public CastMatch newMatch(final Object... parameters) {
    return CastMatch.newMatch((java.lang.String) parameters[0], (hu.bme.mit.ttc.imdb.movies.Movie) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_name = body.getOrCreateVariableByName("name");
      PVariable var_M = body.getOrCreateVariableByName("M");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_name, "name"), 
        new ExportedParameter(body, var_M, "M")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_M, var__virtual_0_, getFeatureLiteral("http://movies/1.0", "Movie", "persons"), "http://movies/1.0/Movie.persons");
      new TypeBinary(body, CONTEXT, var__virtual_0_, var_name, getFeatureLiteral("http://movies/1.0", "Person", "name"), "http://movies/1.0/Person.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CastQuerySpecification INSTANCE = make();
    
    public static CastQuerySpecification make() {
      return new CastQuerySpecification();					
      
    }
  }
}

package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesOfCoupleMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate CommonMoviesOfCoupleMatcher in a type-safe way.
 * 
 * @see CommonMoviesOfCoupleMatcher
 * @see CommonMoviesOfCoupleMatch
 * 
 */
@SuppressWarnings("all")
public final class CommonMoviesOfCoupleQuerySpecification extends BaseGeneratedQuerySpecification<CommonMoviesOfCoupleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CommonMoviesOfCoupleQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CommonMoviesOfCoupleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CommonMoviesOfCoupleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.commonMoviesOfCouple";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("c","m");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("c", "hu.bme.mit.ttc.imdb.movies.Couple"),new PParameter("m", "hu.bme.mit.ttc.imdb.movies.Movie"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_c = body.getOrCreateVariableByName("c");
      PVariable var_m = body.getOrCreateVariableByName("m");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_c, "c"), 
        new ExportedParameter(body, var_m, "m")
      ));
      
      
      new TypeUnary(body, var_c, getClassifierLiteral("http://movies/1.0", "Couple"), "http://movies/1.0/Couple");
      new TypeBinary(body, CONTEXT, var_c, var_m, getFeatureLiteral("http://movies/1.0", "Group", "commonMovies"), "http://movies/1.0/Group.commonMovies");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CommonMoviesOfCoupleQuerySpecification> {
    @Override
    public CommonMoviesOfCoupleQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CommonMoviesOfCoupleQuerySpecification INSTANCE = make();
    
    public static CommonMoviesOfCoupleQuerySpecification make() {
      return new CommonMoviesOfCoupleQuerySpecification();					
      
    }
  }
  
}

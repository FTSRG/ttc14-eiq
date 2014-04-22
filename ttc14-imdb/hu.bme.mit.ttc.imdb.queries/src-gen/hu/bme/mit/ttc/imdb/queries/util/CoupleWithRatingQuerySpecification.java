package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.CoupleWithRatingMatcher;
import hu.bme.mit.ttc.imdb.queries.util.CoupleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CoupleWithRatingMatcher in a type-safe way.
 * 
 * @see CoupleWithRatingMatcher
 * @see CoupleWithRatingMatch
 * 
 */
@SuppressWarnings("all")
public final class CoupleWithRatingQuerySpecification extends BaseGeneratedQuerySpecification<CoupleWithRatingMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CoupleWithRatingQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CoupleWithRatingMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CoupleWithRatingMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.coupleWithRating";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("p1","p2","avgRating");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("p1", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("p2", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("avgRating", "java.lang.Double"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_p1 = body.getOrCreateVariableByName("p1");
      PVariable var_p2 = body.getOrCreateVariableByName("p2");
      PVariable var_avgRating = body.getOrCreateVariableByName("avgRating");
      PVariable var_c = body.getOrCreateVariableByName("c");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_p1, "p1"), 
        new ExportedParameter(body, var_p2, "p2"), 
        new ExportedParameter(body, var_avgRating, "avgRating")
      ));
      
      
      
      new PositivePatternCall(body, new FlatTuple(var_c, var_p1, var_p2), CoupleQuerySpecification.instance());
      new TypeUnary(body, var_c, getClassifierLiteral("http://movies/1.0", "Couple"), "http://movies/1.0/Couple");
      new TypeBinary(body, context, var_c, var_avgRating, getFeatureLiteral("http://movies/1.0", "Group", "avgRating"), "http://movies/1.0/Group.avgRating");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private CoupleWithRatingQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CoupleWithRatingQuerySpecification> {
    @Override
    public CoupleWithRatingQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CoupleWithRatingQuerySpecification INSTANCE = make();
    
    public static CoupleWithRatingQuerySpecification make() {
      try {
      	return new CoupleWithRatingQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}

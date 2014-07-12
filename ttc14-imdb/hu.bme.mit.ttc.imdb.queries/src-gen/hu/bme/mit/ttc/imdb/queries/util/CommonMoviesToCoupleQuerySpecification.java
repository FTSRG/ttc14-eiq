package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesToCoupleMatch;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesToCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.util.PersonsToCoupleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CommonMoviesToCoupleMatcher in a type-safe way.
 * 
 * @see CommonMoviesToCoupleMatcher
 * @see CommonMoviesToCoupleMatch
 * 
 */
@SuppressWarnings("all")
public final class CommonMoviesToCoupleQuerySpecification extends BaseGeneratedQuerySpecification<CommonMoviesToCoupleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CommonMoviesToCoupleQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CommonMoviesToCoupleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CommonMoviesToCoupleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.commonMoviesToCouple";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("p1name","p2name","m");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("p1name", "java.lang.String"),new PParameter("p2name", "java.lang.String"),new PParameter("m", "hu.bme.mit.ttc.imdb.movies.Movie"));
  }
  
  @Override
  public CommonMoviesToCoupleMatch newEmptyMatch() {
    return CommonMoviesToCoupleMatch.newEmptyMatch();
  }
  
  @Override
  public CommonMoviesToCoupleMatch newMatch(final Object... parameters) {
    return CommonMoviesToCoupleMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1], (hu.bme.mit.ttc.imdb.movies.Movie) parameters[2]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_p1name = body.getOrCreateVariableByName("p1name");
      PVariable var_p2name = body.getOrCreateVariableByName("p2name");
      PVariable var_m = body.getOrCreateVariableByName("m");
      PVariable var_p1 = body.getOrCreateVariableByName("p1");
      PVariable var_p2 = body.getOrCreateVariableByName("p2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_p1name, "p1name"), 
        new ExportedParameter(body, var_p2name, "p2name"), 
        new ExportedParameter(body, var_m, "m")
      ));
      
      
      
      new PositivePatternCall(body, new FlatTuple(var_p1name, var_p2name), PersonsToCoupleQuerySpecification.instance());
      new TypeBinary(body, CONTEXT, var_p1, var_m, getFeatureLiteral("http://movies/1.0", "Person", "movies"), "http://movies/1.0/Person.movies");
      new TypeBinary(body, CONTEXT, var_p2, var_m, getFeatureLiteral("http://movies/1.0", "Person", "movies"), "http://movies/1.0/Person.movies");
      new TypeBinary(body, CONTEXT, var_p1, var_p1name, getFeatureLiteral("http://movies/1.0", "Person", "name"), "http://movies/1.0/Person.name");
      new TypeBinary(body, CONTEXT, var_p2, var_p2name, getFeatureLiteral("http://movies/1.0", "Person", "name"), "http://movies/1.0/Person.name");
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern commonMoviesToCouple";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("p1name", "p2name");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String p1name = (java.lang.String) provider.getValue("p1name");
        	java.lang.String p2name = (java.lang.String) provider.getValue("p2name");
        	return evaluateExpression_1_1(p1name, p2name);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CommonMoviesToCoupleQuerySpecification INSTANCE = make();
    
    public static CommonMoviesToCoupleQuerySpecification make() {
      return new CommonMoviesToCoupleQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String p1name, final String p2name) {
    boolean _lessThan = (p1name.compareTo(p2name) < 0);
    return _lessThan;
  }
}

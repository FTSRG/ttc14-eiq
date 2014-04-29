package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.PersonsToCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.util.CastQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PersonsToCoupleMatcher in a type-safe way.
 * 
 * @see PersonsToCoupleMatcher
 * @see PersonsToCoupleMatch
 * 
 */
@SuppressWarnings("all")
public final class PersonsToCoupleQuerySpecification extends BaseGeneratedQuerySpecification<PersonsToCoupleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PersonsToCoupleQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected PersonsToCoupleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PersonsToCoupleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.personsToCouple";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("p1name","p2name");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("p1name", "java.lang.String"),new PParameter("p2name", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_p1name = body.getOrCreateVariableByName("p1name");
      PVariable var_p2name = body.getOrCreateVariableByName("p2name");
      PVariable var_M1 = body.getOrCreateVariableByName("M1");
      PVariable var_M2 = body.getOrCreateVariableByName("M2");
      PVariable var_M3 = body.getOrCreateVariableByName("M3");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_p1name, "p1name"), 
        new ExportedParameter(body, var_p2name, "p2name")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_p1name, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_p2name, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_p1name, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_p2name, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_p1name, var_M3), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_p2name, var_M3), CastQuerySpecification.instance());
      new Inequality(body, var_M1, var_M2);
      new Inequality(body, var_M2, var_M3);
      new Inequality(body, var_M1, var_M3);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsToCouple";
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
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<PersonsToCoupleQuerySpecification> {
    @Override
    public PersonsToCoupleQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static PersonsToCoupleQuerySpecification INSTANCE = make();
    
    public static PersonsToCoupleQuerySpecification make() {
      return new PersonsToCoupleQuerySpecification();					
      
    }
  }
  
  
  private boolean evaluateExpression_1_1(final String p1name, final String p2name) {
    boolean _lessThan = (p1name.compareTo(p2name) < 0);
    return _lessThan;
  }
}

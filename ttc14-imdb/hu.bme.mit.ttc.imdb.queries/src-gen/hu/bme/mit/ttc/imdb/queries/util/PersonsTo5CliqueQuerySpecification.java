package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.PersonsTo5CliqueMatch;
import hu.bme.mit.ttc.imdb.queries.PersonsTo5CliqueMatcher;
import hu.bme.mit.ttc.imdb.queries.util.CastQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PersonsTo5CliqueMatcher in a type-safe way.
 * 
 * @see PersonsTo5CliqueMatcher
 * @see PersonsTo5CliqueMatch
 * 
 */
@SuppressWarnings("all")
public final class PersonsTo5CliqueQuerySpecification extends BaseGeneratedQuerySpecification<PersonsTo5CliqueMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PersonsTo5CliqueQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected PersonsTo5CliqueMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PersonsTo5CliqueMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.personsTo5Clique";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("P1","P2","P3","P4","P5");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("P1", "java.lang.String"),new PParameter("P2", "java.lang.String"),new PParameter("P3", "java.lang.String"),new PParameter("P4", "java.lang.String"),new PParameter("P5", "java.lang.String"));
  }
  
  @Override
  public PersonsTo5CliqueMatch newEmptyMatch() {
    return PersonsTo5CliqueMatch.newEmptyMatch();
  }
  
  @Override
  public PersonsTo5CliqueMatch newMatch(final Object... parameters) {
    return PersonsTo5CliqueMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3], (java.lang.String) parameters[4]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_P1 = body.getOrCreateVariableByName("P1");
      PVariable var_P2 = body.getOrCreateVariableByName("P2");
      PVariable var_P3 = body.getOrCreateVariableByName("P3");
      PVariable var_P4 = body.getOrCreateVariableByName("P4");
      PVariable var_P5 = body.getOrCreateVariableByName("P5");
      PVariable var_M1 = body.getOrCreateVariableByName("M1");
      PVariable var_M2 = body.getOrCreateVariableByName("M2");
      PVariable var_M3 = body.getOrCreateVariableByName("M3");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_P1, "P1"), 
        new ExportedParameter(body, var_P2, "P2"), 
        new ExportedParameter(body, var_P3, "P3"), 
        new ExportedParameter(body, var_P4, "P4"), 
        new ExportedParameter(body, var_P5, "P5")
      ));
      
      
      
      
      
      new PositivePatternCall(body, new FlatTuple(var_P1, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P2, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P3, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P4, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P5, var_M1), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P1, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P2, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P3, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P4, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P5, var_M2), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P1, var_M3), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P2, var_M3), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P3, var_M3), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P4, var_M3), CastQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_P5, var_M3), CastQuerySpecification.instance());
      new Inequality(body, var_M1, var_M2);
      new Inequality(body, var_M2, var_M3);
      new Inequality(body, var_M1, var_M3);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P1", "P2");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P1 = (java.lang.String) provider.getValue("P1");
        	java.lang.String P2 = (java.lang.String) provider.getValue("P2");
        	return evaluateExpression_1_1(P1, P2);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P1", "P3");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P1 = (java.lang.String) provider.getValue("P1");
        	java.lang.String P3 = (java.lang.String) provider.getValue("P3");
        	return evaluateExpression_1_2(P1, P3);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P1", "P4");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P1 = (java.lang.String) provider.getValue("P1");
        	java.lang.String P4 = (java.lang.String) provider.getValue("P4");
        	return evaluateExpression_1_3(P1, P4);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P1", "P5");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P1 = (java.lang.String) provider.getValue("P1");
        	java.lang.String P5 = (java.lang.String) provider.getValue("P5");
        	return evaluateExpression_1_4(P1, P5);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P2", "P3");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P2 = (java.lang.String) provider.getValue("P2");
        	java.lang.String P3 = (java.lang.String) provider.getValue("P3");
        	return evaluateExpression_1_5(P2, P3);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P2", "P4");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P2 = (java.lang.String) provider.getValue("P2");
        	java.lang.String P4 = (java.lang.String) provider.getValue("P4");
        	return evaluateExpression_1_6(P2, P4);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P2", "P5");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P2 = (java.lang.String) provider.getValue("P2");
        	java.lang.String P5 = (java.lang.String) provider.getValue("P5");
        	return evaluateExpression_1_7(P2, P5);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P3", "P4");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P3 = (java.lang.String) provider.getValue("P3");
        	java.lang.String P4 = (java.lang.String) provider.getValue("P4");
        	return evaluateExpression_1_8(P3, P4);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P3", "P5");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P3 = (java.lang.String) provider.getValue("P3");
        	java.lang.String P5 = (java.lang.String) provider.getValue("P5");
        	return evaluateExpression_1_9(P3, P5);
        }
        
        },  null); 
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
        @Override
        public String getShortDescription() {
        	return "Expression evaluation from pattern personsTo5Clique";
        }
        
        @Override
        public Iterable<String> getInputParameterNames() {
        	return Arrays.asList("P4", "P5");
        }
        
        @Override
        public Object evaluateExpression(IValueProvider provider) throws Exception {
        	java.lang.String P4 = (java.lang.String) provider.getValue("P4");
        	java.lang.String P5 = (java.lang.String) provider.getValue("P5");
        	return evaluateExpression_1_10(P4, P5);
        }
        
        },  null); 
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PersonsTo5CliqueQuerySpecification INSTANCE = make();
    
    public static PersonsTo5CliqueQuerySpecification make() {
      return new PersonsTo5CliqueQuerySpecification();					
      
    }
  }
  
  private boolean evaluateExpression_1_1(final String P1, final String P2) {
    boolean _lessThan = (P1.compareTo(P2) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_2(final String P1, final String P3) {
    boolean _lessThan = (P1.compareTo(P3) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_3(final String P1, final String P4) {
    boolean _lessThan = (P1.compareTo(P4) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_4(final String P1, final String P5) {
    boolean _lessThan = (P1.compareTo(P5) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_5(final String P2, final String P3) {
    boolean _lessThan = (P2.compareTo(P3) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_6(final String P2, final String P4) {
    boolean _lessThan = (P2.compareTo(P4) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_7(final String P2, final String P5) {
    boolean _lessThan = (P2.compareTo(P5) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_8(final String P3, final String P4) {
    boolean _lessThan = (P3.compareTo(P4) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_9(final String P3, final String P5) {
    boolean _lessThan = (P3.compareTo(P5) < 0);
    return _lessThan;
  }
  
  private boolean evaluateExpression_1_10(final String P4, final String P5) {
    boolean _lessThan = (P4.compareTo(P5) < 0);
    return _lessThan;
  }
}

package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.util.PersonsTo5CliqueQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.personsTo5Clique pattern,
 * to be used in conjunction with {@link PersonsTo5CliqueMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PersonsTo5CliqueMatcher
 * @see PersonsTo5CliqueProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsTo5CliqueMatch extends BasePatternMatch {
  private String fP1;
  
  private String fP2;
  
  private String fP3;
  
  private String fP4;
  
  private String fP5;
  
  private static List<String> parameterNames = makeImmutableList("P1", "P2", "P3", "P4", "P5");
  
  private PersonsTo5CliqueMatch(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
    this.fP1 = pP1;
    this.fP2 = pP2;
    this.fP3 = pP3;
    this.fP4 = pP4;
    this.fP5 = pP5;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("P1".equals(parameterName)) return this.fP1;
    if ("P2".equals(parameterName)) return this.fP2;
    if ("P3".equals(parameterName)) return this.fP3;
    if ("P4".equals(parameterName)) return this.fP4;
    if ("P5".equals(parameterName)) return this.fP5;
    return null;
    
  }
  
  public String getP1() {
    return this.fP1;
    
  }
  
  public String getP2() {
    return this.fP2;
    
  }
  
  public String getP3() {
    return this.fP3;
    
  }
  
  public String getP4() {
    return this.fP4;
    
  }
  
  public String getP5() {
    return this.fP5;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("P1".equals(parameterName) ) {
    	this.fP1 = (java.lang.String) newValue;
    	return true;
    }
    if ("P2".equals(parameterName) ) {
    	this.fP2 = (java.lang.String) newValue;
    	return true;
    }
    if ("P3".equals(parameterName) ) {
    	this.fP3 = (java.lang.String) newValue;
    	return true;
    }
    if ("P4".equals(parameterName) ) {
    	this.fP4 = (java.lang.String) newValue;
    	return true;
    }
    if ("P5".equals(parameterName) ) {
    	this.fP5 = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP1(final String pP1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP1 = pP1;
    
  }
  
  public void setP2(final String pP2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP2 = pP2;
    
  }
  
  public void setP3(final String pP3) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP3 = pP3;
    
  }
  
  public void setP4(final String pP4) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP4 = pP4;
    
  }
  
  public void setP5(final String pP5) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP5 = pP5;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.personsTo5Clique";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return PersonsTo5CliqueMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP1, fP2, fP3, fP4, fP5};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"P1\"=" + prettyPrintValue(fP1) + ", ");
    result.append("\"P2\"=" + prettyPrintValue(fP2) + ", ");
    result.append("\"P3\"=" + prettyPrintValue(fP3) + ", ");
    result.append("\"P4\"=" + prettyPrintValue(fP4) + ", ");
    result.append("\"P5\"=" + prettyPrintValue(fP5));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP1 == null) ? 0 : fP1.hashCode());
    result = prime * result + ((fP2 == null) ? 0 : fP2.hashCode());
    result = prime * result + ((fP3 == null) ? 0 : fP3.hashCode());
    result = prime * result + ((fP4 == null) ? 0 : fP4.hashCode());
    result = prime * result + ((fP5 == null) ? 0 : fP5.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PersonsTo5CliqueMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    PersonsTo5CliqueMatch other = (PersonsTo5CliqueMatch) obj;
    if (fP1 == null) {if (other.fP1 != null) return false;}
    else if (!fP1.equals(other.fP1)) return false;
    if (fP2 == null) {if (other.fP2 != null) return false;}
    else if (!fP2.equals(other.fP2)) return false;
    if (fP3 == null) {if (other.fP3 != null) return false;}
    else if (!fP3.equals(other.fP3)) return false;
    if (fP4 == null) {if (other.fP4 != null) return false;}
    else if (!fP4.equals(other.fP4)) return false;
    if (fP5 == null) {if (other.fP5 != null) return false;}
    else if (!fP5.equals(other.fP5)) return false;
    return true;
  }
  
  @Override
  public PersonsTo5CliqueQuerySpecification specification() {
    try {
    	return PersonsTo5CliqueQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends PersonsTo5CliqueMatch {
    Mutable(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
      super(pP1, pP2, pP3, pP4, pP5);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends PersonsTo5CliqueMatch {
    Immutable(final String pP1, final String pP2, final String pP3, final String pP4, final String pP5) {
      super(pP1, pP2, pP3, pP4, pP5);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}

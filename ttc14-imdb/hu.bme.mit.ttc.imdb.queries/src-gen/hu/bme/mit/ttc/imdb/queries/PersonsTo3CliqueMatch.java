package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.queries.util.PersonsTo3CliqueQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.personsTo3Clique pattern,
 * to be used in conjunction with {@link PersonsTo3CliqueMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PersonsTo3CliqueMatcher
 * @see PersonsTo3CliqueProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PersonsTo3CliqueMatch extends BasePatternMatch {
  private String fP1;
  
  private String fP2;
  
  private String fP3;
  
  private static List<String> parameterNames = makeImmutableList("P1", "P2", "P3");
  
  private PersonsTo3CliqueMatch(final String pP1, final String pP2, final String pP3) {
    this.fP1 = pP1;
    this.fP2 = pP2;
    this.fP3 = pP3;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("P1".equals(parameterName)) return this.fP1;
    if ("P2".equals(parameterName)) return this.fP2;
    if ("P3".equals(parameterName)) return this.fP3;
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
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.personsTo3Clique";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return PersonsTo3CliqueMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP1, fP2, fP3};
    
  }
  
  @Override
  public PersonsTo3CliqueMatch toImmutable() {
    return isMutable() ? newMatch(fP1, fP2, fP3) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"P1\"=" + prettyPrintValue(fP1) + ", ");
    result.append("\"P2\"=" + prettyPrintValue(fP2) + ", ");
    result.append("\"P3\"=" + prettyPrintValue(fP3));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP1 == null) ? 0 : fP1.hashCode());
    result = prime * result + ((fP2 == null) ? 0 : fP2.hashCode());
    result = prime * result + ((fP3 == null) ? 0 : fP3.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PersonsTo3CliqueMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    PersonsTo3CliqueMatch other = (PersonsTo3CliqueMatch) obj;
    if (fP1 == null) {if (other.fP1 != null) return false;}
    else if (!fP1.equals(other.fP1)) return false;
    if (fP2 == null) {if (other.fP2 != null) return false;}
    else if (!fP2.equals(other.fP2)) return false;
    if (fP3 == null) {if (other.fP3 != null) return false;}
    else if (!fP3.equals(other.fP3)) return false;
    return true;
  }
  
  @Override
  public PersonsTo3CliqueQuerySpecification specification() {
    try {
    	return PersonsTo3CliqueQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static PersonsTo3CliqueMatch newEmptyMatch() {
    return new Mutable(null, null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PersonsTo3CliqueMatch newMutableMatch(final String pP1, final String pP2, final String pP3) {
    return new Mutable(pP1, pP2, pP3);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1 the fixed value of pattern parameter P1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter P2, or null if not bound.
   * @param pP3 the fixed value of pattern parameter P3, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PersonsTo3CliqueMatch newMatch(final String pP1, final String pP2, final String pP3) {
    return new Immutable(pP1, pP2, pP3);
    
  }
  
  private static final class Mutable extends PersonsTo3CliqueMatch {
    Mutable(final String pP1, final String pP2, final String pP3) {
      super(pP1, pP2, pP3);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PersonsTo3CliqueMatch {
    Immutable(final String pP1, final String pP2, final String pP3) {
      super(pP1, pP2, pP3);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}

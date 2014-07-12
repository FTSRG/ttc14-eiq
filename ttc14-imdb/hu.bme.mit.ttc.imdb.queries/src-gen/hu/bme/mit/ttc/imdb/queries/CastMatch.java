package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.util.CastQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.cast pattern,
 * to be used in conjunction with {@link CastMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CastMatcher
 * @see CastProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CastMatch extends BasePatternMatch {
  private String fName;
  
  private Movie fM;
  
  private static List<String> parameterNames = makeImmutableList("name", "M");
  
  private CastMatch(final String pName, final Movie pM) {
    this.fName = pName;
    this.fM = pM;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("name".equals(parameterName)) return this.fName;
    if ("M".equals(parameterName)) return this.fM;
    return null;
    
  }
  
  public String getName() {
    return this.fName;
    
  }
  
  public Movie getM() {
    return this.fM;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    if ("M".equals(parameterName) ) {
    	this.fM = (hu.bme.mit.ttc.imdb.movies.Movie) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
    
  }
  
  public void setM(final Movie pM) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM = pM;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.cast";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CastMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fName, fM};
    
  }
  
  @Override
  public CastMatch toImmutable() {
    return isMutable() ? newMatch(fName, fM) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
    result.append("\"M\"=" + prettyPrintValue(fM));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    result = prime * result + ((fM == null) ? 0 : fM.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CastMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CastMatch other = (CastMatch) obj;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    if (fM == null) {if (other.fM != null) return false;}
    else if (!fM.equals(other.fM)) return false;
    return true;
  }
  
  @Override
  public CastQuerySpecification specification() {
    try {
    	return CastQuerySpecification.instance();
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
  public static CastMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pM the fixed value of pattern parameter M, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CastMatch newMutableMatch(final String pName, final Movie pM) {
    return new Mutable(pName, pM);
    
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
  public static CastMatch newMatch(final String pName, final Movie pM) {
    return new Immutable(pName, pM);
    
  }
  
  private static final class Mutable extends CastMatch {
    Mutable(final String pName, final Movie pM) {
      super(pName, pM);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CastMatch {
    Immutable(final String pName, final Movie pM) {
      super(pName, pM);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}

package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.util.CountOfCommonMoviesOfCoupleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.countOfCommonMoviesOfCouple pattern,
 * to be used in conjunction with {@link CountOfCommonMoviesOfCoupleMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CountOfCommonMoviesOfCoupleMatcher
 * @see CountOfCommonMoviesOfCoupleProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CountOfCommonMoviesOfCoupleMatch extends BasePatternMatch {
  private Person fP1;
  
  private Person fP2;
  
  private Integer fN;
  
  private static List<String> parameterNames = makeImmutableList("p1", "p2", "n");
  
  private CountOfCommonMoviesOfCoupleMatch(final Person pP1, final Person pP2, final Integer pN) {
    this.fP1 = pP1;
    this.fP2 = pP2;
    this.fN = pN;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p1".equals(parameterName)) return this.fP1;
    if ("p2".equals(parameterName)) return this.fP2;
    if ("n".equals(parameterName)) return this.fN;
    return null;
    
  }
  
  public Person getP1() {
    return this.fP1;
    
  }
  
  public Person getP2() {
    return this.fP2;
    
  }
  
  public Integer getN() {
    return this.fN;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("p1".equals(parameterName) ) {
    	this.fP1 = (hu.bme.mit.ttc.imdb.movies.Person) newValue;
    	return true;
    }
    if ("p2".equals(parameterName) ) {
    	this.fP2 = (hu.bme.mit.ttc.imdb.movies.Person) newValue;
    	return true;
    }
    if ("n".equals(parameterName) ) {
    	this.fN = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP1(final Person pP1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP1 = pP1;
    
  }
  
  public void setP2(final Person pP2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP2 = pP2;
    
  }
  
  public void setN(final Integer pN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fN = pN;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.countOfCommonMoviesOfCouple";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CountOfCommonMoviesOfCoupleMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP1, fP2, fN};
    
  }
  
  @Override
  public CountOfCommonMoviesOfCoupleMatch toImmutable() {
    return isMutable() ? newMatch(fP1, fP2, fN) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p1\"=" + prettyPrintValue(fP1) + ", ");
    result.append("\"p2\"=" + prettyPrintValue(fP2) + ", ");
    result.append("\"n\"=" + prettyPrintValue(fN));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP1 == null) ? 0 : fP1.hashCode());
    result = prime * result + ((fP2 == null) ? 0 : fP2.hashCode());
    result = prime * result + ((fN == null) ? 0 : fN.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CountOfCommonMoviesOfCoupleMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CountOfCommonMoviesOfCoupleMatch other = (CountOfCommonMoviesOfCoupleMatch) obj;
    if (fP1 == null) {if (other.fP1 != null) return false;}
    else if (!fP1.equals(other.fP1)) return false;
    if (fP2 == null) {if (other.fP2 != null) return false;}
    else if (!fP2.equals(other.fP2)) return false;
    if (fN == null) {if (other.fN != null) return false;}
    else if (!fN.equals(other.fN)) return false;
    return true;
  }
  
  @Override
  public CountOfCommonMoviesOfCoupleQuerySpecification specification() {
    try {
    	return CountOfCommonMoviesOfCoupleQuerySpecification.instance();
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
  public static CountOfCommonMoviesOfCoupleMatch newEmptyMatch() {
    return new Mutable(null, null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CountOfCommonMoviesOfCoupleMatch newMutableMatch(final Person pP1, final Person pP2, final Integer pN) {
    return new Mutable(pP1, pP2, pN);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pP1 the fixed value of pattern parameter p1, or null if not bound.
   * @param pP2 the fixed value of pattern parameter p2, or null if not bound.
   * @param pN the fixed value of pattern parameter n, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CountOfCommonMoviesOfCoupleMatch newMatch(final Person pP1, final Person pP2, final Integer pN) {
    return new Immutable(pP1, pP2, pN);
    
  }
  
  private static final class Mutable extends CountOfCommonMoviesOfCoupleMatch {
    Mutable(final Person pP1, final Person pP2, final Integer pN) {
      super(pP1, pP2, pN);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CountOfCommonMoviesOfCoupleMatch {
    Immutable(final Person pP1, final Person pP2, final Integer pN) {
      super(pP1, pP2, pN);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}

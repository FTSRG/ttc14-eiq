package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.util.CoupleWithRatingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.coupleWithRating pattern,
 * to be used in conjunction with {@link CoupleWithRatingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CoupleWithRatingMatcher
 * @see CoupleWithRatingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CoupleWithRatingMatch extends BasePatternMatch {
  private Person fP1;
  
  private Person fP2;
  
  private Double fAvgRating;
  
  private static List<String> parameterNames = makeImmutableList("p1", "p2", "avgRating");
  
  private CoupleWithRatingMatch(final Person pP1, final Person pP2, final Double pAvgRating) {
    this.fP1 = pP1;
    this.fP2 = pP2;
    this.fAvgRating = pAvgRating;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p1".equals(parameterName)) return this.fP1;
    if ("p2".equals(parameterName)) return this.fP2;
    if ("avgRating".equals(parameterName)) return this.fAvgRating;
    return null;
    
  }
  
  public Person getP1() {
    return this.fP1;
    
  }
  
  public Person getP2() {
    return this.fP2;
    
  }
  
  public Double getAvgRating() {
    return this.fAvgRating;
    
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
    if ("avgRating".equals(parameterName) ) {
    	this.fAvgRating = (java.lang.Double) newValue;
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
  
  public void setAvgRating(final Double pAvgRating) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAvgRating = pAvgRating;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.coupleWithRating";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CoupleWithRatingMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP1, fP2, fAvgRating};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p1\"=" + prettyPrintValue(fP1) + ", ");
    result.append("\"p2\"=" + prettyPrintValue(fP2) + ", ");
    result.append("\"avgRating\"=" + prettyPrintValue(fAvgRating));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP1 == null) ? 0 : fP1.hashCode());
    result = prime * result + ((fP2 == null) ? 0 : fP2.hashCode());
    result = prime * result + ((fAvgRating == null) ? 0 : fAvgRating.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CoupleWithRatingMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CoupleWithRatingMatch other = (CoupleWithRatingMatch) obj;
    if (fP1 == null) {if (other.fP1 != null) return false;}
    else if (!fP1.equals(other.fP1)) return false;
    if (fP2 == null) {if (other.fP2 != null) return false;}
    else if (!fP2.equals(other.fP2)) return false;
    if (fAvgRating == null) {if (other.fAvgRating != null) return false;}
    else if (!fAvgRating.equals(other.fAvgRating)) return false;
    return true;
  }
  
  @Override
  public CoupleWithRatingQuerySpecification specification() {
    try {
    	return CoupleWithRatingQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends CoupleWithRatingMatch {
    Mutable(final Person pP1, final Person pP2, final Double pAvgRating) {
      super(pP1, pP2, pAvgRating);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends CoupleWithRatingMatch {
    Immutable(final Person pP1, final Person pP2, final Double pAvgRating) {
      super(pP1, pP2, pAvgRating);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}

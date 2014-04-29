package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.queries.util.CommonMoviesToCoupleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.commonMoviesToCouple pattern,
 * to be used in conjunction with {@link CommonMoviesToCoupleMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CommonMoviesToCoupleMatcher
 * @see CommonMoviesToCoupleProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CommonMoviesToCoupleMatch extends BasePatternMatch {
  private String fP1name;
  
  private String fP2name;
  
  private Movie fM;
  
  private static List<String> parameterNames = makeImmutableList("p1name", "p2name", "m");
  
  private CommonMoviesToCoupleMatch(final String pP1name, final String pP2name, final Movie pM) {
    this.fP1name = pP1name;
    this.fP2name = pP2name;
    this.fM = pM;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p1name".equals(parameterName)) return this.fP1name;
    if ("p2name".equals(parameterName)) return this.fP2name;
    if ("m".equals(parameterName)) return this.fM;
    return null;
    
  }
  
  public String getP1name() {
    return this.fP1name;
    
  }
  
  public String getP2name() {
    return this.fP2name;
    
  }
  
  public Movie getM() {
    return this.fM;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("p1name".equals(parameterName) ) {
    	this.fP1name = (java.lang.String) newValue;
    	return true;
    }
    if ("p2name".equals(parameterName) ) {
    	this.fP2name = (java.lang.String) newValue;
    	return true;
    }
    if ("m".equals(parameterName) ) {
    	this.fM = (hu.bme.mit.ttc.imdb.movies.Movie) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP1name(final String pP1name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP1name = pP1name;
    
  }
  
  public void setP2name(final String pP2name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP2name = pP2name;
    
  }
  
  public void setM(final Movie pM) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fM = pM;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.commonMoviesToCouple";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CommonMoviesToCoupleMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP1name, fP2name, fM};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p1name\"=" + prettyPrintValue(fP1name) + ", ");
    result.append("\"p2name\"=" + prettyPrintValue(fP2name) + ", ");
    result.append("\"m\"=" + prettyPrintValue(fM));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP1name == null) ? 0 : fP1name.hashCode());
    result = prime * result + ((fP2name == null) ? 0 : fP2name.hashCode());
    result = prime * result + ((fM == null) ? 0 : fM.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CommonMoviesToCoupleMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CommonMoviesToCoupleMatch other = (CommonMoviesToCoupleMatch) obj;
    if (fP1name == null) {if (other.fP1name != null) return false;}
    else if (!fP1name.equals(other.fP1name)) return false;
    if (fP2name == null) {if (other.fP2name != null) return false;}
    else if (!fP2name.equals(other.fP2name)) return false;
    if (fM == null) {if (other.fM != null) return false;}
    else if (!fM.equals(other.fM)) return false;
    return true;
  }
  
  @Override
  public CommonMoviesToCoupleQuerySpecification specification() {
    try {
    	return CommonMoviesToCoupleQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends CommonMoviesToCoupleMatch {
    Mutable(final String pP1name, final String pP2name, final Movie pM) {
      super(pP1name, pP2name, pM);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends CommonMoviesToCoupleMatch {
    Immutable(final String pP1name, final String pP2name, final Movie pM) {
      super(pP1name, pP2name, pM);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}

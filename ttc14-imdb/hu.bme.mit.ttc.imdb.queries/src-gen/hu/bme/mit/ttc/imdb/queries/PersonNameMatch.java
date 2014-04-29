package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.util.PersonNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.personName pattern,
 * to be used in conjunction with {@link PersonNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PersonNameMatcher
 * @see PersonNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PersonNameMatch extends BasePatternMatch {
  private Person fP;
  
  private String fPName;
  
  private static List<String> parameterNames = makeImmutableList("p", "pName");
  
  private PersonNameMatch(final Person pP, final String pPName) {
    this.fP = pP;
    this.fPName = pPName;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("p".equals(parameterName)) return this.fP;
    if ("pName".equals(parameterName)) return this.fPName;
    return null;
    
  }
  
  public Person getP() {
    return this.fP;
    
  }
  
  public String getPName() {
    return this.fPName;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("p".equals(parameterName) ) {
    	this.fP = (hu.bme.mit.ttc.imdb.movies.Person) newValue;
    	return true;
    }
    if ("pName".equals(parameterName) ) {
    	this.fPName = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setP(final Person pP) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fP = pP;
    
  }
  
  public void setPName(final String pPName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPName = pPName;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.personName";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return PersonNameMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fP, fPName};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"p\"=" + prettyPrintValue(fP) + ", ");
    result.append("\"pName\"=" + prettyPrintValue(fPName));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fP == null) ? 0 : fP.hashCode());
    result = prime * result + ((fPName == null) ? 0 : fPName.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PersonNameMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    PersonNameMatch other = (PersonNameMatch) obj;
    if (fP == null) {if (other.fP != null) return false;}
    else if (!fP.equals(other.fP)) return false;
    if (fPName == null) {if (other.fPName != null) return false;}
    else if (!fPName.equals(other.fPName)) return false;
    return true;
  }
  
  @Override
  public PersonNameQuerySpecification specification() {
    try {
    	return PersonNameQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends PersonNameMatch {
    Mutable(final Person pP, final String pPName) {
      super(pP, pPName);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends PersonNameMatch {
    Immutable(final Person pP, final String pPName) {
      super(pP, pPName);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}

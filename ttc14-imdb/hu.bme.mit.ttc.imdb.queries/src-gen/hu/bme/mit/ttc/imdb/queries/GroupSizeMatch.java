package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Group;
import hu.bme.mit.ttc.imdb.queries.util.GroupSizeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.groupSize pattern,
 * to be used in conjunction with {@link GroupSizeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GroupSizeMatcher
 * @see GroupSizeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class GroupSizeMatch extends BasePatternMatch {
  private Group fGroup;
  
  private Integer fS;
  
  private static List<String> parameterNames = makeImmutableList("group", "S");
  
  private GroupSizeMatch(final Group pGroup, final Integer pS) {
    this.fGroup = pGroup;
    this.fS = pS;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("group".equals(parameterName)) return this.fGroup;
    if ("S".equals(parameterName)) return this.fS;
    return null;
    
  }
  
  public Group getGroup() {
    return this.fGroup;
    
  }
  
  public Integer getS() {
    return this.fS;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("group".equals(parameterName) ) {
    	this.fGroup = (hu.bme.mit.ttc.imdb.movies.Group) newValue;
    	return true;
    }
    if ("S".equals(parameterName) ) {
    	this.fS = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setGroup(final Group pGroup) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fGroup = pGroup;
    
  }
  
  public void setS(final Integer pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.groupSize";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return GroupSizeMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fGroup, fS};
    
  }
  
  @Override
  public GroupSizeMatch toImmutable() {
    return isMutable() ? newMatch(fGroup, fS) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"group\"=" + prettyPrintValue(fGroup) + ", ");
    result.append("\"S\"=" + prettyPrintValue(fS));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fGroup == null) ? 0 : fGroup.hashCode());
    result = prime * result + ((fS == null) ? 0 : fS.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof GroupSizeMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GroupSizeMatch other = (GroupSizeMatch) obj;
    if (fGroup == null) {if (other.fGroup != null) return false;}
    else if (!fGroup.equals(other.fGroup)) return false;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public GroupSizeQuerySpecification specification() {
    try {
    	return GroupSizeQuerySpecification.instance();
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
  public static GroupSizeMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pGroup the fixed value of pattern parameter group, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static GroupSizeMatch newMutableMatch(final Group pGroup, final Integer pS) {
    return new Mutable(pGroup, pS);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pGroup the fixed value of pattern parameter group, or null if not bound.
   * @param pS the fixed value of pattern parameter S, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static GroupSizeMatch newMatch(final Group pGroup, final Integer pS) {
    return new Immutable(pGroup, pS);
    
  }
  
  private static final class Mutable extends GroupSizeMatch {
    Mutable(final Group pGroup, final Integer pS) {
      super(pGroup, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends GroupSizeMatch {
    Immutable(final Group pGroup, final Integer pS) {
      super(pGroup, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}

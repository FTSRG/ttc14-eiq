package hu.bme.mit.ttc.imdb.queries;

import hu.bme.mit.ttc.imdb.movies.Group;
import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.util.MemberOfGroupQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.imdb.queries.memberOfGroup pattern,
 * to be used in conjunction with {@link MemberOfGroupMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MemberOfGroupMatcher
 * @see MemberOfGroupProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MemberOfGroupMatch extends BasePatternMatch {
  private Person fPerson;
  
  private Group fGroup;
  
  private static List<String> parameterNames = makeImmutableList("person", "group");
  
  private MemberOfGroupMatch(final Person pPerson, final Group pGroup) {
    this.fPerson = pPerson;
    this.fGroup = pGroup;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("person".equals(parameterName)) return this.fPerson;
    if ("group".equals(parameterName)) return this.fGroup;
    return null;
    
  }
  
  public Person getPerson() {
    return this.fPerson;
    
  }
  
  public Group getGroup() {
    return this.fGroup;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("person".equals(parameterName) ) {
    	this.fPerson = (hu.bme.mit.ttc.imdb.movies.Person) newValue;
    	return true;
    }
    if ("group".equals(parameterName) ) {
    	this.fGroup = (hu.bme.mit.ttc.imdb.movies.Group) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setPerson(final Person pPerson) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPerson = pPerson;
    
  }
  
  public void setGroup(final Group pGroup) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fGroup = pGroup;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.imdb.queries.memberOfGroup";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return MemberOfGroupMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPerson, fGroup};
    
  }
  
  @Override
  public MemberOfGroupMatch toImmutable() {
    return isMutable() ? newMatch(fPerson, fGroup) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"person\"=" + prettyPrintValue(fPerson) + ", ");
    result.append("\"group\"=" + prettyPrintValue(fGroup));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPerson == null) ? 0 : fPerson.hashCode());
    result = prime * result + ((fGroup == null) ? 0 : fGroup.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MemberOfGroupMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    MemberOfGroupMatch other = (MemberOfGroupMatch) obj;
    if (fPerson == null) {if (other.fPerson != null) return false;}
    else if (!fPerson.equals(other.fPerson)) return false;
    if (fGroup == null) {if (other.fGroup != null) return false;}
    else if (!fGroup.equals(other.fGroup)) return false;
    return true;
  }
  
  @Override
  public MemberOfGroupQuerySpecification specification() {
    try {
    	return MemberOfGroupQuerySpecification.instance();
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
  public static MemberOfGroupMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param pGroup the fixed value of pattern parameter group, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MemberOfGroupMatch newMutableMatch(final Person pPerson, final Group pGroup) {
    return new Mutable(pPerson, pGroup);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPerson the fixed value of pattern parameter person, or null if not bound.
   * @param pGroup the fixed value of pattern parameter group, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MemberOfGroupMatch newMatch(final Person pPerson, final Group pGroup) {
    return new Immutable(pPerson, pGroup);
    
  }
  
  private static final class Mutable extends MemberOfGroupMatch {
    Mutable(final Person pPerson, final Group pGroup) {
      super(pPerson, pGroup);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MemberOfGroupMatch {
    Immutable(final Person pPerson, final Group pGroup) {
      super(pPerson, pGroup);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}

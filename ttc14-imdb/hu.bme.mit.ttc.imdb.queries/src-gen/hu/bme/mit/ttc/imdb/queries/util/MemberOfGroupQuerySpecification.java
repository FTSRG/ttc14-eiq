package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.MemberOfGroupMatch;
import hu.bme.mit.ttc.imdb.queries.MemberOfGroupMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate MemberOfGroupMatcher in a type-safe way.
 * 
 * @see MemberOfGroupMatcher
 * @see MemberOfGroupMatch
 * 
 */
@SuppressWarnings("all")
public final class MemberOfGroupQuerySpecification extends BaseGeneratedQuerySpecification<MemberOfGroupMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MemberOfGroupQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected MemberOfGroupMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MemberOfGroupMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.memberOfGroup";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("person","group");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("person", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("group", "hu.bme.mit.ttc.imdb.movies.Group"));
  }
  
  @Override
  public MemberOfGroupMatch newEmptyMatch() {
    return MemberOfGroupMatch.newEmptyMatch();
  }
  
  @Override
  public MemberOfGroupMatch newMatch(final Object... parameters) {
    return MemberOfGroupMatch.newMatch((hu.bme.mit.ttc.imdb.movies.Person) parameters[0], (hu.bme.mit.ttc.imdb.movies.Group) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_person = body.getOrCreateVariableByName("person");
      PVariable var_group = body.getOrCreateVariableByName("group");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_person, "person"), 
        new ExportedParameter(body, var_group, "group")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_group, var_person, getFeatureLiteral("http://movies/1.0", "Couple", "p1"), "http://movies/1.0/Couple.p1");
      bodies.add(body);
    }
    {
      PBody body = new PBody(this);
      PVariable var_person = body.getOrCreateVariableByName("person");
      PVariable var_group = body.getOrCreateVariableByName("group");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_person, "person"), 
        new ExportedParameter(body, var_group, "group")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_group, var_person, getFeatureLiteral("http://movies/1.0", "Couple", "p2"), "http://movies/1.0/Couple.p2");
      bodies.add(body);
    }
    {
      PBody body = new PBody(this);
      PVariable var_person = body.getOrCreateVariableByName("person");
      PVariable var_group = body.getOrCreateVariableByName("group");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_person, "person"), 
        new ExportedParameter(body, var_group, "group")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_group, var_person, getFeatureLiteral("http://movies/1.0", "Clique", "persons"), "http://movies/1.0/Clique.persons");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static MemberOfGroupQuerySpecification INSTANCE = make();
    
    public static MemberOfGroupQuerySpecification make() {
      return new MemberOfGroupQuerySpecification();					
      
    }
  }
}

package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.GroupSizeMatcher;
import hu.bme.mit.ttc.imdb.queries.util.MemberOfGroupQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate GroupSizeMatcher in a type-safe way.
 * 
 * @see GroupSizeMatcher
 * @see GroupSizeMatch
 * 
 */
@SuppressWarnings("all")
public final class GroupSizeQuerySpecification extends BaseGeneratedQuerySpecification<GroupSizeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static GroupSizeQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected GroupSizeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return GroupSizeMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.groupSize";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("group","S");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("group", "hu.bme.mit.ttc.imdb.movies.Group"),new PParameter("S", "java.lang.Integer"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_group = body.getOrCreateVariableByName("group");
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_group, "group"), 
        new ExportedParameter(body, var_S, "S")
      ));
      
      
      new TypeUnary(body, var_group, getClassifierLiteral("http://movies/1.0", "Group"), "http://movies/1.0/Group");
      new PatternMatchCounter(body, new FlatTuple(var___0_, var_group), MemberOfGroupQuerySpecification.instance().instance(), var_S);
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<GroupSizeQuerySpecification> {
    @Override
    public GroupSizeQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static GroupSizeQuerySpecification INSTANCE = make();
    
    public static GroupSizeQuerySpecification make() {
      return new GroupSizeQuerySpecification();					
      
    }
  }
  
}

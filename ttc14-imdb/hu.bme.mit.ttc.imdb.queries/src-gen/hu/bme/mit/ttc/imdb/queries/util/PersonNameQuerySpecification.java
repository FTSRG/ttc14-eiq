package hu.bme.mit.ttc.imdb.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.imdb.queries.PersonNameMatch;
import hu.bme.mit.ttc.imdb.queries.PersonNameMatcher;
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
 * A pattern-specific query specification that can instantiate PersonNameMatcher in a type-safe way.
 * 
 * @see PersonNameMatcher
 * @see PersonNameMatch
 * 
 */
@SuppressWarnings("all")
public final class PersonNameQuerySpecification extends BaseGeneratedQuerySpecification<PersonNameMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PersonNameQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected PersonNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PersonNameMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.ttc.imdb.queries.personName";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("p","pName");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("p", "hu.bme.mit.ttc.imdb.movies.Person"),new PParameter("pName", "java.lang.String"));
  }
  
  @Override
  public PersonNameMatch newEmptyMatch() {
    return PersonNameMatch.newEmptyMatch();
  }
  
  @Override
  public PersonNameMatch newMatch(final Object... parameters) {
    return PersonNameMatch.newMatch((hu.bme.mit.ttc.imdb.movies.Person) parameters[0], (java.lang.String) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_p = body.getOrCreateVariableByName("p");
      PVariable var_pName = body.getOrCreateVariableByName("pName");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_p, "p"), 
        new ExportedParameter(body, var_pName, "pName")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_p, var_pName, getFeatureLiteral("http://movies/1.0", "Person", "name"), "http://movies/1.0/Person.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PersonNameQuerySpecification INSTANCE = make();
    
    public static PersonNameQuerySpecification make() {
      return new PersonNameQuerySpecification();					
      
    }
  }
}

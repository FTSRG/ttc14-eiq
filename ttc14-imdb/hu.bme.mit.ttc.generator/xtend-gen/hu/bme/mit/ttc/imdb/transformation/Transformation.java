package hu.bme.mit.ttc.imdb.transformation;

import hu.bme.mit.ttc.imdb.movies.MoviesFactory;
import hu.bme.mit.ttc.imdb.queries.Imdb;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class Transformation {
  protected Resource r;
  
  @Extension
  private MoviesFactory _moviesFactory = MoviesFactory.eINSTANCE;
  
  @Extension
  private Imdb _imdb = new Function0<Imdb>() {
    public Imdb apply() {
      try {
        Imdb _instance = Imdb.instance();
        return _instance;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  public void createCouples() {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method getAllValuesOfm(CommonMoviesOfCoupleMatch) is not applicable for the arguments (Person,Person)"
      + "\nType mismatch: cannot convert from Person to CommonMoviesOfCoupleMatch");
  }
}

package hu.bme.mit.ttc.imdb.transformation;

import hu.bme.mit.ttc.imdb.movies.MoviesFactory;
import hu.bme.mit.ttc.imdb.queries.CoupleMatch;
import hu.bme.mit.ttc.imdb.queries.CoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.Imdb;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
    try {
      final IncQueryEngine engine = IncQueryEngine.on(this.r);
      final CoupleMatcher coupleMatcher = this._imdb.getCouple(engine);
      final IMatchProcessor<CoupleMatch> _function = new IMatchProcessor<CoupleMatch>() {
        public void process(final CoupleMatch it) {
          String _prettyPrint = it.prettyPrint();
          InputOutput.<String>println(_prettyPrint);
        }
      };
      coupleMatcher.forEachMatch(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

package hu.bme.mit.ttc.imdb.transformation;

import hu.bme.mit.ttc.imdb.movies.Couple;
import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;
import hu.bme.mit.ttc.imdb.movies.Person;
import hu.bme.mit.ttc.imdb.queries.CommonMoviesOfCoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.CoupleMatch;
import hu.bme.mit.ttc.imdb.queries.CoupleMatcher;
import hu.bme.mit.ttc.imdb.queries.Imdb;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
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
    try {
      final IncQueryEngine engine = IncQueryEngine.on(this.r);
      final CoupleMatcher coupleMatcher = this._imdb.getCouple(engine);
      final CommonMoviesOfCoupleMatcher commonMoviesMatcher = this._imdb.getCommonMoviesOfCouple(engine);
      final IMatchProcessor<CoupleMatch> _function = new IMatchProcessor<CoupleMatch>() {
        public void process(final CoupleMatch it) {
          final Couple couple = Transformation.this._moviesFactory.createCouple();
          Person _p1 = it.getP1();
          couple.setP1(_p1);
          Person _p2 = it.getP2();
          couple.setP2(_p2);
          double sumRating = 0.0;
          Person _p1_1 = it.getP1();
          Person _p2_1 = it.getP2();
          final Set<Movie> commonMovies = commonMoviesMatcher.getAllValuesOfm(_p1_1, _p2_1);
          for (final Movie m : commonMovies) {
            {
              EList<Movie> _commonMovies = couple.getCommonMovies();
              _commonMovies.add(m);
              double _rating = m.getRating();
              double _plus = (sumRating + _rating);
              sumRating = _plus;
            }
          }
          final int n = commonMovies.size();
          double _divide = (sumRating / n);
          couple.setAvgRating(_divide);
          EList<EObject> _contents = Transformation.this.r.getContents();
          _contents.add(couple);
        }
      };
      coupleMatcher.forEachMatch(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

package hu.bme.mit.ttc.imdb.generator;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import hu.bme.mit.ttc.imdb.movies.Actor;
import hu.bme.mit.ttc.imdb.movies.Actress;
import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;
import hu.bme.mit.ttc.imdb.movies.Person;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Generator {
  protected Resource r;
  
  @Extension
  private MoviesFactory _moviesFactory = MoviesFactory.eINSTANCE;
  
  public void generate(final int N) {
    this.createExample(N);
  }
  
  public void createExample(final int N) {
    int _minus = (N - 1);
    IntegerRange _upTo = new IntegerRange(0, _minus);
    final Procedure1<Integer> _function = new Procedure1<Integer>() {
      public void apply(final Integer it) {
        Generator.this.createTest((it).intValue());
      }
    };
    IterableExtensions.<Integer>forEach(_upTo, _function);
  }
  
  public boolean createTest(final int n) {
    boolean _xblockexpression = false;
    {
      this.createPositive(n);
      boolean _createNegative = this.createNegative(n);
      _xblockexpression = (_createNegative);
    }
    return _xblockexpression;
  }
  
  public boolean createPositive(final int n) {
    boolean _xblockexpression = false;
    {
      final ArrayList<Movie> movies = CollectionLiterals.<Movie>newArrayList();
      IntegerRange _upTo = new IntegerRange(0, 4);
      final Procedure1<Integer> _function = new Procedure1<Integer>() {
        public void apply(final Integer it) {
          int _multiply = (10 * n);
          int _plus = (_multiply + (it).intValue());
          Movie _createMovie = Generator.this.createMovie(_plus);
          movies.add(_createMovie);
        }
      };
      IterableExtensions.<Integer>forEach(_upTo, _function);
      int _multiply = (10 * n);
      String _plus = ("a" + Integer.valueOf(_multiply));
      final Actor a = this.createActor(_plus);
      int _multiply_1 = (10 * n);
      int _plus_1 = (_multiply_1 + 1);
      String _plus_2 = ("a" + Integer.valueOf(_plus_1));
      final Actor b = this.createActor(_plus_2);
      int _multiply_2 = (10 * n);
      int _plus_3 = (_multiply_2 + 2);
      String _plus_4 = ("a" + Integer.valueOf(_plus_3));
      final Actor c = this.createActor(_plus_4);
      int _multiply_3 = (10 * n);
      int _plus_5 = (_multiply_3 + 3);
      String _plus_6 = ("a" + Integer.valueOf(_plus_5));
      final Actress d = this.createActress(_plus_6);
      int _multiply_4 = (10 * n);
      int _plus_7 = (_multiply_4 + 4);
      String _plus_8 = ("a" + Integer.valueOf(_plus_7));
      final Actress e = this.createActress(_plus_8);
      final ImmutableList<Person> actors = ImmutableList.<Person>of(a, b, c, d, e);
      final ImmutableList<Actor> firstTwo = ImmutableList.<Actor>of(a, b);
      final ImmutableList<Actress> lastTwo = ImmutableList.<Actress>of(d, e);
      Movie _get = movies.get(0);
      EList<Person> _persons = _get.getPersons();
      Iterables.<Person>addAll(_persons, firstTwo);
      IntegerRange _upTo_1 = new IntegerRange(1, 3);
      final Procedure1<Integer> _function_1 = new Procedure1<Integer>() {
        public void apply(final Integer it) {
          Movie _get = movies.get((it).intValue());
          EList<Person> _persons = _get.getPersons();
          Iterables.<Person>addAll(_persons, actors);
        }
      };
      IterableExtensions.<Integer>forEach(_upTo_1, _function_1);
      Movie _get_1 = movies.get(4);
      EList<Person> _persons_1 = _get_1.getPersons();
      Iterables.<Person>addAll(_persons_1, lastTwo);
      EList<EObject> _contents = this.r.getContents();
      Iterables.<EObject>addAll(_contents, actors);
      EList<EObject> _contents_1 = this.r.getContents();
      boolean _add = Iterables.<EObject>addAll(_contents_1, movies);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public boolean createNegative(final int n) {
    boolean _xblockexpression = false;
    {
      final ArrayList<Movie> movies = CollectionLiterals.<Movie>newArrayList();
      IntegerRange _upTo = new IntegerRange(5, 9);
      final Procedure1<Integer> _function = new Procedure1<Integer>() {
        public void apply(final Integer it) {
          int _multiply = (10 * n);
          int _plus = (_multiply + (it).intValue());
          Movie _createMovie = Generator.this.createMovie(_plus);
          movies.add(_createMovie);
        }
      };
      IterableExtensions.<Integer>forEach(_upTo, _function);
      int _multiply = (10 * n);
      int _plus = (_multiply + 5);
      String _plus_1 = ("a" + Integer.valueOf(_plus));
      final Actor a = this.createActor(_plus_1);
      int _multiply_1 = (10 * n);
      int _plus_2 = (_multiply_1 + 6);
      String _plus_3 = ("a" + Integer.valueOf(_plus_2));
      final Actor b = this.createActor(_plus_3);
      int _multiply_2 = (10 * n);
      int _plus_4 = (_multiply_2 + 7);
      String _plus_5 = ("a" + Integer.valueOf(_plus_4));
      final Actress c = this.createActress(_plus_5);
      int _multiply_3 = (10 * n);
      int _plus_6 = (_multiply_3 + 8);
      String _plus_7 = ("a" + Integer.valueOf(_plus_6));
      final Actress d = this.createActress(_plus_7);
      int _multiply_4 = (10 * n);
      int _plus_8 = (_multiply_4 + 9);
      String _plus_9 = ("a" + Integer.valueOf(_plus_8));
      final Actress e = this.createActress(_plus_9);
      final ImmutableList<Person> actors = ImmutableList.<Person>of(a, b, c, d, e);
      Movie _get = movies.get(0);
      EList<Person> _persons = _get.getPersons();
      ImmutableList<Person> _of = ImmutableList.<Person>of(a, b);
      Iterables.<Person>addAll(_persons, _of);
      Movie _get_1 = movies.get(1);
      EList<Person> _persons_1 = _get_1.getPersons();
      ImmutableList<Person> _of_1 = ImmutableList.<Person>of(a, b, c);
      Iterables.<Person>addAll(_persons_1, _of_1);
      Movie _get_2 = movies.get(2);
      EList<Person> _persons_2 = _get_2.getPersons();
      ImmutableList<Person> _of_2 = ImmutableList.<Person>of(b, c, d);
      Iterables.<Person>addAll(_persons_2, _of_2);
      Movie _get_3 = movies.get(3);
      EList<Person> _persons_3 = _get_3.getPersons();
      ImmutableList<Person> _of_3 = ImmutableList.<Person>of(c, d, e);
      Iterables.<Person>addAll(_persons_3, _of_3);
      Movie _get_4 = movies.get(4);
      EList<Person> _persons_4 = _get_4.getPersons();
      ImmutableList<Person> _of_4 = ImmutableList.<Person>of(d, e);
      Iterables.<Person>addAll(_persons_4, _of_4);
      EList<EObject> _contents = this.r.getContents();
      Iterables.<EObject>addAll(_contents, actors);
      EList<EObject> _contents_1 = this.r.getContents();
      boolean _add = Iterables.<EObject>addAll(_contents_1, movies);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public Movie createMovie(final int rating) {
    Movie _xblockexpression = null;
    {
      final Movie movie = this._moviesFactory.createMovie();
      movie.setRating(rating);
      _xblockexpression = (movie);
    }
    return _xblockexpression;
  }
  
  public Actor createActor(final String name) {
    Actor _xblockexpression = null;
    {
      final Actor actor = this._moviesFactory.createActor();
      actor.setName(name);
      _xblockexpression = (actor);
    }
    return _xblockexpression;
  }
  
  public Actress createActress(final String name) {
    Actress _xblockexpression = null;
    {
      final Actress actress = this._moviesFactory.createActress();
      actress.setName(name);
      _xblockexpression = (actress);
    }
    return _xblockexpression;
  }
}

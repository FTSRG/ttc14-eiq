/**
 */
package hu.bme.mit.ttc.imdb.movies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.ttc.imdb.movies.MoviesFactory
 * @model kind="package"
 * @generated
 */
public interface MoviesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "movies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://movies/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "movies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoviesPackage eINSTANCE = hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ContainedElementImpl <em>Contained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.ContainedElementImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getContainedElement()
	 * @generated
	 */
	int CONTAINED_ELEMENT = 8;

	/**
	 * The number of structural features of the '<em>Contained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.PersonImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOVIES = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.ActorImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MOVIES = PERSON__MOVIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = PERSON__NAME;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ActressImpl <em>Actress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.ActressImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getActress()
	 * @generated
	 */
	int ACTRESS = 2;

	/**
	 * The feature id for the '<em><b>Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTRESS__MOVIES = PERSON__MOVIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTRESS__NAME = PERSON__NAME;

	/**
	 * The number of structural features of the '<em>Actress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTRESS_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTRESS_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.GroupImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Common Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COMMON_MOVIES = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avg Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__AVG_RATING = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.CoupleImpl <em>Couple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.CoupleImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getCouple()
	 * @generated
	 */
	int COUPLE = 3;

	/**
	 * The feature id for the '<em><b>Common Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE__COMMON_MOVIES = GROUP__COMMON_MOVIES;

	/**
	 * The feature id for the '<em><b>Avg Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE__AVG_RATING = GROUP__AVG_RATING;

	/**
	 * The feature id for the '<em><b>P1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE__P1 = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE__P2 = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Couple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE_FEATURE_COUNT = GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Couple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLE_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MovieImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 4;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__PERSONS = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TITLE = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__RATING = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__YEAR = CONTAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TYPE = CONTAINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.CliqueImpl <em>Clique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.CliqueImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getClique()
	 * @generated
	 */
	int CLIQUE = 6;

	/**
	 * The feature id for the '<em><b>Common Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIQUE__COMMON_MOVIES = GROUP__COMMON_MOVIES;

	/**
	 * The feature id for the '<em><b>Avg Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIQUE__AVG_RATING = GROUP__AVG_RATING;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIQUE__PERSONS = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIQUE_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIQUE_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.impl.RootImpl
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.ttc.imdb.movies.MovieType <em>Movie Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.ttc.imdb.movies.MovieType
	 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getMovieType()
	 * @generated
	 */
	int MOVIE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.ttc.imdb.movies.Person#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Movies</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Person#getMovies()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Movies();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Actress <em>Actress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actress</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Actress
	 * @generated
	 */
	EClass getActress();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Couple <em>Couple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Couple</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Couple
	 * @generated
	 */
	EClass getCouple();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.ttc.imdb.movies.Couple#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>P1</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Couple#getP1()
	 * @see #getCouple()
	 * @generated
	 */
	EReference getCouple_P1();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.ttc.imdb.movies.Couple#getP2 <em>P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>P2</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Couple#getP2()
	 * @see #getCouple()
	 * @generated
	 */
	EReference getCouple_P2();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.ttc.imdb.movies.Movie#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getPersons()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Persons();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Movie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getTitle()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Title();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Movie#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getRating()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Rating();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Movie#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getYear()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Year();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Movie#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getType()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.ttc.imdb.movies.Group#getCommonMovies <em>Common Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Common Movies</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Group#getCommonMovies()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_CommonMovies();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.ttc.imdb.movies.Group#getAvgRating <em>Avg Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Rating</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Group#getAvgRating()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_AvgRating();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Clique <em>Clique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clique</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Clique
	 * @generated
	 */
	EClass getClique();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.ttc.imdb.movies.Clique#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Clique#getPersons()
	 * @see #getClique()
	 * @generated
	 */
	EReference getClique_Persons();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.ttc.imdb.movies.Root#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.Root#getChildren()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Children();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.ttc.imdb.movies.ContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Element</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.ContainedElement
	 * @generated
	 */
	EClass getContainedElement();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.ttc.imdb.movies.MovieType <em>Movie Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Movie Type</em>'.
	 * @see hu.bme.mit.ttc.imdb.movies.MovieType
	 * @generated
	 */
	EEnum getMovieType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoviesFactory getMoviesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.PersonImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Movies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MOVIES = eINSTANCE.getPerson_Movies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.ActorImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ActressImpl <em>Actress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.ActressImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getActress()
		 * @generated
		 */
		EClass ACTRESS = eINSTANCE.getActress();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.CoupleImpl <em>Couple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.CoupleImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getCouple()
		 * @generated
		 */
		EClass COUPLE = eINSTANCE.getCouple();

		/**
		 * The meta object literal for the '<em><b>P1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLE__P1 = eINSTANCE.getCouple_P1();

		/**
		 * The meta object literal for the '<em><b>P2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLE__P2 = eINSTANCE.getCouple_P2();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MovieImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__PERSONS = eINSTANCE.getMovie_Persons();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__TITLE = eINSTANCE.getMovie_Title();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__RATING = eINSTANCE.getMovie_Rating();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__YEAR = eINSTANCE.getMovie_Year();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__TYPE = eINSTANCE.getMovie_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.GroupImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Common Movies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__COMMON_MOVIES = eINSTANCE.getGroup_CommonMovies();

		/**
		 * The meta object literal for the '<em><b>Avg Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__AVG_RATING = eINSTANCE.getGroup_AvgRating();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.CliqueImpl <em>Clique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.CliqueImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getClique()
		 * @generated
		 */
		EClass CLIQUE = eINSTANCE.getClique();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIQUE__PERSONS = eINSTANCE.getClique_Persons();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.RootImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CHILDREN = eINSTANCE.getRoot_Children();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.impl.ContainedElementImpl <em>Contained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.impl.ContainedElementImpl
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getContainedElement()
		 * @generated
		 */
		EClass CONTAINED_ELEMENT = eINSTANCE.getContainedElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.ttc.imdb.movies.MovieType <em>Movie Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.ttc.imdb.movies.MovieType
		 * @see hu.bme.mit.ttc.imdb.movies.impl.MoviesPackageImpl#getMovieType()
		 * @generated
		 */
		EEnum MOVIE_TYPE = eINSTANCE.getMovieType();

	}

} //MoviesPackage

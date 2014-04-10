/**
 */
package hu.bme.mit.ttc.imdb.movies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Movie#getPersons <em>Persons</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Movie#getTitle <em>Title</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Movie#getRating <em>Rating</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Movie#getYear <em>Year</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Movie#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie()
 * @model
 * @generated
 */
public interface Movie extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.ttc.imdb.movies.Person}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.ttc.imdb.movies.Person#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie_Persons()
	 * @see hu.bme.mit.ttc.imdb.movies.Person#getMovies
	 * @model opposite="movies"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Movie#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(double)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie_Rating()
	 * @model
	 * @generated
	 */
	double getRating();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Movie#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(double value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Movie#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.ttc.imdb.movies.MovieType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.ttc.imdb.movies.MovieType
	 * @see #setType(MovieType)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getMovie_Type()
	 * @model
	 * @generated
	 */
	MovieType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Movie#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.ttc.imdb.movies.MovieType
	 * @see #getType()
	 * @generated
	 */
	void setType(MovieType value);

} // Movie

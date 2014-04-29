/**
 */
package hu.bme.mit.ttc.imdb.movies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Person#getMovies <em>Movies</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Person#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends ContainedElement {
	/**
	 * Returns the value of the '<em><b>Movies</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.ttc.imdb.movies.Movie}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.ttc.imdb.movies.Movie#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movies</em>' reference list.
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getPerson_Movies()
	 * @see hu.bme.mit.ttc.imdb.movies.Movie#getPersons
	 * @model opposite="persons"
	 * @generated
	 */
	EList<Movie> getMovies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Person

/**
 */
package hu.bme.mit.ttc.imdb.movies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Couple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Couple#getP1 <em>P1</em>}</li>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Couple#getP2 <em>P2</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getCouple()
 * @model
 * @generated
 */
public interface Couple extends Group {
	/**
	 * Returns the value of the '<em><b>P1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1</em>' reference.
	 * @see #setP1(Person)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getCouple_P1()
	 * @model
	 * @generated
	 */
	Person getP1();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Couple#getP1 <em>P1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P1</em>' reference.
	 * @see #getP1()
	 * @generated
	 */
	void setP1(Person value);

	/**
	 * Returns the value of the '<em><b>P2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P2</em>' reference.
	 * @see #setP2(Person)
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getCouple_P2()
	 * @model
	 * @generated
	 */
	Person getP2();

	/**
	 * Sets the value of the '{@link hu.bme.mit.ttc.imdb.movies.Couple#getP2 <em>P2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P2</em>' reference.
	 * @see #getP2()
	 * @generated
	 */
	void setP2(Person value);

} // Couple

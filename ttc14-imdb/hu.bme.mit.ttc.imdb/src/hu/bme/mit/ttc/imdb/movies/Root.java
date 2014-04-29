/**
 */
package hu.bme.mit.ttc.imdb.movies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ttc.imdb.movies.Root#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.ttc.imdb.movies.ContainedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see hu.bme.mit.ttc.imdb.movies.MoviesPackage#getRoot_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainedElement> getChildren();

} // Root

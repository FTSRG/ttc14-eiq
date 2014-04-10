/**
 */
package hu.bme.mit.ttc.imdb.movies.tests;

import hu.bme.mit.ttc.imdb.movies.Movie;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MovieTest extends TestCase {

	/**
	 * The fixture for this Movie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Movie fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MovieTest.class);
	}

	/**
	 * Constructs a new Movie test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovieTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Movie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Movie fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Movie test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Movie getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MoviesFactory.eINSTANCE.createMovie());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MovieTest

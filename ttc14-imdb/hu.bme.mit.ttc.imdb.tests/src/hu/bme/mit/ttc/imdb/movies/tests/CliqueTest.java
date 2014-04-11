/**
 */
package hu.bme.mit.ttc.imdb.movies.tests;

import hu.bme.mit.ttc.imdb.movies.Clique;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clique</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CliqueTest extends GroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CliqueTest.class);
	}

	/**
	 * Constructs a new Clique test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliqueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clique test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clique getFixture() {
		return (Clique)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MoviesFactory.eINSTANCE.createClique());
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

} //CliqueTest
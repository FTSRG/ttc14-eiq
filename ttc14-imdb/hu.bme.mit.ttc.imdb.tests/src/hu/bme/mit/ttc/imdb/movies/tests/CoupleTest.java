/**
 */
package hu.bme.mit.ttc.imdb.movies.tests;

import hu.bme.mit.ttc.imdb.movies.Couple;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Couple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoupleTest extends GroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoupleTest.class);
	}

	/**
	 * Constructs a new Couple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Couple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Couple getFixture() {
		return (Couple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MoviesFactory.eINSTANCE.createCouple());
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

} //CoupleTest

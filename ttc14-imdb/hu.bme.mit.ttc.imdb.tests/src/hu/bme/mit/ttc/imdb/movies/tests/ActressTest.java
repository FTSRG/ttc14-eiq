/**
 */
package hu.bme.mit.ttc.imdb.movies.tests;

import hu.bme.mit.ttc.imdb.movies.Actress;
import hu.bme.mit.ttc.imdb.movies.MoviesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actress</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActressTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActressTest.class);
	}

	/**
	 * Constructs a new Actress test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActressTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actress test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Actress getFixture() {
		return (Actress)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MoviesFactory.eINSTANCE.createActress());
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

} //ActressTest

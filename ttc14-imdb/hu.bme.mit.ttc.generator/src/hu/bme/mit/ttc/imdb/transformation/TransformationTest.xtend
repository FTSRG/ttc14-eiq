package hu.bme.mit.ttc.imdb.transformation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test

class TransformationTest {

	ResourceSet rs;
	Resource r;

	@Test
	def test() {
		rs = new ResourceSetImpl;
		r = rs.getResource(URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true), true);

		val transformation = new Transformation
		transformation.r = r
		transformation.createCouples
	}

}

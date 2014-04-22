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
	def testSyntheticMovies() {
		xform(URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true))
	}

	
	def xform(URI instanceModelURI) {
		rs = new ResourceSetImpl;
		r = rs.getResource(instanceModelURI, true);

		val transformation = new Transformation
		transformation.r = r
		transformation.createCouples
		
		r.save(emptyMap)
	}

}

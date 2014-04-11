package hu.bme.mit.ttc.imdb.transformation;

import hu.bme.mit.ttc.imdb.transformation.Transformation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

@SuppressWarnings("all")
public class TransformationTest {
  private ResourceSet rs;
  
  private Resource r;
  
  @Test
  public void test() {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    this.rs = _resourceSetImpl;
    URI _createPlatformResourceURI = URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true);
    Resource _resource = this.rs.getResource(_createPlatformResourceURI, true);
    this.r = _resource;
    Transformation _transformation = new Transformation();
    final Transformation transformation = _transformation;
    transformation.r = this.r;
    transformation.createCouples();
  }
}

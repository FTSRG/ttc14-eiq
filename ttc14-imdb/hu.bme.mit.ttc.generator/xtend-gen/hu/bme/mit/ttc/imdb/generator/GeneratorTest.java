package hu.bme.mit.ttc.imdb.generator;

import hu.bme.mit.ttc.imdb.generator.Generator;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;

@SuppressWarnings("all")
public class GeneratorTest {
  private ResourceSet rs;
  
  private Resource r;
  
  @Test
  public void test() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      this.rs = _resourceSetImpl;
      URI _createPlatformResourceURI = URI.createPlatformResourceURI("hu.bme.mit.ttc.imdb.instance/model/synthetic.movies", true);
      Resource _createResource = this.rs.createResource(_createPlatformResourceURI);
      this.r = _createResource;
      Generator _generator = new Generator();
      final Generator generator = _generator;
      generator.r = this.r;
      generator.generate(1);
      Map<Object,Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      this.r.save(_emptyMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

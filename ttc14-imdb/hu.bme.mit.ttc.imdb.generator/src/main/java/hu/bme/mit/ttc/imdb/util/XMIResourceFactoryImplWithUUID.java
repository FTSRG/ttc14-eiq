package hu.bme.mit.ttc.imdb.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XMIResourceFactoryImplWithUUID extends XMIResourceFactoryImpl {

	public XMIResourceFactoryImplWithUUID() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(URI uri) {
		return new XMIResourceImplWithUUID(uri);
	}
}

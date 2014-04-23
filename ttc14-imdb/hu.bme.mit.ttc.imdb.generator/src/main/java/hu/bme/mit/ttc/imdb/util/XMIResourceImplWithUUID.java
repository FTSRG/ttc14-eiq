package hu.bme.mit.ttc.imdb.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class XMIResourceImplWithUUID extends XMIResourceImpl {

	public XMIResourceImplWithUUID() {
		super();
	}

	public XMIResourceImplWithUUID(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	protected boolean useUUIDs() {
		return true;
	}
}

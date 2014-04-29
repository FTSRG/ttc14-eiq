package hu.bme.mit.ttc.imdb.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class XMIResourceImplWithUUID extends XMIResourceImpl {

	public new() {
		super();
	}

	public new(URI uri) {
		super(uri);
	}

	override protected boolean useUUIDs() {
		return true;
	}
}

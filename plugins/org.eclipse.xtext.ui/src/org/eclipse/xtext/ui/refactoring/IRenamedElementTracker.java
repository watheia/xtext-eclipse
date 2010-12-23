/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.refactoring;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.RenamedElementTracker;

import com.google.inject.ImplementedBy;

/**
 * Tracks the URIs of the elements whose names change in a refactoring. This is necessary as URIs could change if the
 * language implements a name dependent {@link org.eclipse.xtext.resource.IFragmentProvider}.
 * 
 * @author koehnlein - Initial contribution and API
 */
@ImplementedBy(RenamedElementTracker.class)
public interface IRenamedElementTracker {

	/**
	 * Applies the semantic change, relocates the renamedElements and returns a map of original to new {@link URI URIs}.
	 */
	Map<URI, URI> renameAndTrack(Iterable<URI> renamedElementURIs, String newName, ResourceSet resourceSet,
			IRenameStrategy renameStrategy, IProgressMonitor monitor);

}
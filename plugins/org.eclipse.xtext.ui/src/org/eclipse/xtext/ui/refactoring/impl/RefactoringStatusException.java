/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.refactoring.impl;

/**
 * A convenient way to stop calculation of refactoring changes.
 * 
 * The message will be reported to the {@link org.eclipse.ltk.core.refactoring.RefactoringStatus} and thus to the UI.
 * For any other exception, the stack trace is logged to the console additionally.
 * 
 * @author koehnlein - Initial contribution and API
 */
public class RefactoringStatusException extends RuntimeException {

	private static final long serialVersionUID = 6796021485044787459L;
	private final boolean isFatal;

	public RefactoringStatusException(String message, boolean isFatal) {
		super(message);
		this.isFatal = isFatal;
	}

	public boolean isFatal() {
		return isFatal;
	}

}
/**
 * <copyright>
 * </copyright>
 *
 * $Id: AValidator.java,v 1.1 2010/02/03 18:24:42 sefftinge Exp $
 */
package org.eclipse.xtext.ui.common.editor.outline.impl.simplestructure.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.ui.common.editor.outline.impl.simplestructure.A;
import org.eclipse.xtext.ui.common.editor.outline.impl.simplestructure.B;

/**
 * A sample validator interface for {@link org.eclipse.xtext.ui.editor.outline.impl.simplestructure.A}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AValidator {
	boolean validate();

	boolean validateA(A value);
	boolean validateB(EList<B> value);
	boolean validateName(String value);
}

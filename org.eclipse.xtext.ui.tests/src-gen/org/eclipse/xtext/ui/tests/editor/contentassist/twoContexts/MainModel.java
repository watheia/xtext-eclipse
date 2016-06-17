/**
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.twoContexts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.twoContexts.MainModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.twoContexts.TwoContextsPackage#getMainModel()
 * @model
 * @generated
 */
public interface MainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ui.tests.editor.contentassist.twoContexts.AnElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.twoContexts.TwoContextsPackage#getMainModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AnElement> getElements();

} // MainModel

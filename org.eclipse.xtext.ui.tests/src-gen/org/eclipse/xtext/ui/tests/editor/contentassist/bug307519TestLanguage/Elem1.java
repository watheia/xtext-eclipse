/**
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elem1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Elem1#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Bug307519TestLanguagePackage#getElem1()
 * @model
 * @generated
 */
public interface Elem1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.EnumT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.EnumT
   * @see #setValue(EnumT)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Bug307519TestLanguagePackage#getElem1_Value()
   * @model
   * @generated
   */
  EnumT getValue();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.Elem1#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug307519TestLanguage.EnumT
   * @see #getValue()
   * @generated
   */
  void setValue(EnumT value);

} // Elem1

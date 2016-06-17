/**
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Alias Where Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getRightAlias <em>Right Alias</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Bug287941TestLanguagePackage#getReferenceAliasWhereEntry()
 * @model
 * @generated
 */
public interface ReferenceAliasWhereEntry extends WhereEntry
{
  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(FromEntry)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Bug287941TestLanguagePackage#getReferenceAliasWhereEntry_Alias()
   * @model
   * @generated
   */
  FromEntry getAlias();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(FromEntry value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(EReference)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Bug287941TestLanguagePackage#getReferenceAliasWhereEntry_Reference()
   * @model
   * @generated
   */
  EReference getReference();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(EReference value);

  /**
   * Returns the value of the '<em><b>Right Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Alias</em>' reference.
   * @see #setRightAlias(FromEntry)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.Bug287941TestLanguagePackage#getReferenceAliasWhereEntry_RightAlias()
   * @model
   * @generated
   */
  FromEntry getRightAlias();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug287941TestLanguage.ReferenceAliasWhereEntry#getRightAlias <em>Right Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Alias</em>' reference.
   * @see #getRightAlias()
   * @generated
   */
  void setRightAlias(FromEntry value);

} // ReferenceAliasWhereEntry

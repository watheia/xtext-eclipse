/**
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyPackage#getDirectives <em>Directives</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Bug347012TestLanguagePackage#getMyPackage()
 * @model
 * @generated
 */
public interface MyPackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Bug347012TestLanguagePackage#getMyPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyPackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.MyClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directives</em>' containment reference list.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug347012TestLanguage.Bug347012TestLanguagePackage#getMyPackage_Directives()
   * @model containment="true"
   * @generated
   */
  EList<MyClass> getDirectives();

} // MyPackage

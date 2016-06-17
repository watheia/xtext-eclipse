/**
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.PropertyOperator#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.PropertyOperator#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.Bug303200TestLanguagePackage#getPropertyOperator()
 * @model
 * @generated
 */
public interface PropertyOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.Bug303200TestLanguagePackage#getPropertyOperator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.PropertyOperator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(ListExpression)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.Bug303200TestLanguagePackage#getPropertyOperator_Expressions()
   * @model containment="true"
   * @generated
   */
  ListExpression getExpressions();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug303200TestLanguage.PropertyOperator#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(ListExpression value);

} // PropertyOperator

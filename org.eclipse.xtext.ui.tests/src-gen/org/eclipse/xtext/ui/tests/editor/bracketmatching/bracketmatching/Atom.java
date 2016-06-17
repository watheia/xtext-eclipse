/**
 */
package org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.Atom#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.BracketmatchingPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.BracketmatchingPackage#getAtom_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.bracketmatching.bracketmatching.Atom#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Atom

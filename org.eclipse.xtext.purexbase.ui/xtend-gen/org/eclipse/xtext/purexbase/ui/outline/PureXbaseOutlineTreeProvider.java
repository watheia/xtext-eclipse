/**
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase.ui.outline;

import org.eclipse.xtext.purexbase.pureXbase.Model;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
@SuppressWarnings("all")
public class PureXbaseOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final Model m) {
    return true;
  }
}

/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.bracketmatching.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BmTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/editor/bracketmatching/parser/antlr/internal/InternalBmTestLanguage.tokens");
	}
}

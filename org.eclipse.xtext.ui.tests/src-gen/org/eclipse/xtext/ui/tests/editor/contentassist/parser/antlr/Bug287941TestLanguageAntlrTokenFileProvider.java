/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Bug287941TestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalBug287941TestLanguage.tokens");
	}
}

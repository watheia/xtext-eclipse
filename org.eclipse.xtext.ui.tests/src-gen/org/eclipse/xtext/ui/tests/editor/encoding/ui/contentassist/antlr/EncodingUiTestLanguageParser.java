/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.editor.encoding.services.EncodingUiTestLanguageGrammarAccess;

public class EncodingUiTestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private EncodingUiTestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr.internal.InternalEncodingUiTestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr.internal.InternalEncodingUiTestLanguageParser result = new org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr.internal.InternalEncodingUiTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getWordsAssignment(), "rule__Model__WordsAssignment");
					put(grammarAccess.getWordAccess().getValueAssignment(), "rule__Word__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr.internal.InternalEncodingUiTestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.editor.encoding.ui.contentassist.antlr.internal.InternalEncodingUiTestLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}
	
	public EncodingUiTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EncodingUiTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

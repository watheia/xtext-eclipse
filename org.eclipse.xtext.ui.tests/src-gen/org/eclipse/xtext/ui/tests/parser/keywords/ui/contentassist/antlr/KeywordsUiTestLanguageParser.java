/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.parser.keywords.services.KeywordsUiTestLanguageGrammarAccess;

public class KeywordsUiTestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private KeywordsUiTestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal.InternalKeywordsUiTestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal.InternalKeywordsUiTestLanguageParser result = new org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal.InternalKeywordsUiTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getModelAccess().getFirstAssignment_0(), "rule__Model__FirstAssignment_0");
					put(grammarAccess.getModelAccess().getSecondAssignment_1(), "rule__Model__SecondAssignment_1");
					put(grammarAccess.getModelAccess().getThirdAssignment_2(), "rule__Model__ThirdAssignment_2");
					put(grammarAccess.getModelAccess().getForthAssignment_3(), "rule__Model__ForthAssignment_3");
					put(grammarAccess.getModelAccess().getFifthAssignment_4(), "rule__Model__FifthAssignment_4");
					put(grammarAccess.getModelAccess().getSixthAssignment_5(), "rule__Model__SixthAssignment_5");
					put(grammarAccess.getModelAccess().getSeventhAssignment_6(), "rule__Model__SeventhAssignment_6");
					put(grammarAccess.getModelAccess().getEighthAssignment_7(), "rule__Model__EighthAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal.InternalKeywordsUiTestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.parser.keywords.ui.contentassist.antlr.internal.InternalKeywordsUiTestLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public KeywordsUiTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KeywordsUiTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

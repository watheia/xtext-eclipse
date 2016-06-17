/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.quickfix.services.QuickfixCrossrefTestLanguageGrammarAccess;

public class QuickfixCrossrefTestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private QuickfixCrossrefTestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr.internal.InternalQuickfixCrossrefTestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr.internal.InternalQuickfixCrossrefTestLanguageParser result = new org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr.internal.InternalQuickfixCrossrefTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getElementAccess().getGroup_4(), "rule__Element__Group_4__0");
					put(grammarAccess.getMainAccess().getElementsAssignment(), "rule__Main__ElementsAssignment");
					put(grammarAccess.getElementAccess().getDocAssignment_0(), "rule__Element__DocAssignment_0");
					put(grammarAccess.getElementAccess().getNameAssignment_1(), "rule__Element__NameAssignment_1");
					put(grammarAccess.getElementAccess().getContainedAssignment_3(), "rule__Element__ContainedAssignment_3");
					put(grammarAccess.getElementAccess().getReferencedAssignment_4_1(), "rule__Element__ReferencedAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr.internal.InternalQuickfixCrossrefTestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.quickfix.ui.contentassist.antlr.internal.InternalQuickfixCrossrefTestLanguageParser) parser;
			typedParser.entryRuleMain();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QuickfixCrossrefTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QuickfixCrossrefTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

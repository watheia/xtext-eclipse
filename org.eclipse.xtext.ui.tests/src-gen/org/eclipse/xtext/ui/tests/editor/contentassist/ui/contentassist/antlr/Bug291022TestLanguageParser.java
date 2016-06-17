/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug291022TestLanguageGrammarAccess;

public class Bug291022TestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private Bug291022TestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug291022TestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug291022TestLanguageParser result = new org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug291022TestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelElementAccess().getAlternatives_3(), "rule__ModelElement__Alternatives_3");
					put(grammarAccess.getModelAttributeAccess().getAlternatives(), "rule__ModelAttribute__Alternatives");
					put(grammarAccess.getRootModelAccess().getGroup(), "rule__RootModel__Group__0");
					put(grammarAccess.getRootModelAccess().getGroup_3(), "rule__RootModel__Group_3__0");
					put(grammarAccess.getModelElementAccess().getGroup(), "rule__ModelElement__Group__0");
					put(grammarAccess.getModelElementAccess().getGroup_1(), "rule__ModelElement__Group_1__0");
					put(grammarAccess.getModelElementAccess().getGroup_3_1(), "rule__ModelElement__Group_3_1__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRootModelAccess().getNameAssignment_1(), "rule__RootModel__NameAssignment_1");
					put(grammarAccess.getRootModelAccess().getTypeAssignment_2(), "rule__RootModel__TypeAssignment_2");
					put(grammarAccess.getRootModelAccess().getElementsAssignment_3_1(), "rule__RootModel__ElementsAssignment_3_1");
					put(grammarAccess.getModelElementAccess().getFirstReferenceAssignment_0(), "rule__ModelElement__FirstReferenceAssignment_0");
					put(grammarAccess.getModelElementAccess().getNameAssignment_1_1(), "rule__ModelElement__NameAssignment_1_1");
					put(grammarAccess.getModelElementAccess().getSecondReferenceAssignment_2(), "rule__ModelElement__SecondReferenceAssignment_2");
					put(grammarAccess.getModelElementAccess().getElementsAssignment_3_1_1(), "rule__ModelElement__ElementsAssignment_3_1_1");
					put(grammarAccess.getAttributeAccess().getFeatureAssignment_0(), "rule__Attribute__FeatureAssignment_0");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug291022TestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug291022TestLanguageParser) parser;
			typedParser.entryRuleRootModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public Bug291022TestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Bug291022TestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

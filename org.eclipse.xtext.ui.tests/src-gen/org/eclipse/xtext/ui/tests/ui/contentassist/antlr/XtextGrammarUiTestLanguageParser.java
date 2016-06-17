/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.services.XtextGrammarUiTestLanguageGrammarAccess;

public class XtextGrammarUiTestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private XtextGrammarUiTestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.ui.contentassist.antlr.internal.InternalXtextGrammarUiTestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.ui.contentassist.antlr.internal.InternalXtextGrammarUiTestLanguageParser result = new org.eclipse.xtext.ui.tests.ui.contentassist.antlr.internal.InternalXtextGrammarUiTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractRuleAccess().getAlternatives(), "rule__AbstractRule__Alternatives");
					put(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives(), "rule__AbstractMetamodelDeclaration__Alternatives");
					put(grammarAccess.getAbstractTokenAccess().getAlternatives(), "rule__AbstractToken__Alternatives");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0(), "rule__AbstractTokenWithCardinality__Alternatives_0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0(), "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0");
					put(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0(), "rule__Action__OperatorAlternatives_2_2_0");
					put(grammarAccess.getAbstractTerminalAccess().getAlternatives(), "rule__AbstractTerminal__Alternatives");
					put(grammarAccess.getAssignmentAccess().getOperatorAlternatives_1_0(), "rule__Assignment__OperatorAlternatives_1_0");
					put(grammarAccess.getAssignableTerminalAccess().getAlternatives(), "rule__AssignableTerminal__Alternatives");
					put(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives(), "rule__CrossReferenceableTerminal__Alternatives");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0(), "rule__TerminalToken__CardinalityAlternatives_1_0");
					put(grammarAccess.getTerminalTokenElementAccess().getAlternatives(), "rule__TerminalTokenElement__Alternatives");
					put(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives(), "rule__AbstractNegatedToken__Alternatives");
					put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
					put(grammarAccess.getGrammarAccess().getGroup_2(), "rule__Grammar__Group_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_2_2(), "rule__Grammar__Group_2_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3(), "rule__Grammar__Group_3__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2(), "rule__Grammar__Group_3_2__0");
					put(grammarAccess.getGrammarAccess().getGroup_3_2_1(), "rule__Grammar__Group_3_2_1__0");
					put(grammarAccess.getGrammarIDAccess().getGroup(), "rule__GrammarID__Group__0");
					put(grammarAccess.getGrammarIDAccess().getGroup_1(), "rule__GrammarID__Group_1__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup(), "rule__GeneratedMetamodel__Group__0");
					put(grammarAccess.getGeneratedMetamodelAccess().getGroup_3(), "rule__GeneratedMetamodel__Group_3__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup(), "rule__ReferencedMetamodel__Group__0");
					put(grammarAccess.getReferencedMetamodelAccess().getGroup_2(), "rule__ReferencedMetamodel__Group_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup(), "rule__ParserRule__Group__0");
					put(grammarAccess.getParserRuleAccess().getGroup_1(), "rule__ParserRule__Group_1__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2(), "rule__ParserRule__Group_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2(), "rule__ParserRule__Group_2_2__0");
					put(grammarAccess.getParserRuleAccess().getGroup_2_2_1(), "rule__ParserRule__Group_2_2_1__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup_0(), "rule__TypeRef__Group_0__0");
					put(grammarAccess.getAlternativesAccess().getGroup(), "rule__Alternatives__Group__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1(), "rule__Alternatives__Group_1__0");
					put(grammarAccess.getAlternativesAccess().getGroup_1_1(), "rule__Alternatives__Group_1_1__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_1(), "rule__Group__Group_1__0");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup(), "rule__AbstractTokenWithCardinality__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getParenthesizedAssignableElementAccess().getGroup(), "rule__ParenthesizedAssignableElement__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup(), "rule__AssignableAlternatives__Group__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1(), "rule__AssignableAlternatives__Group_1__0");
					put(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1(), "rule__AssignableAlternatives__Group_1_1__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup(), "rule__CrossReference__Group__0");
					put(grammarAccess.getCrossReferenceAccess().getGroup_2(), "rule__CrossReference__Group_2__0");
					put(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getGroup(), "rule__ParenthesizedCrossReferenceableElement__Group__0");
					put(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup(), "rule__CrossReferenceableAlternatives__Group__0");
					put(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1(), "rule__CrossReferenceableAlternatives__Group_1__0");
					put(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1_1(), "rule__CrossReferenceableAlternatives__Group_1_1__0");
					put(grammarAccess.getParenthesizedElementAccess().getGroup(), "rule__ParenthesizedElement__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup(), "rule__TerminalRule__Group__0");
					put(grammarAccess.getTerminalRuleAccess().getGroup_2(), "rule__TerminalRule__Group_2__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup(), "rule__TerminalAlternatives__Group__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1(), "rule__TerminalAlternatives__Group_1__0");
					put(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1(), "rule__TerminalAlternatives__Group_1_1__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup(), "rule__TerminalGroup__Group__0");
					put(grammarAccess.getTerminalGroupAccess().getGroup_1(), "rule__TerminalGroup__Group_1__0");
					put(grammarAccess.getTerminalTokenAccess().getGroup(), "rule__TerminalToken__Group__0");
					put(grammarAccess.getParenthesizedTerminalElementAccess().getGroup(), "rule__ParenthesizedTerminalElement__Group__0");
					put(grammarAccess.getNegatedTokenAccess().getGroup(), "rule__NegatedToken__Group__0");
					put(grammarAccess.getUntilTokenAccess().getGroup(), "rule__UntilToken__Group__0");
					put(grammarAccess.getWildcardAccess().getGroup(), "rule__Wildcard__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup(), "rule__CharacterRange__Group__0");
					put(grammarAccess.getCharacterRangeAccess().getGroup_1(), "rule__CharacterRange__Group_1__0");
					put(grammarAccess.getEnumRuleAccess().getGroup(), "rule__EnumRule__Group__0");
					put(grammarAccess.getEnumRuleAccess().getGroup_2(), "rule__EnumRule__Group_2__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup(), "rule__EnumLiterals__Group__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1(), "rule__EnumLiterals__Group_1__0");
					put(grammarAccess.getEnumLiteralsAccess().getGroup_1_1(), "rule__EnumLiterals__Group_1_1__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup(), "rule__EnumLiteralDeclaration__Group__0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1(), "rule__EnumLiteralDeclaration__Group_1__0");
					put(grammarAccess.getGrammarAccess().getNameAssignment_1(), "rule__Grammar__NameAssignment_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_1");
					put(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1(), "rule__Grammar__UsedGrammarsAssignment_2_2_1");
					put(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0(), "rule__Grammar__DefinesHiddenTokensAssignment_3_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0(), "rule__Grammar__HiddenTokensAssignment_3_2_0");
					put(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1(), "rule__Grammar__HiddenTokensAssignment_3_2_1_1");
					put(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(), "rule__Grammar__MetamodelDeclarationsAssignment_4");
					put(grammarAccess.getGrammarAccess().getRulesAssignment_5(), "rule__Grammar__RulesAssignment_5");
					put(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1(), "rule__GeneratedMetamodel__NameAssignment_1");
					put(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2(), "rule__GeneratedMetamodel__EPackageAssignment_2");
					put(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1(), "rule__GeneratedMetamodel__AliasAssignment_3_1");
					put(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1(), "rule__ReferencedMetamodel__EPackageAssignment_1");
					put(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1(), "rule__ReferencedMetamodel__AliasAssignment_2_1");
					put(grammarAccess.getParserRuleAccess().getNameAssignment_0(), "rule__ParserRule__NameAssignment_0");
					put(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1(), "rule__ParserRule__TypeAssignment_1_1");
					put(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0(), "rule__ParserRule__DefinesHiddenTokensAssignment_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0(), "rule__ParserRule__HiddenTokensAssignment_2_2_0");
					put(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1(), "rule__ParserRule__HiddenTokensAssignment_2_2_1_1");
					put(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4(), "rule__ParserRule__AlternativesAssignment_4");
					put(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0(), "rule__TypeRef__MetamodelAssignment_0_0");
					put(grammarAccess.getTypeRefAccess().getClassifierAssignment_1(), "rule__TypeRef__ClassifierAssignment_1");
					put(grammarAccess.getAlternativesAccess().getGroupsAssignment_1_1_1(), "rule__Alternatives__GroupsAssignment_1_1_1");
					put(grammarAccess.getGroupAccess().getTokensAssignment_1_1(), "rule__Group__TokensAssignment_1_1");
					put(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1(), "rule__AbstractTokenWithCardinality__CardinalityAssignment_1");
					put(grammarAccess.getActionAccess().getTypeAssignment_1(), "rule__Action__TypeAssignment_1");
					put(grammarAccess.getActionAccess().getFeatureAssignment_2_1(), "rule__Action__FeatureAssignment_2_1");
					put(grammarAccess.getActionAccess().getOperatorAssignment_2_2(), "rule__Action__OperatorAssignment_2_2");
					put(grammarAccess.getKeywordAccess().getValueAssignment(), "rule__Keyword__ValueAssignment");
					put(grammarAccess.getRuleCallAccess().getRuleAssignment(), "rule__RuleCall__RuleAssignment");
					put(grammarAccess.getAssignmentAccess().getFeatureAssignment_0(), "rule__Assignment__FeatureAssignment_0");
					put(grammarAccess.getAssignmentAccess().getOperatorAssignment_1(), "rule__Assignment__OperatorAssignment_1");
					put(grammarAccess.getAssignmentAccess().getTerminalAssignment_2(), "rule__Assignment__TerminalAssignment_2");
					put(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignment_1_1_1(), "rule__AssignableAlternatives__GroupsAssignment_1_1_1");
					put(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1(), "rule__CrossReference__TypeAssignment_1");
					put(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1(), "rule__CrossReference__TerminalAssignment_2_1");
					put(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsAssignment_1_1_1(), "rule__CrossReferenceableAlternatives__GroupsAssignment_1_1_1");
					put(grammarAccess.getTerminalRuleAccess().getNameAssignment_1(), "rule__TerminalRule__NameAssignment_1");
					put(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1(), "rule__TerminalRule__TypeAssignment_2_1");
					put(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4(), "rule__TerminalRule__AlternativesAssignment_4");
					put(grammarAccess.getTerminalAlternativesAccess().getGroupsAssignment_1_1_1(), "rule__TerminalAlternatives__GroupsAssignment_1_1_1");
					put(grammarAccess.getTerminalGroupAccess().getTokensAssignment_1_1(), "rule__TerminalGroup__TokensAssignment_1_1");
					put(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1(), "rule__TerminalToken__CardinalityAssignment_1");
					put(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1(), "rule__NegatedToken__TerminalAssignment_1");
					put(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1(), "rule__UntilToken__TerminalAssignment_1");
					put(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2(), "rule__CharacterRange__RightAssignment_1_2");
					put(grammarAccess.getEnumRuleAccess().getNameAssignment_1(), "rule__EnumRule__NameAssignment_1");
					put(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1(), "rule__EnumRule__TypeAssignment_2_1");
					put(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4(), "rule__EnumRule__AlternativesAssignment_4");
					put(grammarAccess.getEnumLiteralsAccess().getGroupsAssignment_1_1_1(), "rule__EnumLiterals__GroupsAssignment_1_1_1");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0(), "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0");
					put(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1(), "rule__EnumLiteralDeclaration__LiteralAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.ui.contentassist.antlr.internal.InternalXtextGrammarUiTestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.ui.contentassist.antlr.internal.InternalXtextGrammarUiTestLanguageParser) parser;
			typedParser.entryRuleGrammar();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XtextGrammarUiTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XtextGrammarUiTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

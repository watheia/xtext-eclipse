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

import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug347012TestLanguageGrammarAccess;

public class Bug347012TestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private Bug347012TestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug347012TestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug347012TestLanguageParser result = new org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug347012TestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVirtualSemiAccess().getAlternatives(), "rule__VirtualSemi__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getMyPrimaryAccess().getAlternatives(), "rule__MyPrimary__Alternatives");
					put(grammarAccess.getMyAttributeAccess().getAlternatives(), "rule__MyAttribute__Alternatives");
					put(grammarAccess.getMyProgramAccess().getGroup(), "rule__MyProgram__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getMyPackageAccess().getGroup(), "rule__MyPackage__Group__0");
					put(grammarAccess.getMyPackageAccess().getGroup_6(), "rule__MyPackage__Group_6__0");
					put(grammarAccess.getMyClassAccess().getGroup(), "rule__MyClass__Group__0");
					put(grammarAccess.getMyClassAccess().getGroup_7(), "rule__MyClass__Group_7__0");
					put(grammarAccess.getMyAttributesAccess().getGroup(), "rule__MyAttributes__Group__0");
					put(grammarAccess.getMyFieldAccess().getGroup(), "rule__MyField__Group__0");
					put(grammarAccess.getMyFieldAccess().getGroup_4(), "rule__MyField__Group_4__0");
					put(grammarAccess.getMyBindingAccess().getGroup(), "rule__MyBinding__Group__0");
					put(grammarAccess.getMyBindingAccess().getGroup_1(), "rule__MyBinding__Group_1__0");
					put(grammarAccess.getMyBindingAccess().getGroup_2(), "rule__MyBinding__Group_2__0");
					put(grammarAccess.getMyProgramAccess().getPackageAssignment_2(), "rule__MyProgram__PackageAssignment_2");
					put(grammarAccess.getIdentifierAccess().getNameAssignment(), "rule__Identifier__NameAssignment");
					put(grammarAccess.getLiteralAccess().getNumAssignment_0(), "rule__Literal__NumAssignment_0");
					put(grammarAccess.getLiteralAccess().getStrAssignment_1(), "rule__Literal__StrAssignment_1");
					put(grammarAccess.getLiteralAccess().getBoolAssignment_2(), "rule__Literal__BoolAssignment_2");
					put(grammarAccess.getLiteralAccess().getBoolAssignment_3(), "rule__Literal__BoolAssignment_3");
					put(grammarAccess.getMyPackageAccess().getNameAssignment_2(), "rule__MyPackage__NameAssignment_2");
					put(grammarAccess.getMyPackageAccess().getDirectivesAssignment_6_0(), "rule__MyPackage__DirectivesAssignment_6_0");
					put(grammarAccess.getMyClassAccess().getNameAssignment_3(), "rule__MyClass__NameAssignment_3");
					put(grammarAccess.getMyClassAccess().getDirectivesAssignment_7_0(), "rule__MyClass__DirectivesAssignment_7_0");
					put(grammarAccess.getMyAttributeAccess().getPUBLICAssignment_0(), "rule__MyAttribute__PUBLICAssignment_0");
					put(grammarAccess.getMyAttributeAccess().getPRIVATEAssignment_1(), "rule__MyAttribute__PRIVATEAssignment_1");
					put(grammarAccess.getMyAttributesAccess().getAttributesAssignment_1(), "rule__MyAttributes__AttributesAssignment_1");
					put(grammarAccess.getMyFieldAccess().getAttrAssignment_0(), "rule__MyField__AttrAssignment_0");
					put(grammarAccess.getMyFieldAccess().getBindingsAssignment_3(), "rule__MyField__BindingsAssignment_3");
					put(grammarAccess.getMyFieldAccess().getBindingsAssignment_4_3(), "rule__MyField__BindingsAssignment_4_3");
					put(grammarAccess.getMyBindingAccess().getNameAssignment_0(), "rule__MyBinding__NameAssignment_0");
					put(grammarAccess.getMyBindingAccess().getTypeAssignment_1_3(), "rule__MyBinding__TypeAssignment_1_3");
					put(grammarAccess.getMyBindingAccess().getExpressionAssignment_2_3(), "rule__MyBinding__ExpressionAssignment_2_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug347012TestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug347012TestLanguageParser) parser;
			typedParser.entryRuleMyProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}
	
	public Bug347012TestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Bug347012TestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

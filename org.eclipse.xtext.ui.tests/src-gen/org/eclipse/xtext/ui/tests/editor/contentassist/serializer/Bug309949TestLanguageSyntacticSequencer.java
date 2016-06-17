/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug309949TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug309949TestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected Bug309949TestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Model___NumberSignDigitOneAsteriskKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_0_4___or___NumberSignDigitTwoAsteriskKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_4__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Bug309949TestLanguageGrammarAccess) access;
		match_Model___NumberSignDigitOneAsteriskKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_0_4___or___NumberSignDigitTwoAsteriskKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_4__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getModelAccess().getNumberSignDigitOneAsteriskKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_0_4())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getModelAccess().getNumberSignDigitTwoAsteriskKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_2_4())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Model___NumberSignDigitOneAsteriskKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_0_4___or___NumberSignDigitTwoAsteriskKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_4__.equals(syntax))
				emit_Model___NumberSignDigitOneAsteriskKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_0_4___or___NumberSignDigitTwoAsteriskKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_4__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('#1*' '{' '}') | ('#2*' '{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Model___NumberSignDigitOneAsteriskKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_0_4___or___NumberSignDigitTwoAsteriskKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_4__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

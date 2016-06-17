/*
 * generated by Xtext
 */
package org.eclipse.xtext.xtext.ui.ecore2xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xtext.ui.ecore2xtext.Concrete0;
import org.eclipse.xtext.xtext.ui.ecore2xtext.Concrete1;
import org.eclipse.xtext.xtext.ui.ecore2xtext.DiamondInheritance;
import org.eclipse.xtext.xtext.ui.ecore2xtext.Ecore2xtextPackage;
import org.eclipse.xtext.xtext.ui.ecore2xtext.Root;
import org.eclipse.xtext.xtext.ui.ecore2xtext.services.Ecore2XtextTestGrammarAccess;

@SuppressWarnings("all")
public class Ecore2XtextTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Ecore2XtextTestGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Ecore2xtextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Ecore2xtextPackage.CONCRETE0:
				sequence_Concrete0_Impl(context, (Concrete0) semanticObject); 
				return; 
			case Ecore2xtextPackage.CONCRETE1:
				sequence_Concrete1_Impl(context, (Concrete1) semanticObject); 
				return; 
			case Ecore2xtextPackage.DIAMOND_INHERITANCE:
				sequence_DiamondInheritance(context, (DiamondInheritance) semanticObject); 
				return; 
			case Ecore2xtextPackage.ROOT:
				sequence_Root(context, (Root) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Concrete0_Impl(EObject context, Concrete0 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcrete0_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Concrete1_Impl(EObject context, Concrete1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcrete1_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DiamondInheritance(EObject context, DiamondInheritance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Ecore2xtextPackage.Literals.ABSTRACT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDiamondInheritanceAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=INT0 (classes+=Abstract classes+=Abstract*)? concrete0=Concrete0?)
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

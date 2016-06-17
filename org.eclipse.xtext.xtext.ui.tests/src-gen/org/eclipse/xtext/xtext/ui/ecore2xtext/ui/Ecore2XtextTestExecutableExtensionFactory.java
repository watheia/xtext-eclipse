/*
 * generated by Xtext
 */
package org.eclipse.xtext.xtext.ui.ecore2xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.xtext.xtext.ui.tests.Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Ecore2XtextTestExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.ORG_ECLIPSE_XTEXT_XTEXT_UI_ECORE2XTEXT_ECORE2XTEXTTEST);
	}
	
}

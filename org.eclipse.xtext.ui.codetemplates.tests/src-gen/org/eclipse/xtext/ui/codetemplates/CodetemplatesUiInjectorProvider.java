/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.codetemplates;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CodetemplatesUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.xtext.ui.codetemplates.ui.internal.CodetemplatesActivator.getInstance().getInjector("org.eclipse.xtext.ui.codetemplates.Codetemplates");
	}
	
}

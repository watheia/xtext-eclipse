/*
 * generated by Xtext
 */
package org.eclipse.xtext.xbase.testlanguages.bug462047;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class Bug462047LangUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.xtext.xbase.testlanguages.ui.internal.XImportSectionTestLangActivator.getInstance().getInjector("org.eclipse.xtext.xbase.testlanguages.bug462047.Bug462047Lang");
	}
	
}

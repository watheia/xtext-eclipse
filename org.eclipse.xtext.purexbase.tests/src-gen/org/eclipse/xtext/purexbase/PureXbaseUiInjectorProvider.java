/*
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PureXbaseUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.xtext.purexbase.ui.internal.PureXbaseActivator.getInstance().getInjector("org.eclipse.xtext.purexbase.PureXbase");
	}
	
}

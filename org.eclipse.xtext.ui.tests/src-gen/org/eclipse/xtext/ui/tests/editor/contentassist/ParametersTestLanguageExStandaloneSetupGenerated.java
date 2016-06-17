/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class ParametersTestLanguageExStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguageStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguageExRuntimeModule());
	}
	
	public void register(Injector injector) {

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("parameterstestlanguageex", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("parameterstestlanguageex", serviceProvider);
		

	}
}

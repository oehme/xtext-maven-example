/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BuildDSLUiModule extends org.xtext.builddsl.ui.AbstractBuildDSLUiModule {
	public BuildDSLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IContextualOutputConfigurationProvider> bindIContextualOutputConfigurationProvider() {
		return EclipseOutputConfigurationProvider.class;
	}
}

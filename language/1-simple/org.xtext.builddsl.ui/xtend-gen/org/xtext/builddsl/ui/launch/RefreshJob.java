/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.ui.launch;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.builddsl.ui.launch.BuildDSLLaunchDelegate;

@SuppressWarnings("all")
public class RefreshJob extends Job {
  private final static Logger logger = Logger.getLogger(BuildDSLLaunchDelegate.class);
  
  private ILaunchConfiguration configuration;
  
  public RefreshJob(final ILaunchConfiguration configuration) {
    super("Refreshing after Build launch");
    this.configuration = configuration;
  }
  
  public IStatus run(final IProgressMonitor monitor) {
    IStatus _xblockexpression = null;
    {
      try {
        RefreshTab.refreshResources(this.configuration, monitor);
      } catch (final Throwable _t) {
        if (_t instanceof CoreException) {
          final CoreException e = (CoreException)_t;
          String _message = e.getMessage();
          RefreshJob.logger.error(_message, e);
          return e.getStatus();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = Status.OK_STATUS;
    }
    return _xblockexpression;
  }
}

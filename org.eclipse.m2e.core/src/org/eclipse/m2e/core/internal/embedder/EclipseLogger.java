/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.core.internal.embedder;

import org.slf4j.LoggerFactory;

import org.codehaus.plexus.logging.Logger;

import org.eclipse.m2e.core.embedder.IMavenConfiguration;
import org.eclipse.m2e.core.internal.Messages;


class EclipseLogger implements Logger {
  private static final org.slf4j.Logger log = LoggerFactory.getLogger(EclipseLogger.class);

  private final IMavenConfiguration mavenConfiguration;

  public EclipseLogger(IMavenConfiguration mavenConfiguration) {
    this.mavenConfiguration = mavenConfiguration;
  }

  public void debug(String msg) {
    if(isDebugEnabled()) {
      log.debug(msg);
    }
  }

  public void debug(String msg, Throwable t) {
    if(isDebugEnabled()) {
      log.debug(msg + " " + t.getMessage(), t); //$NON-NLS-1$
    }
  }

  public void info(String msg) {
    if(isInfoEnabled()) {
      log.info(msg);
    }
  }

  public void info(String msg, Throwable t) {
    if(isInfoEnabled()) {
      log.info(msg + " " + t.getMessage(), t); //$NON-NLS-1$
    }
  }

  public void warn(String msg) {
    if(isWarnEnabled()) {
      log.warn(msg);
    }
  }

  public void warn(String msg, Throwable t) {
    if(isWarnEnabled()) {
      log.warn(msg + " " + t.getMessage(), t); //$NON-NLS-1$
    }
  }

  public void fatalError(String msg) {
    if(isFatalErrorEnabled()) {
      log.error(msg);
    }
  }

  public void fatalError(String msg, Throwable t) {
    if(isFatalErrorEnabled()) {
      log.error(msg + " " + t.getMessage(), t); //$NON-NLS-1$
    }
  }

  public void error(String msg) {
    if(isErrorEnabled()) {
      log.error(msg);
    }
  }

  public void error(String msg, Throwable t) {
    if(isErrorEnabled()) {
      log.error(msg + " " + t.getMessage(), t); //$NON-NLS-1$
    }
  }

  public boolean isDebugEnabled() {
    return mavenConfiguration.isDebugOutput();
  }

  public boolean isInfoEnabled() {
    return true;
  }

  public boolean isWarnEnabled() {
    return true;
  }

  public boolean isErrorEnabled() {
    return true;
  }

  public boolean isFatalErrorEnabled() {
    return true;
  }

  public void setThreshold(int treshold) {
  }

  public int getThreshold() {
    return LEVEL_DEBUG;
  }

  public Logger getChildLogger(String name) {
    return this;
  }

  public String getName() {
    return Messages.EclipseLogger_name;
  }
}

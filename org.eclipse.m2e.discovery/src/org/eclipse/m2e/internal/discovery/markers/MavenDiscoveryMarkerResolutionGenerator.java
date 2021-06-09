/*******************************************************************************
 * Copyright (c) 2011-2015 Sonatype, Inc. and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *      Anton Tanasenko - Refactor marker resolutions and quick fixes (Bug #484359)
 *******************************************************************************/

package org.eclipse.m2e.internal.discovery.markers;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;
import org.eclipse.ui.IMarkerResolutionGenerator2;

import org.eclipse.m2e.core.internal.IMavenConstants;


@SuppressWarnings("restriction")
public class MavenDiscoveryMarkerResolutionGenerator
    implements IMarkerResolutionGenerator, IMarkerResolutionGenerator2 {

    @Override
    public boolean hasResolutions(IMarker marker) {
    return canResolve(marker);
  }

  @Override
  public IMarkerResolution[] getResolutions(IMarker marker) {
    if(canResolve(marker)) {
      return new IMarkerResolution[] {new DiscoveryWizardResolution(marker)};
    }
    return new IMarkerResolution[0];
  }

  public static boolean canResolve(IMarker marker) {
    String type = marker.getAttribute(IMavenConstants.MARKER_ATTR_EDITOR_HINT, null);
    return IMavenConstants.EDITOR_HINT_MISSING_CONFIGURATOR.equals(type)
        || IMavenConstants.EDITOR_HINT_NOT_COVERED_MOJO_EXECUTION.equals(type)
        || IMavenConstants.EDITOR_HINT_UNKNOWN_LIFECYCLE_ID.equals(type);
  }
}

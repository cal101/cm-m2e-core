/*******************************************************************************
 * Copyright (c) 2012 Igor Fedorenko
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2e.sourcelookup.ui.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.jdt.launching.sourcelookup.advanced.AdvancedSourceLookup;
import org.eclipse.jdt.launching.sourcelookup.advanced.AdvancedSourceLookupParticipant;
import org.eclipse.jdt.launching.sourcelookup.containers.PackageFragmentRootSourceContainer;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.m2e.core.embedder.ArtifactKey;
import org.eclipse.m2e.sourcelookup.internal.launch.MavenArtifactIdentifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SourceLookupInfoDialog extends Dialog {
  private final Object debugElement;

  private final AdvancedSourceLookupParticipant sourceLookup;

  private Text textLocation;

  private Text textGAV;

  private Text textJavaProject;

  private Text textSourceContainer;

  // FIXME
  private final IProgressMonitor monitor = new NullProgressMonitor();

  public SourceLookupInfoDialog(Shell parentShell, Object debugElement, AdvancedSourceLookupParticipant sourceLookup) {
    super(parentShell);
    setShellStyle(SWT.RESIZE | SWT.TITLE);
    this.debugElement = debugElement;
    this.sourceLookup = sourceLookup;
  }

  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Source lookup properties"); //$NON-NLS-1$
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite container = (Composite) super.createDialogArea(parent);
    container.setLayout(new GridLayout(2, false));

    Label lblCodeLocation = new Label(container, SWT.NONE);
    lblCodeLocation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
    lblCodeLocation.setText("Code location:"); //$NON-NLS-1$

    textLocation = new Text(container, SWT.BORDER | SWT.WRAP | SWT.MULTI);
    textLocation.setEditable(false);
    textLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

    Label lblGav = new Label(container, SWT.NONE);
    lblGav.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
    lblGav.setText("GAV:"); //$NON-NLS-1$

    textGAV = new Text(container, SWT.BORDER | SWT.WRAP);
    textGAV.setEditable(false);
    textGAV.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

    Label lblJavaProject = new Label(container, SWT.NONE);
    lblJavaProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
    lblJavaProject.setText("Java project:"); //$NON-NLS-1$

    textJavaProject = new Text(container, SWT.BORDER | SWT.WRAP);
    textJavaProject.setEditable(false);
    textJavaProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

    Label lblSourceContainer = new Label(container, SWT.NONE);
    lblSourceContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
    lblSourceContainer.setText("Source container:"); //$NON-NLS-1$

    textSourceContainer = new Text(container, SWT.BORDER | SWT.WRAP);
    textSourceContainer.setEditable(false);
    textSourceContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

    Composite fillerComposite = new Composite(container, SWT.NONE);
    fillerComposite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 2, 1));

    Composite actionsComposite = new Composite(container, SWT.NONE);
    actionsComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
    actionsComposite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));

    Button btnCopy = new Button(actionsComposite, SWT.NONE);
    btnCopy.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> copyToClipboard()
    ));
    btnCopy.setToolTipText("Copy to clipboard"); //$NON-NLS-1$
    btnCopy.setText("Copy"); //$NON-NLS-1$

    Button btnRefresh = new Button(actionsComposite, SWT.NONE);
  	btnRefresh.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
  		try {
  			sourceLookup.getSourceContainer(debugElement, true, monitor);
  		} catch (CoreException e1) {
  			showError(e1);
  		}
  	}));
    btnRefresh.setToolTipText("Force rediscovery of source lookup information for this code location."); //$NON-NLS-1$
    btnRefresh.setText("Refresh"); //$NON-NLS-1$

    updateDisplay(monitor);

    return container;
  }

  @Override
  protected void createButtonsForButtonBar(Composite parent) {

    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
  }

  @Override
  protected Point getInitialSize() {
    return new Point(450, 300);
  }

  private void updateDisplay(IProgressMonitor moninor) {
    try {
      File location = AdvancedSourceLookup.getClassesLocation(debugElement);

      if (location == null) {
        return;
      }

      textLocation.setText(location.getAbsolutePath());

      ISourceContainer container = sourceLookup.getSourceContainer(debugElement, false, moninor /* sync */);

      // TODO consider extracting artifact keys from container
      final Collection<ArtifactKey> artifacts = new MavenArtifactIdentifier().identify(location, moninor);
      textGAV.setText(artifacts.toString());

      // TODO extract project(s) from the container
      textJavaProject.setText("<not-implemented>"); //$NON-NLS-1$

      textSourceContainer.setText(toString(container));
    } catch (CoreException e) {
      showError(e);
    }
  }

  void showError(CoreException e) {
    ErrorDialog.openError(getParentShell(), "Source lookup info", "Could not determine code maven coordinates", //$NON-NLS-1$ //$NON-NLS-2$
        e.getStatus());
  }

  private String toString(ISourceContainer container) {
    if (container == null) {
      return ""; //$NON-NLS-1$
    }

    StringBuilder sb = new StringBuilder();
    sb.append(container.getClass().getSimpleName()).append(" ").append(container.getName()); //$NON-NLS-1$

    if (container instanceof PackageFragmentRootSourceContainer) {
      sb.append(" ").append( //$NON-NLS-1$
          ((PackageFragmentRootSourceContainer) container).getPackageFragmentRoot().getJavaProject().getProject());
    }

    return sb.toString();
  }

  void copyToClipboard() {
    List<Transfer> dataTypes = new ArrayList<>();
    List<Object> data = new ArrayList<>();

    Clipboard clipboard = new Clipboard(getShell().getDisplay());

    StringBuilder sb = new StringBuilder();
    sb.append("Location: ").append(textLocation.getText()).append("\n"); //$NON-NLS-1$ //$NON-NLS-2$
    sb.append("GAV: ").append(textGAV.getText()).append("\n"); //$NON-NLS-1$ //$NON-NLS-2$
    sb.append("Java project: ").append(textJavaProject.getText()).append("\n"); //$NON-NLS-1$ //$NON-NLS-2$
    sb.append("Source container: ").append(textSourceContainer.getText()).append("\n"); //$NON-NLS-1$ //$NON-NLS-2$

    dataTypes.add(TextTransfer.getInstance());
    data.add(sb.toString());

    clipboard.setContents(data.toArray(), dataTypes.toArray(new Transfer[dataTypes.size()]));

    clipboard.dispose();
  }
}

/*******************************************************************************
 * Copyright (c) 2020, 2021 Christoph Läubrich
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Christoph Läubrich - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2e.pde.ui.editor;

import java.io.ByteArrayInputStream;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.m2e.pde.MavenTargetLocation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClipboardParser {

	private String groupId;
	private String artifactId;
	private String version;
	private String classifier;
	private Exception error;
	private String scope;

	public ClipboardParser(String text) {
		if (text != null && text.trim().startsWith("<")) { //$NON-NLS-1$
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				ByteArrayInputStream input = new ByteArrayInputStream(text.getBytes("UTF-8")); //$NON-NLS-1$
				Document doc = builder.parse(input);
				groupId = getTextFor("groupId", doc); //$NON-NLS-1$
				artifactId = getTextFor("artifactId", doc); //$NON-NLS-1$
				version = getTextFor("version", doc); //$NON-NLS-1$
				classifier = getTextFor("classifier", doc); //$NON-NLS-1$
				scope = getTextFor("scope", doc); //$NON-NLS-1$
			} catch (Exception e) {
				// we can't use the clipboard content then...
				this.error = e;
			}
		}
	}

	private String getTextFor(String element, Document doc) {
		NodeList nl = doc.getElementsByTagName(element);
		Node item = nl.item(0);
		if (item != null) {
			return item.getTextContent();
		}
		return null;
	}

	public Exception getError() {
		return error;
	}

	public String getScope() {
		return Objects.requireNonNullElse(scope, MavenTargetLocation.DEFAULT_DEPENDENCY_SCOPE);
	}

	public String getGroupId() {
		return Objects.requireNonNullElse(groupId, ""); //$NON-NLS-1$
	}

	public String getArtifactId() {
		return Objects.requireNonNullElse(artifactId, ""); //$NON-NLS-1$
	}

	public String getVersion() {
		return Objects.requireNonNullElse(version, ""); //$NON-NLS-1$
	}

	public String getClassifier() {
		return Objects.requireNonNullElse(classifier, ""); //$NON-NLS-1$
	}
}

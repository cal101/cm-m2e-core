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

package org.eclipse.m2e.model.edit.pom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.m2e.model.edit.pom.Activation;
import org.eclipse.m2e.model.edit.pom.ActivationFile;
import org.eclipse.m2e.model.edit.pom.ActivationOS;
import org.eclipse.m2e.model.edit.pom.ActivationProperty;
import org.eclipse.m2e.model.edit.pom.Build;
import org.eclipse.m2e.model.edit.pom.BuildBase;
import org.eclipse.m2e.model.edit.pom.CiManagement;
import org.eclipse.m2e.model.edit.pom.Configuration;
import org.eclipse.m2e.model.edit.pom.Contributor;
import org.eclipse.m2e.model.edit.pom.Dependency;
import org.eclipse.m2e.model.edit.pom.DependencyManagement;
import org.eclipse.m2e.model.edit.pom.DeploymentRepository;
import org.eclipse.m2e.model.edit.pom.Developer;
import org.eclipse.m2e.model.edit.pom.DistributionManagement;
import org.eclipse.m2e.model.edit.pom.DocumentRoot;
import org.eclipse.m2e.model.edit.pom.Exclusion;
import org.eclipse.m2e.model.edit.pom.Extension;
import org.eclipse.m2e.model.edit.pom.IssueManagement;
import org.eclipse.m2e.model.edit.pom.License;
import org.eclipse.m2e.model.edit.pom.MailingList;
import org.eclipse.m2e.model.edit.pom.Model;
import org.eclipse.m2e.model.edit.pom.Notifier;
import org.eclipse.m2e.model.edit.pom.Organization;
import org.eclipse.m2e.model.edit.pom.Parent;
import org.eclipse.m2e.model.edit.pom.Plugin;
import org.eclipse.m2e.model.edit.pom.PluginExecution;
import org.eclipse.m2e.model.edit.pom.PluginManagement;
import org.eclipse.m2e.model.edit.pom.PomFactory;
import org.eclipse.m2e.model.edit.pom.PomPackage;
import org.eclipse.m2e.model.edit.pom.Prerequisites;
import org.eclipse.m2e.model.edit.pom.Profile;
import org.eclipse.m2e.model.edit.pom.PropertyElement;
import org.eclipse.m2e.model.edit.pom.Relocation;
import org.eclipse.m2e.model.edit.pom.ReportPlugin;
import org.eclipse.m2e.model.edit.pom.ReportSet;
import org.eclipse.m2e.model.edit.pom.Reporting;
import org.eclipse.m2e.model.edit.pom.Repository;
import org.eclipse.m2e.model.edit.pom.RepositoryPolicy;
import org.eclipse.m2e.model.edit.pom.Resource;
import org.eclipse.m2e.model.edit.pom.Scm;
import org.eclipse.m2e.model.edit.pom.Site;


/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class PomPackageImpl extends EPackageImpl implements PomPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass activationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass activationFileEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass activationOSEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass activationPropertyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass buildEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass buildBaseEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass ciManagementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass contributorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass dependencyManagementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass deploymentRepositoryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass developerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass distributionManagementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass exclusionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass extensionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass issueManagementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass licenseEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass mailingListEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass notifierEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass organizationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass parentEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass pluginEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass pluginExecutionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass pluginManagementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass prerequisitesEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass profileEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass relocationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass reportingEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass reportPluginEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass reportSetEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass repositoryPolicyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass scmEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass siteEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass propertyElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass configurationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.m2e.model.edit.pom.PomPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PomPackageImpl() {
    super(eNS_URI, PomFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * Simple dependencies are satisfied by calling this method on all dependent packages before doing anything else. This
   * method drives initialization for interdependent packages directly, in parallel with this package, itself.
   * <p>
   * Of this package and its interdependencies, all packages which have not yet been registered by their URI values are
   * first created and registered. The packages are then initialized in two steps: meta-model objects for all of the
   * packages are created before any are initialized, since one package's meta-model objects may refer to those of
   * another.
   * <p>
   * Invocation of this method will not affect any packages that have already been initialized. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PomPackage init() {
    if(isInited)
      return (PomPackage) EPackage.Registry.INSTANCE.getEPackage(PomPackage.eNS_URI);

    // Obtain or create and register package
    PomPackageImpl thePomPackage = (PomPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PomPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(eNS_URI) : new PomPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thePomPackage.createPackageContents();

    // Initialize created meta-data
    thePomPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePomPackage.freeze();

    return thePomPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getActivation() {
    return activationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivation_ActiveByDefault() {
    return (EAttribute) activationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivation_Jdk() {
    return (EAttribute) activationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getActivation_Os() {
    return (EReference) activationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getActivation_Property() {
    return (EReference) activationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getActivation_File() {
    return (EReference) activationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getActivationFile() {
    return activationFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationFile_Missing() {
    return (EAttribute) activationFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationFile_Exists() {
    return (EAttribute) activationFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getActivationOS() {
    return activationOSEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationOS_Name() {
    return (EAttribute) activationOSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationOS_Family() {
    return (EAttribute) activationOSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationOS_Arch() {
    return (EAttribute) activationOSEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationOS_Version() {
    return (EAttribute) activationOSEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getActivationProperty() {
    return activationPropertyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationProperty_Name() {
    return (EAttribute) activationPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getActivationProperty_Value() {
    return (EAttribute) activationPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getBuild() {
    return buildEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuild_SourceDirectory() {
    return (EAttribute) buildEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuild_ScriptSourceDirectory() {
    return (EAttribute) buildEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuild_TestSourceDirectory() {
    return (EAttribute) buildEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuild_OutputDirectory() {
    return (EAttribute) buildEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuild_TestOutputDirectory() {
    return (EAttribute) buildEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getBuild_Extensions() {
    return (EReference) buildEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getBuildBase() {
    return buildBaseEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuildBase_DefaultGoal() {
    return (EAttribute) buildBaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getBuildBase_Resources() {
    return (EReference) buildBaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getBuildBase_TestResources() {
    return (EReference) buildBaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuildBase_Directory() {
    return (EAttribute) buildBaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuildBase_FinalName() {
    return (EAttribute) buildBaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getBuildBase_PluginManagement() {
    return (EReference) buildBaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getBuildBase_Plugins() {
    return (EReference) buildBaseEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getBuildBase_Filters() {
    return (EAttribute) buildBaseEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getCiManagement() {
    return ciManagementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getCiManagement_System() {
    return (EAttribute) ciManagementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getCiManagement_Url() {
    return (EAttribute) ciManagementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getCiManagement_Notifiers() {
    return (EReference) ciManagementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getContributor() {
    return contributorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Name() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Email() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Url() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Organization() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_OrganizationUrl() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Timezone() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getContributor_Properties() {
    return (EReference) contributorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getContributor_Roles() {
    return (EAttribute) contributorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDependency() {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_GroupId() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_ArtifactId() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_Version() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_Type() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_Classifier() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_Scope() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_SystemPath() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDependency_Exclusions() {
    return (EReference) dependencyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDependency_Optional() {
    return (EAttribute) dependencyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDependencyManagement() {
    return dependencyManagementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDependencyManagement_Dependencies() {
    return (EReference) dependencyManagementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDeploymentRepository() {
    return deploymentRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeploymentRepository_UniqueVersion() {
    return (EAttribute) deploymentRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeploymentRepository_Id() {
    return (EAttribute) deploymentRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeploymentRepository_Name() {
    return (EAttribute) deploymentRepositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeploymentRepository_Url() {
    return (EAttribute) deploymentRepositoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeploymentRepository_Layout() {
    return (EAttribute) deploymentRepositoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDeveloper() {
    return developerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Id() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Name() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Email() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Url() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Organization() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_OrganizationUrl() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Timezone() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDeveloper_Properties() {
    return (EReference) developerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDeveloper_Roles() {
    return (EAttribute) developerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDistributionManagement() {
    return distributionManagementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDistributionManagement_Repository() {
    return (EReference) distributionManagementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDistributionManagement_SnapshotRepository() {
    return (EReference) distributionManagementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDistributionManagement_Site() {
    return (EReference) distributionManagementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDistributionManagement_DownloadUrl() {
    return (EAttribute) distributionManagementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDistributionManagement_Relocation() {
    return (EReference) distributionManagementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDistributionManagement_Status() {
    return (EAttribute) distributionManagementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getDocumentRoot() {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getDocumentRoot_Project() {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getExclusion() {
    return exclusionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getExclusion_ArtifactId() {
    return (EAttribute) exclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getExclusion_GroupId() {
    return (EAttribute) exclusionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getExtension() {
    return extensionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getExtension_GroupId() {
    return (EAttribute) extensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getExtension_ArtifactId() {
    return (EAttribute) extensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getExtension_Version() {
    return (EAttribute) extensionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getIssueManagement() {
    return issueManagementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getIssueManagement_System() {
    return (EAttribute) issueManagementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getIssueManagement_Url() {
    return (EAttribute) issueManagementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getLicense() {
    return licenseEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getLicense_Name() {
    return (EAttribute) licenseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getLicense_Url() {
    return (EAttribute) licenseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getLicense_Distribution() {
    return (EAttribute) licenseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getLicense_Comments() {
    return (EAttribute) licenseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getMailingList() {
    return mailingListEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_Name() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_Subscribe() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_Unsubscribe() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_Post() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_Archive() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getMailingList_OtherArchives() {
    return (EAttribute) mailingListEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getModel() {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Parent() {
    return (EReference) modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_ModelVersion() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_GroupId() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_ArtifactId() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Packaging() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Name() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Version() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Description() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Url() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Prerequisites() {
    return (EReference) modelEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_IssueManagement() {
    return (EReference) modelEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_CiManagement() {
    return (EReference) modelEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_InceptionYear() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_MailingLists() {
    return (EReference) modelEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Developers() {
    return (EReference) modelEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Contributors() {
    return (EReference) modelEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Licenses() {
    return (EReference) modelEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Scm() {
    return (EReference) modelEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Organization() {
    return (EReference) modelEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Build() {
    return (EReference) modelEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Profiles() {
    return (EReference) modelEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Repositories() {
    return (EReference) modelEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_PluginRepositories() {
    return (EReference) modelEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Dependencies() {
    return (EReference) modelEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Reporting() {
    return (EReference) modelEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_DependencyManagement() {
    return (EReference) modelEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_DistributionManagement() {
    return (EReference) modelEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getModel_Properties() {
    return (EReference) modelEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getModel_Modules() {
    return (EAttribute) modelEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getNotifier() {
    return notifierEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_Type() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_SendOnError() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_SendOnFailure() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_SendOnSuccess() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_SendOnWarning() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getNotifier_Address() {
    return (EAttribute) notifierEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getNotifier_Configuration() {
    return (EReference) notifierEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getOrganization() {
    return organizationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getOrganization_Name() {
    return (EAttribute) organizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getOrganization_Url() {
    return (EAttribute) organizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getParent() {
    return parentEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getParent_ArtifactId() {
    return (EAttribute) parentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getParent_GroupId() {
    return (EAttribute) parentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getParent_Version() {
    return (EAttribute) parentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getParent_RelativePath() {
    return (EAttribute) parentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getPlugin() {
    return pluginEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPlugin_GroupId() {
    return (EAttribute) pluginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPlugin_ArtifactId() {
    return (EAttribute) pluginEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPlugin_Version() {
    return (EAttribute) pluginEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPlugin_Extensions() {
    return (EAttribute) pluginEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getPlugin_Executions() {
    return (EReference) pluginEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getPlugin_Dependencies() {
    return (EReference) pluginEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPlugin_Inherited() {
    return (EAttribute) pluginEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getPlugin_Configuration() {
    return (EReference) pluginEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getPluginExecution() {
    return pluginExecutionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPluginExecution_Id() {
    return (EAttribute) pluginExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPluginExecution_Phase() {
    return (EAttribute) pluginExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPluginExecution_Inherited() {
    return (EAttribute) pluginExecutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPluginExecution_Goals() {
    return (EAttribute) pluginExecutionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getPluginExecution_Configuration() {
    return (EReference) pluginExecutionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getPluginManagement() {
    return pluginManagementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getPluginManagement_Plugins() {
    return (EReference) pluginManagementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getPrerequisites() {
    return prerequisitesEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPrerequisites_Maven() {
    return (EAttribute) prerequisitesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getProfile() {
    return profileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getProfile_Id() {
    return (EAttribute) profileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Activation() {
    return (EReference) profileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Build() {
    return (EReference) profileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Repositories() {
    return (EReference) profileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_PluginRepositories() {
    return (EReference) profileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Dependencies() {
    return (EReference) profileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Reports() {
    return (EReference) profileEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_DependencyManagement() {
    return (EReference) profileEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_DistributionManagement() {
    return (EReference) profileEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Properties() {
    return (EReference) profileEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getProfile_Modules() {
    return (EAttribute) profileEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getProfile_Reporting() {
    return (EReference) profileEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getRelocation() {
    return relocationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRelocation_GroupId() {
    return (EAttribute) relocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRelocation_ArtifactId() {
    return (EAttribute) relocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRelocation_Version() {
    return (EAttribute) relocationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRelocation_Message() {
    return (EAttribute) relocationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getReporting() {
    return reportingEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReporting_ExcludeDefaults() {
    return (EAttribute) reportingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReporting_OutputDirectory() {
    return (EAttribute) reportingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getReporting_Plugins() {
    return (EReference) reportingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getReportPlugin() {
    return reportPluginEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportPlugin_GroupId() {
    return (EAttribute) reportPluginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportPlugin_ArtifactId() {
    return (EAttribute) reportPluginEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportPlugin_Version() {
    return (EAttribute) reportPluginEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportPlugin_Inherited() {
    return (EAttribute) reportPluginEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getReportPlugin_ReportSets() {
    return (EReference) reportPluginEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getReportPlugin_Configuration() {
    return (EReference) reportPluginEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getReportSet() {
    return reportSetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportSet_Id() {
    return (EAttribute) reportSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportSet_Inherited() {
    return (EAttribute) reportSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getReportSet_Reports() {
    return (EAttribute) reportSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getReportSet_Configuration() {
    return (EReference) reportSetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getRepository() {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getRepository_Releases() {
    return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EReference getRepository_Snapshots() {
    return (EReference) repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepository_Id() {
    return (EAttribute) repositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepository_Name() {
    return (EAttribute) repositoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepository_Url() {
    return (EAttribute) repositoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepository_Layout() {
    return (EAttribute) repositoryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getRepositoryPolicy() {
    return repositoryPolicyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepositoryPolicy_Enabled() {
    return (EAttribute) repositoryPolicyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepositoryPolicy_UpdatePolicy() {
    return (EAttribute) repositoryPolicyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getRepositoryPolicy_ChecksumPolicy() {
    return (EAttribute) repositoryPolicyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getResource() {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getResource_TargetPath() {
    return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getResource_Filtering() {
    return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getResource_Directory() {
    return (EAttribute) resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getResource_Includes() {
    return (EAttribute) resourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getResource_Excludes() {
    return (EAttribute) resourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getScm() {
    return scmEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getScm_Connection() {
    return (EAttribute) scmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getScm_DeveloperConnection() {
    return (EAttribute) scmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getScm_Tag() {
    return (EAttribute) scmEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getScm_Url() {
    return (EAttribute) scmEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getSite() {
    return siteEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getSite_Id() {
    return (EAttribute) siteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getSite_Name() {
    return (EAttribute) siteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getSite_Url() {
    return (EAttribute) siteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getPropertyElement() {
    return propertyElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPropertyElement_Name() {
    return (EAttribute) propertyElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EAttribute getPropertyElement_Value() {
    return (EAttribute) propertyElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public EClass getConfiguration() {
    return configurationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public PomFactory getPomFactory() {
    return (PomFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its
   * first. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public void createPackageContents() {
    if(isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    activationEClass = createEClass(ACTIVATION);
    createEAttribute(activationEClass, ACTIVATION__ACTIVE_BY_DEFAULT);
    createEAttribute(activationEClass, ACTIVATION__JDK);
    createEReference(activationEClass, ACTIVATION__OS);
    createEReference(activationEClass, ACTIVATION__PROPERTY);
    createEReference(activationEClass, ACTIVATION__FILE);

    activationFileEClass = createEClass(ACTIVATION_FILE);
    createEAttribute(activationFileEClass, ACTIVATION_FILE__MISSING);
    createEAttribute(activationFileEClass, ACTIVATION_FILE__EXISTS);

    activationOSEClass = createEClass(ACTIVATION_OS);
    createEAttribute(activationOSEClass, ACTIVATION_OS__NAME);
    createEAttribute(activationOSEClass, ACTIVATION_OS__FAMILY);
    createEAttribute(activationOSEClass, ACTIVATION_OS__ARCH);
    createEAttribute(activationOSEClass, ACTIVATION_OS__VERSION);

    activationPropertyEClass = createEClass(ACTIVATION_PROPERTY);
    createEAttribute(activationPropertyEClass, ACTIVATION_PROPERTY__NAME);
    createEAttribute(activationPropertyEClass, ACTIVATION_PROPERTY__VALUE);

    buildEClass = createEClass(BUILD);
    createEAttribute(buildEClass, BUILD__SOURCE_DIRECTORY);
    createEAttribute(buildEClass, BUILD__SCRIPT_SOURCE_DIRECTORY);
    createEAttribute(buildEClass, BUILD__TEST_SOURCE_DIRECTORY);
    createEAttribute(buildEClass, BUILD__OUTPUT_DIRECTORY);
    createEAttribute(buildEClass, BUILD__TEST_OUTPUT_DIRECTORY);
    createEReference(buildEClass, BUILD__EXTENSIONS);

    buildBaseEClass = createEClass(BUILD_BASE);
    createEAttribute(buildBaseEClass, BUILD_BASE__DEFAULT_GOAL);
    createEReference(buildBaseEClass, BUILD_BASE__RESOURCES);
    createEReference(buildBaseEClass, BUILD_BASE__TEST_RESOURCES);
    createEAttribute(buildBaseEClass, BUILD_BASE__DIRECTORY);
    createEAttribute(buildBaseEClass, BUILD_BASE__FINAL_NAME);
    createEReference(buildBaseEClass, BUILD_BASE__PLUGIN_MANAGEMENT);
    createEReference(buildBaseEClass, BUILD_BASE__PLUGINS);
    createEAttribute(buildBaseEClass, BUILD_BASE__FILTERS);

    ciManagementEClass = createEClass(CI_MANAGEMENT);
    createEAttribute(ciManagementEClass, CI_MANAGEMENT__SYSTEM);
    createEAttribute(ciManagementEClass, CI_MANAGEMENT__URL);
    createEReference(ciManagementEClass, CI_MANAGEMENT__NOTIFIERS);

    contributorEClass = createEClass(CONTRIBUTOR);
    createEAttribute(contributorEClass, CONTRIBUTOR__NAME);
    createEAttribute(contributorEClass, CONTRIBUTOR__EMAIL);
    createEAttribute(contributorEClass, CONTRIBUTOR__URL);
    createEAttribute(contributorEClass, CONTRIBUTOR__ORGANIZATION);
    createEAttribute(contributorEClass, CONTRIBUTOR__ORGANIZATION_URL);
    createEAttribute(contributorEClass, CONTRIBUTOR__TIMEZONE);
    createEReference(contributorEClass, CONTRIBUTOR__PROPERTIES);
    createEAttribute(contributorEClass, CONTRIBUTOR__ROLES);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__GROUP_ID);
    createEAttribute(dependencyEClass, DEPENDENCY__ARTIFACT_ID);
    createEAttribute(dependencyEClass, DEPENDENCY__VERSION);
    createEAttribute(dependencyEClass, DEPENDENCY__TYPE);
    createEAttribute(dependencyEClass, DEPENDENCY__CLASSIFIER);
    createEAttribute(dependencyEClass, DEPENDENCY__SCOPE);
    createEAttribute(dependencyEClass, DEPENDENCY__SYSTEM_PATH);
    createEReference(dependencyEClass, DEPENDENCY__EXCLUSIONS);
    createEAttribute(dependencyEClass, DEPENDENCY__OPTIONAL);

    dependencyManagementEClass = createEClass(DEPENDENCY_MANAGEMENT);
    createEReference(dependencyManagementEClass, DEPENDENCY_MANAGEMENT__DEPENDENCIES);

    deploymentRepositoryEClass = createEClass(DEPLOYMENT_REPOSITORY);
    createEAttribute(deploymentRepositoryEClass, DEPLOYMENT_REPOSITORY__UNIQUE_VERSION);
    createEAttribute(deploymentRepositoryEClass, DEPLOYMENT_REPOSITORY__ID);
    createEAttribute(deploymentRepositoryEClass, DEPLOYMENT_REPOSITORY__NAME);
    createEAttribute(deploymentRepositoryEClass, DEPLOYMENT_REPOSITORY__URL);
    createEAttribute(deploymentRepositoryEClass, DEPLOYMENT_REPOSITORY__LAYOUT);

    developerEClass = createEClass(DEVELOPER);
    createEAttribute(developerEClass, DEVELOPER__ID);
    createEAttribute(developerEClass, DEVELOPER__NAME);
    createEAttribute(developerEClass, DEVELOPER__EMAIL);
    createEAttribute(developerEClass, DEVELOPER__URL);
    createEAttribute(developerEClass, DEVELOPER__ORGANIZATION);
    createEAttribute(developerEClass, DEVELOPER__ORGANIZATION_URL);
    createEAttribute(developerEClass, DEVELOPER__TIMEZONE);
    createEReference(developerEClass, DEVELOPER__PROPERTIES);
    createEAttribute(developerEClass, DEVELOPER__ROLES);

    distributionManagementEClass = createEClass(DISTRIBUTION_MANAGEMENT);
    createEReference(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__REPOSITORY);
    createEReference(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__SNAPSHOT_REPOSITORY);
    createEReference(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__SITE);
    createEAttribute(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__DOWNLOAD_URL);
    createEReference(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__RELOCATION);
    createEAttribute(distributionManagementEClass, DISTRIBUTION_MANAGEMENT__STATUS);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PROJECT);

    exclusionEClass = createEClass(EXCLUSION);
    createEAttribute(exclusionEClass, EXCLUSION__ARTIFACT_ID);
    createEAttribute(exclusionEClass, EXCLUSION__GROUP_ID);

    extensionEClass = createEClass(EXTENSION);
    createEAttribute(extensionEClass, EXTENSION__GROUP_ID);
    createEAttribute(extensionEClass, EXTENSION__ARTIFACT_ID);
    createEAttribute(extensionEClass, EXTENSION__VERSION);

    issueManagementEClass = createEClass(ISSUE_MANAGEMENT);
    createEAttribute(issueManagementEClass, ISSUE_MANAGEMENT__SYSTEM);
    createEAttribute(issueManagementEClass, ISSUE_MANAGEMENT__URL);

    licenseEClass = createEClass(LICENSE);
    createEAttribute(licenseEClass, LICENSE__NAME);
    createEAttribute(licenseEClass, LICENSE__URL);
    createEAttribute(licenseEClass, LICENSE__DISTRIBUTION);
    createEAttribute(licenseEClass, LICENSE__COMMENTS);

    mailingListEClass = createEClass(MAILING_LIST);
    createEAttribute(mailingListEClass, MAILING_LIST__NAME);
    createEAttribute(mailingListEClass, MAILING_LIST__SUBSCRIBE);
    createEAttribute(mailingListEClass, MAILING_LIST__UNSUBSCRIBE);
    createEAttribute(mailingListEClass, MAILING_LIST__POST);
    createEAttribute(mailingListEClass, MAILING_LIST__ARCHIVE);
    createEAttribute(mailingListEClass, MAILING_LIST__OTHER_ARCHIVES);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PARENT);
    createEAttribute(modelEClass, MODEL__MODEL_VERSION);
    createEAttribute(modelEClass, MODEL__GROUP_ID);
    createEAttribute(modelEClass, MODEL__ARTIFACT_ID);
    createEAttribute(modelEClass, MODEL__PACKAGING);
    createEAttribute(modelEClass, MODEL__NAME);
    createEAttribute(modelEClass, MODEL__VERSION);
    createEAttribute(modelEClass, MODEL__DESCRIPTION);
    createEAttribute(modelEClass, MODEL__URL);
    createEReference(modelEClass, MODEL__PREREQUISITES);
    createEReference(modelEClass, MODEL__ISSUE_MANAGEMENT);
    createEReference(modelEClass, MODEL__CI_MANAGEMENT);
    createEAttribute(modelEClass, MODEL__INCEPTION_YEAR);
    createEReference(modelEClass, MODEL__MAILING_LISTS);
    createEReference(modelEClass, MODEL__DEVELOPERS);
    createEReference(modelEClass, MODEL__CONTRIBUTORS);
    createEReference(modelEClass, MODEL__LICENSES);
    createEReference(modelEClass, MODEL__SCM);
    createEReference(modelEClass, MODEL__ORGANIZATION);
    createEReference(modelEClass, MODEL__BUILD);
    createEReference(modelEClass, MODEL__PROFILES);
    createEReference(modelEClass, MODEL__REPOSITORIES);
    createEReference(modelEClass, MODEL__PLUGIN_REPOSITORIES);
    createEReference(modelEClass, MODEL__DEPENDENCIES);
    createEReference(modelEClass, MODEL__REPORTING);
    createEReference(modelEClass, MODEL__DEPENDENCY_MANAGEMENT);
    createEReference(modelEClass, MODEL__DISTRIBUTION_MANAGEMENT);
    createEReference(modelEClass, MODEL__PROPERTIES);
    createEAttribute(modelEClass, MODEL__MODULES);

    notifierEClass = createEClass(NOTIFIER);
    createEAttribute(notifierEClass, NOTIFIER__TYPE);
    createEAttribute(notifierEClass, NOTIFIER__SEND_ON_ERROR);
    createEAttribute(notifierEClass, NOTIFIER__SEND_ON_FAILURE);
    createEAttribute(notifierEClass, NOTIFIER__SEND_ON_SUCCESS);
    createEAttribute(notifierEClass, NOTIFIER__SEND_ON_WARNING);
    createEAttribute(notifierEClass, NOTIFIER__ADDRESS);
    createEReference(notifierEClass, NOTIFIER__CONFIGURATION);

    organizationEClass = createEClass(ORGANIZATION);
    createEAttribute(organizationEClass, ORGANIZATION__NAME);
    createEAttribute(organizationEClass, ORGANIZATION__URL);

    parentEClass = createEClass(PARENT);
    createEAttribute(parentEClass, PARENT__ARTIFACT_ID);
    createEAttribute(parentEClass, PARENT__GROUP_ID);
    createEAttribute(parentEClass, PARENT__VERSION);
    createEAttribute(parentEClass, PARENT__RELATIVE_PATH);

    pluginEClass = createEClass(PLUGIN);
    createEAttribute(pluginEClass, PLUGIN__GROUP_ID);
    createEAttribute(pluginEClass, PLUGIN__ARTIFACT_ID);
    createEAttribute(pluginEClass, PLUGIN__VERSION);
    createEAttribute(pluginEClass, PLUGIN__EXTENSIONS);
    createEReference(pluginEClass, PLUGIN__EXECUTIONS);
    createEReference(pluginEClass, PLUGIN__DEPENDENCIES);
    createEAttribute(pluginEClass, PLUGIN__INHERITED);
    createEReference(pluginEClass, PLUGIN__CONFIGURATION);

    pluginExecutionEClass = createEClass(PLUGIN_EXECUTION);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__ID);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__PHASE);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__INHERITED);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__GOALS);
    createEReference(pluginExecutionEClass, PLUGIN_EXECUTION__CONFIGURATION);

    pluginManagementEClass = createEClass(PLUGIN_MANAGEMENT);
    createEReference(pluginManagementEClass, PLUGIN_MANAGEMENT__PLUGINS);

    prerequisitesEClass = createEClass(PREREQUISITES);
    createEAttribute(prerequisitesEClass, PREREQUISITES__MAVEN);

    profileEClass = createEClass(PROFILE);
    createEAttribute(profileEClass, PROFILE__ID);
    createEReference(profileEClass, PROFILE__ACTIVATION);
    createEReference(profileEClass, PROFILE__BUILD);
    createEReference(profileEClass, PROFILE__REPOSITORIES);
    createEReference(profileEClass, PROFILE__PLUGIN_REPOSITORIES);
    createEReference(profileEClass, PROFILE__DEPENDENCIES);
    createEReference(profileEClass, PROFILE__REPORTS);
    createEReference(profileEClass, PROFILE__DEPENDENCY_MANAGEMENT);
    createEReference(profileEClass, PROFILE__DISTRIBUTION_MANAGEMENT);
    createEReference(profileEClass, PROFILE__PROPERTIES);
    createEAttribute(profileEClass, PROFILE__MODULES);
    createEReference(profileEClass, PROFILE__REPORTING);

    relocationEClass = createEClass(RELOCATION);
    createEAttribute(relocationEClass, RELOCATION__GROUP_ID);
    createEAttribute(relocationEClass, RELOCATION__ARTIFACT_ID);
    createEAttribute(relocationEClass, RELOCATION__VERSION);
    createEAttribute(relocationEClass, RELOCATION__MESSAGE);

    reportingEClass = createEClass(REPORTING);
    createEAttribute(reportingEClass, REPORTING__EXCLUDE_DEFAULTS);
    createEAttribute(reportingEClass, REPORTING__OUTPUT_DIRECTORY);
    createEReference(reportingEClass, REPORTING__PLUGINS);

    reportPluginEClass = createEClass(REPORT_PLUGIN);
    createEAttribute(reportPluginEClass, REPORT_PLUGIN__GROUP_ID);
    createEAttribute(reportPluginEClass, REPORT_PLUGIN__ARTIFACT_ID);
    createEAttribute(reportPluginEClass, REPORT_PLUGIN__VERSION);
    createEAttribute(reportPluginEClass, REPORT_PLUGIN__INHERITED);
    createEReference(reportPluginEClass, REPORT_PLUGIN__REPORT_SETS);
    createEReference(reportPluginEClass, REPORT_PLUGIN__CONFIGURATION);

    reportSetEClass = createEClass(REPORT_SET);
    createEAttribute(reportSetEClass, REPORT_SET__ID);
    createEAttribute(reportSetEClass, REPORT_SET__INHERITED);
    createEAttribute(reportSetEClass, REPORT_SET__REPORTS);
    createEReference(reportSetEClass, REPORT_SET__CONFIGURATION);

    repositoryEClass = createEClass(REPOSITORY);
    createEReference(repositoryEClass, REPOSITORY__RELEASES);
    createEReference(repositoryEClass, REPOSITORY__SNAPSHOTS);
    createEAttribute(repositoryEClass, REPOSITORY__ID);
    createEAttribute(repositoryEClass, REPOSITORY__NAME);
    createEAttribute(repositoryEClass, REPOSITORY__URL);
    createEAttribute(repositoryEClass, REPOSITORY__LAYOUT);

    repositoryPolicyEClass = createEClass(REPOSITORY_POLICY);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__ENABLED);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__UPDATE_POLICY);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__CHECKSUM_POLICY);

    resourceEClass = createEClass(RESOURCE);
    createEAttribute(resourceEClass, RESOURCE__TARGET_PATH);
    createEAttribute(resourceEClass, RESOURCE__FILTERING);
    createEAttribute(resourceEClass, RESOURCE__DIRECTORY);
    createEAttribute(resourceEClass, RESOURCE__INCLUDES);
    createEAttribute(resourceEClass, RESOURCE__EXCLUDES);

    scmEClass = createEClass(SCM);
    createEAttribute(scmEClass, SCM__CONNECTION);
    createEAttribute(scmEClass, SCM__DEVELOPER_CONNECTION);
    createEAttribute(scmEClass, SCM__TAG);
    createEAttribute(scmEClass, SCM__URL);

    siteEClass = createEClass(SITE);
    createEAttribute(siteEClass, SITE__ID);
    createEAttribute(siteEClass, SITE__NAME);
    createEAttribute(siteEClass, SITE__URL);

    propertyElementEClass = createEClass(PROPERTY_ELEMENT);
    createEAttribute(propertyElementEClass, PROPERTY_ELEMENT__NAME);
    createEAttribute(propertyElementEClass, PROPERTY_ELEMENT__VALUE);

    configurationEClass = createEClass(CONFIGURATION);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
   * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public void initializePackageContents() {
    if(isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    buildEClass.getESuperTypes().add(this.getBuildBase());

    // Initialize classes and features; add operations and parameters
    initEClass(activationEClass, Activation.class, "Activation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivation_ActiveByDefault(), theXMLTypePackage.getString(), "activeByDefault", "false", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Activation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getActivation_Jdk(), theXMLTypePackage.getString(), "jdk", null, 0, 1, Activation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivation_Os(), this.getActivationOS(), null, "os", null, 0, 1, Activation.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getActivation_Property(), this.getActivationProperty(), null, "property", null, 0, 1, //$NON-NLS-1$
        Activation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActivation_File(), this.getActivationFile(), null, "file", null, 0, 1, Activation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(activationFileEClass, ActivationFile.class, "ActivationFile", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivationFile_Missing(), theXMLTypePackage.getString(), "missing", null, 0, 1, //$NON-NLS-1$
        ActivationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivationFile_Exists(), theXMLTypePackage.getString(), "exists", null, 0, 1, //$NON-NLS-1$
        ActivationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(activationOSEClass, ActivationOS.class, "ActivationOS", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivationOS_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ActivationOS.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivationOS_Family(), theXMLTypePackage.getString(), "family", null, 0, 1, ActivationOS.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivationOS_Arch(), theXMLTypePackage.getString(), "arch", null, 0, 1, ActivationOS.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivationOS_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ActivationOS.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activationPropertyEClass, ActivationProperty.class, "ActivationProperty", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivationProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, //$NON-NLS-1$
        ActivationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActivationProperty_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, //$NON-NLS-1$
        ActivationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(buildEClass, Build.class, "Build", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getBuild_SourceDirectory(), theXMLTypePackage.getString(), "sourceDirectory", null, 0, 1, //$NON-NLS-1$
        Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getBuild_ScriptSourceDirectory(), theXMLTypePackage.getString(), "scriptSourceDirectory", null, 0, //$NON-NLS-1$
        1, Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getBuild_TestSourceDirectory(), theXMLTypePackage.getString(), "testSourceDirectory", null, 0, 1, //$NON-NLS-1$
        Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getBuild_OutputDirectory(), theXMLTypePackage.getString(), "outputDirectory", null, 0, 1, //$NON-NLS-1$
        Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getBuild_TestOutputDirectory(), theXMLTypePackage.getString(), "testOutputDirectory", null, 0, 1, //$NON-NLS-1$
        Build.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getBuild_Extensions(), this.getExtension(), null, "extensions", null, 0, -1, Build.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(buildBaseEClass, BuildBase.class, "BuildBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getBuildBase_DefaultGoal(), theXMLTypePackage.getString(), "defaultGoal", null, 0, 1, //$NON-NLS-1$
        BuildBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getBuildBase_Resources(), this.getResource(), null, "resources", null, 0, -1, BuildBase.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildBase_TestResources(), this.getResource(), null, "testResources", null, 0, -1, //$NON-NLS-1$
        BuildBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildBase_Directory(), theXMLTypePackage.getString(), "directory", null, 0, 1, BuildBase.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildBase_FinalName(), theXMLTypePackage.getString(), "finalName", null, 0, 1, BuildBase.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildBase_PluginManagement(), this.getPluginManagement(), null, "pluginManagement", null, 0, 1, //$NON-NLS-1$
        BuildBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildBase_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, BuildBase.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildBase_Filters(), theXMLTypePackage.getString(), "filters", null, 0, -1, BuildBase.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ciManagementEClass, CiManagement.class, "CiManagement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCiManagement_System(), theXMLTypePackage.getString(), "system", null, 0, 1, CiManagement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCiManagement_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, CiManagement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCiManagement_Notifiers(), this.getNotifier(), null, "notifiers", null, 0, -1, CiManagement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(contributorEClass, Contributor.class, "Contributor", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributor_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Contributor.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributor_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, Contributor.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributor_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Contributor.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributor_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, //$NON-NLS-1$
        Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getContributor_OrganizationUrl(), theXMLTypePackage.getString(), "organizationUrl", null, 0, 1, //$NON-NLS-1$
        Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getContributor_Timezone(), theXMLTypePackage.getString(), "timezone", null, 0, 1, Contributor.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributor_Properties(), this.getPropertyElement(), null, "properties", null, 0, -1, //$NON-NLS-1$
        Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContributor_Roles(), theXMLTypePackage.getString(), "roles", null, 0, -1, Contributor.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Dependency.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, //$NON-NLS-1$
        Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getDependency_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Dependency.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Dependency.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_Classifier(), theXMLTypePackage.getString(), "classifier", null, 0, 1, //$NON-NLS-1$
        Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getDependency_Scope(), theXMLTypePackage.getString(), "scope", null, 0, 1, Dependency.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_SystemPath(), theXMLTypePackage.getString(), "systemPath", null, 0, 1, //$NON-NLS-1$
        Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getDependency_Exclusions(), this.getExclusion(), null, "exclusions", null, 0, -1, Dependency.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependency_Optional(), theXMLTypePackage.getString(), "optional", "false", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(dependencyManagementEClass, DependencyManagement.class, "DependencyManagement", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencyManagement_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, //$NON-NLS-1$
        DependencyManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentRepositoryEClass, DeploymentRepository.class, "DeploymentRepository", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeploymentRepository_UniqueVersion(), theXMLTypePackage.getString(), "uniqueVersion", "true", 0, //$NON-NLS-1$ //$NON-NLS-2$
        1, DeploymentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentRepository_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, //$NON-NLS-1$
        DeploymentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentRepository_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, //$NON-NLS-1$
        DeploymentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentRepository_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, //$NON-NLS-1$
        DeploymentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentRepository_Layout(), theXMLTypePackage.getString(), "layout", null, 0, 1, //$NON-NLS-1$
        DeploymentRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getDeveloper_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Developer.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeveloper_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Developer.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeveloper_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, Developer.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeveloper_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Developer.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeveloper_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, //$NON-NLS-1$
        Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getDeveloper_OrganizationUrl(), theXMLTypePackage.getString(), "organizationUrl", null, 0, 1, //$NON-NLS-1$
        Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getDeveloper_Timezone(), theXMLTypePackage.getString(), "timezone", null, 0, 1, Developer.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeveloper_Properties(), this.getPropertyElement(), null, "properties", null, 0, -1, //$NON-NLS-1$
        Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeveloper_Roles(), theXMLTypePackage.getString(), "roles", null, 0, -1, Developer.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distributionManagementEClass, DistributionManagement.class, "DistributionManagement", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDistributionManagement_Repository(), this.getDeploymentRepository(), null, "repository", null, 0, //$NON-NLS-1$
        1, DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDistributionManagement_SnapshotRepository(), this.getDeploymentRepository(), null,
        "snapshotRepository", null, 0, 1, DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDistributionManagement_Site(), this.getSite(), null, "site", null, 0, 1, //$NON-NLS-1$
        DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDistributionManagement_DownloadUrl(), theXMLTypePackage.getString(), "downloadUrl", null, 0, 1, //$NON-NLS-1$
        DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getDistributionManagement_Relocation(), this.getRelocation(), null, "relocation", null, 0, 1, //$NON-NLS-1$
        DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDistributionManagement_Status(), theXMLTypePackage.getString(), "status", null, 0, 1, //$NON-NLS-1$
        DistributionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", //$NON-NLS-1$
        null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
        "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Project(), this.getModel(), null, "project", null, 0, -2, null, IS_TRANSIENT, //$NON-NLS-1$
        IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
        IS_ORDERED);

    initEClass(exclusionEClass, Exclusion.class, "Exclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getExclusion_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, Exclusion.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExclusion_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Exclusion.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getExtension_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Extension.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtension_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, Extension.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtension_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Extension.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(issueManagementEClass, IssueManagement.class, "IssueManagement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIssueManagement_System(), theXMLTypePackage.getString(), "system", null, 0, 1, //$NON-NLS-1$
        IssueManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIssueManagement_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, IssueManagement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getLicense_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, License.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLicense_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, License.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLicense_Distribution(), theXMLTypePackage.getString(), "distribution", null, 0, 1, License.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLicense_Comments(), theXMLTypePackage.getString(), "comments", null, 0, 1, License.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mailingListEClass, MailingList.class, "MailingList", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMailingList_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MailingList.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMailingList_Subscribe(), theXMLTypePackage.getString(), "subscribe", null, 0, 1, //$NON-NLS-1$
        MailingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getMailingList_Unsubscribe(), theXMLTypePackage.getString(), "unsubscribe", null, 0, 1, //$NON-NLS-1$
        MailingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getMailingList_Post(), theXMLTypePackage.getString(), "post", null, 0, 1, MailingList.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMailingList_Archive(), theXMLTypePackage.getString(), "archive", null, 0, 1, MailingList.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMailingList_OtherArchives(), ecorePackage.getEString(), "otherArchives", null, 0, -1, //$NON-NLS-1$
        MailingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getModel_Parent(), this.getParent(), null, "parent", null, 0, 1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getModel_ModelVersion(), theXMLTypePackage.getString(), "modelVersion", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Packaging(), theXMLTypePackage.getString(), "packaging", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Prerequisites(), this.getPrerequisites(), null, "prerequisites", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_IssueManagement(), this.getIssueManagement(), null, "issueManagement", null, 0, 1, //$NON-NLS-1$
        Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_CiManagement(), this.getCiManagement(), null, "ciManagement", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_InceptionYear(), theXMLTypePackage.getString(), "inceptionYear", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_MailingLists(), this.getMailingList(), null, "mailingLists", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Developers(), this.getDeveloper(), null, "developers", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Contributors(), this.getContributor(), null, "contributors", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Licenses(), this.getLicense(), null, "licenses", null, 0, -1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getModel_Scm(), this.getScm(), null, "scm", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Organization(), this.getOrganization(), null, "organization", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Build(), this.getBuild(), null, "build", null, 0, 1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getModel_Profiles(), this.getProfile(), null, "profiles", null, 0, -1, Model.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getModel_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_PluginRepositories(), this.getRepository(), null, "pluginRepositories", null, 0, -1, //$NON-NLS-1$
        Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Reporting(), this.getReporting(), null, "reporting", null, 0, 1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DependencyManagement(), this.getDependencyManagement(), null, "dependencyManagement", null, //$NON-NLS-1$
        0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DistributionManagement(), this.getDistributionManagement(), null, "distributionManagement", //$NON-NLS-1$
        null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Properties(), this.getPropertyElement(), null, "properties", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Modules(), theXMLTypePackage.getString(), "modules", null, 0, -1, Model.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notifierEClass, Notifier.class, "Notifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getNotifier_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Notifier.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNotifier_SendOnError(), theXMLTypePackage.getString(), "sendOnError", "true", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Notifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getNotifier_SendOnFailure(), theXMLTypePackage.getString(), "sendOnFailure", "true", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Notifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getNotifier_SendOnSuccess(), theXMLTypePackage.getString(), "sendOnSuccess", "true", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Notifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getNotifier_SendOnWarning(), theXMLTypePackage.getString(), "sendOnWarning", "true", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Notifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getNotifier_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, Notifier.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNotifier_Configuration(), this.getPropertyElement(), null, "configuration", null, 0, -1, //$NON-NLS-1$
        Notifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganization_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Organization.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrganization_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Organization.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getParent_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, Parent.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParent_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Parent.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParent_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Parent.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParent_RelativePath(), theXMLTypePackage.getString(), "relativePath", null, 0, 1, Parent.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getPlugin_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Extensions(), theXMLTypePackage.getString(), "extensions", "false", 0, 1, Plugin.class, //$NON-NLS-1$ //$NON-NLS-2$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Executions(), this.getPluginExecution(), null, "executions", null, 0, -1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlugin_Inherited(), theXMLTypePackage.getString(), "inherited", null, 0, 1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, Plugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(pluginExecutionEClass, PluginExecution.class, "PluginExecution", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginExecution_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, PluginExecution.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Phase(), theXMLTypePackage.getString(), "phase", null, 0, 1, //$NON-NLS-1$
        PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Inherited(), theXMLTypePackage.getString(), "inherited", null, 0, 1, //$NON-NLS-1$
        PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Goals(), theXMLTypePackage.getString(), "goals", null, 0, -1, //$NON-NLS-1$
        PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginExecution_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, //$NON-NLS-1$
        PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginManagementEClass, PluginManagement.class, "PluginManagement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginManagement_Plugins(), this.getPlugin(), null, "plugins", null, 0, -1, //$NON-NLS-1$
        PluginManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prerequisitesEClass, Prerequisites.class, "Prerequisites", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrerequisites_Maven(), theXMLTypePackage.getString(), "maven", null, 0, 1, Prerequisites.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getProfile_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Profile.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Activation(), this.getActivation(), null, "activation", null, 0, 1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Build(), this.getBuildBase(), null, "build", null, 0, 1, Profile.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getProfile_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_PluginRepositories(), this.getRepository(), null, "pluginRepositories", null, 0, -1, //$NON-NLS-1$
        Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Reports(), this.getReportPlugin(), null, "reports", null, 0, -1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_DependencyManagement(), this.getDependencyManagement(), null, "dependencyManagement", //$NON-NLS-1$
        null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_DistributionManagement(), this.getDistributionManagement(), null,
        "distributionManagement", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Properties(), this.getPropertyElement(), null, "properties", null, 0, -1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProfile_Modules(), theXMLTypePackage.getString(), "modules", null, 0, -1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProfile_Reporting(), this.getReporting(), null, "reporting", null, 0, 1, Profile.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(relocationEClass, Relocation.class, "Relocation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelocation_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, Relocation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelocation_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, //$NON-NLS-1$
        Relocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getRelocation_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Relocation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelocation_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, Relocation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportingEClass, Reporting.class, "Reporting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getReporting_ExcludeDefaults(), theXMLTypePackage.getString(), "excludeDefaults", "false", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        Reporting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getReporting_OutputDirectory(), theXMLTypePackage.getString(), "outputDirectory", null, 0, 1, //$NON-NLS-1$
        Reporting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getReporting_Plugins(), this.getReportPlugin(), null, "plugins", null, 0, -1, Reporting.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(reportPluginEClass, ReportPlugin.class, "ReportPlugin", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReportPlugin_GroupId(), theXMLTypePackage.getString(), "groupId", null, 0, 1, ReportPlugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReportPlugin_ArtifactId(), theXMLTypePackage.getString(), "artifactId", null, 0, 1, //$NON-NLS-1$
        ReportPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getReportPlugin_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ReportPlugin.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReportPlugin_Inherited(), theXMLTypePackage.getString(), "inherited", null, 0, 1, //$NON-NLS-1$
        ReportPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getReportPlugin_ReportSets(), this.getReportSet(), null, "reportSets", null, 0, -1, //$NON-NLS-1$
        ReportPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReportPlugin_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, //$NON-NLS-1$
        ReportPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportSetEClass, ReportSet.class, "ReportSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getReportSet_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, ReportSet.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReportSet_Inherited(), theXMLTypePackage.getString(), "inherited", null, 0, 1, ReportSet.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReportSet_Reports(), theXMLTypePackage.getString(), "reports", null, 0, -1, ReportSet.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReportSet_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, //$NON-NLS-1$
        ReportSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepository_Releases(), this.getRepositoryPolicy(), null, "releases", null, 0, 1, //$NON-NLS-1$
        Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Snapshots(), this.getRepositoryPolicy(), null, "snapshots", null, 0, 1, //$NON-NLS-1$
        Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Repository.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Repository.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Repository.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Layout(), theXMLTypePackage.getString(), "layout", null, 0, 1, Repository.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryPolicyEClass, RepositoryPolicy.class, "RepositoryPolicy", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryPolicy_Enabled(), theXMLTypePackage.getString(), "enabled", "true", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
        RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_UpdatePolicy(), theXMLTypePackage.getString(), "updatePolicy", null, 0, 1, //$NON-NLS-1$
        RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_ChecksumPolicy(), theXMLTypePackage.getString(), "checksumPolicy", null, 0, 1, //$NON-NLS-1$
        RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getResource_TargetPath(), theXMLTypePackage.getString(), "targetPath", null, 0, 1, Resource.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Filtering(), theXMLTypePackage.getString(), "filtering", "false", 0, 1, Resource.class, //$NON-NLS-1$ //$NON-NLS-2$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Directory(), theXMLTypePackage.getString(), "directory", null, 0, 1, Resource.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Includes(), theXMLTypePackage.getString(), "includes", null, 0, -1, Resource.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Excludes(), theXMLTypePackage.getString(), "excludes", null, 0, -1, Resource.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scmEClass, Scm.class, "Scm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getScm_Connection(), theXMLTypePackage.getString(), "connection", null, 0, 1, Scm.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScm_DeveloperConnection(), theXMLTypePackage.getString(), "developerConnection", null, 0, 1, //$NON-NLS-1$
        Scm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getScm_Tag(), theXMLTypePackage.getString(), "tag", null, 0, 1, Scm.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScm_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Scm.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getSite_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Site.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSite_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Site.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSite_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, Site.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyElementEClass, PropertyElement.class, "PropertyElement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PropertyElement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyElement_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, //$NON-NLS-1$
        PropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$
    addAnnotation(activationEClass, source, new String[] {"name", "Activation", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getActivation_ActiveByDefault(), source, new String[] {"kind", "element", "name", "activeByDefault", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getActivation_Jdk(), source, new String[] {"kind", "element", "name", "jdk", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivation_Os(), source, new String[] {"kind", "element", "name", "os", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivation_Property(), source, new String[] {"kind", "element", "name", "property", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivation_File(), source, new String[] {"kind", "element", "name", "file", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(activationFileEClass, source, new String[] {"name", "ActivationFile", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getActivationFile_Missing(), source, new String[] {"kind", "element", "name", "missing", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivationFile_Exists(), source, new String[] {"kind", "element", "name", "exists", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(activationOSEClass, source, new String[] {"name", "ActivationOS", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getActivationOS_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivationOS_Family(), source, new String[] {"kind", "element", "name", "family", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivationOS_Arch(), source, new String[] {"kind", "element", "name", "arch", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivationOS_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(activationPropertyEClass, source, new String[] {"name", "ActivationProperty", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getActivationProperty_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getActivationProperty_Value(), source, new String[] {"kind", "element", "name", "value", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(buildEClass, source, new String[] {"name", "Build", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getBuild_SourceDirectory(), source, new String[] {"kind", "element", "name", "sourceDirectory", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getBuild_ScriptSourceDirectory(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "scriptSourceDirectory", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getBuild_TestSourceDirectory(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "testSourceDirectory", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getBuild_OutputDirectory(), source, new String[] {"kind", "element", "name", "outputDirectory", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getBuild_TestOutputDirectory(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "testOutputDirectory", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getBuild_Extensions(), source, new String[] {"kind", "element", "name", "extensions", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(buildBaseEClass, source, new String[] {"name", "BuildBase", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getBuildBase_DefaultGoal(), source, new String[] {"kind", "element", "name", "defaultGoal", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getBuildBase_Resources(), source, new String[] {"kind", "element", "name", "resources", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getBuildBase_TestResources(), source, new String[] {"kind", "element", "name", "testResources", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getBuildBase_Directory(), source, new String[] {"kind", "element", "name", "directory", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getBuildBase_FinalName(), source, new String[] {"kind", "element", "name", "finalName", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getBuildBase_PluginManagement(), source, new String[] {"kind", "element", "name", "pluginManagement", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getBuildBase_Plugins(), source, new String[] {"kind", "element", "name", "plugins", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(ciManagementEClass, source, new String[] {"name", "CiManagement", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getCiManagement_System(), source, new String[] {"kind", "element", "name", "system", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getCiManagement_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getCiManagement_Notifiers(), source, new String[] {"kind", "element", "name", "notifiers", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(contributorEClass, source, new String[] {"name", "Contributor", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getContributor_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getContributor_Email(), source, new String[] {"kind", "element", "name", "email", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getContributor_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getContributor_Organization(), source, new String[] {"kind", "element", "name", "organization", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getContributor_OrganizationUrl(), source, new String[] {"kind", "element", "name", "organizationUrl", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getContributor_Timezone(), source, new String[] {"kind", "element", "name", "timezone", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getContributor_Properties(), source, new String[] {"kind", "element", "name", "properties", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(dependencyEClass, source, new String[] {"name", "Dependency", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getDependency_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDependency_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDependency_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDependency_Type(), source, new String[] {"kind", "element", "name", "type", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDependency_Classifier(), source, new String[] {"kind", "element", "name", "classifier", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDependency_Scope(), source, new String[] {"kind", "element", "name", "scope", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDependency_SystemPath(), source, new String[] {"kind", "element", "name", "systemPath", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDependency_Exclusions(), source, new String[] {"kind", "element", "name", "exclusions", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDependency_Optional(), source, new String[] {"kind", "element", "name", "optional", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(dependencyManagementEClass, source, new String[] {"name", "DependencyManagement", "kind", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "elementOnly"}); //$NON-NLS-1$
    addAnnotation(getDependencyManagement_Dependencies(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "dependencies", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(deploymentRepositoryEClass, source, new String[] {"name", "DeploymentRepository", "kind", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "elementOnly"}); //$NON-NLS-1$
    addAnnotation(getDeploymentRepository_UniqueVersion(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "uniqueVersion", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getDeploymentRepository_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeploymentRepository_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeploymentRepository_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeploymentRepository_Layout(), source, new String[] {"kind", "element", "name", "layout", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(developerEClass, source, new String[] {"name", "Developer", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getDeveloper_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeveloper_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeveloper_Email(), source, new String[] {"kind", "element", "name", "email", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeveloper_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeveloper_Organization(), source, new String[] {"kind", "element", "name", "organization", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDeveloper_OrganizationUrl(), source, new String[] {"kind", "element", "name", "organizationUrl", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDeveloper_Timezone(), source, new String[] {"kind", "element", "name", "timezone", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getDeveloper_Properties(), source, new String[] {"kind", "element", "name", "properties", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(distributionManagementEClass, source, new String[] {"name", "DistributionManagement", "kind", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "elementOnly"}); //$NON-NLS-1$
    addAnnotation(getDistributionManagement_Repository(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "repository", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getDistributionManagement_SnapshotRepository(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "snapshotRepository", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getDistributionManagement_Site(), source, new String[] {"kind", "element", "name", "site", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getDistributionManagement_DownloadUrl(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "downloadUrl", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getDistributionManagement_Relocation(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "relocation", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getDistributionManagement_Status(), source, new String[] {"kind", "element", "name", "status", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(documentRootEClass, source, new String[] {"name", "", "kind", "mixed"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getDocumentRoot_Mixed(), source, new String[] {"kind", "elementWildcard", "name", ":mixed"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {"kind", "attribute", "name", "xmlns:prefix"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {"kind", "attribute", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "xsi:schemaLocation"}); //$NON-NLS-1$
    addAnnotation(getDocumentRoot_Project(), source, new String[] {"kind", "element", "name", "project", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(exclusionEClass, source, new String[] {"name", "Exclusion", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getExclusion_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getExclusion_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(extensionEClass, source, new String[] {"name", "Extension", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getExtension_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getExtension_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getExtension_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(issueManagementEClass, source, new String[] {"name", "IssueManagement", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getIssueManagement_System(), source, new String[] {"kind", "element", "name", "system", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getIssueManagement_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(licenseEClass, source, new String[] {"name", "License", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getLicense_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getLicense_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getLicense_Distribution(), source, new String[] {"kind", "element", "name", "distribution", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getLicense_Comments(), source, new String[] {"kind", "element", "name", "comments", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(mailingListEClass, source, new String[] {"name", "MailingList", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getMailingList_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getMailingList_Subscribe(), source, new String[] {"kind", "element", "name", "subscribe", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getMailingList_Unsubscribe(), source, new String[] {"kind", "element", "name", "unsubscribe", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getMailingList_Post(), source, new String[] {"kind", "element", "name", "post", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getMailingList_Archive(), source, new String[] {"kind", "element", "name", "archive", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(modelEClass, source, new String[] {"name", "Model", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getModel_Parent(), source, new String[] {"kind", "element", "name", "parent", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_ModelVersion(), source, new String[] {"kind", "element", "name", "modelVersion", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Packaging(), source, new String[] {"kind", "element", "name", "packaging", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Description(), source, new String[] {"kind", "element", "name", "description", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Prerequisites(), source, new String[] {"kind", "element", "name", "prerequisites", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_IssueManagement(), source, new String[] {"kind", "element", "name", "issueManagement", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_CiManagement(), source, new String[] {"kind", "element", "name", "ciManagement", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_InceptionYear(), source, new String[] {"kind", "element", "name", "inceptionYear", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_MailingLists(), source, new String[] {"kind", "element", "name", "mailingLists", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_Developers(), source, new String[] {"kind", "element", "name", "developers", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Contributors(), source, new String[] {"kind", "element", "name", "contributors", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_Licenses(), source, new String[] {"kind", "element", "name", "licenses", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Scm(), source, new String[] {"kind", "element", "name", "scm", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Organization(), source, new String[] {"kind", "element", "name", "organization", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_Build(), source, new String[] {"kind", "element", "name", "build", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Profiles(), source, new String[] {"kind", "element", "name", "profiles", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_Repositories(), source, new String[] {"kind", "element", "name", "repositories", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_PluginRepositories(), source, new String[] {"kind", "element", "name", "pluginRepositories", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_Dependencies(), source, new String[] {"kind", "element", "name", "dependencies", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getModel_Reporting(), source, new String[] {"kind", "element", "name", "reporting", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getModel_DependencyManagement(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "dependencyManagement", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getModel_DistributionManagement(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "distributionManagement", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getModel_Properties(), source, new String[] {"kind", "element", "name", "properties", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(notifierEClass, source, new String[] {"name", "Notifier", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getNotifier_Type(), source, new String[] {"kind", "element", "name", "type", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getNotifier_SendOnError(), source, new String[] {"kind", "element", "name", "sendOnError", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getNotifier_SendOnFailure(), source, new String[] {"kind", "element", "name", "sendOnFailure", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getNotifier_SendOnSuccess(), source, new String[] {"kind", "element", "name", "sendOnSuccess", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getNotifier_SendOnWarning(), source, new String[] {"kind", "element", "name", "sendOnWarning", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getNotifier_Address(), source, new String[] {"kind", "element", "name", "address", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(organizationEClass, source, new String[] {"name", "Organization", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getOrganization_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getOrganization_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(parentEClass, source, new String[] {"name", "Parent", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getParent_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getParent_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getParent_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getParent_RelativePath(), source, new String[] {"kind", "element", "name", "relativePath", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(pluginEClass, source, new String[] {"name", "Plugin", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getPlugin_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPlugin_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPlugin_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPlugin_Extensions(), source, new String[] {"kind", "element", "name", "extensions", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPlugin_Executions(), source, new String[] {"kind", "element", "name", "executions", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPlugin_Dependencies(), source, new String[] {"kind", "element", "name", "dependencies", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getPlugin_Inherited(), source, new String[] {"kind", "element", "name", "inherited", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(pluginExecutionEClass, source, new String[] {"name", "PluginExecution", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getPluginExecution_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPluginExecution_Phase(), source, new String[] {"kind", "element", "name", "phase", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getPluginExecution_Inherited(), source, new String[] {"kind", "element", "name", "inherited", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(pluginManagementEClass, source, new String[] {"name", "PluginManagement", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getPluginManagement_Plugins(), source, new String[] {"kind", "element", "name", "plugins", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(prerequisitesEClass, source, new String[] {"name", "Prerequisites", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getPrerequisites_Maven(), source, new String[] {"kind", "element", "name", "maven", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(profileEClass, source, new String[] {"name", "Profile", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getProfile_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getProfile_Activation(), source, new String[] {"kind", "element", "name", "activation", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getProfile_Build(), source, new String[] {"kind", "element", "name", "build", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getProfile_Repositories(), source, new String[] {"kind", "element", "name", "repositories", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getProfile_PluginRepositories(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "pluginRepositories", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getProfile_Dependencies(), source, new String[] {"kind", "element", "name", "dependencies", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getProfile_Reports(), source, new String[] {"kind", "element", "name", "reports", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getProfile_DependencyManagement(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "dependencyManagement", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getProfile_DistributionManagement(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "distributionManagement", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(getProfile_Properties(), source, new String[] {"kind", "element", "name", "properties", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(relocationEClass, source, new String[] {"name", "Relocation", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getRelocation_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRelocation_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getRelocation_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRelocation_Message(), source, new String[] {"kind", "element", "name", "message", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(reportingEClass, source, new String[] {"name", "Reporting", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getReporting_ExcludeDefaults(), source, new String[] {"kind", "element", "name", "excludeDefaults", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getReporting_OutputDirectory(), source, new String[] {"kind", "element", "name", "outputDirectory", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getReporting_Plugins(), source, new String[] {"kind", "element", "name", "plugins", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(reportPluginEClass, source, new String[] {"name", "ReportPlugin", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getReportPlugin_GroupId(), source, new String[] {"kind", "element", "name", "groupId", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getReportPlugin_ArtifactId(), source, new String[] {"kind", "element", "name", "artifactId", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getReportPlugin_Version(), source, new String[] {"kind", "element", "name", "version", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getReportPlugin_Inherited(), source, new String[] {"kind", "element", "name", "inherited", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getReportPlugin_ReportSets(), source, new String[] {"kind", "element", "name", "reportSets", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(reportSetEClass, source, new String[] {"name", "ReportSet", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getReportSet_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getReportSet_Inherited(), source, new String[] {"kind", "element", "name", "inherited", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(repositoryEClass, source, new String[] {"name", "Repository", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getRepository_Releases(), source, new String[] {"kind", "element", "name", "releases", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRepository_Snapshots(), source, new String[] {"kind", "element", "name", "snapshots", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRepository_Id(), source, new String[] {"kind", "element", "name", "id", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRepository_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRepository_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getRepository_Layout(), source, new String[] {"kind", "element", "name", "layout", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(repositoryPolicyEClass, source, new String[] {"name", "RepositoryPolicy", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getRepositoryPolicy_Enabled(), source, new String[] {"kind", "element", "name", "enabled", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getRepositoryPolicy_UpdatePolicy(), source, new String[] {"kind", "element", "name", "updatePolicy", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getRepositoryPolicy_ChecksumPolicy(), source, new String[] {"kind", "element", "name", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        "checksumPolicy", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    addAnnotation(resourceEClass, source, new String[] {"name", "Resource", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getResource_TargetPath(), source, new String[] {"kind", "element", "name", "targetPath", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getResource_Filtering(), source, new String[] {"kind", "element", "name", "filtering", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getResource_Directory(), source, new String[] {"kind", "element", "name", "directory", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(scmEClass, source, new String[] {"name", "Scm", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getScm_Connection(), source, new String[] {"kind", "element", "name", "connection", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getScm_DeveloperConnection(), source, new String[] {"kind", "element", "name", "developerConnection", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$
    addAnnotation(getScm_Tag(), source, new String[] {"kind", "element", "name", "tag", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getScm_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(siteEClass, source, new String[] {"name", "Site", "kind", "elementOnly"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    addAnnotation(getSite_Id(), source,
        new String[] {"kind", "element", "name", "id", "namespace", "##targetNamespace"}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
    addAnnotation(getSite_Name(), source, new String[] {"kind", "element", "name", "name", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
    addAnnotation(getSite_Url(), source, new String[] {"kind", "element", "name", "url", "namespace", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        "##targetNamespace"}); //$NON-NLS-1$
  }

} // PomPackageImpl

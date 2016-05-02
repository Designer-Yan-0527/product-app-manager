/*
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.appmgt.migration.util;

import org.wso2.carbon.governance.api.util.GovernanceConstants;
import org.wso2.carbon.registry.core.RegistryConstants;

public class Constants {

    public static final String VERSION_1_2_0 = "1.2.0";
    public static final String CURRENT_TENANT   = "current_tenant";
    public static final String ROLE_RESTRICTIONS = "role_restrictions";

    // Migration client argument property names
    public static final String ARG_MIGRATE_TO_VERSION = "migrateToVersion";
    public static final String ARG_MIGRATE_TENANTS = "tenants";
    public static final String ARG_MIGRATE = "migrate";

    public static final String DATA_SOURCE_NAME = "DataSourceName";
    public static final String ARG_MIGRATE_DB = "migrateDB";
    public static final String ARG_MIGRATE_REG = "migrateReg";
    public static final String ARG_MIGRATE_FILE_SYSTEM = "migrateFS";
    public static final String ARG_MIGRATE_PROFILE= "migrateProfile";
    public static final String PUBLISHER_MIGRATE_PROFILE= "publisher";
    public static final String GATEWAY_MIGRATE_PROFILE= "gateway";


    public static final String MIGRATION_SCRIPTS_LOCATION = "/dbscripts/migration-1.1.0_to_1.2.0/";
    public static final String REGISTRY_ARTIFACT_LIFECYCLE_HISTORY =
            "/repository/components/org.wso2.carbon.governance/lifecycles/history/__system_governance_appmgt_applicationdata_";
    public static final String REGISTRY_ARTIFACT_LIFECYCLE_HISTORY_OLD =
            "/_system/governance/repository/components/org.wso2.carbon.governance/lifecycles/history/__system_governance_appmgt_applicationdata_";
    public static final String GOVERNANCE_ARTIFACT_CONFIGURATION_PATH =
            RegistryConstants.GOVERNANCE_COMPONENT_PATH + "/configuration/";
    public static final String RXT_REG_PATH = GovernanceConstants.RXT_CONFIGS_PATH;

    public static final String GOVERNANCE_COMPONENT_REGISTRY_LOCATION = "/repository/components/org.wso2.carbon" +
            ".governance";
    public static final String RXT_PATH = "/repository/resources/rxts/webapp.rxt";
    public static final String ATTRIBUTE_CLASSNAME = "className";
    public static final String LIFE_CYCLES_FOLDER = "lifecycles";
    public static final String WEBAPP_LIFECYCLE = "WebAppLifeCycle";
    public static final String WEBAPP_RXT = "webapp";
    public static final String MOBILEAPP_RXT = "mobileapp";

    //Synapse Configuration related
    public static final String SYNAPSE_API_ROOT_ELEMENT = "api";
    public static final String SYNAPSE_API_XMLNS = "http://ws.apache.org/ns/synapse";
    public static final String SYNAPSE_IN_SEQUENCE_ELEMENT = "inSequence";
    public static final String SYNAPSE_PROPERTY_ELEMENT = "property";
    public static final String SYNAPSE_API_ATTRIBUTE_NAME = "name";
    public static final String SYNAPSE_API_ATTRIBUTE_VERSION = "version";
    public static final String SYNAPSE_API_ATTRIBUTE_VALUE = "value";
    public static final String SYNAPSE_API_ATTRIBUTE_EXPRESSION = "expression";
    public static final String SYNAPSE_API_NO_VERSION_PROPERTY = "noVersion";






    //database types
    public static final String DB_TYPE_ORACLE = "oracle";
}

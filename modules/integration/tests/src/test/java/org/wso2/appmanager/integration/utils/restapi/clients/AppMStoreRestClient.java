/*
*Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

package org.wso2.appmanager.integration.utils.restapi.clients;

import exception.AppManagerIntegrationTestException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.wso2.carbon.automation.test.utils.http.client.HttpRequestUtil;
import org.wso2.carbon.automation.test.utils.http.client.HttpResponse;
import org.wso2.appmanager.integration.utils.restapi.base.AppMIntegrationConstants;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides set of method to invoke publisher API
 */
public class AppMStoreRestClient {
    private static final Log log = LogFactory.getLog(AppMStoreRestClient.class);
    private String backendURL;
    private Map<String, String> requestHeaders = new HashMap<String, String>();
    private static final long WAIT_TIME = 90 * 1000;

    public AppMStoreRestClient(String backendURL) {
        this.backendURL = backendURL;
        if (requestHeaders.get("Content-Type") == null) {
            this.requestHeaders.put("Content-Type", "application/x-www-form-urlencoded");
        }
    }

    /**
     * Login to API store
     *
     * @param userName - username to login
     * @param password - password to login
     * @return - http response
     * @throws AppManagerIntegrationTestException - Throws if login to store fails
     */
    public HttpResponse login(String userName, String password)
            throws AppManagerIntegrationTestException {
        HttpResponse response;
        log.info("Login to Store " + backendURL + " as the user " + userName);

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("action", "login"));
        urlParameters.add(new BasicNameValuePair("username", userName));
        urlParameters.add(new BasicNameValuePair("password", password));

        try {
            response = HttpRequestUtil.doPost(new URL(
                                                      backendURL + AppMIntegrationConstants.StoreRestApis.LOGIN_URL +
                                                              "?username=" + userName +
                                                              "&password=" + password), "{}",
                                              requestHeaders);
        } catch (Exception e) {
            throw new AppManagerIntegrationTestException("Unable to login to the store app ", e);
        }


        String session = getSession(response.getHeaders());

        if (session == null) {
            throw new AppManagerIntegrationTestException("No session cookie found with response");
        }

        setSession(session);
        return response;
    }


    private String getSession(Map<String, String> responseHeaders) {
        return responseHeaders.get("Set-Cookie");
    }

    private String setSession(String session) {
        return requestHeaders.put("Cookie", session);
    }

}

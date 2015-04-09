/*
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.analytics.dataservice.webservice.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.analytics.api.AnalyticsDataAPI;

/**
 * This class represents the analytics data service web service declarative services component.
 *
 * @scr.component name="analytics.webservice.component" immediate="true"
 * @scr.reference name="analytics.api.component" interface="org.wso2.carbon.analytics.api.AnalyticsDataAPI"
 * cardinality="1..1" policy="dynamic" bind="setAnalyticsDataAPIService" unbind="unsetAnalyticsDataAPIService"
 */
public class AnalyticsDataServiceWebServiceComponent {
    private static final Log logger = LogFactory.getLog(AnalyticsDataServiceWebServiceComponent.class);

    protected void activate(ComponentContext ctx) {
        if (logger.isDebugEnabled()) {
            logger.debug("Activating AnalyticsDataServiceWebServiceComponent");
        }
    }

    protected void setAnalyticsDataAPIService(AnalyticsDataAPI analyticsDataAPI) {
        ServiceHolder.setAnalyticsDataAPIService(analyticsDataAPI);
    }

    protected void unsetAnalyticsDataAPIService(AnalyticsDataAPI analyticsDataAPI) {
    }
}

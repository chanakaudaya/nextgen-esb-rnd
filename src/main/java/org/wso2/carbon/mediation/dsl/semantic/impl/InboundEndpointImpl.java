/*
 * Copyright (c) 2005-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.mediation.dsl.semantic.impl;

import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;

public class InboundEndpointImpl implements InboundEndpoint {

    String port;
    String urlContext;
    String protocol;
    String name;

    @Override
    public boolean publishToMessageFlow(MessageFlow messageFlow, Message message) {
        messageFlow.invoke(message);
        return true;
    }

    @Override
    public void setPort(String port) {
        this.port = port;

    }

    @Override
    public String getPort() {
        return this.port;
    }

    @Override
    public void setProtocol(String protocol) {
        this.protocol = protocol;

    }

    @Override
    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public void setURLContext(String urlContext) {
        this.urlContext = urlContext;

    }

    @Override
    public String getURLContext() {
        return this.urlContext;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
        
    }

    @Override
    public String getName() {
        return name;
    }

}

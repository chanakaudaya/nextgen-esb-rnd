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

import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.OutboundConnector;

public class OutboundConnectorImpl implements OutboundConnector {

    String endpoint;
    String name;
    String timeout;

    @Override
    public void sendMessage(Message message) {
        System.out.println("Message Received at Default Outbound Connector. Sending the message - "
                           + message.getBodyAsString());

    }

    @Override
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;

    }

    @Override
    public String getEndpoint() {
        return this.endpoint;
    }

    @Override
    public boolean processMessage(Message message) {
        System.out.println("Message Received at Default Outbound Connector. Sending the message - "
                           + message.getBodyAsString());
        return true;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setTimeout(String timeout) {
        this.timeout = timeout;

    }

    @Override
    public String getTimeout() {
        return timeout;
    }

}

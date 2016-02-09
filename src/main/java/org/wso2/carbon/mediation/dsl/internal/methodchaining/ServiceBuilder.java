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
package org.wso2.carbon.mediation.dsl.internal.methodchaining;

import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.Service;
import org.wso2.carbon.mediation.dsl.semantic.impl.ServiceImpl;

public class ServiceBuilder {

    private Service service;

    public ServiceBuilder() {
        service = new ServiceImpl();
    }

    // Start the Mediation DSL with this method.
    public static ServiceBuilder Service() {
        return new ServiceBuilder();
    }

    // Start the inboundEndpoint building with this method.
    public InboundEndpointBuilder inboundEndpoint() {
        InboundEndpointBuilder builder = new InboundEndpointBuilder(this);
        getService().setInboundEndpoint(builder.inboundEndpoint);
        return builder;
    }

    public MessageFlowBuilder messageFlow() {
        MessageFlowBuilder builder = new MessageFlowBuilder(this);
        getService().setMessageFlow(builder.messageFlow);
        return builder;
    }

    public Service getService() {
        return service;
    }

    public void consumeMessage(Message message) {
        service.consumeMessage(message);
        // Service.printService(service);
    }

}

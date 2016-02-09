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

import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.impl.InboundEndpointImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorType;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageFlowImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class MessageFlowBuilder {

    MessageFlow messageFlow;

    ServiceBuilder serviceBuilder;

    public MessageFlowBuilder(ServiceBuilder serviceBuilder) {
        this.serviceBuilder = serviceBuilder;
        messageFlow = new MessageFlowImpl();
    }

    public MessageFlowBuilder process(ProcessorType processorType) {
        ProcessorBuilder builder = new ProcessorBuilder(this, processorType);
        getMessageFlow().addProcessor(builder.processor);
        return this;
    }

    public MessageFlowBuilder intercept(InterceptorType interceptorType) {
        InterceptorBuilder builder = new InterceptorBuilder(this, interceptorType);
        getMessageFlow().addInterceptor(builder.interceptor);
        return this;
    }
    
    public OutboundConnectorBuilder connect() {
        OutboundConnectorBuilder builder = new OutboundConnectorBuilder(this);
        getMessageFlow().addProcessor(builder.outboundConnector);
        return builder;
    }
    
    public ServiceBuilder end() {
        return serviceBuilder;
    }

    public MessageFlow getMessageFlow() {
        return messageFlow;
    }

    public void printMessageFlow() {
        // MessageFlow.printMessageFlow();
    }

}

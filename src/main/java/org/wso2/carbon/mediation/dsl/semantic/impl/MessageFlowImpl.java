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

import java.util.ArrayList;
import java.util.List;

import org.wso2.carbon.mediation.dsl.semantic.Interceptor;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.OutboundConnector;
import org.wso2.carbon.mediation.dsl.semantic.Processor;

public class MessageFlowImpl implements MessageFlow {

    List<Processor> processorList = new ArrayList<Processor>();
    List<Interceptor> interceptorList = new ArrayList<Interceptor>();
    String name;

    @Override
    public boolean invokeProcessorList(List<Processor> processorList, Message message) {
        processorList.forEach((processor) -> {
            processor.processMessage(message);
        });
        return true;
    }

    @Override
    public boolean invokeProcessor(Processor processor, Message message) {
        processor.processMessage(message);
        return true;
    }

    @Override
    public boolean invokeInterceptor(Interceptor interceptor, Message message) {
        interceptor.handleMessage(message);
        return true;
    }

    @Override
    public boolean invokeOutboundConnector(OutboundConnector outboundConnector, Message message) {
        outboundConnector.sendMessage(message);
        return true;
    }

    @Override
    public boolean invoke(Message message) {
        // First invoke the set of interceptors
        invokeInterceptorList(interceptorList, message);

        // Then invoke the processors
        invokeProcessorList(processorList, message);
        return true;
    }

    @Override
    public boolean invokeInterceptorList(List<Interceptor> interceptorList, Message message) {
        interceptorList.forEach((interceptor) -> {
            interceptor.handleMessage(message);
        });
        return true;
    }

    @Override
    public void addProcessor(Processor proessor) {
        this.processorList.add(proessor);
    }

    @Override
    public void addInterceptor(Interceptor interceptor) {
        this.interceptorList.add(interceptor);
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

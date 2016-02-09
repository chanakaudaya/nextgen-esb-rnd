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

import org.wso2.carbon.mediation.dsl.semantic.Interceptor;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorType;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class InterceptorBuilder {

    Interceptor interceptor;
    // Keep a back reference to the Message Flow Builder.
    MessageFlowBuilder messageFlowBuilder;

    public InterceptorBuilder(MessageFlowBuilder messageFlowBuilder, InterceptorType interceptorType) {
        this.messageFlowBuilder = messageFlowBuilder;
        interceptor = InterceptorFactory.getInterceptor(interceptorType);
    }
    
    public MessageFlowBuilder intercept(InterceptorType interceptorType) {
        InterceptorBuilder builder = new InterceptorBuilder(messageFlowBuilder, interceptorType);
        messageFlowBuilder.getMessageFlow().addInterceptor(builder.interceptor);
        return messageFlowBuilder;
    }

}

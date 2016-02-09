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

import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class ProcessorBuilder {

    Processor processor;
    // Keep a back reference to the Message Flow Builder.
    MessageFlowBuilder messageFlowBuilder;

    public ProcessorBuilder(MessageFlowBuilder messageFlowBuilder, ProcessorType processorType) {
        this.messageFlowBuilder = messageFlowBuilder;
        processor = ProcessorFactory.getProcessor(processorType);
    }
    
    public MessageFlowBuilder process(ProcessorType processorType) {
        ProcessorBuilder builder = new ProcessorBuilder(messageFlowBuilder, processorType);
        messageFlowBuilder.getMessageFlow().addProcessor(builder.processor);
        return messageFlowBuilder;
    }

}

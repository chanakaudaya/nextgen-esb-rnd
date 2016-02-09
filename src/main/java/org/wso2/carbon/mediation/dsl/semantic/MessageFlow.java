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

package org.wso2.carbon.mediation.dsl.semantic;

import java.util.List;

/**
 * The main message execution flow inside the ESB. This will consists of
 * Processors, Interceptors OutboundInterfaces and Templates.
 */
public interface MessageFlow {

    /**
     * Invoke the message flow from outside.
     *
     * @param message the message
     * @return true, if successful
     */
    boolean invoke(Message message);

    /**
     * Invoke a set of Processors within a message flow.
     *
     * @param processorList the processor list
     * @return true, if successful
     */
    boolean invokeProcessorList(List<Processor> processorList, Message message);

    /**
     * Invoke a single Processor.
     *
     * @param processor the processor
     * @return true, if successful
     */
    boolean invokeProcessor(Processor processor, Message message);

    /**
     * Invoke an interceptor.
     *
     * @param interceptor the interceptor
     * @return true, if successful
     */
    boolean invokeInterceptor(Interceptor interceptor, Message message);

    /**
     * Invoke an outbound connector.
     *
     * @param outboundConnector the outbound connector
     * @return true, if successful
     */
    boolean invokeOutboundConnector(OutboundConnector outboundConnector, Message message);

    /**
     * Invoke interceptor list.
     *
     * @param interceptorList the interceptor list
     * @param message the message
     * @return true, if successful
     */
    boolean invokeInterceptorList(List<Interceptor> interceptorList, Message message);

    /**
     * Adds the processor.
     *
     * @param proessor the proessor
     */
    void addProcessor(Processor proessor);

    /**
     * Adds the interceptor.
     *
     * @param interceptor the interceptor
     */
    void addInterceptor(Interceptor interceptor);
    
    /**
     * Sets the name.
     *
     * @param name the new name
     */
    void setName(String name);
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    String getName();


}

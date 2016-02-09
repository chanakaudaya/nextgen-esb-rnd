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

// TODO: Auto-generated Javadoc
/**
 * The main component which bundles the necessary processing components for a
 * given functionality (service).
 */
public interface Service {

    /**
     * Consume message.
     *
     * @param message the message
     */
    void consumeMessage(Message message);

    /**
     * Adds the inbound endpoint.
     *
     * @param inboundEndpoint the inbound endpoint
     */
    void setInboundEndpoint(InboundEndpoint inboundEndpoint);

    /**
     * Adds the message flow.
     *
     * @param messageFlow the message flow
     */
    void setMessageFlow(MessageFlow messageFlow);

    /**
     * Gets the inbound endpoints.
     *
     * @return the inbound endpoints
     */
    InboundEndpoint getInboundEndpoint();

    /**
     * Gets the message flows.
     *
     * @return the message flows
     */
    MessageFlow getMessageFlow();
    
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

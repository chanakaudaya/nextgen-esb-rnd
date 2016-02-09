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

/**
 * Interface to define the main entry point to the ESB. All the messages will
 * come through this component.
 */

public interface InboundEndpoint {

    /**
     * Publish the message to the relevant message flow.
     *
     * @param messageFlow the message flow
     * @param message the message
     * @return true, if successful
     */
    boolean publishToMessageFlow(MessageFlow messageFlow, Message message);

    /**
     * Sets the port.
     *
     * @param port the new port
     */
    void setPort(String port);

    /**
     * Gets the port.
     *
     * @return the port
     */
    String getPort();

    /**
     * Sets the protocol.
     */
    void setProtocol(String protocol);

    /**
     * Gets the protocol.
     *
     * @return the protocol
     */
    String getProtocol();

    /**
     * Sets the url context.
     */
    void setURLContext(String urlContext);

    /**
     * Gets the URL context.
     *
     * @return the URL context
     */
    String getURLContext();
    
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

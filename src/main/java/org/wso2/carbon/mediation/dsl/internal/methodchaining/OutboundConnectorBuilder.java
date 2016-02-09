package org.wso2.carbon.mediation.dsl.internal.methodchaining;

import org.wso2.carbon.mediation.dsl.semantic.OutboundConnector;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.OutboundConnectorImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class OutboundConnectorBuilder {
    
    OutboundConnector outboundConnector;
    // Keep a back reference to the Message Flow Builder.
    MessageFlowBuilder messageFlowBuilder;

    public OutboundConnectorBuilder(MessageFlowBuilder messageFlowBuilder) {
        this.messageFlowBuilder = messageFlowBuilder;
        outboundConnector = new OutboundConnectorImpl();
    }
    
    public OutboundConnectorBuilder connect() {
        OutboundConnectorBuilder builder = new OutboundConnectorBuilder(messageFlowBuilder);
        messageFlowBuilder.getMessageFlow().addProcessor(builder.outboundConnector);
        return builder;
    }
    
    public MessageFlowBuilder endpoint(String endpoint) {
        this.outboundConnector.setEndpoint(endpoint);
        return messageFlowBuilder;
    }
    
    

}

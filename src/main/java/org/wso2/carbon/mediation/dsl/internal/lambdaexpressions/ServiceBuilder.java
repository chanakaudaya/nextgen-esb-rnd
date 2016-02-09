package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;

import java.util.function.Consumer;

import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.Service;
import org.wso2.carbon.mediation.dsl.semantic.impl.ServiceImpl;

public class ServiceBuilder {

    Service service;

    public ServiceBuilder() {
        service = new ServiceImpl();
    }

    public static Service Service(Consumer<ServiceBuilder> serviceConsumer) {
        ServiceBuilder serviceBuilder = new ServiceBuilder();
        serviceConsumer.accept(serviceBuilder);
        return serviceBuilder.service;
    }

    public void inboundEndpoint(Consumer<InboundEndpointBuilder> inboundEndpointConsumer) {
        InboundEndpointBuilder inboundEndpointBuilder = new InboundEndpointBuilder();
        inboundEndpointConsumer.accept(inboundEndpointBuilder);
        InboundEndpoint inboundEndpoint = inboundEndpointBuilder.inboundEndpoint(); 
        service.setInboundEndpoint(inboundEndpoint);
    }
    
    public void messageFlow(Consumer<MessageFlowBuilder> messageFlowConsumer) {
        MessageFlowBuilder messageFlowBuilder = new MessageFlowBuilder();
        messageFlowConsumer.accept(messageFlowBuilder);
        MessageFlow messageFlow = messageFlowBuilder.messageFlow();
        service.setMessageFlow(messageFlow);
    }
    
    public void consumeMessage(Message message) {
        service.consumeMessage(message);
    }

}

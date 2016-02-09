package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;


import java.util.function.Consumer;

import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.impl.InboundEndpointImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorType;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageFlowImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class MessageFlowBuilder {
    
    private MessageFlow messageFlow;
    public MessageFlowBuilder() {
        messageFlow = new MessageFlowImpl();
    }
    
    public MessageFlow messageFlow(){
      return messageFlow;
    }

    public void process(ProcessorType processorType){
        ProcessorBuilder builder = new ProcessorBuilder(processorType);
        messageFlow.addProcessor(builder.processor());
    }
    public void intercept(InterceptorType interceptorType){
        InterceptorBuilder builder = new InterceptorBuilder(interceptorType);
        messageFlow.addInterceptor(builder.interceptor());
    }
    public void connect(Consumer<OutboundConnectorBuilder> outboundConnectorConsumer){
        OutboundConnectorBuilder outboundConnectorBuilder = new OutboundConnectorBuilder();
        outboundConnectorConsumer.accept(outboundConnectorBuilder);
        messageFlow.addProcessor(outboundConnectorBuilder.outboundConnector());
        
    }

}

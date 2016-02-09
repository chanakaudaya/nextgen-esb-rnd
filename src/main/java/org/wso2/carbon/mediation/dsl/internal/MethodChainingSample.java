package org.wso2.carbon.mediation.dsl.internal;

import static org.wso2.carbon.mediation.dsl.internal.methodchaining.ServiceBuilder.*;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class MethodChainingSample {
 public static void main(String[] args) {
     
     Message message = new MessageImpl();
     message.setBody("<Test>NextGenESB</Test>");
     
     
     Service()
         .inboundEndpoint()
             .protocol("HTTP")
             .port("9090")
             .urlContext("/service/HelloService")
         .messageFlow()
             .process(ProcessorType.TRANSFORM)
             .process(ProcessorType.TRACE)
             .connect()
                 .endpoint("http://localhost:9000/services/EchoService")
             .process(ProcessorType.TRANSFORM)
             .connect()
                 .endpoint("default")
             .end()
         .consumeMessage(message);
         
      }


}

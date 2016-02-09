package org.wso2.carbon.mediation.dsl.internal;

import static org.wso2.carbon.mediation.dsl.internal.lambdaexpressions.ServiceBuilder.*;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.Service;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class LambdaExpressionsSample {
    public static void main(String[] args) {

        Message message = new MessageImpl();
        message.setBody("<Test>NextGenESB</Test>");

        Service s1 = Service(s -> {
            s.inboundEndpoint(ib -> {
                ib.protocol("HTTP");
                ib.port("9090");
                ib.urlContext("/service/HelloService");
            });

            s.messageFlow(mf -> {
                mf.process(ProcessorType.TRANSFORM);
                mf.process(ProcessorType.PARALLEL);
                mf.connect(c -> {
                    c.endpoint("http://localhost:9000/services/EchoService");
                });
                mf.process(ProcessorType.TRANSFORM);
                mf.connect(c -> {
                    c.endpoint("default");
                });
            });

            s.consumeMessage(message);

        });

    }

}

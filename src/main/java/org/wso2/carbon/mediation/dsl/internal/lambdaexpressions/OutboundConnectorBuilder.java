package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;

import org.wso2.carbon.mediation.dsl.semantic.OutboundConnector;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.OutboundConnectorImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class OutboundConnectorBuilder {
    
    private OutboundConnector outboundConnector;
    public OutboundConnectorBuilder() {
        outboundConnector = new OutboundConnectorImpl();
    }
    
    public OutboundConnector outboundConnector(){
      return outboundConnector;
    }
    
    public OutboundConnector connect() {
        return outboundConnector;
    }
    
    public void endpoint(String endpointURL) {
        outboundConnector.setEndpoint(endpointURL);
    }

}

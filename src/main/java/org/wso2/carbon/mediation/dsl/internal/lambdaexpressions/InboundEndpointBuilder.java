package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;

import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.impl.InboundEndpointImpl;

public class InboundEndpointBuilder {
    
    private InboundEndpoint inboundEndpoint;
    public InboundEndpointBuilder() {
        inboundEndpoint = new InboundEndpointImpl();
    }
    
    public InboundEndpoint inboundEndpoint(){
      return inboundEndpoint;
    }

    public void port(String port){
      inboundEndpoint.setPort(port);
    }
    public void protocol(String protocol){
      inboundEndpoint.setProtocol(protocol);
    }
    public void urlContext(String urlContext){
      inboundEndpoint.setURLContext(urlContext);
    }

}

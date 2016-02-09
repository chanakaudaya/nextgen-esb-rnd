package org.wso2.carbon.mediation.dsl.external;

import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramBaseListener;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InboundEndpointContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeFromSourceContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeFromTargetContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeToSourceContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeToTargetContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.MessageFlowContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.OutboundConnectorContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.ProcessContext;
import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.OutboundConnector;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.Service;
import org.wso2.carbon.mediation.dsl.semantic.impl.InboundEndpointImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageFlowImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.OutboundConnectorImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class WebSequenceDiagramBaseListenerImpl extends WebSequenceDiagramBaseListener {

    Service service;
    MessageFlow messageFlow;
    OutboundConnector outboundConnector;

    public WebSequenceDiagramBaseListenerImpl(Service service) {
        this.service = service;
    }

    @Override
    public void exitInboundEndpoint(InboundEndpointContext ctx) {
        InboundEndpoint inboundEndpoint = new InboundEndpointImpl();
        inboundEndpoint.setPort(ctx.port().getText());
        inboundEndpoint.setProtocol(ctx.protocol().getText());
        inboundEndpoint.setURLContext(ctx.context().getText());
        service.setInboundEndpoint(inboundEndpoint);
    }

    @Override
    public void exitMessageFlow(MessageFlowContext ctx) {
        messageFlow = new MessageFlowImpl();
        messageFlow.setName(ctx.ID().getText());
        // service.setMessageFlow(messageFlow);
    }

    @Override
    public void exitOutboundConnector(OutboundConnectorContext ctx) {
        outboundConnector = new OutboundConnectorImpl();
        outboundConnector.setEndpoint(ctx.endpoint().getText());
        outboundConnector.setTimeout(ctx.timeout().getText());
    }

    @Override
    public void exitInvokeFromSource(InvokeFromSourceContext ctx) {
        messageFlow.setName(ctx.messageFlowName().getText());
        service.setMessageFlow(messageFlow);
    }

    @Override
    public void exitProcess(ProcessContext ctx) {
        Processor processor = ProcessorFactory.getProcessor(ProcessorType.valueOf(ctx.processorName()
            .getText()));
        messageFlow.addProcessor(processor);
    }

    @Override
    public void exitInvokeToTarget(InvokeToTargetContext ctx) {
        outboundConnector.setName(ctx.outboundConnectorName().getText());
        messageFlow.addProcessor(outboundConnector);
        // super.exitInvokeToTarget(ctx);
    }

    @Override
    public void exitInvokeFromTarget(InvokeFromTargetContext ctx) {
        // TODO Auto-generated method stub
        super.exitInvokeFromTarget(ctx);
    }

    @Override
    public void exitInvokeToSource(InvokeToSourceContext ctx) {
        // TODO Auto-generated method stub
        super.exitInvokeToSource(ctx);
    }

    @Override
    public void exitInvoke(InvokeContext ctx) {

        super.exitInvoke(ctx);
    }

}

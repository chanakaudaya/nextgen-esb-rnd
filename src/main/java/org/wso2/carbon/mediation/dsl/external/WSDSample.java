package org.wso2.carbon.mediation.dsl.external;

import java.io.IOException;
import java.io.InputStream;

import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramBaseListener;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramLexer;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.ControlContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.DefineContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InboundEndpointContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InterceptorContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.InvokeContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.MessageFlowContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.OutboundConnectorContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.ProcessorContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.ServiceContext;
import org.wso2.carbon.mediation.dsl.external.modelwsd.WebSequenceDiagramParser.WebsequencediagramContext;
import org.wso2.carbon.mediation.dsl.semantic.InboundEndpoint;
import org.wso2.carbon.mediation.dsl.semantic.Message;
import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.Service;
import org.wso2.carbon.mediation.dsl.semantic.impl.InboundEndpointImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageFlowImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ServiceImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class WSDSample {

    public static void main(String[] args) throws IOException {
        
        Message message = new MessageImpl();
        message.setBody("<Test>NextGenESB</Test>");
        
        
        // Reading the DSL script
        InputStream is = ClassLoader
            .getSystemResourceAsStream("service1.wsd");

        // Loading the DSL script into the ANTLR stream.
        CharStream cs = new ANTLRInputStream(is);

        // Passing the input to the lexer to create tokens
        WebSequenceDiagramLexer lexer = new WebSequenceDiagramLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Passing the tokens to the parser to create the parse trea.
        WebSequenceDiagramParser parser = new WebSequenceDiagramParser(tokens);

        // Semantic model to be populated
        Service service = new ServiceImpl();

        // Adding the listener to facilitate walking through parse tree.
        parser.addParseListener(new WebSequenceDiagramBaseListenerImpl(service));
        
        parser.websequencediagram();

        service.consumeMessage(message);
    }

}


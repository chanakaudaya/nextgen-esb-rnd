// Generated from WebSequenceDiagram.g4 by ANTLR 4.5.2
package org.wso2.carbon.mediation.dsl.external.modelwsd;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebSequenceDiagramParser}.
 */
public interface WebSequenceDiagramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#websequencediagram}.
	 * @param ctx the parse tree
	 */
	void enterWebsequencediagram(WebSequenceDiagramParser.WebsequencediagramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#websequencediagram}.
	 * @param ctx the parse tree
	 */
	void exitWebsequencediagram(WebSequenceDiagramParser.WebsequencediagramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(WebSequenceDiagramParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(WebSequenceDiagramParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#inboundEndpoint}.
	 * @param ctx the parse tree
	 */
	void enterInboundEndpoint(WebSequenceDiagramParser.InboundEndpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#inboundEndpoint}.
	 * @param ctx the parse tree
	 */
	void exitInboundEndpoint(WebSequenceDiagramParser.InboundEndpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#messageFlow}.
	 * @param ctx the parse tree
	 */
	void enterMessageFlow(WebSequenceDiagramParser.MessageFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#messageFlow}.
	 * @param ctx the parse tree
	 */
	void exitMessageFlow(WebSequenceDiagramParser.MessageFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#processor}.
	 * @param ctx the parse tree
	 */
	void enterProcessor(WebSequenceDiagramParser.ProcessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#processor}.
	 * @param ctx the parse tree
	 */
	void exitProcessor(WebSequenceDiagramParser.ProcessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#outboundConnector}.
	 * @param ctx the parse tree
	 */
	void enterOutboundConnector(WebSequenceDiagramParser.OutboundConnectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#outboundConnector}.
	 * @param ctx the parse tree
	 */
	void exitOutboundConnector(WebSequenceDiagramParser.OutboundConnectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#interceptor}.
	 * @param ctx the parse tree
	 */
	void enterInterceptor(WebSequenceDiagramParser.InterceptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#interceptor}.
	 * @param ctx the parse tree
	 */
	void exitInterceptor(WebSequenceDiagramParser.InterceptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#flowScheduler}.
	 * @param ctx the parse tree
	 */
	void enterFlowScheduler(WebSequenceDiagramParser.FlowSchedulerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#flowScheduler}.
	 * @param ctx the parse tree
	 */
	void exitFlowScheduler(WebSequenceDiagramParser.FlowSchedulerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(WebSequenceDiagramParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(WebSequenceDiagramParser.ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(WebSequenceDiagramParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(WebSequenceDiagramParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(WebSequenceDiagramParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(WebSequenceDiagramParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#endpoint}.
	 * @param ctx the parse tree
	 */
	void enterEndpoint(WebSequenceDiagramParser.EndpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#endpoint}.
	 * @param ctx the parse tree
	 */
	void exitEndpoint(WebSequenceDiagramParser.EndpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#timeout}.
	 * @param ctx the parse tree
	 */
	void enterTimeout(WebSequenceDiagramParser.TimeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#timeout}.
	 * @param ctx the parse tree
	 */
	void exitTimeout(WebSequenceDiagramParser.TimeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(WebSequenceDiagramParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(WebSequenceDiagramParser.PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(WebSequenceDiagramParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(WebSequenceDiagramParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(WebSequenceDiagramParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(WebSequenceDiagramParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void enterServiceName(WebSequenceDiagramParser.ServiceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#serviceName}.
	 * @param ctx the parse tree
	 */
	void exitServiceName(WebSequenceDiagramParser.ServiceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#processorName}.
	 * @param ctx the parse tree
	 */
	void enterProcessorName(WebSequenceDiagramParser.ProcessorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#processorName}.
	 * @param ctx the parse tree
	 */
	void exitProcessorName(WebSequenceDiagramParser.ProcessorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#inboundEndpointName}.
	 * @param ctx the parse tree
	 */
	void enterInboundEndpointName(WebSequenceDiagramParser.InboundEndpointNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#inboundEndpointName}.
	 * @param ctx the parse tree
	 */
	void exitInboundEndpointName(WebSequenceDiagramParser.InboundEndpointNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#messageFlowName}.
	 * @param ctx the parse tree
	 */
	void enterMessageFlowName(WebSequenceDiagramParser.MessageFlowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#messageFlowName}.
	 * @param ctx the parse tree
	 */
	void exitMessageFlowName(WebSequenceDiagramParser.MessageFlowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#outboundConnectorName}.
	 * @param ctx the parse tree
	 */
	void enterOutboundConnectorName(WebSequenceDiagramParser.OutboundConnectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#outboundConnectorName}.
	 * @param ctx the parse tree
	 */
	void exitOutboundConnectorName(WebSequenceDiagramParser.OutboundConnectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#interceptorName}.
	 * @param ctx the parse tree
	 */
	void enterInterceptorName(WebSequenceDiagramParser.InterceptorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#interceptorName}.
	 * @param ctx the parse tree
	 */
	void exitInterceptorName(WebSequenceDiagramParser.InterceptorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#flowSchedulerName}.
	 * @param ctx the parse tree
	 */
	void enterFlowSchedulerName(WebSequenceDiagramParser.FlowSchedulerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#flowSchedulerName}.
	 * @param ctx the parse tree
	 */
	void exitFlowSchedulerName(WebSequenceDiagramParser.FlowSchedulerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#invokeFromSource}.
	 * @param ctx the parse tree
	 */
	void enterInvokeFromSource(WebSequenceDiagramParser.InvokeFromSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#invokeFromSource}.
	 * @param ctx the parse tree
	 */
	void exitInvokeFromSource(WebSequenceDiagramParser.InvokeFromSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#invokeToTarget}.
	 * @param ctx the parse tree
	 */
	void enterInvokeToTarget(WebSequenceDiagramParser.InvokeToTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#invokeToTarget}.
	 * @param ctx the parse tree
	 */
	void exitInvokeToTarget(WebSequenceDiagramParser.InvokeToTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#invokeFromTarget}.
	 * @param ctx the parse tree
	 */
	void enterInvokeFromTarget(WebSequenceDiagramParser.InvokeFromTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#invokeFromTarget}.
	 * @param ctx the parse tree
	 */
	void exitInvokeFromTarget(WebSequenceDiagramParser.InvokeFromTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#invokeToSource}.
	 * @param ctx the parse tree
	 */
	void enterInvokeToSource(WebSequenceDiagramParser.InvokeToSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#invokeToSource}.
	 * @param ctx the parse tree
	 */
	void exitInvokeToSource(WebSequenceDiagramParser.InvokeToSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(WebSequenceDiagramParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(WebSequenceDiagramParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(WebSequenceDiagramParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(WebSequenceDiagramParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebSequenceDiagramParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(WebSequenceDiagramParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebSequenceDiagramParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(WebSequenceDiagramParser.ControlContext ctx);
}
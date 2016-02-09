grammar WebSequenceDiagram;
websequencediagram: MediationProcessName NL+
					((define NL+) |
					(invoke NL+) |
					(process NL+) | 
					(control NL+))+
					EOF;
					
service: 'Service("' ID '")';
inboundEndpoint: 'InboundEndpoint(' protocol ',' port ',' context ')';
messageFlow: 'MessageFlow("' ID '")';
processor: 'Processor("' ID '")';
outboundConnector: 'OutboundConnector(' endpoint ',' timeout')';
interceptor: 'Interceptor("' ID '")';
flowScheduler: 'FlowScheduler(' period ',' count')';
protocol: 'protocol("' ID '")';
port: 'port(' NUM ')';
context: 'context("' ID '")';
endpoint: 'endpoint("' URL '")';
timeout: 'timeout(' NUM ')';
period: 'period(' NUM ')';
count: 'count(' NUM ')';
define: serviceName WS* ':' WS* service | 
		processorName WS* ':' WS* processor | 
		inboundEndpointName WS* ':' WS* inboundEndpoint | 
		messageFlowName WS* ':' WS* messageFlow | 
		outboundConnectorName WS* ':' WS* outboundConnector | 
		interceptorName WS* ':' WS* interceptor | 
		flowSchedulerName WS* ':' WS* flowScheduler;
		
serviceName: SERVICE;
processorName: (PARALLEL | TRACE | TRANSFORM | CALL)+;
inboundEndpointName: INBOUNDENDPOINT;
messageFlowName: MESSAGEFLOW;
outboundConnectorName: OUTBOUNDCONNECTOR;
interceptorName: INTERCEPTOR;
flowSchedulerName: FLOWSCHEDULER;

SERVICE: S E R V I C E;
PROCESSOR: P R O C E S S O R;
INBOUNDENDPOINT: I N B O U N D E N D P O I N T;
MESSAGEFLOW: M E S S A G E F L O W;
OUTBOUNDCONNECTOR: O U T B O U N D C O N N E C T O R;
INTERCEPTOR: I N T E R C E P T O R;
FLOWSCHEDULER: F L O W S C H E D U L E R;
PARALLEL: P A R A L L E L;
TRACE: T R A C E;
TRANSFORM: T R A N S F O R M;
CALL: C A L L;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


invokeFromSource: inboundEndpointName WS*  '->' WS* messageFlowName WS* ':' WS* ID;
invokeToTarget: messageFlowName WS* '->' WS* outboundConnectorName WS* ':' WS* ID;
invokeFromTarget: outboundConnectorName WS* '->' WS* messageFlowName WS* ':' WS* ID;
invokeToSource: messageFlowName WS* '->' WS* inboundEndpointName WS* ':' WS* ID;

invoke: invokeFromSource | invokeToTarget | invokeFromTarget | invokeToSource;
process: 'process_message(' processorName ',' ID* ')';
control: ID;

MediationProcessName: '"' ('A'..'Z' | 'a'..'z' | ' ')+ '"' ;

ID: ([a-zA-Z/\?&] | UNDERSCORE)+;
UNDERSCORE : '_';
COLON: ':';
NUM: [0-9]+;
WS: (' ' | '\t')+;
NL:  '\r'? '\n';
URL: ([a-zA-Z/\?&] | COLON | [0-9])+;




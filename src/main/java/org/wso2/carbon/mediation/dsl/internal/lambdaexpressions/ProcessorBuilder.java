package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;

import org.wso2.carbon.mediation.dsl.semantic.MessageFlow;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.MessageFlowImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorImpl;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class ProcessorBuilder {
    
    private Processor processor;
    public ProcessorBuilder(ProcessorType processorType) {
        processor = ProcessorFactory.getProcessor(processorType);
    }
    
    public Processor processor(){
      return processor;
    }

}

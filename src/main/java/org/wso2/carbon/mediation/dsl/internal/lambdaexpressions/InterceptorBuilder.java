package org.wso2.carbon.mediation.dsl.internal.lambdaexpressions;

import org.wso2.carbon.mediation.dsl.semantic.Interceptor;
import org.wso2.carbon.mediation.dsl.semantic.Processor;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.InterceptorType;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorFactory;
import org.wso2.carbon.mediation.dsl.semantic.impl.ProcessorType;

public class InterceptorBuilder {
    
    private Interceptor interceptor;
    public InterceptorBuilder(InterceptorType interceptorType) {
        interceptor = InterceptorFactory.getInterceptor(interceptorType);
    }
    
    public Interceptor interceptor(){
      return interceptor;
    }

}

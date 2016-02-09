package org.wso2.carbon.mediation.dsl.semantic.impl;

import org.wso2.carbon.mediation.dsl.semantic.Interceptor;
import org.wso2.carbon.mediation.dsl.semantic.Message;

public class CachingInterceptor implements Interceptor {

    @Override
    public boolean handleMessage(Message message) {
        System.out.println("Message Received at Caching Interceptor - " + message.getBodyAsString());
        return true;
    }

}

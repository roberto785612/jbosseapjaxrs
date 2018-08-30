package com.rob785612.jbosseapjaxrs;

import javax.interceptor.Interceptor;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Interceptor
public class MyInterceptor {
    
    private static final Logger LOG = Logger.getLogger(MyInterceptor.class.getName());

    @AroundInvoke
    public Object invoke(InvocationContext ctx) throws Exception {
        LOG.info("inside interceptor, about to invoke target");
        
        try {
            Object o =  ctx.proceed();
            LOG.info("inside interceptor, target invoked, about to return");
            return o;
        } catch (Exception e) {
            LOG.info("interceptor caught exception");
            return "interceptor caught exception, returning string from interceptor";
        }
    }
}

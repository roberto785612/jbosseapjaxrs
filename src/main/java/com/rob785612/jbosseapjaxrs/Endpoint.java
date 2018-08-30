package com.rob785612.jbosseapjaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.interceptor.Interceptors;
import javax.inject.Inject;
import java.util.logging.Logger;

@Path("/")
@Produces("application/json")
@Interceptors(MyInterceptor.class)
public class Endpoint {
    
    private static final Logger LOG = Logger.getLogger(Endpoint.class.getName());

    @Inject
    private MyService myService;
    
    @GET
    public String get() throws Exception {
        LOG.info("inside GET method of endpoint");
        //throw new RuntimeException();
        //throw new Exception();
        //return "heya!";
        return myService.get();
    }
}

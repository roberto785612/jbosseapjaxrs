package com.rob785612.jbosseapjaxrs;

import javax.ejb.Stateless;
import java.util.logging.Logger;

@Stateless
public class MyService {
    
    private static final Logger LOG = Logger.getLogger(MyService.class.getName());
    
    public String get() throws Exception {
        LOG.info("inside GET method of service");
        //throw new RuntimeException();
        //throw new Exception();
        return "heya! return from inside service";
    }
}

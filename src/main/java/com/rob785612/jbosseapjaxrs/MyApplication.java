package com.rob785612.jbosseapjaxrs;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(Endpoint.class);
        return classes;
    }
}

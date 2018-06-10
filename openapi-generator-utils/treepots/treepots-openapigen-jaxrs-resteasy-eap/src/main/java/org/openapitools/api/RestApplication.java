package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.Case1ApiServiceImpl;
import org.openapitools.api.impl.IpsumApiServiceImpl;
import org.openapitools.api.impl.Issue7754ApiServiceImpl;
import org.openapitools.api.impl.Pull66ApiServiceImpl;
import org.openapitools.api.impl.Pull75ApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(Case1ApiServiceImpl.class);
        resources.add(IpsumApiServiceImpl.class);
        resources.add(Issue7754ApiServiceImpl.class);
        resources.add(Pull66ApiServiceImpl.class);
        resources.add(Pull75ApiServiceImpl.class);

        return resources;
    }




}
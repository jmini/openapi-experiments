package fr.jmini.openapi.openapitools;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import fr.jmini.openapi.openapitools.api.impl.Case1ApiServiceImpl;
import fr.jmini.openapi.openapitools.api.impl.IpsumApiServiceImpl;
import fr.jmini.openapi.openapitools.api.impl.Issue7754ApiServiceImpl;
import fr.jmini.openapi.openapitools.api.impl.Pull66ApiServiceImpl;
import fr.jmini.openapi.openapitools.api.impl.Pull708ApiServiceImpl;
import fr.jmini.openapi.openapitools.api.impl.Pull75ApiServiceImpl;

@ApplicationPath("/v2")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(Case1ApiServiceImpl.class);
        resources.add(IpsumApiServiceImpl.class);
        resources.add(Issue7754ApiServiceImpl.class);
        resources.add(Pull66ApiServiceImpl.class);
        resources.add(Pull708ApiServiceImpl.class);
        resources.add(Pull75ApiServiceImpl.class);

        return resources;
    }




}
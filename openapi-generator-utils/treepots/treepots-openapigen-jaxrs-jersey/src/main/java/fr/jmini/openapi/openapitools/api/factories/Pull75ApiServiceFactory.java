package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.Pull75ApiService;
import fr.jmini.openapi.openapitools.api.impl.Pull75ApiServiceImpl;


public class Pull75ApiServiceFactory {
    private final static Pull75ApiService service = new Pull75ApiServiceImpl();

    public static Pull75ApiService getPull75Api() {
        return service;
    }
}

package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.Pull708ApiService;
import fr.jmini.openapi.openapitools.api.impl.Pull708ApiServiceImpl;


public class Pull708ApiServiceFactory {
    private final static Pull708ApiService service = new Pull708ApiServiceImpl();

    public static Pull708ApiService getPull708Api() {
        return service;
    }
}

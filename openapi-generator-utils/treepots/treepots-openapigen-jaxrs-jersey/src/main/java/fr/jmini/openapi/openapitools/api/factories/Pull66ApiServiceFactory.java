package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.Pull66ApiService;
import fr.jmini.openapi.openapitools.api.impl.Pull66ApiServiceImpl;


public class Pull66ApiServiceFactory {
    private final static Pull66ApiService service = new Pull66ApiServiceImpl();

    public static Pull66ApiService getPull66Api() {
        return service;
    }
}

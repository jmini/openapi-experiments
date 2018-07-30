package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.Issue7754ApiService;
import fr.jmini.openapi.openapitools.api.impl.Issue7754ApiServiceImpl;


public class Issue7754ApiServiceFactory {
    private final static Issue7754ApiService service = new Issue7754ApiServiceImpl();

    public static Issue7754ApiService getIssue7754Api() {
        return service;
    }
}

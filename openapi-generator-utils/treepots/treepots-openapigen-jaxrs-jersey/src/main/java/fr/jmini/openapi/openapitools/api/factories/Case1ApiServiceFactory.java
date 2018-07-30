package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.Case1ApiService;
import fr.jmini.openapi.openapitools.api.impl.Case1ApiServiceImpl;


public class Case1ApiServiceFactory {
    private final static Case1ApiService service = new Case1ApiServiceImpl();

    public static Case1ApiService getCase1Api() {
        return service;
    }
}

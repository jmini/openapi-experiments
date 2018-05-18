package org.openapitools.api.factories;

import org.openapitools.api.Case1ApiService;
import org.openapitools.api.impl.Case1ApiServiceImpl;


public class Case1ApiServiceFactory {
    private final static Case1ApiService service = new Case1ApiServiceImpl();

    public static Case1ApiService getCase1Api() {
        return service;
    }
}

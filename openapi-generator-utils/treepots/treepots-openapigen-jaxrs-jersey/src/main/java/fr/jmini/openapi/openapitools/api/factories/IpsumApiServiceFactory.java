package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.IpsumApiService;
import fr.jmini.openapi.openapitools.api.impl.IpsumApiServiceImpl;


public class IpsumApiServiceFactory {
    private final static IpsumApiService service = new IpsumApiServiceImpl();

    public static IpsumApiService getIpsumApi() {
        return service;
    }
}

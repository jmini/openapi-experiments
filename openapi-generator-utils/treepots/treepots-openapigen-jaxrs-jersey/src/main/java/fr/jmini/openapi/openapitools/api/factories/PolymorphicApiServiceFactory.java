package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.PolymorphicApiService;
import fr.jmini.openapi.openapitools.api.impl.PolymorphicApiServiceImpl;


public class PolymorphicApiServiceFactory {
    private final static PolymorphicApiService service = new PolymorphicApiServiceImpl();

    public static PolymorphicApiService getPolymorphicApi() {
        return service;
    }
}

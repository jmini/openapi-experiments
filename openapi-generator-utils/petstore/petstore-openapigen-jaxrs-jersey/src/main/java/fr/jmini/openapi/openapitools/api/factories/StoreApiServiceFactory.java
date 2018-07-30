package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.StoreApiService;
import fr.jmini.openapi.openapitools.api.impl.StoreApiServiceImpl;


public class StoreApiServiceFactory {
    private final static StoreApiService service = new StoreApiServiceImpl();

    public static StoreApiService getStoreApi() {
        return service;
    }
}

package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.PetApiService;
import fr.jmini.openapi.openapitools.api.impl.PetApiServiceImpl;


public class PetApiServiceFactory {
    private final static PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}

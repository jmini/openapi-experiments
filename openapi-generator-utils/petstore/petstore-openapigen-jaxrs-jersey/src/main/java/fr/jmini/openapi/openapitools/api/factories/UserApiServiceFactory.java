package fr.jmini.openapi.openapitools.api.factories;

import fr.jmini.openapi.openapitools.api.UserApiService;
import fr.jmini.openapi.openapitools.api.impl.UserApiServiceImpl;


public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}

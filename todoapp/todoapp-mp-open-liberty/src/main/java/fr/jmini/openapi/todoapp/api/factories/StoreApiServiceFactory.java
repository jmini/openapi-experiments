package fr.jmini.openapi.todoapp.api.factories;

import fr.jmini.openapi.todoapp.api.StoreApiService;
import fr.jmini.openapi.todoapp.api.impl.StoreApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-09T05:47:19.863+02:00[Europe/Zurich]")
public class StoreApiServiceFactory {
    private final static StoreApiService service = new StoreApiServiceImpl();

    public static StoreApiService getStoreApi() {
        return service;
    }
}

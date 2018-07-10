package fr.jmini.openapi.todoapp.api.factories;

import fr.jmini.openapi.todoapp.api.PetApiService;
import fr.jmini.openapi.todoapp.api.impl.PetApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-09T05:47:19.863+02:00[Europe/Zurich]")
public class PetApiServiceFactory {
    private final static PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}

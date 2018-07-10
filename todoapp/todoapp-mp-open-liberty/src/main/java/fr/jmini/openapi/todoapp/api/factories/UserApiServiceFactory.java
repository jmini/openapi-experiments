package fr.jmini.openapi.todoapp.api.factories;

import fr.jmini.openapi.todoapp.api.UserApiService;
import fr.jmini.openapi.todoapp.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-09T05:47:19.863+02:00[Europe/Zurich]")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}

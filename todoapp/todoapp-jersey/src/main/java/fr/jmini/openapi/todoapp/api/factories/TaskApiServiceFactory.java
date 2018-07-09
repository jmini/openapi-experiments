package fr.jmini.openapi.todoapp.api.factories;

import fr.jmini.openapi.todoapp.api.TaskApiService;
import fr.jmini.openapi.todoapp.api.impl.TaskApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-09T21:58:03.726+02:00[Europe/Zurich]")
public class TaskApiServiceFactory {
    private final static TaskApiService service = new TaskApiServiceImpl();

    public static TaskApiService getTaskApi() {
        return service;
    }
}

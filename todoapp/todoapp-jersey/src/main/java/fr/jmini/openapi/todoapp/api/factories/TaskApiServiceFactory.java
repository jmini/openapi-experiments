package fr.jmini.openapi.todoapp.api.factories;

import fr.jmini.openapi.todoapp.api.TaskApiService;
import fr.jmini.openapi.todoapp.api.impl.TaskApiServiceImpl;


public class TaskApiServiceFactory {
    private final static TaskApiService service = new TaskApiServiceImpl();

    public static TaskApiService getTaskApi() {
        return service;
    }
}

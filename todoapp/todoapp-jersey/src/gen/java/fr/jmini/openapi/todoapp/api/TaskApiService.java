package fr.jmini.openapi.todoapp.api;

import fr.jmini.openapi.todoapp.api.*;
import fr.jmini.openapi.todoapp.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import fr.jmini.openapi.todoapp.model.Error;
import fr.jmini.openapi.todoapp.model.Task;

import java.util.List;
import fr.jmini.openapi.todoapp.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class TaskApiService {
    public abstract Response createTask(Task task,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTask(String taskId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllTasks(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTask(String taskId,Task task,SecurityContext securityContext) throws NotFoundException;
}

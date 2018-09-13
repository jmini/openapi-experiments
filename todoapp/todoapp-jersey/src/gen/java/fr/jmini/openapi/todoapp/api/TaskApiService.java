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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-13T18:10:24.149+02:00[Europe/Zurich]")
public abstract class TaskApiService {
    public abstract Response createTask(Task task,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTask(String taskId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllTasks(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTask(String taskId,Task task,SecurityContext securityContext) throws NotFoundException;
}

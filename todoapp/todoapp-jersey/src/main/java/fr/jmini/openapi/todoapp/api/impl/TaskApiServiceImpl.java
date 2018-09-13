package fr.jmini.openapi.todoapp.api.impl;

import fr.jmini.openapi.todoapp.api.*;
import fr.jmini.openapi.todoapp.model.*;

import fr.jmini.openapi.todoapp.model.Error;
import fr.jmini.openapi.todoapp.model.Task;

import java.util.List;
import fr.jmini.openapi.todoapp.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-13T18:10:24.149+02:00[Europe/Zurich]")
public class TaskApiServiceImpl extends TaskApiService {
    @Override
    public Response createTask(Task task, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteTask(String taskId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAllTasks(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateTask(String taskId, Task task, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

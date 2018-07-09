package fr.jmini.openapi.todoapp.api;

import fr.jmini.openapi.todoapp.model.*;
import fr.jmini.openapi.todoapp.api.TaskApiService;
import fr.jmini.openapi.todoapp.api.factories.TaskApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.todoapp.model.Error;
import fr.jmini.openapi.todoapp.model.Task;

import java.util.Map;
import java.util.List;
import fr.jmini.openapi.todoapp.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/task")


@io.swagger.annotations.Api(description = "the task API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-09T21:58:03.726+02:00[Europe/Zurich]")
public class TaskApi  {
   private final TaskApiService delegate;

   public TaskApi(@Context ServletConfig servletContext) {
      TaskApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TaskApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TaskApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TaskApiServiceFactory.getTaskApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Task.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Task.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Error.class) })
    public Response createTask(@ApiParam(value = "" ) Task task
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTask(task,securityContext);
    }
    @DELETE
    @Path("/{taskId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Error.class) })
    public Response deleteTask(@ApiParam(value = "",required=true) @PathParam("taskId") String taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTask(taskId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Task.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "a list of all tasks", response = Task.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "generic error response", response = Error.class) })
    public Response getAllTasks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllTasks(securityContext);
    }
    @PUT
    @Path("/{taskId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Task.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Task.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Error.class) })
    public Response updateTask(@ApiParam(value = "",required=true) @PathParam("taskId") String taskId
,@ApiParam(value = "" ) Task task
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTask(taskId,task,securityContext);
    }
}

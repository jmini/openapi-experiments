package fr.jmini.openapi.todoapp.api;

import fr.jmini.openapi.todoapp.model.Error;
import fr.jmini.openapi.todoapp.model.Task;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/task")
public class TaskApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response createTask(Task task) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{taskId}")
    @Produces({ "application/json" })
    public Response deleteTask(@PathParam("taskId") String taskId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    public Response getAllTasks() {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{taskId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response updateTask(@PathParam("taskId") String taskId,Task task) {
        return Response.ok().entity("magic!").build();
    }
}

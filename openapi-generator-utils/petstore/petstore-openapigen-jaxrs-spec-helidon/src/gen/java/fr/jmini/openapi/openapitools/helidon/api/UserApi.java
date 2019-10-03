package fr.jmini.openapi.openapitools.helidon.api;

import java.util.List;
import fr.jmini.openapi.openapitools.helidon.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user")
public class UserApi {

    @POST
    public Response createUser(@Valid User user) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/createWithArray")
    public Response createUsersWithArrayInput(@Valid List<User> user) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/createWithList")
    public Response createUsersWithListInput(@Valid List<User> user) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{username}")
    public Response deleteUser(@PathParam("username") String username) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{username}")
    @Produces({ "application/json", "application/xml" })
    public Response getUserByName(@PathParam("username") String username) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/login")
    @Produces({ "application/json", "application/xml" })
    public Response loginUser(@QueryParam("username")    String username,@QueryParam("password")    String password) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/logout")
    public Response logoutUser() {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{username}")
    public Response updateUser(@PathParam("username") String username,@Valid User user) {
        return Response.ok().entity("magic!").build();
    }
}

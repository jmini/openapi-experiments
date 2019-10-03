package fr.jmini.openapi.openapitools.quarkus.api;

import java.io.File;
import fr.jmini.openapi.openapitools.quarkus.model.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pet")
public class PetApi {

    @POST
    @Consumes({ "application/json", "application/xml" })
    public Response addPet(@Valid Pet pet) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{petId}")
    public Response deletePet(@PathParam("petId") Long petId,@HeaderParam("api_key")    String apiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/findByStatus")
    @Produces({ "application/json", "application/xml" })
    public Response findPetsByStatus(@QueryParam("status")    List<String> status) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/findByTags")
    @Produces({ "application/json", "application/xml" })
    public Response findPetsByTags(@QueryParam("tags")    List<String> tags) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{petId}")
    @Produces({ "application/json", "application/xml" })
    public Response getPetById(@PathParam("petId") Long petId) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Consumes({ "application/json", "application/xml" })
    public Response updatePet(@Valid Pet pet) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    public Response updatePetWithForm(@PathParam("petId") String petId,@FormParam(value = "name")  String name,@FormParam(value = "status")  String status) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    public Response uploadFile(@PathParam("petId") Long petId,@FormParam(value = "additionalMetadata")  String additionalMetadata, @FormParam(value = "file") InputStream fileInputStream) {
        return Response.ok().entity("magic!").build();
    }
}

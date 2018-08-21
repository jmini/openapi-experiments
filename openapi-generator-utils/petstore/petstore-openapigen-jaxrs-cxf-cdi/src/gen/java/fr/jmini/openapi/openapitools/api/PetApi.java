package fr.jmini.openapi.openapitools.api;

import java.io.File;
import fr.jmini.openapi.openapitools.model.Pet;
import fr.jmini.openapi.openapitools.api.PetApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/pet")
@RequestScoped

@Api(description = "the pet API")




public class PetApi  {

  @Context SecurityContext securityContext;

  @Inject PetApiService delegate;


    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @ApiOperation(value = "Add a new pet to the store", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addPet(@ApiParam(value = "Pet object that needs to be added to the store" ) Pet pet) {
        return delegate.addPet(pet, securityContext);
    }

    @DELETE
    @Path("/{petId}")
    
    
    @ApiOperation(value = "Deletes a pet", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid pet value", response = Void.class) })
    public Response deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathParam("petId") Long petId, @ApiParam(value = "" )@HeaderParam("api_key") String apiKey) {
        return delegate.deletePet(petId, apiKey, securityContext);
    }

    @GET
    @Path("/findByStatus")
    
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma separated strings", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value", response = Void.class) })
    public Response findPetsByStatus( @ApiParam(value = "Status values that need to be considered for filter", allowableValues="available, pending, sold", defaultValue="new ArrayList<String>()") @DefaultValue("new ArrayList<String>()") @QueryParam("status") List<String> status) {
        return delegate.findPetsByStatus(status, securityContext);
    }

    @GET
    @Path("/findByTags")
    
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Finds Pets by tags", notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid tag value", response = Void.class) })
    public Response findPetsByTags( @ApiParam(value = "Tags to filter by")  @QueryParam("tags") List<String> tags) {
        return delegate.findPetsByTags(tags, securityContext);
    }

    @GET
    @Path("/{petId}")
    
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Find pet by ID", notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions", response = Pet.class, authorizations = {
        @Authorization(value = "api_key"),
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response getPetById(@ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathParam("petId") Long petId) {
        return delegate.getPetById(petId, securityContext);
    }

    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    
    @ApiOperation(value = "Update an existing pet", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ) Pet pet) {
        return delegate.updatePet(pet, securityContext);
    }

    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    
    @ApiOperation(value = "Updates a pet in the store with form data", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathParam("petId") String petId, @Multipart(value = "name", required = false)  String name, @Multipart(value = "status", required = false)  String status) {
        return delegate.updatePetWithForm(petId, name, status, securityContext);
    }

    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    
    @ApiOperation(value = "uploads an image", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathParam("petId") Long petId, @Multipart(value = "additionalMetadata", required = false)  String additionalMetadata,  @Multipart(value = "file", required = false) InputStream fileInputStream, @Multipart(value = "file" , required = false) Attachment fileDetail) {
        return delegate.uploadFile(petId, additionalMetadata, fileInputStream, fileDetail, securityContext);
    }
}
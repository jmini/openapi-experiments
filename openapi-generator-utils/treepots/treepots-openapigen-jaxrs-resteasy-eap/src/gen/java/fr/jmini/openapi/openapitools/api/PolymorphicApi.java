package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.SomeObject;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/polymorphic")


@io.swagger.annotations.Api(description = "the polymorphic API")

public interface PolymorphicApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class) })
    public Response getPolymorphic(@Context SecurityContext securityContext);
}

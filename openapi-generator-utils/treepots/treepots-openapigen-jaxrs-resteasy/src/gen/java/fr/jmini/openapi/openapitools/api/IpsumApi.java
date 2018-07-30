package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.IpsumApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.ErrorModel;
import fr.jmini.openapi.openapitools.model.SomeObject;

import java.util.Map;
import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/ipsum")


@io.swagger.annotations.Api(description = "the ipsum API")

public class IpsumApi  {

    @Inject IpsumApiService service;

    @GET
    @Path("/issue199")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "ipsum", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })
    public Response op(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.op(securityContext);
    }
}

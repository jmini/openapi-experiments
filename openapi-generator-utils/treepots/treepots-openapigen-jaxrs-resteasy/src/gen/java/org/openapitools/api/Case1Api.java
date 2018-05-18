package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.Case1ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ItemWithBoolean;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/case1")


@io.swagger.annotations.Api(description = "the case1 API")

public class Case1Api  {

    @Inject Case1ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing pet", notes = "", response = ItemWithBoolean.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public Response getCase1(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCase1(securityContext);
    }
}

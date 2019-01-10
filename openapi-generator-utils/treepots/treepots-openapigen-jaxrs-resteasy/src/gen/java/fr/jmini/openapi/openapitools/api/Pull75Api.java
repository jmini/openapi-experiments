package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.Pull75ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.ObjWithEnums;

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
import javax.validation.Valid;

@Path("/pull75")


@io.swagger.annotations.Api(description = "the pull75 API")

public class Pull75Api  {

    @Inject Pull75ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = ObjWithEnums.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class) })
    public Response op75(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.op75(securityContext);
    }
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pull708")


@io.swagger.annotations.Api(description = "the pull708 API")

public interface Pull708Api  {
   
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response op708( @DefaultValue("foobar") @QueryParam("bar") String bar,@Context SecurityContext securityContext);
}

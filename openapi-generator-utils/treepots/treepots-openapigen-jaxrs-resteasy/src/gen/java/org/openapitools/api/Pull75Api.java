package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.Pull75ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ObjWithEnums;

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

@Path("/pull75")


@io.swagger.annotations.Api(description = "the pull75 API")

public class Pull75Api  {

    @Inject Pull75ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = ObjWithEnums.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class) })
    public Response op(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.op(securityContext);
    }
}

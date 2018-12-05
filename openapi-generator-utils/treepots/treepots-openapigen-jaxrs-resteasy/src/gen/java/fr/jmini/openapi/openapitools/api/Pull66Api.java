package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.Pull66ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.EnumInArrayOfArray;

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

@Path("/pull66")


@io.swagger.annotations.Api(description = "the pull66 API")

public class Pull66Api  {

    @Inject Pull66ApiService service;

    @GET
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Void.class) })
    public Response pull66(@ApiParam(value = "" ) @Valid EnumInArrayOfArray enumInArrayOfArray,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pull66(enumInArrayOfArray,securityContext);
    }
}

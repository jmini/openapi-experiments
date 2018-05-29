package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.EnumInArrayOfArray;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pull66")


@io.swagger.annotations.Api(description = "the pull66 API")

public interface Pull66Api  {
   
    @GET
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Void.class) })
    public Response pull66(@ApiParam(value = "" ) EnumInArrayOfArray enumInArrayOfArray,@Context SecurityContext securityContext);
}

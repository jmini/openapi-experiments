package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.ErrorModel;
import fr.jmini.openapi.openapitools.model.SomeObject;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ipsum")
@Api(description = "the ipsum API")
public class IpsumApi {

    @GET
    @Path("/issue199")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "ipsum" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class)
    })
    public Response op() {
        return Response.ok().entity("magic!").build();
    }
}

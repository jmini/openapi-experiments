package org.openapitools.api;

import org.openapitools.model.ItemWithBoolean;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/case1")
@Api(description = "the case1 API")
public class Case1Api {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Update an existing pet", notes = "", response = ItemWithBoolean.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class)
    })
    public Response getCase1() {
        return Response.ok().entity("magic!").build();
    }
}

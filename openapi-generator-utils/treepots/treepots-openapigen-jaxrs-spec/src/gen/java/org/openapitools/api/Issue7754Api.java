package org.openapitools.api;

import org.openapitools.model.LongModel;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/issue7754")
@Api(description = "the issue7754 API")
public class Issue7754Api {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = LongModel.class)
    })
    public Response issue7754() {
        return Response.ok().entity("magic!").build();
    }
}

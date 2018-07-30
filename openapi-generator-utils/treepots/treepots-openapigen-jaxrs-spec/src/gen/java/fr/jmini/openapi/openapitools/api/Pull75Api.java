package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.ObjWithEnums;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pull75")
@Api(description = "the pull75 API")
public class Pull75Api {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = ObjWithEnums.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class)
    })
    public Response op() {
        return Response.ok().entity("magic!").build();
    }
}

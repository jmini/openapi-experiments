package fr.jmini.openapi.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pull708")
@Api(description = "the pull708 API")
public class Pull708Api {

    @GET
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response op708(@QueryParam("bar")  @DefaultValue("foobar")   String bar) {
        return Response.ok().entity("magic!").build();
    }
}

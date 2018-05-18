package org.openapitools.api;

import org.openapitools.model.EnumInArrayOfArray;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pull66")
@Api(description = "the pull66 API")
public class Pull66Api {

    @GET
    @Consumes({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Void.class)
    })
    public Response pull66(@Valid EnumInArrayOfArray enumInArrayOfArray) {
        return Response.ok().entity("magic!").build();
    }
}

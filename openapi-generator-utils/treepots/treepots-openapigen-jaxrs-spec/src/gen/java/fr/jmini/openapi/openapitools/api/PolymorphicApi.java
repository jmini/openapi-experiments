package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.SomeObject;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/polymorphic")
@Api(description = "the polymorphic API")
public class PolymorphicApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class)
    })
    public Response getPolymorphic() {
        return Response.ok().entity("magic!").build();
    }
}

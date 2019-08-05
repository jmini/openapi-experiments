package org.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ping")
public class PingApi {

    @GET
    public Response pingGet() {
        return Response.ok().entity("magic!").build();
    }
}

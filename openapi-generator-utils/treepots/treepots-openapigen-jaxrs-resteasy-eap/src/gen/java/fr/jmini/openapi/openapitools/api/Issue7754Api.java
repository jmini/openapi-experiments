package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.LongModel;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/issue7754")


@io.swagger.annotations.Api(description = "the issue7754 API")

public interface Issue7754Api  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public Response issue7754(@Context SecurityContext securityContext);
}

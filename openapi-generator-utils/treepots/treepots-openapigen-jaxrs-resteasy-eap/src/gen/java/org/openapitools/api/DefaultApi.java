package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ItemWithBoolean;
import org.openapitools.model.LongModel;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/default")


@io.swagger.annotations.Api(description = "the default API")

public interface DefaultApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing pet", notes = "", response = ItemWithBoolean.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public Response getCase1(@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public Response issue7754(@Context SecurityContext securityContext);
}

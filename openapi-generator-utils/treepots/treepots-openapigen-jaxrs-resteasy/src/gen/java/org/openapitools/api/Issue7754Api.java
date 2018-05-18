package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.Issue7754ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.LongModel;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/issue7754")


@io.swagger.annotations.Api(description = "the issue7754 API")

public class Issue7754Api  {

    @Inject Issue7754ApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public Response issue7754(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.issue7754(securityContext);
    }
}

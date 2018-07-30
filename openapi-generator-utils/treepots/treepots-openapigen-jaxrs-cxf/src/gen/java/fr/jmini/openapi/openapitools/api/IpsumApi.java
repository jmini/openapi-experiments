package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.ErrorModel;
import fr.jmini.openapi.openapitools.model.SomeObject;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAPI Tree Pots
 *
 * <p>Example spec
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface IpsumApi  {

    @GET
    @Path("/ipsum/issue199")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "ipsum" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })
    public SomeObject op();
}


package org.openapitools.api;

import org.openapitools.model.ItemWithBoolean;
import org.openapitools.model.LongModel;

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
public interface DefaultApi  {

    /**
     * Update an existing pet
     *
     */
    @GET
    @Path("/case1")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update an existing pet", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public ItemWithBoolean getCase1();

    /**
     * Codegen
     *
     */
    @GET
    @Path("/issue7754")
    @Produces({ "application/json" })
    @ApiOperation(value = "Codegen", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public LongModel issue7754();
}


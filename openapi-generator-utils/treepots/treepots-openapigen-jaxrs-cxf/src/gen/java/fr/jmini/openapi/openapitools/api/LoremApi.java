package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.EnumInArrayOfArray;
import fr.jmini.openapi.openapitools.model.ItemWithBoolean;
import fr.jmini.openapi.openapitools.model.LongModel;
import fr.jmini.openapi.openapitools.model.ObjWithEnums;
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
public interface LoremApi  {

    /**
     * Update an existing pet
     *
     */
    @GET
    @Path("/case1")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update an existing pet", tags={ "lorem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public ItemWithBoolean getCase1();

    @GET
    @Path("/polymorphic")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "lorem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class) })
    public SomeObject getPolymorphic();

    /**
     * Codegen
     *
     */
    @GET
    @Path("/issue7754")
    @Produces({ "application/json" })
    @ApiOperation(value = "Codegen", tags={ "lorem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public LongModel issue7754();

    @GET
    @Path("/pull75")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "lorem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class) })
    public ObjWithEnums op();

    @GET
    @Path("/pull708")
    @ApiOperation(value = "", tags={ "lorem",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void op708(@QueryParam("bar") @DefaultValue("foobar") String bar);

    @GET
    @Path("/pull66")
    @Consumes({ "application/json" })
    @ApiOperation(value = "", tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok") })
    public void pull66(@Valid EnumInArrayOfArray enumInArrayOfArray);
}


package org.openapitools.api;

import org.openapitools.model.ErrorModel;
import org.openapitools.model.SomeObject;
import org.openapitools.api.IpsumApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/ipsum")
@RequestScoped

@Api(description = "the ipsum API")




public class IpsumApi  {

  @Context SecurityContext securityContext;

  @Inject IpsumApiService delegate;


    @GET
    @Path("/issue199")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "ipsum" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })
    public Response op() {
        return delegate.op(securityContext);
    }
}

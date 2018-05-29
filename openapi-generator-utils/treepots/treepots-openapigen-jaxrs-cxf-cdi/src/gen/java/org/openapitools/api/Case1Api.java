package org.openapitools.api;

import org.openapitools.model.ItemWithBoolean;
import org.openapitools.api.Case1ApiService;

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
@Path("/case1")
@RequestScoped

@Api(description = "the case1 API")




public class Case1Api  {

  @Context SecurityContext securityContext;

  @Inject Case1ApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Update an existing pet", notes = "", response = ItemWithBoolean.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public Response getCase1() {
        return delegate.getCase1(securityContext);
    }
}

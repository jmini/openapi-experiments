package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.Pull708ApiService;

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
@Path("/pull708")
@RequestScoped

@Api(description = "the pull708 API")




public class Pull708Api  {

  @Context SecurityContext securityContext;

  @Inject Pull708ApiService delegate;


    @GET
    
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response op708( @ApiParam(value = "", defaultValue="foobar") @DefaultValue("foobar") @QueryParam("bar") String bar) {
        return delegate.op708(bar, securityContext);
    }
}

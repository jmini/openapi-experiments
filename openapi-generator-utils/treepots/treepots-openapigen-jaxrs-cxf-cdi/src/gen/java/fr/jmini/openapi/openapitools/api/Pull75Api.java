package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.ObjWithEnums;
import fr.jmini.openapi.openapitools.api.Pull75ApiService;

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
@Path("/pull75")
@RequestScoped

@Api(description = "the pull75 API")




public class Pull75Api  {

  @Context SecurityContext securityContext;

  @Inject Pull75ApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = ObjWithEnums.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class) })
    public Response op() {
        return delegate.op(securityContext);
    }
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.EnumInArrayOfArray;
import fr.jmini.openapi.openapitools.api.Pull66ApiService;

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
@Path("/pull66")
@RequestScoped

@Api(description = "the pull66 API")




public class Pull66Api  {

  @Context SecurityContext securityContext;

  @Inject Pull66ApiService delegate;


    @GET
    
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Void.class) })
    public Response pull66(@ApiParam(value = "" ) EnumInArrayOfArray enumInArrayOfArray) {
        return delegate.pull66(enumInArrayOfArray, securityContext);
    }
}

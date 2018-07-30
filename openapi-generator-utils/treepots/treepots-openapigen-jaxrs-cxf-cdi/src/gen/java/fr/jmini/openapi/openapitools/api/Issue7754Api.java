package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.LongModel;
import fr.jmini.openapi.openapitools.api.Issue7754ApiService;

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
@Path("/issue7754")
@RequestScoped

@Api(description = "the issue7754 API")




public class Issue7754Api  {

  @Context SecurityContext securityContext;

  @Inject Issue7754ApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={ "lorem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public Response issue7754() {
        return delegate.issue7754(securityContext);
    }
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.Pull66ApiService;
import fr.jmini.openapi.openapitools.api.factories.Pull66ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.EnumInArrayOfArray;

import java.util.Map;
import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pull66")


@io.swagger.annotations.Api(description = "the pull66 API")

public class Pull66Api  {
   private final Pull66ApiService delegate;

   public Pull66Api(@Context ServletConfig servletContext) {
      Pull66ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("Pull66Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (Pull66ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = Pull66ApiServiceFactory.getPull66Api();
      }

      this.delegate = delegate;
   }

    @GET
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Void.class) })
    public Response pull66(@ApiParam(value = "" ) EnumInArrayOfArray enumInArrayOfArray
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pull66(enumInArrayOfArray,securityContext);
    }
}

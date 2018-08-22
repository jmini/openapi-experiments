package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.Pull708ApiService;
import fr.jmini.openapi.openapitools.api.factories.Pull708ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

@Path("/pull708")


@io.swagger.annotations.Api(description = "the pull708 API")

public class Pull708Api  {
   private final Pull708ApiService delegate;

   public Pull708Api(@Context ServletConfig servletContext) {
      Pull708ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("Pull708Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (Pull708ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = Pull708ApiServiceFactory.getPull708Api();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response op708(@ApiParam(value = "", defaultValue="foobar") @DefaultValue("foobar") @QueryParam("bar") String bar
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.op708(bar,securityContext);
    }
}

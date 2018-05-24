package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.Pull75ApiService;
import org.openapitools.api.factories.Pull75ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ObjWithEnums;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pull75")


@io.swagger.annotations.Api(description = "the pull75 API")

public class Pull75Api  {
   private final Pull75ApiService delegate;

   public Pull75Api(@Context ServletConfig servletContext) {
      Pull75ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("Pull75Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (Pull75ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = Pull75ApiServiceFactory.getPull75Api();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = ObjWithEnums.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ObjWithEnums.class) })
    public Response op(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.op(securityContext);
    }
}

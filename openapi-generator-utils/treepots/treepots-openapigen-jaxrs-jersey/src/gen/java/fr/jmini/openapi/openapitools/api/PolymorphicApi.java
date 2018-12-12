package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.PolymorphicApiService;
import fr.jmini.openapi.openapitools.api.factories.PolymorphicApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.SomeObject;

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
import javax.validation.Valid;

@Path("/polymorphic")


@io.swagger.annotations.Api(description = "the polymorphic API")

public class PolymorphicApi  {
   private final PolymorphicApiService delegate;

   public PolymorphicApi(@Context ServletConfig servletContext) {
      PolymorphicApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PolymorphicApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PolymorphicApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PolymorphicApiServiceFactory.getPolymorphicApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = SomeObject.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "a pet to be returned", response = SomeObject.class) })
    public Response getPolymorphic(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPolymorphic(securityContext);
    }
}

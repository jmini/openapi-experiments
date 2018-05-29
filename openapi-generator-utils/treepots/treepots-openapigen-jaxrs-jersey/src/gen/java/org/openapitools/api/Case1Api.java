package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.Case1ApiService;
import org.openapitools.api.factories.Case1ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ItemWithBoolean;

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

@Path("/case1")


@io.swagger.annotations.Api(description = "the case1 API")

public class Case1Api  {
   private final Case1ApiService delegate;

   public Case1Api(@Context ServletConfig servletContext) {
      Case1ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("Case1Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (Case1ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = Case1ApiServiceFactory.getCase1Api();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing pet", notes = "", response = ItemWithBoolean.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ItemWithBoolean.class) })
    public Response getCase1(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCase1(securityContext);
    }
}

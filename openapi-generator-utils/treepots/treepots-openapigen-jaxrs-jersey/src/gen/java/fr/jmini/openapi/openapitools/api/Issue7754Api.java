package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.model.*;
import fr.jmini.openapi.openapitools.api.Issue7754ApiService;
import fr.jmini.openapi.openapitools.api.factories.Issue7754ApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import fr.jmini.openapi.openapitools.model.LongModel;

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

@Path("/issue7754")


@io.swagger.annotations.Api(description = "the issue7754 API")

public class Issue7754Api  {
   private final Issue7754ApiService delegate;

   public Issue7754Api(@Context ServletConfig servletContext) {
      Issue7754ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("Issue7754Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (Issue7754ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = Issue7754ApiServiceFactory.getIssue7754Api();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Codegen", notes = "", response = LongModel.class, tags={ "lorem", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = LongModel.class) })
    public Response issue7754(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.issue7754(securityContext);
    }
}

package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import fr.jmini.openapi.openapitools.model.ObjWithEnums;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped

public class Pull75ApiServiceImpl implements Pull75ApiService {
      @Override
      public Response op75(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}

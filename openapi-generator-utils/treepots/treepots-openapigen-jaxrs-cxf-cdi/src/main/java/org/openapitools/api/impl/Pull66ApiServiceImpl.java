package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.EnumInArrayOfArray;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped

public class Pull66ApiServiceImpl implements Pull66ApiService {
      @Override
      public Response pull66(EnumInArrayOfArray enumInArrayOfArray, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
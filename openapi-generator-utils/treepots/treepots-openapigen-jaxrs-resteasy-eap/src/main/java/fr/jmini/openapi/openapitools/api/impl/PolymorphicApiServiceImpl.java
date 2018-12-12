package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import fr.jmini.openapi.openapitools.model.SomeObject;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class PolymorphicApiServiceImpl implements PolymorphicApi {
      public Response getPolymorphic(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

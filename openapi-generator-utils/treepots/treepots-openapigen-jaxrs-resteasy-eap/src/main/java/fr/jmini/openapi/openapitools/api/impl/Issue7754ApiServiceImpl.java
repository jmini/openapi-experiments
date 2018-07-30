package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import fr.jmini.openapi.openapitools.model.LongModel;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class Issue7754ApiServiceImpl implements Issue7754Api {
      public Response issue7754(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

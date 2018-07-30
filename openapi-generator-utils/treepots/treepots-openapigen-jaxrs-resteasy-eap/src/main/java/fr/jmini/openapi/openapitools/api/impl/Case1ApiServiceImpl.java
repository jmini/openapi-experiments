package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import fr.jmini.openapi.openapitools.model.ItemWithBoolean;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class Case1ApiServiceImpl implements Case1Api {
      public Response getCase1(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

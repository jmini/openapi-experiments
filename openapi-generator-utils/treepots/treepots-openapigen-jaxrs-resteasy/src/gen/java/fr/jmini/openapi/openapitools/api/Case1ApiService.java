package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import fr.jmini.openapi.openapitools.model.ItemWithBoolean;

import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface Case1ApiService {
      Response getCase1(SecurityContext securityContext)
      throws NotFoundException;
}

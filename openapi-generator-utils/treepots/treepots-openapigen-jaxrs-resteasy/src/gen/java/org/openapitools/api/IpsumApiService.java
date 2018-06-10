package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ErrorModel;
import org.openapitools.model.SomeObject;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface IpsumApiService {
      Response op(SecurityContext securityContext)
      throws NotFoundException;
}

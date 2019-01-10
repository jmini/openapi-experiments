package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import fr.jmini.openapi.openapitools.model.ObjWithEnums;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface Pull75ApiService {
      public Response op75(SecurityContext securityContext);
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.List;
import fr.jmini.openapi.openapitools.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface UserApiService {
      public Response createUser(User user, SecurityContext securityContext);
      public Response createUsersWithArrayInput(List<User> user, SecurityContext securityContext);
      public Response createUsersWithListInput(List<User> user, SecurityContext securityContext);
      public Response deleteUser(String username, SecurityContext securityContext);
      public Response getUserByName(String username, SecurityContext securityContext);
      public Response loginUser(String username, String password, SecurityContext securityContext);
      public Response logoutUser(SecurityContext securityContext);
      public Response updateUser(String username, User user, SecurityContext securityContext);
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.util.List;
import fr.jmini.openapi.openapitools.model.User;

import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class UserApiService {
    public abstract Response createUser(User user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createUsersWithArrayInput(List<User> user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createUsersWithListInput(List<User> user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteUser(String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserByName(String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response loginUser(String username,String password,SecurityContext securityContext) throws NotFoundException;
    public abstract Response logoutUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUser(String username,User user,SecurityContext securityContext) throws NotFoundException;
}

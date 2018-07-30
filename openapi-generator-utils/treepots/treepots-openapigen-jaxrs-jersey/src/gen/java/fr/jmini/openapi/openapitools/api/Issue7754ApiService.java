package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import fr.jmini.openapi.openapitools.model.LongModel;

import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

public abstract class Issue7754ApiService {
    public abstract Response issue7754(SecurityContext securityContext) throws NotFoundException;
}

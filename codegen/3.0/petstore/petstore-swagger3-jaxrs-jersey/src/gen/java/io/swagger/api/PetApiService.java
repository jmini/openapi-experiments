package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Pet;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;



public abstract class PetApiService {
    
    public abstract Response addPet(Pet pet,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response findPetsByStatus( List<String> status,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response findPetsByTags( List<String> tags,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updatePet(Pet pet,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updatePetWithForm(String petId,Body body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response uploadFile(Long petId,Body1 body1,SecurityContext securityContext) throws NotFoundException;
    
}


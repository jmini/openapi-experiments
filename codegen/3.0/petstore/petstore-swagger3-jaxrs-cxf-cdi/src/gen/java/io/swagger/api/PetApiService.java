package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Pet;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;



public interface PetApiService {
  
      public Response addPet(Pet pet, SecurityContext securityContext);
  
      public Response deletePet(Long petId, String apiKey, SecurityContext securityContext);
  
      public Response findPetsByStatus(List<String> status, SecurityContext securityContext);
  
      public Response findPetsByTags(List<String> tags, SecurityContext securityContext);
  
      public Response getPetById(Long petId, SecurityContext securityContext);
  
      public Response updatePet(Pet pet, SecurityContext securityContext);
  
      public Response updatePetWithForm(String petId, Body body, SecurityContext securityContext);
  
      public Response uploadFile(Long petId, Body1 body1, SecurityContext securityContext);
  
}


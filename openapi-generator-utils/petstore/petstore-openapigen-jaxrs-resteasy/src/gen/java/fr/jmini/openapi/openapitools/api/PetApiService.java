package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import fr.jmini.openapi.openapitools.model.Pet;

import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface PetApiService {
      Response addPet(Pet pet,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByStatus(List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      Response findPetsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePet(Pet pet,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePetWithForm(String petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext)
      throws NotFoundException;
}

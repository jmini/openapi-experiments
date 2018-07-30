package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import fr.jmini.openapi.openapitools.model.Pet;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class PetApiServiceImpl implements PetApi {
      public Response addPet(Pet pet,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deletePet(Long petId,String apiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response findPetsByStatus(List<String> status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response findPetsByTags(List<String> tags,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPetById(Long petId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updatePet(Pet pet,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updatePetWithForm(String petId,String name,String status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

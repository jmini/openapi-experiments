package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Pet;


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
  
      public Response updatePetWithForm(String petId,Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
  
      public Response uploadFile(Long petId,Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
  
}


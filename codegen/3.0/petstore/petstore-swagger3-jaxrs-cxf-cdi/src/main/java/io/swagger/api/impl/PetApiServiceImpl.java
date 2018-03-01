package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Pet;


import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped


public class PetApiServiceImpl implements PetApiService {
  
      @Override
      public Response addPet(Pet pet, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response deletePet(Long petId, String apiKey, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response findPetsByStatus(List<String> status, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response findPetsByTags(List<String> tags, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response getPetById(Long petId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response updatePet(Pet pet, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response updatePetWithForm(String petId, Body body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
      @Override
      public Response uploadFile(Long petId, Body1 body1, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
  
}


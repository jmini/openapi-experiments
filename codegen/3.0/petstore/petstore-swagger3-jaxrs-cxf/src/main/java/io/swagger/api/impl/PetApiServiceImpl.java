package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Pet;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;





/**
 * Swagger Petstore
 *
 
 * <p>This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 
 *
 */

public class PetApiServiceImpl implements PetApi {


    
    /**
     * Add a new pet to the store
     *
     
     */
    
    public void addPet(Pet pet) {
        // TODO: Implement...
        
        
    }
    

    
    /**
     * Deletes a pet
     *
     
     */
    
    public void deletePet(Long petId, String apiKey) {
        // TODO: Implement...
        
        
    }
    

    
    /**
     * Finds Pets by status
     *
     
     * Multiple status values can be provided with comma separated strings
     *
     
     */
    
    public List<Pet> findPetsByStatus(List<String> status) {
        // TODO: Implement...
        
        return null;
    }
    

    
    /**
     * Finds Pets by tags
     *
     
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     
     */
    
    public List<Pet> findPetsByTags(List<String> tags) {
        // TODO: Implement...
        
        return null;
    }
    

    
    /**
     * Find pet by ID
     *
     
     * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
     *
     
     */
    
    public Pet getPetById(Long petId) {
        // TODO: Implement...
        
        return null;
    }
    

    
    /**
     * Update an existing pet
     *
     
     */
    
    public void updatePet(Pet pet) {
        // TODO: Implement...
        
        
    }
    

    
    /**
     * Updates a pet in the store with form data
     *
     
     */
    
    public void updatePetWithForm(String petId, Body body) {
        // TODO: Implement...
        
        
    }
    

    
    /**
     * uploads an image
     *
     
     */
    
    public void uploadFile(Long petId, Body1 body1) {
        // TODO: Implement...
        
        
    }
    

}



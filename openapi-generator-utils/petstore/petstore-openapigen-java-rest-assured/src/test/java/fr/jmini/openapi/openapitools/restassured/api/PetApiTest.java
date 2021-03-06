/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jmini.openapi.openapitools.restassured.api;

import java.io.File;
import fr.jmini.openapi.openapitools.restassured.model.Pet;
import fr.jmini.openapi.openapitools.restassured.ApiClient;
import fr.jmini.openapi.openapitools.restassured.api.PetApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static fr.jmini.openapi.openapitools.restassured.GsonObjectMapper.gson;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private PetApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io/v2"))).pet();
    }

    /**
     * Invalid input
     */
    @Test
    public void shouldSee405AfterAddPet() {
        Pet pet = null;
        api.addPet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid pet value
     */
    @Test
    public void shouldSee400AfterDeletePet() {
        Long petId = null;
        String apiKey = null;
        api.deletePet()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterFindPetsByStatus() {
        List<String> status = null;
        api.findPetsByStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid status value
     */
    @Test
    public void shouldSee400AfterFindPetsByStatus() {
        List<String> status = null;
        api.findPetsByStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterFindPetsByTags() {
        List<String> tags = null;
        api.findPetsByTags().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid tag value
     */
    @Test
    public void shouldSee400AfterFindPetsByTags() {
        List<String> tags = null;
        api.findPetsByTags().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetPetById() {
        Long petId = null;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterGetPetById() {
        Long petId = null;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Pet not found
     */
    @Test
    public void shouldSee404AfterGetPetById() {
        Long petId = null;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterUpdatePet() {
        Pet pet = null;
        api.updatePet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Pet not found
     */
    @Test
    public void shouldSee404AfterUpdatePet() {
        Pet pet = null;
        api.updatePet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Validation exception
     */
    @Test
    public void shouldSee405AfterUpdatePet() {
        Pet pet = null;
        api.updatePet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid input
     */
    @Test
    public void shouldSee405AfterUpdatePetWithForm() {
        String petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterUploadFile() {
        Long petId = null;
        String additionalMetadata = null;
        File file = null;
        api.uploadFile()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import java.io.File;
import org.openapitools.client.model.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;

import static io.restassured.http.Method.*;

public class PetApi {

    private RequestSpecBuilder reqSpec;

    private PetApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static PetApi pet(RequestSpecBuilder reqSpec) {
        return new PetApi(reqSpec);
    }


    public AddPetOper addPet() {
        return new AddPetOper(reqSpec);
    }

    public DeletePetOper deletePet() {
        return new DeletePetOper(reqSpec);
    }

    public FindPetsByStatusOper findPetsByStatus() {
        return new FindPetsByStatusOper(reqSpec);
    }

    @Deprecated
    public FindPetsByTagsOper findPetsByTags() {
        return new FindPetsByTagsOper(reqSpec);
    }

    public GetPetByIdOper getPetById() {
        return new GetPetByIdOper(reqSpec);
    }

    public UpdatePetOper updatePet() {
        return new UpdatePetOper(reqSpec);
    }

    public UpdatePetWithFormOper updatePetWithForm() {
        return new UpdatePetWithFormOper(reqSpec);
    }

    public UploadFileOper uploadFile() {
        return new UploadFileOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public PetApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Add a new pet to the store
     * 
     *
     * @see #body Pet object that needs to be added to the store (optional)
     */
    public class AddPetOper {

        public static final String REQ_URI = "/pet";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public AddPetOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public AddPetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param pet (Pet) Pet object that needs to be added to the store (optional)
         * @return operation
         */
        public AddPetOper body(Pet pet) {
            reqSpec.setBody(pet);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public AddPetOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public AddPetOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Deletes a pet
     * 
     *
     * @see #petIdPath Pet id to delete (required)
     * @see #apiKeyHeader  (optional)
     */
    public class DeletePetOper {

        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeletePetOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeletePetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }

        public static final String API_KEY_HEADER = "api_key";

        /**
         * @param apiKey (String)  (optional)
         * @return operation
         */
        public DeletePetOper apiKeyHeader(String apiKey) {
            reqSpec.addHeader(API_KEY_HEADER, apiKey);
            return this;
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) Pet id to delete (required)
         * @return operation
         */
        public DeletePetOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public DeletePetOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public DeletePetOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @see #statusQuery Status values that need to be considered for filter (optional, default to new ArrayList&lt;String&gt;())
     * return List&lt;Pet&gt;
     */
    public class FindPetsByStatusOper {

        public static final String REQ_URI = "/pet/findByStatus";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FindPetsByStatusOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FindPetsByStatusOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/findByStatus
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /pet/findByStatus
         * @param handler handler
         * @return List&lt;Pet&gt;
         */
        public List<Pet> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<Pet>>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String STATUS_QUERY = "status";

        /**
         * @param status (List&lt;String&gt;) Status values that need to be considered for filter (optional, default to new ArrayList&lt;String&gt;())
         * @return operation
         */
        public FindPetsByStatusOper statusQuery(Object... status) {
            reqSpec.addQueryParam(STATUS_QUERY, status);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FindPetsByStatusOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FindPetsByStatusOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @see #tagsQuery Tags to filter by (optional)
     * return List&lt;Pet&gt;
     * @deprecated
     */
    @Deprecated
    public class FindPetsByTagsOper {

        public static final String REQ_URI = "/pet/findByTags";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public FindPetsByTagsOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public FindPetsByTagsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/findByTags
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /pet/findByTags
         * @param handler handler
         * @return List&lt;Pet&gt;
         */
        public List<Pet> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<Pet>>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String TAGS_QUERY = "tags";

        /**
         * @param tags (List&lt;String&gt;) Tags to filter by (optional)
         * @return operation
         */
        public FindPetsByTagsOper tagsQuery(Object... tags) {
            reqSpec.addQueryParam(TAGS_QUERY, tags);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public FindPetsByTagsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public FindPetsByTagsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Find pet by ID
     * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
     *
     * @see #petIdPath ID of pet that needs to be fetched (required)
     * return Pet
     */
    public class GetPetByIdOper {

        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetPetByIdOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetPetByIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /pet/{petId}
         * @param handler handler
         * @return Pet
         */
        public Pet executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Pet>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet that needs to be fetched (required)
         * @return operation
         */
        public GetPetByIdOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public GetPetByIdOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public GetPetByIdOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Update an existing pet
     * 
     *
     * @see #body Pet object that needs to be added to the store (optional)
     */
    public class UpdatePetOper {

        public static final String REQ_URI = "/pet";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UpdatePetOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public UpdatePetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /pet
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PUT, REQ_URI));
        }

         /**
         * @param pet (Pet) Pet object that needs to be added to the store (optional)
         * @return operation
         */
        public UpdatePetOper body(Pet pet) {
            reqSpec.setBody(pet);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public UpdatePetOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public UpdatePetOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Updates a pet in the store with form data
     * 
     *
     * @see #petIdPath ID of pet that needs to be updated (required)
     * @see #nameForm Updated name of the pet (optional, default to null)
     * @see #statusForm Updated status of the pet (optional, default to null)
     */
    public class UpdatePetWithFormOper {

        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UpdatePetWithFormOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public UpdatePetWithFormOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (String) ID of pet that needs to be updated (required)
         * @return operation
         */
        public UpdatePetWithFormOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

         public static final String NAME_FORM = "name";

         /**
         * @param name (String) Updated name of the pet (optional, default to null)
         * @return operation
         */
         public UpdatePetWithFormOper nameForm(Object... name) {
            reqSpec.addFormParam(NAME_FORM, name);
            return this;
         }

         public static final String STATUS_FORM = "status";

         /**
         * @param status (String) Updated status of the pet (optional, default to null)
         * @return operation
         */
         public UpdatePetWithFormOper statusForm(Object... status) {
            reqSpec.addFormParam(STATUS_FORM, status);
            return this;
         }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public UpdatePetWithFormOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public UpdatePetWithFormOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * uploads an image
     * 
     *
     * @see #petIdPath ID of pet to update (required)
     * @see #additionalMetadataForm Additional data to pass to server (optional, default to null)
     * @see #fileMultiPart file to upload (optional, default to null)
     */
    public class UploadFileOper {

        public static final String REQ_URI = "/pet/{petId}/uploadImage";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UploadFileOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("multipart/form-data");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public UploadFileOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("multipart/form-data");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet/{petId}/uploadImage
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet to update (required)
         * @return operation
         */
        public UploadFileOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

         public static final String ADDITIONAL_METADATA_FORM = "additionalMetadata";

         /**
         * @param additionalMetadata (String) Additional data to pass to server (optional, default to null)
         * @return operation
         */
         public UploadFileOper additionalMetadataForm(Object... additionalMetadata) {
            reqSpec.addFormParam(ADDITIONAL_METADATA_FORM, additionalMetadata);
            return this;
         }

         /**
         * It will assume that the control name is file and the &lt;content-type&gt; is &lt;application/octet-stream&gt;
         * @see #reqSpec for customise
         * @param file (File) file to upload (optional, default to null)
         * @return operation
         */
         public UploadFileOper fileMultiPart(File file) {
            reqSpec.addMultiPart(file);
            return this;
         }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public UploadFileOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public UploadFileOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
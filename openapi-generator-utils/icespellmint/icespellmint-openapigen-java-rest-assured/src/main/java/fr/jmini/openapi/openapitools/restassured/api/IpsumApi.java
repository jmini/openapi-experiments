/*
 * OpenAPI Ice Spell Mint API
 * Test Spec for a \"Simple Client\"
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jmini.openapi.openapitools.restassured.api;

import com.google.gson.reflect.TypeToken;
import fr.jmini.openapi.openapitools.restassured.model.SomeObj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.*;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import fr.jmini.openapi.openapitools.restassured.JSON;

import static io.restassured.http.Method.*;

@Api(value = "Ipsum")
public class IpsumApi {

    private RequestSpecBuilder reqSpec;

    private IpsumApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static IpsumApi ipsum(RequestSpecBuilder reqSpec) {
        return new IpsumApi(reqSpec);
    }


    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingDelete",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingDeleteOper jsonPingDelete() {
        return new JsonPingDeleteOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingHead",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingHeadOper jsonPingHead() {
        return new JsonPingHeadOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingOptions",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingOptionsOper jsonPingOptions() {
        return new JsonPingOptionsOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingPatch",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingPatchOper jsonPingPatch() {
        return new JsonPingPatchOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingPost",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingPostOper jsonPingPost() {
        return new JsonPingPostOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "jsonPingPut",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public JsonPingPutOper jsonPingPut() {
        return new JsonPingPutOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingDelete",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingDeleteOper pingDelete() {
        return new PingDeleteOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingGet",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingGetOper pingGet() {
        return new PingGetOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingHead",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingHeadOper pingHead() {
        return new PingHeadOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingOptions",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingOptionsOper pingOptions() {
        return new PingOptionsOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingPatch",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingPatchOper pingPatch() {
        return new PingPatchOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingPost",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingPostOper pingPost() {
        return new PingPostOper(reqSpec);
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pingPut",
            tags = { "ipsum" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public PingPutOper pingPut() {
        return new PingPutOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public IpsumApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingDeleteOper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingDeleteOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingDeleteOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingDeleteOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingDeleteOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingHeadOper {

        public static final Method REQ_METHOD = HEAD;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingHeadOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * HEAD /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingHeadOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingHeadOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingHeadOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingOptionsOper {

        public static final Method REQ_METHOD = OPTIONS;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingOptionsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * OPTIONS /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingOptionsOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingOptionsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingOptionsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingPatchOper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingPatchOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingPatchOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPatchOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPatchOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingPostOper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingPostOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingPostOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPostOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPostOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class JsonPingPutOper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/ipsum/jsonPing";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JsonPingPutOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /ipsum/jsonPing
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param someObj (SomeObj)  (optional)
         * @return operation
         */
        public JsonPingPutOper body(SomeObj someObj) {
            reqSpec.setBody(someObj);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPutOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public JsonPingPutOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingDeleteOper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingDeleteOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingDeleteOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingDeleteOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingDeleteOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingGetOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingGetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingGetOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingGetOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingGetOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingHeadOper {

        public static final Method REQ_METHOD = HEAD;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingHeadOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * HEAD /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingHeadOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingHeadOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingHeadOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingOptionsOper {

        public static final Method REQ_METHOD = OPTIONS;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingOptionsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * OPTIONS /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingOptionsOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingOptionsOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingOptionsOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingPatchOper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingPatchOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingPatchOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingPatchOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingPatchOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingPostOper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingPostOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingPostOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingPostOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingPostOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #customQuery  (optional)
     */
    public static class PingPutOper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/ipsum/ping";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public PingPutOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /ipsum/ping
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String CUSTOM_QUERY = "custom";

        /**
         * @param custom (String)  (optional)
         * @return operation
         */
        public PingPutOper customQuery(Object... custom) {
            reqSpec.addQueryParam(CUSTOM_QUERY, custom);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PingPutOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PingPutOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}

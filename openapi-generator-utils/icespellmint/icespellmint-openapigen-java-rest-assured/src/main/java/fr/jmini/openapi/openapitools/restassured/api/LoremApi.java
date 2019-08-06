/*
 * OpenAPI Ice Spell Mint API
 * Test Spec for a \"Simple Client\"
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jmini.openapi.openapitools.restassured.api;

import com.google.gson.reflect.TypeToken;

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

@Api(value = "Lorem")
public class LoremApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private LoremApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static LoremApi lorem(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new LoremApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }


    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyDelete",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyDeleteOper emptyDelete() {
        return new EmptyDeleteOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyGet",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyGetOper emptyGet() {
        return new EmptyGetOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyHead",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyHeadOper emptyHead() {
        return new EmptyHeadOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyOptions",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyOptionsOper emptyOptions() {
        return new EmptyOptionsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyPatch",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyPatchOper emptyPatch() {
        return new EmptyPatchOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyPost",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyPostOper emptyPost() {
        return new EmptyPostOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "emptyPut",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "OK")  })
    public EmptyPutOper emptyPut() {
        return new EmptyPutOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public LoremApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * 
     * 
     *
     */
    public static class EmptyDeleteOper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/lorem/deleteEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyDeleteOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /lorem/deleteEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyDeleteOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyDeleteOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyGetOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/lorem/getEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyGetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /lorem/getEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyGetOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyGetOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyHeadOper {

        public static final Method REQ_METHOD = HEAD;
        public static final String REQ_URI = "/lorem/headEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyHeadOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * HEAD /lorem/headEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyHeadOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyHeadOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyOptionsOper {

        public static final Method REQ_METHOD = OPTIONS;
        public static final String REQ_URI = "/lorem/optionsEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyOptionsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * OPTIONS /lorem/optionsEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyOptionsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyOptionsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyPatchOper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/lorem/patchEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyPatchOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /lorem/patchEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyPatchOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyPatchOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyPostOper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/lorem/postEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyPostOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /lorem/postEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyPostOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyPostOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     */
    public static class EmptyPutOper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/lorem/putEmpty";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public EmptyPutOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /lorem/putEmpty
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public EmptyPutOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public EmptyPutOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}

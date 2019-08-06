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


package fr.jmini.openapi.openapitools.restassuredjackson.api;

import fr.jmini.openapi.openapitools.restassuredjackson.model.SomeObj;

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
import static io.restassured.http.Method.*;

@Api(value = "Etiam")
public class EtiamApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private EtiamApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static EtiamApi etiam(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new EtiamApi(reqSpecSupplier);
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
            nickname = "getInt",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetIntOper getInt() {
        return new GetIntOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getIntList",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetIntListOper getIntList() {
        return new GetIntListOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getIntMap",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetIntMapOper getIntMap() {
        return new GetIntMapOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getSomeObj",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetSomeObjOper getSomeObj() {
        return new GetSomeObjOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getSomeObjList",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetSomeObjListOper getSomeObjList() {
        return new GetSomeObjListOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getSomeObjMap",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetSomeObjMapOper getSomeObjMap() {
        return new GetSomeObjMapOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getString",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetStringOper getString() {
        return new GetStringOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getStringList",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetStringListOper getStringList() {
        return new GetStringListOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getStringMap",
            tags = { "etiam" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK")  })
    public GetStringMapOper getStringMap() {
        return new GetStringMapOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public EtiamApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * 
     * 
     *
     * return Integer
     */
    public static class GetIntOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getInt";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetIntOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getInt
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getInt
         * @param handler handler
         * @return Integer
         */
        public Integer executeAs(Function<Response, Response> handler) {
            
            return execute(handler).as(Integer.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetIntOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetIntOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return List&lt;Integer&gt;
     */
    public static class GetIntListOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getIntList";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetIntListOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getIntList
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getIntList
         * @param handler handler
         * @return List&lt;Integer&gt;
         */
        public List<Integer> executeAs(Function<Response, Response> handler) {
            return java.util.Arrays.asList(execute(handler).as(Integer[].class));
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetIntListOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetIntListOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return Map&lt;String, Integer&gt;
     */
    public static class GetIntMapOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getIntMap";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetIntMapOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getIntMap
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getIntMap
         * @param handler handler
         * @return Map&lt;String, Integer&gt;
         */
        public Map<String, Integer> executeAs(Function<Response, Response> handler) {
            //Integer
            return execute(handler).as(Map.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetIntMapOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetIntMapOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return SomeObj
     */
    public static class GetSomeObjOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getSomeObj";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetSomeObjOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getSomeObj
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getSomeObj
         * @param handler handler
         * @return SomeObj
         */
        public SomeObj executeAs(Function<Response, Response> handler) {
            
            return execute(handler).as(SomeObj.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetSomeObjOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetSomeObjOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return List&lt;SomeObj&gt;
     */
    public static class GetSomeObjListOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getSomeObjList";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetSomeObjListOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getSomeObjList
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getSomeObjList
         * @param handler handler
         * @return List&lt;SomeObj&gt;
         */
        public List<SomeObj> executeAs(Function<Response, Response> handler) {
            return java.util.Arrays.asList(execute(handler).as(SomeObj[].class));
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetSomeObjListOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetSomeObjListOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return Map&lt;String, SomeObj&gt;
     */
    public static class GetSomeObjMapOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getSomeObjMap";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetSomeObjMapOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getSomeObjMap
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getSomeObjMap
         * @param handler handler
         * @return Map&lt;String, SomeObj&gt;
         */
        public Map<String, SomeObj> executeAs(Function<Response, Response> handler) {
            //SomeObj
            return execute(handler).as(Map.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetSomeObjMapOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetSomeObjMapOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return String
     */
    public static class GetStringOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getString";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetStringOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getString
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getString
         * @param handler handler
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            
            return execute(handler).as(String.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetStringOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetStringOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return List&lt;String&gt;
     */
    public static class GetStringListOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getStringList";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetStringListOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getStringList
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getStringList
         * @param handler handler
         * @return List&lt;String&gt;
         */
        public List<String> executeAs(Function<Response, Response> handler) {
            return java.util.Arrays.asList(execute(handler).as(String[].class));
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetStringListOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetStringListOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return Map&lt;String, String&gt;
     */
    public static class GetStringMapOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/etiam/getStringMap";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetStringMapOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /etiam/getStringMap
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /etiam/getStringMap
         * @param handler handler
         * @return Map&lt;String, String&gt;
         */
        public Map<String, String> executeAs(Function<Response, Response> handler) {
            //String
            return execute(handler).as(Map.class);
            
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetStringMapOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetStringMapOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}

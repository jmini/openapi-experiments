/*
 * OpenAPI Tree Pots
 * Example spec
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
import fr.jmini.openapi.openapitools.restassured.model.EnumInArrayOfArray;
import fr.jmini.openapi.openapitools.restassured.model.ItemWithBoolean;
import fr.jmini.openapi.openapitools.restassured.model.LongModel;
import fr.jmini.openapi.openapitools.restassured.model.ObjWithEnums;
import fr.jmini.openapi.openapitools.restassured.model.SomeObject;

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


    @ApiOperation(value = "Update an existing pet",
            notes = "",
            nickname = "getCase1",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Ok")  })
    public GetCase1Oper getCase1() {
        return new GetCase1Oper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getPolymorphic",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "a pet to be returned")  })
    public GetPolymorphicOper getPolymorphic() {
        return new GetPolymorphicOper(createReqSpec());
    }

    @ApiOperation(value = "Codegen",
            notes = "",
            nickname = "issue7754",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Ok")  })
    public Issue7754Oper issue7754() {
        return new Issue7754Oper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "op708",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 0, message = "successful operation")  })
    public Op708Oper op708() {
        return new Op708Oper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "op75",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Ok")  })
    public Op75Oper op75() {
        return new Op75Oper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "pull66",
            tags = { "lorem" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Ok")  })
    public Pull66Oper pull66() {
        return new Pull66Oper(createReqSpec());
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
     * Update an existing pet
     * 
     *
     * return ItemWithBoolean
     */
    public static class GetCase1Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/case1";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetCase1Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /case1
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /case1
         * @param handler handler
         * @return ItemWithBoolean
         */
        public ItemWithBoolean executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ItemWithBoolean>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetCase1Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetCase1Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return SomeObject
     */
    public static class GetPolymorphicOper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/polymorphic";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetPolymorphicOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /polymorphic
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /polymorphic
         * @param handler handler
         * @return SomeObject
         */
        public SomeObject executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<SomeObject>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetPolymorphicOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetPolymorphicOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Codegen
     * 
     *
     * return LongModel
     */
    public static class Issue7754Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/issue7754";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public Issue7754Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /issue7754
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /issue7754
         * @param handler handler
         * @return LongModel
         */
        public LongModel executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<LongModel>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public Issue7754Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public Issue7754Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #barQuery  (optional, default to &quot;foobar&quot;)
     */
    public static class Op708Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pull708";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public Op708Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pull708
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String BAR_QUERY = "bar";

        /**
         * @param bar (String)  (optional, default to &quot;foobar&quot;)
         * @return operation
         */
        public Op708Oper barQuery(Object... bar) {
            reqSpec.addQueryParam(BAR_QUERY, bar);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public Op708Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public Op708Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return ObjWithEnums
     */
    public static class Op75Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pull75";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public Op75Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pull75
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /pull75
         * @param handler handler
         * @return ObjWithEnums
         */
        public ObjWithEnums executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<ObjWithEnums>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public Op75Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public Op75Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * @see #body  (optional)
     */
    public static class Pull66Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pull66";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public Pull66Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pull66
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param enumInArrayOfArray (EnumInArrayOfArray)  (optional)
         * @return operation
         */
        public Pull66Oper body(EnumInArrayOfArray enumInArrayOfArray) {
            reqSpec.setBody(enumInArrayOfArray);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public Pull66Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public Pull66Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}

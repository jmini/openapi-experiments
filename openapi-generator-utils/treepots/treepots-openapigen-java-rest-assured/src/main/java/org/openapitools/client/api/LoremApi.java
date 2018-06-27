/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.model.EnumInArrayOfArray;
import org.openapitools.client.model.ItemWithBoolean;
import org.openapitools.client.model.LongModel;
import org.openapitools.client.model.ObjWithEnums;

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

public class LoremApi {

    private RequestSpecBuilder reqSpec;

    private LoremApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static LoremApi lorem(RequestSpecBuilder reqSpec) {
        return new LoremApi(reqSpec);
    }


    public GetCase1Oper getCase1() {
        return new GetCase1Oper(reqSpec);
    }

    public Issue7754Oper issue7754() {
        return new Issue7754Oper(reqSpec);
    }

    public OpOper op() {
        return new OpOper(reqSpec);
    }

    public Pull66Oper pull66() {
        return new Pull66Oper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public LoremApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Update an existing pet
     * 
     *
     * return ItemWithBoolean
     */
    public class GetCase1Oper {

        public static final String REQ_URI = "/case1";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetCase1Oper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

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
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
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
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public GetCase1Oper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public GetCase1Oper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Codegen
     * 
     *
     * return LongModel
     */
    public class Issue7754Oper {

        public static final String REQ_URI = "/issue7754";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public Issue7754Oper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

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
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
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
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public Issue7754Oper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public Issue7754Oper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * 
     * 
     *
     * return ObjWithEnums
     */
    public class OpOper {

        public static final String REQ_URI = "/pull75";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public OpOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public OpOper(RequestSpecBuilder reqSpec) {
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
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
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
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public OpOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public OpOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
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
    public class Pull66Oper {

        public static final String REQ_URI = "/pull66";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public Pull66Oper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

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
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
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
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public Pull66Oper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public Pull66Oper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
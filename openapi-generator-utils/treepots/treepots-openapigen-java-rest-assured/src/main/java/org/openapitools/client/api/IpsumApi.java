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
import org.openapitools.client.model.ErrorModel;
import org.openapitools.client.model.SomeObject;

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

public class IpsumApi {

    private RequestSpecBuilder reqSpec;

    private IpsumApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static IpsumApi ipsum(RequestSpecBuilder reqSpec) {
        return new IpsumApi(reqSpec);
    }


    public OpOper op() {
        return new OpOper(reqSpec);
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
     * return SomeObject
     */
    public class OpOper {

        public static final String REQ_URI = "/ipsum/issue199";

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
         * GET /ipsum/issue199
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /ipsum/issue199
         * @param handler handler
         * @return SomeObject
         */
        public SomeObject executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<SomeObject>(){}.getType();
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
}
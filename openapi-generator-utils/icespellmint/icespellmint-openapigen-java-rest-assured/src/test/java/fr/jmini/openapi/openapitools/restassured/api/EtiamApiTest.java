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

import fr.jmini.openapi.openapitools.restassured.model.SomeObj;
import fr.jmini.openapi.openapitools.restassured.ApiClient;
import fr.jmini.openapi.openapitools.restassured.api.EtiamApi;
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
 * API tests for EtiamApi
 */
@Ignore
public class EtiamApiTest {

    private EtiamApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost:8090"))).etiam();
    }

    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetInt() {
        api.getInt().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetIntList() {
        api.getIntList().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetIntMap() {
        api.getIntMap().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetSomeObj() {
        api.getSomeObj().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetSomeObjList() {
        api.getSomeObjList().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetSomeObjMap() {
        api.getSomeObjMap().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetString() {
        api.getString().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetStringList() {
        api.getStringList().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetStringMap() {
        api.getStringMap().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
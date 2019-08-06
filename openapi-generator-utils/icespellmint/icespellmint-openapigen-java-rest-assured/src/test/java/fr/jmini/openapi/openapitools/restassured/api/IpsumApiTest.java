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
import fr.jmini.openapi.openapitools.restassured.api.IpsumApi;
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
 * API tests for IpsumApi
 */
@Ignore
public class IpsumApiTest {

    private IpsumApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost:8090"))).ipsum();
    }

    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingDelete() {
        SomeObj someObj = null;
        api.jsonPingDelete().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingHead() {
        SomeObj someObj = null;
        api.jsonPingHead().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingOptions() {
        SomeObj someObj = null;
        api.jsonPingOptions().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingPatch() {
        SomeObj someObj = null;
        api.jsonPingPatch().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingPost() {
        SomeObj someObj = null;
        api.jsonPingPost().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterJsonPingPut() {
        SomeObj someObj = null;
        api.jsonPingPut().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingDelete() {
        String custom = null;
        api.pingDelete().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingGet() {
        String custom = null;
        api.pingGet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingHead() {
        String custom = null;
        api.pingHead().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingOptions() {
        String custom = null;
        api.pingOptions().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingPatch() {
        String custom = null;
        api.pingPatch().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingPost() {
        String custom = null;
        api.pingPost().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterPingPut() {
        String custom = null;
        api.pingPut().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
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


package fr.jmini.openapi.openapitools.restassured.jackson.api;

import fr.jmini.openapi.openapitools.restassured.jackson.model.User;
import fr.jmini.openapi.openapitools.restassured.jackson.ApiClient;
import fr.jmini.openapi.openapitools.restassured.jackson.api.UserApi;
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
import static fr.jmini.openapi.openapitools.restassured.jackson.JacksonObjectMapper.jackson;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private UserApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(jackson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io/v2"))).user();
    }

    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUser() {
        User user = null;
        api.createUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithArrayInput() {
        List<User> user = null;
        api.createUsersWithArrayInput().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithListInput() {
        List<User> user = null;
        api.createUsersWithListInput().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username/password supplied
     */
    @Test
    public void shouldSee400AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterLogoutUser() {
        api.logoutUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid user supplied
     */
    @Test
    public void shouldSee400AfterUpdateUser() {
        String username = null;
        User user = null;
        api.updateUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterUpdateUser() {
        String username = null;
        User user = null;
        api.updateUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
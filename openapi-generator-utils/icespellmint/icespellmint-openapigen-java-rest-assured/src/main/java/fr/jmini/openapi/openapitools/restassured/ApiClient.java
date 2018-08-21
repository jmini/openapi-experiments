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


package fr.jmini.openapi.openapitools.restassured;

import fr.jmini.openapi.openapitools.restassured.api.*;

import io.restassured.builder.RequestSpecBuilder;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static fr.jmini.openapi.openapitools.restassured.GsonObjectMapper.gson;

public class ApiClient {
    public static final String BASE_URI = "http://localhost:8090";

    private final Config config;

    private ApiClient(Config config) {
        this.config = config;
    }

    public static ApiClient api(Config config) {
        return new ApiClient(config);
    }

    public IpsumApi ipsum() {
        return IpsumApi.ipsum(config.baseReqSpec.get());
    }
    public LoremApi lorem() {
        return LoremApi.lorem(config.baseReqSpec.get());
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> baseReqSpec = () -> new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())));

        /**
         * Use common specification for all operations
         * @param supplier supplier
         * @return configuration
         */
        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            this.baseReqSpec = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }
    }
}
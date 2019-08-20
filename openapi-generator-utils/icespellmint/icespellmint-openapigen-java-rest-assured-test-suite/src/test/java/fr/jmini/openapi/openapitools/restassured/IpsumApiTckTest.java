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

package fr.jmini.openapi.openapitools.restassured;

import static fr.jmini.openapi.openapitools.restassured.GsonObjectMapper.gson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

import fr.jmini.openapi.openapitools.restassured.api.IpsumApi;
import fr.jmini.openapi.openapitools.restassured.misc.ApiUtil;
import fr.jmini.openapi.openapitools.restassured.model.SomeObj;
import fr.jmini.rest.client.tck.AbstractIpsumApiTck;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;

/**
 * API tests for IpsumApi
 */
public class IpsumApiTckTest extends AbstractIpsumApiTck<SomeObj> {

    private IpsumApi api;

    @Override
    protected void initIpsumApi(String basePath) {
        api = ApiClient.api(
            ApiClient.Config.apiConfig()
                .reqSpecSupplier(
                    () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri(basePath)
                )
        )
            .ipsum();
    }

    @Override
    protected void performPingGetCall(String customQueryParameterValue) throws Exception {
        api.pingGet()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingPostCall(String customQueryParameterValue) throws Exception {
        api.pingPost()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingPutCall(String customQueryParameterValue) throws Exception {
        api.pingPut()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingDeleteCall(String customQueryParameterValue) throws Exception {
        api.pingDelete()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingOptionsCall(String customQueryParameterValue) throws Exception {
        api.pingOptions()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingHeadCall(String customQueryParameterValue) throws Exception {
        api.pingHead()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingPatchCall(String customQueryParameterValue) throws Exception {
        api.pingPatch()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performPingTraceCall(String customQueryParameterValue) throws Exception {
        api.pingTrace()
            .customQuery(customQueryParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingPostCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPost()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingPutCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPut()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingDeleteCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingDelete()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingOptionsCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingOptions()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingHeadCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingHead()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingPatchCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPatch()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performJsonPingTraceCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingTrace()
            .body(requestBodyValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloGetCall(String namePathParameterValue) throws Exception {
        api.helloGet()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloPostCall(String namePathParameterValue) throws Exception {
        api.helloPost()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloPutCall(String namePathParameterValue) throws Exception {
        api.helloPut()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloDeleteCall(String namePathParameterValue) throws Exception {
        api.helloDelete()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloOptionsCall(String namePathParameterValue) throws Exception {
        api.helloOptions()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloHeadCall(String namePathParameterValue) throws Exception {
        api.helloHead()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloPatchCall(String namePathParameterValue) throws Exception {
        api.helloPatch()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performHelloTraceCall(String namePathParameterValue) throws Exception {
        api.helloTrace()
            .namePath(namePathParameterValue)
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected SomeObj createSomeObject(Long id, String name) {
        return new SomeObj().id(id)
            .name(name);
    }
}
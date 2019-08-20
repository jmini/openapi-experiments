package fr.jmini.openapi.openapitools.restassured;

import static fr.jmini.openapi.openapitools.restassured.GsonObjectMapper.gson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;

import fr.jmini.openapi.openapitools.restassured.api.LoremApi;
import fr.jmini.openapi.openapitools.restassured.misc.ApiUtil;
import fr.jmini.rest.client.tck.AbstractLoremApiTck;

/**
 * API tests for LoremApi
 */
public class LoremApiTckTest extends AbstractLoremApiTck {

    private LoremApi api;

    @Override
    protected void initLoremApi(String basePath) {
        api = ApiClient.api(
            ApiClient.Config.apiConfig()
                .reqSpecSupplier(
                    () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri(basePath)
                )
        )
            .lorem();
    }

    @Override
    protected void performEmptyGetCall() throws Exception {
        api.emptyGet()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyPostCall() throws Exception {
        api.emptyPost()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyPutCall() throws Exception {
        api.emptyPut()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyDeleteCall() throws Exception {
        api.emptyDelete()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyOptionsCall() throws Exception {
        api.emptyOptions()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyHeadCall() throws Exception {
        api.emptyHead()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyPatchCall() throws Exception {
        api.emptyPatch()
            .execute(ApiUtil.expectCreatedHandler());
    }

    @Override
    protected void performEmptyTraceCall() throws Exception {
        api.emptyTrace()
            .execute(ApiUtil.expectCreatedHandler());
    }
}

package fr.jmini.openapi.openapitools.restassured;

import static fr.jmini.openapi.openapitools.restassured.GsonObjectMapper.gson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.Parameter;

import fr.jmini.openapi.openapitools.restassured.api.IpsumApi;
import fr.jmini.rest.client.tck.AbstractIpsumApiTck;
import fr.jmini.rest.client.tck.counter.StringCounter;

public class IpsumWithReqSpecApiTest {

    private ClientAndServer mockServer;
    private IpsumApi api;

    @Before
    public void createApi() {
        mockServer = ClientAndServer.startClientAndServer();
        String port =  "" + mockServer.getLocalPort();
        StringCounter counterA = new StringCounter("a_value_", 1);
        StringCounter counterB = new StringCounter("b_value_", 1);
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addHeader("x-header-a",  counterA.nextValue())
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost:" + port ))).ipsum()
                .reqSpec(r -> r.addHeader("x-header-b", counterB.nextValue()));
    }

    @After
    public void stopMockServer() {
        mockServer.stop();
    }

    @Test
    public void testWith() {
        String path = AbstractIpsumApiTck.IPSUM_PING_PATH;

        StringCounter counterC = new StringCounter("c_value_", 1);

        mockServer
        .when(
                HttpRequest.request()
                        .withPath(path)
        )
        .respond(
                HttpResponse.response()
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                        .withStatusCode(201)
                        .withBody("{ \"status\": \"ok\"}")
        );

        String customParameterValue1 = "param1";
        api.pingGet()
            .reqSpec(r -> r.addHeader("x-header-c", counterC.nextValue()))
            .customQuery(customParameterValue1).execute(r -> r.prettyPeek());
        
        String customParameterValue2 = "param2";
        api.pingGet()
            .reqSpec(r -> r.addHeader("x-header-c", counterC.nextValue()))
            .customQuery(customParameterValue2).execute(r -> r.prettyPeek());
        
        HttpRequest[] recordedRequests = mockServer.retrieveRecordedRequests(
                HttpRequest.request()
                    .withPath(path)
        );

        Assertions.assertThat(recordedRequests).describedAs("recorded requests").hasSize(2);
        HttpRequest request1 = recordedRequests[0];
        Assertions.assertThat(request1.getQueryStringParameterList()).describedAs("query string parameters").hasSize(1);
        Parameter param1 = request1.getQueryStringParameterList().get(0);
        Assertions.assertThat(param1.getName().getValue()).describedAs("query parameter name").isEqualTo("custom");
        Assertions.assertThat(param1.getValues()).describedAs("query parameter values").hasSize(1);
        Assertions.assertThat(param1.getValues().get(0).getValue()).describedAs("query parameter unique value").isEqualTo(customParameterValue1);
        Assertions.assertThat(request1.getFirstHeader("x-header-a")).describedAs("first header 'x-header-a' value").isEqualTo("a_value_1");
        Assertions.assertThat(request1.getFirstHeader("x-header-b")).describedAs("first header 'x-header-a' value").isEqualTo("b_value_1");
        Assertions.assertThat(request1.getFirstHeader("x-header-c")).describedAs("first header 'x-header-a' value").isEqualTo("c_value_1");

        Assertions.assertThat(recordedRequests).describedAs("recorded requests").hasSize(2);
        HttpRequest request2 = recordedRequests[1];
        Assertions.assertThat(request2.getQueryStringParameterList()).describedAs("query string parameters").hasSize(1);
        Parameter param2 = request2.getQueryStringParameterList().get(0);
        Assertions.assertThat(param2.getName().getValue()).describedAs("query parameter name").isEqualTo("custom");
        Assertions.assertThat(param2.getValues()).describedAs("query parameter values").hasSize(1);
        Assertions.assertThat(param2.getValues().get(0).getValue()).describedAs("query parameter unique value").isEqualTo(customParameterValue2);
        Assertions.assertThat(request2.getFirstHeader("x-header-a")).describedAs("first header 'x-header-a' value").isEqualTo("a_value_2");
        Assertions.assertThat(request2.getFirstHeader("x-header-b")).describedAs("first header 'x-header-a' value").isEqualTo("b_value_2");
        Assertions.assertThat(request2.getFirstHeader("x-header-c")).describedAs("first header 'x-header-a' value").isEqualTo("c_value_2");
    }
}
package fr.jmini.rest.client.tck;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.matchers.MatchType;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.JsonBody;
import org.mockserver.verify.VerificationTimes;

public abstract class AbstractIpsumApiTck<SO> {

    public static final String IPSUM_PING_PATH = "/ipsum/ping";
    public static final String IPSUM_JSON_PING_PATH = "/ipsum/jsonPing";
    private static ClientAndServer mockServer;

    @BeforeClass
    public static void startMockServer() {
        mockServer = ClientAndServer.startClientAndServer();
    }

    @AfterClass
    public static void stopMockServer() {
        mockServer.stop();
    }

    @Before
    public void createApi() {
        String basePath = "http://localhost:" + mockServer.getLocalPort();
        initIpsumApi(basePath);
    }

    protected abstract void initIpsumApi(String basePath);

    protected abstract void performPingGetCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingPostCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingPutCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingDeleteCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingOptionsCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingHeadCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingPatchCall(String customQueryParameterValue) throws Exception;

    protected abstract void performPingTraceCall(String customQueryParameterValue) throws Exception;

    protected abstract void performJsonPingPostCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingPutCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingDeleteCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingOptionsCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingHeadCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingPatchCall(SO requestBodyValue) throws Exception;

    protected abstract void performJsonPingTraceCall(SO requestBodyValue) throws Exception;

    protected abstract SO createSomeObject(Long id, String name);

    @Test
    public void testPingGetFoo() throws Exception {
        runPingGetTest("GET", this::performPingGetCall, "Foo");
    }

    @Test
    public void testPingPostFoo() throws Exception {
        runPingGetTest("POST", this::performPingPostCall, "Foo");
    }

    @Test
    public void testPingPutFoo() throws Exception {
        runPingGetTest("PUT", this::performPingPutCall, "Foo");
    }

    @Test
    public void testPingDeleteFoo() throws Exception {
        runPingGetTest("DELETE", this::performPingDeleteCall, "Foo");
    }

    @Test
    public void testPingOptionsFoo() throws Exception {
        runPingGetTest("OPTIONS", this::performPingOptionsCall, "Foo");
    }

    @Test
    public void testPingHeadFoo() throws Exception {
        runPingGetTest("HEAD", this::performPingHeadCall, "Foo");
    }

    @Test
    public void testPingPatchFoo() throws Exception {
        runPingGetTest("PATCH", this::performPingPatchCall, "Foo");
    }

    @Test
    public void testPingTraceFoo() throws Exception {
        runPingGetTest("TRACE", this::performPingTraceCall, "Foo");
    }

    @Test
    public void testPingGetFooAndBar() throws Exception {
        runPingGetTest("GET", this::performPingGetCall, "foo & bar");
    }

    @Test
    public void testPingPostFooAndBar() throws Exception {
        runPingGetTest("POST", this::performPingPostCall, "foo & bar");
    }

    @Test
    public void testPingPutFooAndBar() throws Exception {
        runPingGetTest("PUT", this::performPingPutCall, "foo & bar");
    }

    @Test
    public void testPingDeleteFooAndBar() throws Exception {
        runPingGetTest("DELETE", this::performPingDeleteCall, "foo & bar");
    }

    @Test
    public void testPingOptionsFooAndBar() throws Exception {
        runPingGetTest("OPTIONS", this::performPingOptionsCall, "foo & bar");
    }

    @Test
    public void testPingHeadFooAndBar() throws Exception {
        runPingGetTest("HEAD", this::performPingHeadCall, "foo & bar");
    }

    @Test
    public void testPingPatchFooAndBar() throws Exception {
        runPingGetTest("PATCH", this::performPingPatchCall, "foo & bar");
    }

    @Test
    public void testPingTraceFooAndBar() throws Exception {
        runPingGetTest("TRACE", this::performPingTraceCall, "foo & bar");
    }

    @Test
    public void testJsonPingPostSomeObj() throws Exception {
        runJsonPingGetTest("POST", this::performJsonPingPostCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingPutSomeObj() throws Exception {
        runJsonPingGetTest("PUT", this::performJsonPingPutCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingDeleteSomeObj() throws Exception {
        runJsonPingGetTest("DELETE", this::performJsonPingDeleteCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingOptionsSomeObj() throws Exception {
        runJsonPingGetTest("OPTIONS", this::performJsonPingOptionsCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingHeadSomeObj() throws Exception {
        runJsonPingGetTest("HEAD", this::performJsonPingHeadCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingPatchSomeObj() throws Exception {
        runJsonPingGetTest("PATCH", this::performJsonPingPatchCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingTraceSomeObj() throws Exception {
        runJsonPingGetTest("TRACE", this::performJsonPingTraceCall, 42L, "FOO");
    }

    private void runPingGetTest(String method, NoReturnValueOneArgCallable<String> performCall, String customQueryParameterValue) throws Exception {
        String path = IPSUM_PING_PATH;
        mockServer
            .when(
                HttpRequest.request()
                    .withPath(path)
                    .withMethod(method)
            )
            .respond(
                HttpResponse.response()
                    .withStatusCode(201)
            );

        performCall.call(customQueryParameterValue);
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                .withQueryStringParameter("custom", customQueryParameterValue),
            VerificationTimes.once()
        );
    }

    private void runJsonPingGetTest(String method, NoReturnValueOneArgCallable<SO> performCall, Long someObjId, String someObjName) throws Exception {
        String path = IPSUM_JSON_PING_PATH;
        SO requestBody = createSomeObject(someObjId, someObjName);
        mockServer
            .when(
                HttpRequest.request()
                    .withPath(path)
                    .withMethod(method)
            )
            .respond(
                HttpResponse.response()
                    .withStatusCode(201)
            );

        performCall.call(requestBody);
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                .withBody(
                    JsonBody.json(
                        "{" +
                            " \"id\": " + someObjId.intValue() + "," +
                            " \"name\": \"" + someObjName + "\"" +
                            "}",
                        MatchType.STRICT
                    )
                ),
            VerificationTimes.once()
        );
    }

}

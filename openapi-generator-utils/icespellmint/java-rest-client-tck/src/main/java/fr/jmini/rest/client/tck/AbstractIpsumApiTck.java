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
    public static final String IPSUM_HELLO_ROOT_PATH = "/ipsum/hello";
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

    protected abstract void performHelloGetCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloPostCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloPutCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloDeleteCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloOptionsCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloHeadCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloPatchCall(String namePathParameterValue) throws Exception;

    protected abstract void performHelloTraceCall(String namePathParameterValue) throws Exception;

    protected abstract SO createSomeObject(Long id, String name);

    @Test
    public void testPingGetFoo() throws Exception {
        runPingTest("GET", this::performPingGetCall, "Foo");
    }

    @Test
    public void testPingPostFoo() throws Exception {
        runPingTest("POST", this::performPingPostCall, "Foo");
    }

    @Test
    public void testPingPutFoo() throws Exception {
        runPingTest("PUT", this::performPingPutCall, "Foo");
    }

    @Test
    public void testPingDeleteFoo() throws Exception {
        runPingTest("DELETE", this::performPingDeleteCall, "Foo");
    }

    @Test
    public void testPingOptionsFoo() throws Exception {
        runPingTest("OPTIONS", this::performPingOptionsCall, "Foo");
    }

    @Test
    public void testPingHeadFoo() throws Exception {
        runPingTest("HEAD", this::performPingHeadCall, "Foo");
    }

    @Test
    public void testPingPatchFoo() throws Exception {
        runPingTest("PATCH", this::performPingPatchCall, "Foo");
    }

    @Test
    public void testPingTraceFoo() throws Exception {
        runPingTest("TRACE", this::performPingTraceCall, "Foo");
    }

    @Test
    public void testPingGetFooAndBar() throws Exception {
        runPingTest("GET", this::performPingGetCall, "foo & bar");
    }

    @Test
    public void testPingPostFooAndBar() throws Exception {
        runPingTest("POST", this::performPingPostCall, "foo & bar");
    }

    @Test
    public void testPingPutFooAndBar() throws Exception {
        runPingTest("PUT", this::performPingPutCall, "foo & bar");
    }

    @Test
    public void testPingDeleteFooAndBar() throws Exception {
        runPingTest("DELETE", this::performPingDeleteCall, "foo & bar");
    }

    @Test
    public void testPingOptionsFooAndBar() throws Exception {
        runPingTest("OPTIONS", this::performPingOptionsCall, "foo & bar");
    }

    @Test
    public void testPingHeadFooAndBar() throws Exception {
        runPingTest("HEAD", this::performPingHeadCall, "foo & bar");
    }

    @Test
    public void testPingPatchFooAndBar() throws Exception {
        runPingTest("PATCH", this::performPingPatchCall, "foo & bar");
    }

    @Test
    public void testPingTraceFooAndBar() throws Exception {
        runPingTest("TRACE", this::performPingTraceCall, "foo & bar");
    }

    @Test
    public void testJsonPingPostSomeObj() throws Exception {
        runJsonPingTest("POST", this::performJsonPingPostCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingPutSomeObj() throws Exception {
        runJsonPingTest("PUT", this::performJsonPingPutCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingDeleteSomeObj() throws Exception {
        runJsonPingTest("DELETE", this::performJsonPingDeleteCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingOptionsSomeObj() throws Exception {
        runJsonPingTest("OPTIONS", this::performJsonPingOptionsCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingHeadSomeObj() throws Exception {
        runJsonPingTest("HEAD", this::performJsonPingHeadCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingPatchSomeObj() throws Exception {
        runJsonPingTest("PATCH", this::performJsonPingPatchCall, 42L, "FOO");
    }

    @Test
    public void testJsonPingTraceSomeObj() throws Exception {
        runJsonPingTest("TRACE", this::performJsonPingTraceCall, 42L, "FOO");
    }

    @Test
    public void testHelloGetJohn() throws Exception {
        runHelloTest("GET", this::performHelloGetCall, "john");
    }

    @Test
    public void testHelloPostJohn() throws Exception {
        runHelloTest("POST", this::performHelloPostCall, "john");
    }

    @Test
    public void testHelloPutJohn() throws Exception {
        runHelloTest("PUT", this::performHelloPutCall, "john");
    }

    @Test
    public void testHelloDeleteJohn() throws Exception {
        runHelloTest("DELETE", this::performHelloDeleteCall, "john");
    }

    @Test
    public void testHelloOptionsJohn() throws Exception {
        runHelloTest("OPTIONS", this::performHelloOptionsCall, "john");
    }

    @Test
    public void testHelloHeadJohn() throws Exception {
        runHelloTest("HEAD", this::performHelloHeadCall, "john");
    }

    @Test
    public void testHelloPatchJohn() throws Exception {
        runHelloTest("PATCH", this::performHelloPatchCall, "john");
    }

    @Test
    public void testHelloTraceJohn() throws Exception {
        runHelloTest("TRACE", this::performHelloTraceCall, "john");
    }

    private void runPingTest(String method, NoReturnValueOneArgCallable<String> performCall, String customQueryParameterValue) throws Exception {
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

    private void runJsonPingTest(String method, NoReturnValueOneArgCallable<SO> performCall, Long someObjId, String someObjName) throws Exception {
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

    private void runHelloTest(String method, NoReturnValueOneArgCallable<String> performCall, String namePathParameterValue) throws Exception {
        String path = IPSUM_HELLO_ROOT_PATH + "/" + namePathParameterValue;
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

        performCall.call(namePathParameterValue);
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method),
            VerificationTimes.once()
        );
    }

}

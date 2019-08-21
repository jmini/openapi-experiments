package fr.jmini.rest.client.tck;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.verify.VerificationTimes;

public abstract class AbstractLoremApiTck {

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
        initLoremApi(basePath);
    }

    protected abstract void initLoremApi(String basePath);

    protected abstract void performEmptyGetCall() throws Exception;

    protected abstract void performEmptyPostCall() throws Exception;

    protected abstract void performEmptyPutCall() throws Exception;

    protected abstract void performEmptyDeleteCall() throws Exception;

    protected abstract void performEmptyOptionsCall() throws Exception;

    protected abstract void performEmptyHeadCall() throws Exception;

    protected abstract void performEmptyPatchCall() throws Exception;

    protected abstract void performEmptyTraceCall() throws Exception;

    @Test
    public void testEmptyGet() throws Exception {
        runEmptyTest("/lorem/getEmpty", "GET", this::performEmptyGetCall);
    }

    @Test
    public void testEmptyPost() throws Exception {
        runEmptyTest("/lorem/postEmpty", "POST", this::performEmptyPostCall);
    }

    @Test
    public void testEmptyPut() throws Exception {
        runEmptyTest("/lorem/putEmpty", "PUT", this::performEmptyPutCall);
    }

    @Test
    public void testEmptyDelete() throws Exception {
        runEmptyTest("/lorem/deleteEmpty", "DELETE", this::performEmptyDeleteCall);
    }

    @Test
    public void testEmptyOptions() throws Exception {
        runEmptyTest("/lorem/optionsEmpty", "OPTIONS", this::performEmptyOptionsCall);
    }

    @Test
    public void testEmptyHead() throws Exception {
        runEmptyTest("/lorem/headEmpty", "HEAD", this::performEmptyHeadCall);
    }

    @Test
    public void testEmptyPatch() throws Exception {
        runEmptyTest("/lorem/patchEmpty", "PATCH", this::performEmptyPatchCall);
    }

    @Test
    public void testEmptyTrace() throws Exception {
        runEmptyTest("/lorem/traceEmpty", "TRACE", this::performEmptyTraceCall);
    }

    private void runEmptyTest(String path, String method, NoReturnValueCallable performCall) throws Exception, AssertionError {
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

        performCall.call();
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                .withHeader("Content-Length", "0"),
            VerificationTimes.once()
        );
    }

}

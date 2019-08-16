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
        String basePath =  "http://localhost:" + mockServer.getLocalPort();
        initLoremApi(basePath);
    }

    protected abstract void initLoremApi(String basePath);

    @Test
    public void testEmptyGet() throws Exception {
        String path = "/lorem/getEmpty";
        String method = "GET";
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

        performEmptyGetCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
            VerificationTimes.once()
        );
    }

    protected abstract void performEmptyGetCall() throws Exception;

    @Test
    public void testEmptyPost() throws Exception {
        String path = "/lorem/postEmpty";
        String method = "POST";
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
        
        performEmptyPostCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }

    protected abstract void performEmptyPostCall() throws Exception;
    
    @Test
    public void testEmptyPut() throws Exception {
        String path = "/lorem/putEmpty";
        String method = "PUT";
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
        
        performEmptyPutCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyPutCall() throws Exception;
    
    @Test
    public void testEmptyDelete() throws Exception {
        String path = "/lorem/deleteEmpty";
        String method = "DELETE";
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
        
        performEmptyDeleteCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyDeleteCall() throws Exception;
    
    @Test
    public void testEmptyOptions() throws Exception {
        String path = "/lorem/optionsEmpty";
        String method = "OPTIONS";
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
        
        performEmptyOptionsCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyOptionsCall() throws Exception;
    
    @Test
    public void testEmptyHead() throws Exception {
        String path = "/lorem/headEmpty";
        String method = "HEAD";
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
        
        performEmptyHeadCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyHeadCall() throws Exception;
    
    @Test
    public void testEmptyPatch() throws Exception {
        String path = "/lorem/patchEmpty";
        String method = "PATCH";
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
        
        performEmptyPatchCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyPatchCall() throws Exception;
    
    @Test
    public void testEmptyTrace() throws Exception {
        String path = "/lorem/traceEmpty";
        String method = "TRACE";
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
        
        performEmptyTraceCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
    }
    
    protected abstract void performEmptyTraceCall() throws Exception;


}

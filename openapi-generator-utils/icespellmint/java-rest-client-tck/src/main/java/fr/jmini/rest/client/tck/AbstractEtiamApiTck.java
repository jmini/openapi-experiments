package fr.jmini.rest.client.tck;

import io.netty.handler.codec.http.HttpHeaderNames;

import org.assertj.core.api.Assertions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.verify.VerificationTimes;

import java.util.List;
import java.util.Map;

public abstract class AbstractEtiamApiTck<SO> {

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
        initEtiamApi(basePath);
    }

    protected abstract void initEtiamApi(String basePath);

    @Test
    public void testGetInt42() throws Exception {
        String path = "/etiam/getInt";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
        )
        .respond(
                HttpResponse.response()
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                        .withStatusCode(200)
                        .withBody("42")
        );

        Integer response = performGetIntCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
            VerificationTimes.once()
        );

        Assertions.assertThat(response).describedAs("response for '" + path + "'").isEqualTo(42);
    }

    protected abstract Integer performGetIntCall() throws Exception;
    
    @Test
    public void testGetIntList369() throws Exception {
        String path = "/etiam/getIntList";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("[3, 6, 9]")
                );
        
        List<Integer> response = performGetIntListCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'").containsExactly(3, 6, 9);
    }
    
    protected abstract List<Integer> performGetIntListCall() throws Exception;
    
    @Test
    public void testGetIntMap12() throws Exception {
        String path = "/etiam/getIntMap";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("{\"one\": 1, \"two\": 2}")
                );
        
        Map<String, Integer> response = performGetIntMapCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'")
            .hasSize(2)
            .containsEntry("one", 1)
            .containsEntry("two", 2);
    }

    protected abstract Map<String, Integer> performGetIntMapCall() throws Exception;

    @Test
    public void testGetStringHelloWorld() throws Exception {
        String path = "/etiam/getString";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("\"Hello world\"")
                );

        String response = performGetStringCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'").isEqualTo("Hello world");
    }
    
    protected abstract String performGetStringCall() throws Exception;
    
    @Test
    public void testGetStringListLoremIpsum() throws Exception {
        String path = "/etiam/getStringList";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("[\"lorem\", \"ipsum\", \"lorem ipsum\"]")
                );
        
        List<String> response = performGetStringListCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'").containsExactly("lorem", "ipsum", "lorem ipsum");
    }
    
    protected abstract List<String> performGetStringListCall() throws Exception;
    
    @Test
    public void testGetStringMap12() throws Exception {
        String path = "/etiam/getStringMap";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("{\"one\": \"1\", \"two\": \"2\"}")
                );
        
        Map<String, String> response = performGetStringMapCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'")
        .hasSize(2)
        .containsEntry("one", "1")
        .containsEntry("two", "2");
    }
    
    protected abstract Map<String, String> performGetStringMapCall() throws Exception;
    
    @Test
    public void testGetSomeObjHelloWorld() throws Exception {
        String path = "/etiam/getSomeObj";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("{\"id\": \"26\", \"name\": \"test\"}")
                );

        SO response = performGetSomeObjCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'").isEqualTo(createSomeObject(26L, "test"));
    }
    
    protected abstract SO performGetSomeObjCall() throws Exception;
    
    @Test
    public void testGetSomeObjListLoremIpsum() throws Exception {
        String path = "/etiam/getSomeObjList";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("[{\"id\": \"3\", \"name\": \"name3\"}, {\"id\": \"6\", \"name\": \"name6\"}, {\"id\": \"9\", \"name\": \"name9\"}]")
                );
        
        List<SO> response = performGetSomeObjListCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'").containsExactly(
                createSomeObject(3L, "name3"),
                createSomeObject(6L, "name6"),
                createSomeObject(9L, "name9")
                );
    }
    
    protected abstract List<SO> performGetSomeObjListCall() throws Exception;
    
    @Test
    public void testGetSomeObjMap12() throws Exception {
        String path = "/etiam/getSomeObjMap";
        String method = "GET";
        mockServer
        .when(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                )
        .respond(
                HttpResponse.response()
                .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), "application/json")
                .withStatusCode(200)
                .withBody("{\"one\": " + "{\"id\": \"11\", \"name\": \"lorem\"}" + ", \"two\": " + "{\"id\": \"22\", \"name\": \"ipsum\"}" + "}")
                );
        
        Map<String, SO> response = performGetSomeObjMapCall();
        mockServer.verify(
                HttpRequest.request()
                .withPath(path)
                .withMethod(method),
                VerificationTimes.once()
                );
        
        Assertions.assertThat(response).describedAs("response for '" + path + "'")
        .hasSize(2)
        .containsEntry("one", createSomeObject(11L, "lorem"))
        .containsEntry("two", createSomeObject(22L, "ipsum"));
    }
    
    protected abstract Map<String, SO> performGetSomeObjMapCall() throws Exception;
    
    protected abstract SO createSomeObject(Long id, String name);

}

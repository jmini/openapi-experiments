package fr.jmini.rest.client.tck;

import java.util.Base64;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.mockserver.verify.VerificationTimes;

public abstract class AbstractDolorApiTck {

    public static final String DOLOR_BASIC_SEC_PATH = "/dolor/basicSecurity";
    public static final String DOLOR_BEARER_SEC_PATH = "/dolor/bearerSecurity";

    private static final String BASIC_AUTH_USER_NAME = "admin";
    private static final String BASIC_AUTH_PASSWORD = "123456";
    private static final String BEARER_AUTH_TOKEN = "AbCdEf123456";

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
        initDolorApi(basePath, BASIC_AUTH_USER_NAME, BASIC_AUTH_PASSWORD, BEARER_AUTH_TOKEN);
    }

    protected abstract void initDolorApi(String basePath, String basicAuthUsername, String basicAuthPassword, String bearerAuthToken);

    protected abstract void performBasicSecCall() throws Exception;

    protected abstract void performBearerSecCall() throws Exception;

    @Test
    public void testBasicAuth() throws Exception {
        String path = DOLOR_BASIC_SEC_PATH;
        String method = "POST";
        String basicAuthHeaderValue = Base64.getEncoder()
            .encodeToString((BASIC_AUTH_USER_NAME + ":" + BASIC_AUTH_PASSWORD).getBytes());
        mockServer.reset();
        mockServer
            .when(
                HttpRequest.request()
                    .withPath(path)
                    .withMethod(method)
            )
            .respond(
                HttpResponse.response()
                    .withStatusCode(200)
            );

        performBasicSecCall();
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                .withHeader("Authorization", "Basic " + basicAuthHeaderValue),
            VerificationTimes.once()
        );
    }

    @Test
    public void testBearerAuth() throws Exception {
        String path = DOLOR_BEARER_SEC_PATH;
        String method = "POST";
        mockServer.reset();
        mockServer
            .when(
                HttpRequest.request()
                    .withPath(path)
                    .withMethod(method)
            )
            .respond(
                HttpResponse.response()
                    .withStatusCode(200)
            );

        performBearerSecCall();
        mockServer.verify(
            HttpRequest.request()
                .withPath(path)
                .withMethod(method)
                .withHeader("Authorization", "Bearer " + BEARER_AUTH_TOKEN),
            VerificationTimes.once()
        );
    }
}

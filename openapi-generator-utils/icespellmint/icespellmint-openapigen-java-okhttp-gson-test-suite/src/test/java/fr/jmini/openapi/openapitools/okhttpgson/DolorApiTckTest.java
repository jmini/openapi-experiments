package fr.jmini.openapi.openapitools.okhttpgson;

import fr.jmini.openapi.openapitools.okhttpgson.api.DolorApi;
import fr.jmini.openapi.openapitools.okhttpgson.auth.HttpBearerAuth;
import fr.jmini.rest.client.tck.AbstractDolorApiTck;

/**
 * API tests for DolorApi
 */
public class DolorApiTckTest extends AbstractDolorApiTck {

    private DolorApi api;

    @Override
    protected void initDolorApi(String basePath, String basicAuthUsername, String basicAuthPassword, String bearerAuthToken) {
        ApiClient client = new ApiClient();
        client.setBasePath(basePath);
        client.setUsername(basicAuthUsername);
        client.setPassword(basicAuthPassword);
        ((HttpBearerAuth) client.getAuthentication("bearerAuth")).setBearerToken(bearerAuthToken);
        api = new DolorApi(client);
    }

    @Override
    protected void performBasicSecCall() throws Exception {
        api.dolorBasicSec();
    }

    @Override
    protected void performBearerSecCall() throws Exception {
        api.dolorBearerSec();
    }
}

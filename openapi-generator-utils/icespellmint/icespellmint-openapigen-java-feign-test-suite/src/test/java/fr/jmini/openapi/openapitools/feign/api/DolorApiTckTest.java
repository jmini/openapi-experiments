package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.rest.client.tck.AbstractDolorApiTck;

/**
 * API tests for DolorApi
 */
public class DolorApiTckTest extends AbstractDolorApiTck {

    private DolorApi apiForBasicAuth;
    private DolorApi apiForBearerAuth;

    @Override
    protected void initDolorApi(String basePath, String basicAuthUsername, String basicAuthPassword, String bearerAuthToken) {
        // TODO: review it seems that feign does not support multiple auth schemes configured globally:

        ApiClient clientForBasicAuth = new ApiClient(new String[] { "httpBasic" });
        clientForBasicAuth.setBasePath(basePath);
        clientForBasicAuth.setCredentials(basicAuthUsername, basicAuthPassword);
        apiForBasicAuth = clientForBasicAuth.buildClient(DolorApi.class);

        ApiClient clientForBearerAuth = new ApiClient(new String[] { "bearerAuth" });
        clientForBearerAuth.setBasePath(basePath);
        clientForBearerAuth.setBearerToken(bearerAuthToken);
        apiForBearerAuth = clientForBearerAuth.buildClient(DolorApi.class);
    }

    @Override
    protected void performBasicSecCall() throws Exception {
        apiForBasicAuth.dolorBasicSec();
    }

    @Override
    protected void performBearerSecCall() throws Exception {
        apiForBearerAuth.dolorBearerSec();
    }
}

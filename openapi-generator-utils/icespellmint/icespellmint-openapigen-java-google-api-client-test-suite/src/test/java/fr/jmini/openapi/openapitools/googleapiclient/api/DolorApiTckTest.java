/*
 * OpenAPI Ice Spell Mint API
 * Test Spec for a \"Simple Client\"
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package fr.jmini.openapi.openapitools.googleapiclient.api;

import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.rest.client.tck.AbstractDolorApiTck;

/**
 * API tests for DolorApi
 */
public class DolorApiTckTest extends AbstractDolorApiTck {

    @Override
    public void testBasicAuth() throws Exception {
        // TODO google-api-client does not seems to support authentication, see https://github.com/OpenAPITools/openapi-generator/issues/3698
    }

    @Override
    public void testBearerAuth() throws Exception {
        // TODO google-api-client does not seems to support authentication, see https://github.com/OpenAPITools/openapi-generator/issues/3698
    }

    private DolorApi api;

    @Override
    protected void initDolorApi(String basePath, String basicAuthUsername, String basicAuthPassword, String bearerAuthToken) {
        ApiClient client = new ApiClient(basePath, null, null, null);
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
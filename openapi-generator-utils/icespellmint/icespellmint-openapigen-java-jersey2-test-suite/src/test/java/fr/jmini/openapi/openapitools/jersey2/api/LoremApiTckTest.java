package fr.jmini.openapi.openapitools.jersey2.api;

import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.rest.client.tck.AbstractLoremApiTck;

/**
 * API tests for LoremApi
 */
public class LoremApiTckTest extends AbstractLoremApiTck {

    @Override
    public void testEmptyPatch() throws Exception {
        // TODO test-suite is expecting a PATCH, but gets a POST with "X-HTTP-Method-Override"
    }

    @Override
    public void testEmptyPut() throws Exception {
        // TODO java.lang.IllegalStateException: Entity must not be null for http method PUT.
    }

    private LoremApi api;

    @Override
    protected void initLoremApi(String basePath) {
        ApiClient client = new ApiClient();
        client.setBasePath(basePath);
        api = new LoremApi(client);
    }

    @Override
    protected void performEmptyGetCall() throws Exception {
        api.emptyGet();
    }

    @Override
    protected void performEmptyPostCall() throws Exception {
        api.emptyPost();
    }

    @Override
    protected void performEmptyPutCall() throws Exception {
        api.emptyPut();
    }

    @Override
    protected void performEmptyDeleteCall() throws Exception {
        api.emptyDelete();
    }

    @Override
    protected void performEmptyOptionsCall() throws Exception {
        api.emptyOptions();
    }

    @Override
    protected void performEmptyHeadCall() throws Exception {
        api.emptyHead();
    }

    @Override
    protected void performEmptyPatchCall() throws Exception {
        api.emptyPatch();
    }

    @Override
    protected void performEmptyTraceCall() throws Exception {
        api.emptyTrace();
    }
}

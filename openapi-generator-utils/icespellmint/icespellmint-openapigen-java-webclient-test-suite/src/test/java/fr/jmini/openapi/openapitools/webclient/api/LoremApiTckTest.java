package fr.jmini.openapi.openapitools.webclient.api;

import fr.jmini.openapi.openapitools.webclient.ApiClient;
import fr.jmini.rest.client.tck.AbstractLoremApiTck;

/**
 * API tests for LoremApi
 */
public class LoremApiTckTest extends AbstractLoremApiTck {

    private LoremApi api;

    @Override
    protected void initLoremApi(String basePath) {
        ApiClient client = new ApiClient();
        client.setBasePath(basePath);
        api = new LoremApi(client);
    }

    @Override
    protected void performEmptyGetCall() throws Exception {
        api.emptyGet().block();
    }

    @Override
    protected void performEmptyPostCall() throws Exception {
        api.emptyPost().block();
    }

    @Override
    protected void performEmptyPutCall() throws Exception {
        api.emptyPut().block();
    }

    @Override
    protected void performEmptyDeleteCall() throws Exception {
        api.emptyDelete().block();
    }

    @Override
    protected void performEmptyOptionsCall() throws Exception {
        api.emptyOptions().block();
    }

    @Override
    protected void performEmptyHeadCall() throws Exception {
        api.emptyHead().block();
    }

    @Override
    protected void performEmptyPatchCall() throws Exception {
        api.emptyPatch().block();
    }

    @Override
    protected void performEmptyTraceCall() throws Exception {
        api.emptyTrace().block();
    }
}

package fr.jmini.openapi.openapitools.resttemplate.api;

import fr.jmini.openapi.openapitools.resttemplate.ApiClient;
import fr.jmini.rest.client.tck.AbstractLoremApiTck;

/**
 * API tests for LoremApi
 */
public class LoremApiTckTest extends AbstractLoremApiTck {

    @Override
    public void testEmptyPatch() throws Exception {
        // TODO: PATCH is not supported by java.net.HttpURLConnection
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
        throw new UnsupportedOperationException("trace is not implemented yet");
    }
}

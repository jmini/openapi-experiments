package fr.jmini.openapi.openapitools.okhttpgson;

import fr.jmini.openapi.openapitools.okhttpgson.api.IpsumApi;
import fr.jmini.openapi.openapitools.okhttpgson.model.SomeObj;
import fr.jmini.rest.client.tck.AbstractIpsumApiTck;

/**
 * API tests for IpsumApi
 */
public class IpsumApiTckTest extends AbstractIpsumApiTck<SomeObj> {

    private IpsumApi api;

    @Override
    protected void initIpsumApi(String basePath) {
        ApiClient client = new ApiClient();
        client.setBasePath(basePath);
        api = new IpsumApi(client);
    }

    @Override
    protected void performPingGetCall(String customQueryParameterValue) throws Exception {
        api.pingGet(customQueryParameterValue);
    }

    @Override
    protected void performPingPostCall(String customQueryParameterValue) throws Exception {
        api.pingPost(customQueryParameterValue);
    }

    @Override
    protected void performPingPutCall(String customQueryParameterValue) throws Exception {
        api.pingPut(customQueryParameterValue);
    }

    @Override
    protected void performPingDeleteCall(String customQueryParameterValue) throws Exception {
        api.pingDelete(customQueryParameterValue);
    }

    @Override
    protected void performPingOptionsCall(String customQueryParameterValue) throws Exception {
        api.pingOptions(customQueryParameterValue);
    }

    @Override
    protected void performPingHeadCall(String customQueryParameterValue) throws Exception {
        api.pingHead(customQueryParameterValue);
    }

    @Override
    protected void performPingPatchCall(String customQueryParameterValue) throws Exception {
        api.pingPatch(customQueryParameterValue);
    }

    @Override
    protected void performPingTraceCall(String customQueryParameterValue) throws Exception {
        api.pingTrace(customQueryParameterValue);
    }

    @Override
    protected void performJsonPingPostCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPost(requestBodyValue);
    }

    @Override
    protected void performJsonPingPutCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPut(requestBodyValue);
    }

    @Override
    protected void performJsonPingDeleteCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingDelete(requestBodyValue);
    }

    @Override
    protected void performJsonPingOptionsCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingOptions(requestBodyValue);
    }

    @Override
    protected void performJsonPingHeadCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingHead(requestBodyValue);
    }

    @Override
    protected void performJsonPingPatchCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingPatch(requestBodyValue);
    }

    @Override
    protected void performJsonPingTraceCall(SomeObj requestBodyValue) throws Exception {
        api.jsonPingTrace(requestBodyValue);
    }

    @Override
    protected void performHelloGetCall(String namePathParameterValue) throws Exception {
        api.helloGet(namePathParameterValue);
    }

    @Override
    protected void performHelloPostCall(String namePathParameterValue) throws Exception {
        api.helloPost(namePathParameterValue);
    }

    @Override
    protected void performHelloPutCall(String namePathParameterValue) throws Exception {
        api.helloPut(namePathParameterValue);
    }

    @Override
    protected void performHelloDeleteCall(String namePathParameterValue) throws Exception {
        api.helloDelete(namePathParameterValue);
    }

    @Override
    protected void performHelloOptionsCall(String namePathParameterValue) throws Exception {
        api.helloOptions(namePathParameterValue);
    }

    @Override
    protected void performHelloHeadCall(String namePathParameterValue) throws Exception {
        api.helloHead(namePathParameterValue);
    }

    @Override
    protected void performHelloPatchCall(String namePathParameterValue) throws Exception {
        api.helloPatch(namePathParameterValue);
    }

    @Override
    protected void performHelloTraceCall(String namePathParameterValue) throws Exception {
        api.helloTrace(namePathParameterValue);
    }

    @Override
    protected SomeObj createSomeObject(Long id, String name) {
        return new SomeObj().id(id)
            .name(name);
    }
}

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


package fr.jmini.openapi.openapitools.jersey2.api;

import java.util.List;
import java.util.Map;

import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.model.SomeObj;
import fr.jmini.rest.client.tck.AbstractEtiamApiTck;

/**
 * API tests for EtiamApi
 */
public class EtiamApiTckTest extends AbstractEtiamApiTck<SomeObj> {

    @Override
    public void testGetStringHelloWorld() throws Exception {
        // TODO not supported https://github.com/OpenAPITools/openapi-generator/issues/3623
    }

    private EtiamApi api;

    @Override
    protected void initEtiamApi(String basePath) {
        ApiClient client = new ApiClient();
        client.setBasePath(basePath);
        api = new EtiamApi(client);
    }

    @Override
    protected Integer performGetIntCall() throws Exception {
        return api.getInt();
    }

    @Override
    protected List<Integer> performGetIntListCall() throws Exception {
        return api.getIntList();
    }

    @Override
    protected Map<String, Integer> performGetIntMapCall() throws Exception {
        return api.getIntMap();
    }

    @Override
    protected String performGetStringCall() throws Exception {
        return api.getString();
    }

    @Override
    protected List<String> performGetStringListCall() throws Exception {
        return api.getStringList();
    }

    @Override
    protected Map<String, String> performGetStringMapCall() throws Exception {
        return api.getStringMap();
    }

    @Override
    protected SomeObj performGetSomeObjCall() throws Exception {
        return api.getSomeObj();
    }

    @Override
    protected List<SomeObj> performGetSomeObjListCall() throws Exception {
        return api.getSomeObjList();
    }

    @Override
    protected Map<String, SomeObj> performGetSomeObjMapCall() throws Exception {
        return api.getSomeObjMap();
    }

    @Override
    protected SomeObj createSomeObject(Long id, String name) {
        return new SomeObj().id(id).name(name);
    }
}

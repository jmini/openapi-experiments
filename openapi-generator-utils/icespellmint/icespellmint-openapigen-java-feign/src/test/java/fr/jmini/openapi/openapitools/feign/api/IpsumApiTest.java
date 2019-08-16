package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.openapi.openapitools.feign.model.SomeObj;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpsumApi
 */
public class IpsumApiTest {

    private IpsumApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(IpsumApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloDeleteTest() {
        String name = null;
        // api.helloDelete(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloGetTest() {
        String name = null;
        // api.helloGet(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloHeadTest() {
        String name = null;
        // api.helloHead(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloOptionsTest() {
        String name = null;
        // api.helloOptions(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloPatchTest() {
        String name = null;
        // api.helloPatch(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloPostTest() {
        String name = null;
        // api.helloPost(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloPutTest() {
        String name = null;
        // api.helloPut(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void helloTraceTest() {
        String name = null;
        // api.helloTrace(name);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingDeleteTest() {
        SomeObj someObj = null;
        // api.jsonPingDelete(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingHeadTest() {
        SomeObj someObj = null;
        // api.jsonPingHead(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingOptionsTest() {
        SomeObj someObj = null;
        // api.jsonPingOptions(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingPatchTest() {
        SomeObj someObj = null;
        // api.jsonPingPatch(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingPostTest() {
        SomeObj someObj = null;
        // api.jsonPingPost(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingPutTest() {
        SomeObj someObj = null;
        // api.jsonPingPut(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void jsonPingTraceTest() {
        SomeObj someObj = null;
        // api.jsonPingTrace(someObj);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingDeleteTest() {
        String custom = null;
        // api.pingDelete(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingDeleteTestQueryMap() {
        IpsumApi.PingDeleteQueryParams queryParams = new IpsumApi.PingDeleteQueryParams()
            .custom(null);
        // api.pingDelete(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingGetTest() {
        String custom = null;
        // api.pingGet(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingGetTestQueryMap() {
        IpsumApi.PingGetQueryParams queryParams = new IpsumApi.PingGetQueryParams()
            .custom(null);
        // api.pingGet(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingHeadTest() {
        String custom = null;
        // api.pingHead(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingHeadTestQueryMap() {
        IpsumApi.PingHeadQueryParams queryParams = new IpsumApi.PingHeadQueryParams()
            .custom(null);
        // api.pingHead(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingOptionsTest() {
        String custom = null;
        // api.pingOptions(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingOptionsTestQueryMap() {
        IpsumApi.PingOptionsQueryParams queryParams = new IpsumApi.PingOptionsQueryParams()
            .custom(null);
        // api.pingOptions(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingPatchTest() {
        String custom = null;
        // api.pingPatch(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingPatchTestQueryMap() {
        IpsumApi.PingPatchQueryParams queryParams = new IpsumApi.PingPatchQueryParams()
            .custom(null);
        // api.pingPatch(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingPostTest() {
        String custom = null;
        // api.pingPost(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingPostTestQueryMap() {
        IpsumApi.PingPostQueryParams queryParams = new IpsumApi.PingPostQueryParams()
            .custom(null);
        // api.pingPost(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingPutTest() {
        String custom = null;
        // api.pingPut(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingPutTestQueryMap() {
        IpsumApi.PingPutQueryParams queryParams = new IpsumApi.PingPutQueryParams()
            .custom(null);
        // api.pingPut(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void pingTraceTest() {
        String custom = null;
        // api.pingTrace(custom);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pingTraceTestQueryMap() {
        IpsumApi.PingTraceQueryParams queryParams = new IpsumApi.PingTraceQueryParams()
            .custom(null);
        // api.pingTrace(queryParams);

    // TODO: test validations
    }
    
}

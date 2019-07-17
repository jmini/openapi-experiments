package fr.jmini.openapi.openapitools.feign.api;

import org.junit.Before;
import org.junit.Test;

import fr.jmini.openapi.openapitools.feign.ApiClient;

/**
 * API tests for DolorApi
 */
public class DolorApiTest {

    private DolorApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DolorApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dolorBasicSecTest() {
        // api.dolorBasicSec();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void dolorBearerSecTest() {
        // api.dolorBearerSec();

        // TODO: test validations
    }

    
}

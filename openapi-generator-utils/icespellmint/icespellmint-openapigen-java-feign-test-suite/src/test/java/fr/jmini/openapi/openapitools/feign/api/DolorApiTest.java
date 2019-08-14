package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

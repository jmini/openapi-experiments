package fr.jmini.openapi.openapitools.feign.api;

import org.junit.Before;
import org.junit.Test;

import fr.jmini.openapi.openapitools.feign.ApiClient;

/**
 * API tests for LoremApi
 */
public class LoremApiTest {

    private LoremApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LoremApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyDeleteTest() {
        // api.emptyDelete();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyGetTest() {
        // api.emptyGet();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyHeadTest() {
        // api.emptyHead();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyOptionsTest() {
        // api.emptyOptions();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyPatchTest() {
        // api.emptyPatch();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyPostTest() {
        // api.emptyPost();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void emptyPutTest() {
        // api.emptyPut();

        // TODO: test validations
    }

    
}

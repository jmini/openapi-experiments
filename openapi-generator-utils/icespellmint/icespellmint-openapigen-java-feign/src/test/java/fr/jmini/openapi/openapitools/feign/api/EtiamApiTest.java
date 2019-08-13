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
 * API tests for EtiamApi
 */
public class EtiamApiTest {

    private EtiamApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EtiamApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getIntTest() {
        // Integer response = api.getInt();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getIntListTest() {
        // List<Integer> response = api.getIntList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getIntMapTest() {
        // Map<String, Integer> response = api.getIntMap();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getSomeObjTest() {
        // SomeObj response = api.getSomeObj();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getSomeObjListTest() {
        // List<SomeObj> response = api.getSomeObjList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getSomeObjMapTest() {
        // Map<String, SomeObj> response = api.getSomeObjMap();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getStringTest() {
        // String response = api.getString();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getStringListTest() {
        // List<String> response = api.getStringList();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void getStringMapTest() {
        // Map<String, String> response = api.getStringMap();

        // TODO: test validations
    }

    
}

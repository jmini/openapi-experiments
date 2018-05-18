/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ItemWithBoolean;
import org.openapitools.client.model.LongModel;
import org.openapitools.client.model.ObjWithEnums;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCase1Test() throws ApiException {
        ItemWithBoolean response = api.getCase1();

        // TODO: test validations
    }
    
    /**
     * Codegen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issue7754Test() throws ApiException {
        LongModel response = api.issue7754();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void opTest() throws ApiException {
        ObjWithEnums response = api.op();

        // TODO: test validations
    }
    
}

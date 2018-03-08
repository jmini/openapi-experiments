/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;




import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






/**
 
 * Swagger Petstore
 *
 
 
 * <p>This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 
 * API tests for StoreApi 
 */

public class StoreApiTest {

    

    private StoreApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        

        api = JAXRSClientFactory.create("http://petstore.swagger.io/v2", StoreApi.class, providers);

        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 


    }

    
    /**
     
     * Delete purchase order by ID
     *
     
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     
     
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() {
        
        String orderId = null;
        
        //api.deleteOrder(orderId);
        
        // TODO: test validations
        
        
    }
    
    /**
     
     * Returns pet inventories by status
     *
     
     * Returns a map of status codes to quantities
     *
     
     
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() {
        
        //Map<String, Integer> response = api.getInventory();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     
     * Find purchase order by ID
     *
     
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     
     
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() {
        
        String orderId = null;
        
        //Order response = api.getOrderById(orderId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     
     * Place an order for a pet
     *
     
     
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() {
        
        Order order = null;
        
        //Order response = api.placeOrder(order);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}

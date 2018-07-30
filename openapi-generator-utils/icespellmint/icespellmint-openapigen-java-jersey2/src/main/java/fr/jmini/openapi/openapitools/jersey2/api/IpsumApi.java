package fr.jmini.openapi.openapitools.jersey2.api;

import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiResponse;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.Pair;

import javax.ws.rs.core.GenericType;

import fr.jmini.openapi.openapitools.jersey2.model.SomeObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IpsumApi {
  private ApiClient apiClient;

  public IpsumApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpsumApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingDelete(SomeObj someObj) throws ApiException {

    jsonPingDeleteWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingDeleteWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingHead(SomeObj someObj) throws ApiException {

    jsonPingHeadWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingHeadWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingOptions(SomeObj someObj) throws ApiException {

    jsonPingOptionsWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingOptionsWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "OPTIONS", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingPatch(SomeObj someObj) throws ApiException {

    jsonPingPatchWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingPatchWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingPost(SomeObj someObj) throws ApiException {

    jsonPingPostWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingPostWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public void jsonPingPut(SomeObj someObj) throws ApiException {

    jsonPingPutWithHttpInfo(someObj);
  }

  /**
   * 
   * 
   * @param someObj  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> jsonPingPutWithHttpInfo(SomeObj someObj) throws ApiException {
    Object localVarPostBody = someObj;
    
    // create path and map variables
    String localVarPath = "/ipsum/jsonPing";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingDelete(String custom) throws ApiException {

    pingDeleteWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingDeleteWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingGet(String custom) throws ApiException {

    pingGetWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingGetWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingHead(String custom) throws ApiException {

    pingHeadWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingHeadWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingOptions(String custom) throws ApiException {

    pingOptionsWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingOptionsWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "OPTIONS", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingPatch(String custom) throws ApiException {

    pingPatchWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingPatchWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingPost(String custom) throws ApiException {

    pingPostWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingPostWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public void pingPut(String custom) throws ApiException {

    pingPutWithHttpInfo(custom);
  }

  /**
   * 
   * 
   * @param custom  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> pingPutWithHttpInfo(String custom) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/ipsum/ping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom", custom));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}

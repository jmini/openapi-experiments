# DolorApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dolorBasicSec**](DolorApi.md#dolorBasicSec) | **POST** /dolor/basicSecurity | 
[**dolorBearerSec**](DolorApi.md#dolorBearerSec) | **POST** /dolor/bearerSecurity | 



## dolorBasicSec

> dolorBasicSec()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.resteasy.ApiClient;
import fr.jmini.openapi.openapitools.resteasy.ApiException;
import fr.jmini.openapi.openapitools.resteasy.Configuration;
import fr.jmini.openapi.openapitools.resteasy.auth.*;
import fr.jmini.openapi.openapitools.resteasy.models.*;
import fr.jmini.openapi.openapitools.resteasy.api.DolorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");
        
        // Configure HTTP basic authorization: httpBasic
        HttpBasicAuth httpBasic = (HttpBasicAuth) defaultClient.getAuthentication("httpBasic");
        httpBasic.setUsername("YOUR USERNAME");
        httpBasic.setPassword("YOUR PASSWORD");

        DolorApi apiInstance = new DolorApi(defaultClient);
        try {
            apiInstance.dolorBasicSec();
        } catch (ApiException e) {
            System.err.println("Exception when calling DolorApi#dolorBasicSec");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[httpBasic](../README.md#httpBasic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## dolorBearerSec

> dolorBearerSec()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.resteasy.ApiClient;
import fr.jmini.openapi.openapitools.resteasy.ApiException;
import fr.jmini.openapi.openapitools.resteasy.Configuration;
import fr.jmini.openapi.openapitools.resteasy.auth.*;
import fr.jmini.openapi.openapitools.resteasy.models.*;
import fr.jmini.openapi.openapitools.resteasy.api.DolorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DolorApi apiInstance = new DolorApi(defaultClient);
        try {
            apiInstance.dolorBearerSec();
        } catch (ApiException e) {
            System.err.println("Exception when calling DolorApi#dolorBearerSec");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


# IpsumApi

All URIs are relative to *http://api.company.xyz/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**op199**](IpsumApi.md#op199) | **GET** /ipsum/issue199 | 


<a name="op199"></a>
# **op199**
> SomeObject op199()



### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.IpsumApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    IpsumApi apiInstance = new IpsumApi(defaultClient);
    try {
      SomeObject result = apiInstance.op199();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpsumApi#op199");
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

[**SomeObject**](SomeObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | a pet to be returned |  -  |
**0** | Unexpected error |  -  |


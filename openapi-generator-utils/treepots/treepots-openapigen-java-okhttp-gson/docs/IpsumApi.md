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
//import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
//import fr.jmini.openapi.openapitools.okhttpgson.api.IpsumApi;


IpsumApi apiInstance = new IpsumApi();
try {
    SomeObject result = apiInstance.op199();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpsumApi#op199");
    e.printStackTrace();
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


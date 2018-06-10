# IpsumApi

All URIs are relative to *http://api.company.xyz/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**op**](IpsumApi.md#op) | **GET** /ipsum/issue199 | 


<a name="op"></a>
# **op**
> SomeObject op()



### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.IpsumApi;


IpsumApi apiInstance = new IpsumApi();
try {
    SomeObject result = apiInstance.op();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpsumApi#op");
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


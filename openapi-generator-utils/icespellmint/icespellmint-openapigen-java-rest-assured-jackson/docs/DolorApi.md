# DolorApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dolorBasicSec**](DolorApi.md#dolorBasicSec) | **POST** /dolor/basicSecurity | 
[**dolorBearerSec**](DolorApi.md#dolorBearerSec) | **POST** /dolor/bearerSecurity | 


<a name="dolorBasicSec"></a>
# **dolorBasicSec**
> dolorBasicSec()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

DolorApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).dolor();

api.dolorBasicSec().execute(r -> r.prettyPeek());
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

<a name="dolorBearerSec"></a>
# **dolorBearerSec**
> dolorBearerSec()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

DolorApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).dolor();

api.dolorBearerSec().execute(r -> r.prettyPeek());
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


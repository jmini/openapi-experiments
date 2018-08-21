# IpsumApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jsonPingDelete**](IpsumApi.md#jsonPingDelete) | **DELETE** /ipsum/jsonPing | 
[**jsonPingHead**](IpsumApi.md#jsonPingHead) | **HEAD** /ipsum/jsonPing | 
[**jsonPingOptions**](IpsumApi.md#jsonPingOptions) | **OPTIONS** /ipsum/jsonPing | 
[**jsonPingPatch**](IpsumApi.md#jsonPingPatch) | **PATCH** /ipsum/jsonPing | 
[**jsonPingPost**](IpsumApi.md#jsonPingPost) | **POST** /ipsum/jsonPing | 
[**jsonPingPut**](IpsumApi.md#jsonPingPut) | **PUT** /ipsum/jsonPing | 
[**pingDelete**](IpsumApi.md#pingDelete) | **DELETE** /ipsum/ping | 
[**pingGet**](IpsumApi.md#pingGet) | **GET** /ipsum/ping | 
[**pingHead**](IpsumApi.md#pingHead) | **HEAD** /ipsum/ping | 
[**pingOptions**](IpsumApi.md#pingOptions) | **OPTIONS** /ipsum/ping | 
[**pingPatch**](IpsumApi.md#pingPatch) | **PATCH** /ipsum/ping | 
[**pingPost**](IpsumApi.md#pingPost) | **POST** /ipsum/ping | 
[**pingPut**](IpsumApi.md#pingPut) | **PUT** /ipsum/ping | 


<a name="jsonPingDelete"></a>
# **jsonPingDelete**
> jsonPingDelete(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingDelete().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jsonPingHead"></a>
# **jsonPingHead**
> jsonPingHead(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingHead().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jsonPingOptions"></a>
# **jsonPingOptions**
> jsonPingOptions(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingOptions().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jsonPingPatch"></a>
# **jsonPingPatch**
> jsonPingPatch(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingPatch().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jsonPingPost"></a>
# **jsonPingPost**
> jsonPingPost(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingPost().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="jsonPingPut"></a>
# **jsonPingPut**
> jsonPingPut(someObj)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.jsonPingPut().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="pingDelete"></a>
# **pingDelete**
> pingDelete(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingDelete().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingGet"></a>
# **pingGet**
> pingGet(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingGet().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingHead"></a>
# **pingHead**
> pingHead(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingHead().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingOptions"></a>
# **pingOptions**
> pingOptions(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingOptions().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingPatch"></a>
# **pingPatch**
> pingPatch(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingPatch().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingPost"></a>
# **pingPost**
> pingPost(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingPost().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pingPut"></a>
# **pingPut**
> pingPut(custom)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

IpsumApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).ipsum();

api.pingPut().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **custom** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


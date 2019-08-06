# EtiamApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInt**](EtiamApi.md#getInt) | **GET** /etiam/getInt | 
[**getIntList**](EtiamApi.md#getIntList) | **GET** /etiam/getIntList | 
[**getIntMap**](EtiamApi.md#getIntMap) | **GET** /etiam/getIntMap | 
[**getSomeObj**](EtiamApi.md#getSomeObj) | **GET** /etiam/getSomeObj | 
[**getSomeObjList**](EtiamApi.md#getSomeObjList) | **GET** /etiam/getSomeObjList | 
[**getSomeObjMap**](EtiamApi.md#getSomeObjMap) | **GET** /etiam/getSomeObjMap | 
[**getString**](EtiamApi.md#getString) | **GET** /etiam/getString | 
[**getStringList**](EtiamApi.md#getStringList) | **GET** /etiam/getStringList | 
[**getStringMap**](EtiamApi.md#getStringMap) | **GET** /etiam/getStringMap | 


<a name="getInt"></a>
# **getInt**
> Integer getInt()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getInt().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIntList"></a>
# **getIntList**
> List&lt;Integer&gt; getIntList()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getIntList().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIntMap"></a>
# **getIntMap**
> Map&lt;String, Integer&gt; getIntMap()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getIntMap().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSomeObj"></a>
# **getSomeObj**
> SomeObj getSomeObj()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getSomeObj().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SomeObj**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSomeObjList"></a>
# **getSomeObjList**
> List&lt;SomeObj&gt; getSomeObjList()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getSomeObjList().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SomeObj&gt;**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSomeObjMap"></a>
# **getSomeObjMap**
> Map&lt;String, SomeObj&gt; getSomeObjMap()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getSomeObjMap().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, SomeObj&gt;**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getString"></a>
# **getString**
> String getString()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getString().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStringList"></a>
# **getStringList**
> List&lt;String&gt; getStringList()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getStringList().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStringMap"></a>
# **getStringMap**
> Map&lt;String, String&gt; getStringMap()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassuredjackson.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

EtiamApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8090"))).etiam();

api.getStringMap().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


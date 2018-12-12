# LoremApi

All URIs are relative to *http://api.company.xyz/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCase1**](LoremApi.md#getCase1) | **GET** /case1 | Update an existing pet
[**getPolymorphic**](LoremApi.md#getPolymorphic) | **GET** /polymorphic | 
[**issue7754**](LoremApi.md#issue7754) | **GET** /issue7754 | Codegen
[**op**](LoremApi.md#op) | **GET** /pull75 | 
[**op708**](LoremApi.md#op708) | **GET** /pull708 | 
[**pull66**](LoremApi.md#pull66) | **GET** /pull66 | 


<a name="getCase1"></a>
# **getCase1**
> ItemWithBoolean getCase1()

Update an existing pet

### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.getCase1().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ItemWithBoolean**](ItemWithBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolymorphic"></a>
# **getPolymorphic**
> SomeObject getPolymorphic()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.getPolymorphic().execute(r -> r.prettyPeek());
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

<a name="issue7754"></a>
# **issue7754**
> LongModel issue7754()

Codegen

### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.issue7754().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LongModel**](LongModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="op"></a>
# **op**
> ObjWithEnums op()



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.op().execute(r -> r.prettyPeek());
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjWithEnums**](ObjWithEnums.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="op708"></a>
# **op708**
> op708(bar)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.op708().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bar** | **String**|  | [optional] [default to &quot;foobar&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pull66"></a>
# **pull66**
> pull66(enumInArrayOfArray)



### Example
```java
// Import classes:
//import fr.jmini.openapi.openapitools.restassured.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

LoremApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://api.company.xyz/v2"))).lorem();

api.pull66().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumInArrayOfArray** | [**EnumInArrayOfArray**](EnumInArrayOfArray.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


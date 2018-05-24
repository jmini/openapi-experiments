# DefaultApi

All URIs are relative to *http://api.company.xyz/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCase1**](DefaultApi.md#getCase1) | **GET** /case1 | Update an existing pet
[**issue7754**](DefaultApi.md#issue7754) | **GET** /issue7754 | Codegen
[**op**](DefaultApi.md#op) | **GET** /pull75 | 
[**pull66**](DefaultApi.md#pull66) | **GET** /pull66 | 


<a name="getCase1"></a>
# **getCase1**
> ItemWithBoolean getCase1()

Update an existing pet

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ItemWithBoolean result = apiInstance.getCase1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCase1");
    e.printStackTrace();
}
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

<a name="issue7754"></a>
# **issue7754**
> LongModel issue7754()

Codegen

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    LongModel result = apiInstance.issue7754();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#issue7754");
    e.printStackTrace();
}
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
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ObjWithEnums result = apiInstance.op();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#op");
    e.printStackTrace();
}
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

<a name="pull66"></a>
# **pull66**
> pull66(enumInArrayOfArray)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
EnumInArrayOfArray enumInArrayOfArray = new EnumInArrayOfArray(); // EnumInArrayOfArray | 
try {
    apiInstance.pull66(enumInArrayOfArray);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pull66");
    e.printStackTrace();
}
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


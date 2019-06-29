# LoremApi

All URIs are relative to *http://api.company.xyz/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCase1**](LoremApi.md#getCase1) | **GET** /case1 | Update an existing pet
[**getPolymorphic**](LoremApi.md#getPolymorphic) | **GET** /polymorphic | 
[**issue7754**](LoremApi.md#issue7754) | **GET** /issue7754 | Codegen
[**op708**](LoremApi.md#op708) | **GET** /pull708 | 
[**op75**](LoremApi.md#op75) | **GET** /pull75 | 
[**pull66**](LoremApi.md#pull66) | **GET** /pull66 | 


<a name="getCase1"></a>
# **getCase1**
> ItemWithBoolean getCase1()

Update an existing pet

### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    try {
      ItemWithBoolean result = apiInstance.getCase1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#getCase1");
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

[**ItemWithBoolean**](ItemWithBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getPolymorphic"></a>
# **getPolymorphic**
> SomeObject getPolymorphic()



### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    try {
      SomeObject result = apiInstance.getPolymorphic();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#getPolymorphic");
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

<a name="issue7754"></a>
# **issue7754**
> LongModel issue7754()

Codegen

### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    try {
      LongModel result = apiInstance.issue7754();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#issue7754");
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

[**LongModel**](LongModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="op708"></a>
# **op708**
> op708(bar)



### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    String bar = "\"foobar\""; // String | 
    try {
      apiInstance.op708(bar);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#op708");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="op75"></a>
# **op75**
> ObjWithEnums op75()



### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    try {
      ObjWithEnums result = apiInstance.op75();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#op75");
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

[**ObjWithEnums**](ObjWithEnums.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="pull66"></a>
# **pull66**
> pull66(enumInArrayOfArray)



### Example
```java
// Import classes:
import fr.jmini.openapi.openapitools.okhttpgson.ApiClient;
import fr.jmini.openapi.openapitools.okhttpgson.ApiException;
import fr.jmini.openapi.openapitools.okhttpgson.Configuration;
import fr.jmini.openapi.openapitools.okhttpgson.models.*;
import fr.jmini.openapi.openapitools.okhttpgson.api.LoremApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.company.xyz/v2");

    LoremApi apiInstance = new LoremApi(defaultClient);
    EnumInArrayOfArray enumInArrayOfArray = new EnumInArrayOfArray(); // EnumInArrayOfArray | 
    try {
      apiInstance.pull66(enumInArrayOfArray);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoremApi#pull66");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |


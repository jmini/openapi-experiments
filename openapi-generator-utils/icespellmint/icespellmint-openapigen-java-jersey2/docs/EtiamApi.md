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



## getInt

> Integer getInt()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            Integer result = apiInstance.getInt();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getInt");
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

**Integer**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getIntList

> List&lt;Integer&gt; getIntList()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            List<Integer> result = apiInstance.getIntList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getIntList");
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

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getIntMap

> Map&lt;String, Integer&gt; getIntMap()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            Map<String, Integer> result = apiInstance.getIntMap();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getIntMap");
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

**Map&lt;String, Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSomeObj

> SomeObj getSomeObj()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            SomeObj result = apiInstance.getSomeObj();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getSomeObj");
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

[**SomeObj**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSomeObjList

> List&lt;SomeObj&gt; getSomeObjList()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            List<SomeObj> result = apiInstance.getSomeObjList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getSomeObjList");
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

[**List&lt;SomeObj&gt;**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSomeObjMap

> Map&lt;String, SomeObj&gt; getSomeObjMap()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            Map<String, SomeObj> result = apiInstance.getSomeObjMap();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getSomeObjMap");
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

[**Map&lt;String, SomeObj&gt;**](SomeObj.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getString

> String getString()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            String result = apiInstance.getString();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getString");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getStringList

> List&lt;String&gt; getStringList()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            List<String> result = apiInstance.getStringList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getStringList");
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

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getStringMap

> Map&lt;String, String&gt; getStringMap()



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.jersey2.ApiClient;
import fr.jmini.openapi.openapitools.jersey2.ApiException;
import fr.jmini.openapi.openapitools.jersey2.Configuration;
import fr.jmini.openapi.openapitools.jersey2.models.*;
import fr.jmini.openapi.openapitools.jersey2.api.EtiamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        EtiamApi apiInstance = new EtiamApi(defaultClient);
        try {
            Map<String, String> result = apiInstance.getStringMap();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EtiamApi#getStringMap");
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

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


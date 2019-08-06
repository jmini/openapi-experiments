# IpsumApi

All URIs are relative to *http://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helloDelete**](IpsumApi.md#helloDelete) | **DELETE** /ipsum/hello/{name} | 
[**helloGet**](IpsumApi.md#helloGet) | **GET** /ipsum/hello/{name} | 
[**helloHead**](IpsumApi.md#helloHead) | **HEAD** /ipsum/hello/{name} | 
[**helloOptions**](IpsumApi.md#helloOptions) | **OPTIONS** /ipsum/hello/{name} | 
[**helloPatch**](IpsumApi.md#helloPatch) | **PATCH** /ipsum/hello/{name} | 
[**helloPost**](IpsumApi.md#helloPost) | **POST** /ipsum/hello/{name} | 
[**helloPut**](IpsumApi.md#helloPut) | **PUT** /ipsum/hello/{name} | 
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



## helloDelete

> helloDelete(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloDelete(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloDelete");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloGet

> helloGet(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloGet(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloGet");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloHead

> helloHead(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloHead(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloHead");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloOptions

> helloOptions(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloOptions(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloOptions");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloPatch

> helloPatch(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloPatch(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloPatch");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloPost

> helloPost(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloPost(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloPost");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## helloPut

> helloPut(name)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            apiInstance.helloPut(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#helloPut");
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
 **name** | **String**|  |

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
| **200** | OK |  -  |


## jsonPingDelete

> jsonPingDelete(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingDelete(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingDelete");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## jsonPingHead

> jsonPingHead(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingHead(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingHead");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## jsonPingOptions

> jsonPingOptions(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingOptions(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingOptions");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## jsonPingPatch

> jsonPingPatch(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingPatch(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingPatch");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## jsonPingPost

> jsonPingPost(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingPost(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingPost");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## jsonPingPut

> jsonPingPut(someObj)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        SomeObj someObj = new SomeObj(); // SomeObj | 
        try {
            apiInstance.jsonPingPut(someObj);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#jsonPingPut");
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
 **someObj** | [**SomeObj**](SomeObj.md)|  | [optional]

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
| **200** | OK |  -  |


## pingDelete

> pingDelete(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingDelete(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingDelete");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingGet

> pingGet(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingGet(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingGet");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingHead

> pingHead(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingHead(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingHead");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingOptions

> pingOptions(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingOptions(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingOptions");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingPatch

> pingPatch(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingPatch(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingPatch");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingPost

> pingPost(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingPost(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingPost");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


## pingPut

> pingPut(custom)



### Example

```java
// Import classes:
import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;
import fr.jmini.openapi.openapitools.googleapiclient.ApiException;
import fr.jmini.openapi.openapitools.googleapiclient.Configuration;
import fr.jmini.openapi.openapitools.googleapiclient.models.*;
import fr.jmini.openapi.openapitools.googleapiclient.api.IpsumApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8090");

        IpsumApi apiInstance = new IpsumApi(defaultClient);
        String custom = "custom_example"; // String | 
        try {
            apiInstance.pingPut(custom);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsumApi#pingPut");
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
 **custom** | **String**|  | [optional]

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
| **200** | OK |  -  |


package fr.jmini.openapi.openapitools.googleapiclient.api;

import fr.jmini.openapi.openapitools.googleapiclient.ApiClient;

import fr.jmini.openapi.openapitools.googleapiclient.model.SomeObj;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class IpsumApi {
    private ApiClient apiClient;

    public IpsumApi() {
        this(new ApiClient());
    }

    public IpsumApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloDelete(String name) throws IOException {
        helloDeleteForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloDelete(String name, Map<String, Object> params) throws IOException {
        helloDeleteForHttpResponse(name, params);
    }

    public HttpResponse helloDeleteForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse helloDeleteForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloDelete");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloGet(String name) throws IOException {
        helloGetForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloGet(String name, Map<String, Object> params) throws IOException {
        helloGetForHttpResponse(name, params);
    }

    public HttpResponse helloGetForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse helloGetForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloGet");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloHead(String name) throws IOException {
        helloHeadForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloHead(String name, Map<String, Object> params) throws IOException {
        helloHeadForHttpResponse(name, params);
    }

    public HttpResponse helloHeadForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloHead");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }

    public HttpResponse helloHeadForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloHead");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloOptions(String name) throws IOException {
        helloOptionsForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloOptions(String name, Map<String, Object> params) throws IOException {
        helloOptionsForHttpResponse(name, params);
    }

    public HttpResponse helloOptionsForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloOptions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }

    public HttpResponse helloOptionsForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloOptions");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPatch(String name) throws IOException {
        helloPatchForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPatch(String name, Map<String, Object> params) throws IOException {
        helloPatchForHttpResponse(name, params);
    }

    public HttpResponse helloPatchForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPatch");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

    public HttpResponse helloPatchForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPatch");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPost(String name) throws IOException {
        helloPostForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPost(String name, Map<String, Object> params) throws IOException {
        helloPostForHttpResponse(name, params);
    }

    public HttpResponse helloPostForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPost");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse helloPostForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPost");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPut(String name) throws IOException {
        helloPutForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloPut(String name, Map<String, Object> params) throws IOException {
        helloPutForHttpResponse(name, params);
    }

    public HttpResponse helloPutForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPut");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

    public HttpResponse helloPutForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloPut");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloTrace(String name) throws IOException {
        helloTraceForHttpResponse(name);
    }

  /**
    * <p><b>200</b> - OK
    * @param name The name parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void helloTrace(String name, Map<String, Object> params) throws IOException {
        helloTraceForHttpResponse(name, params);
    }

    public HttpResponse helloTraceForHttpResponse(String name) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloTrace");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }

    public HttpResponse helloTraceForHttpResponse(String name, Map<String, Object> params) throws IOException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new IllegalArgumentException("Missing the required parameter 'name' when calling helloTrace");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/hello/{name}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingDelete(SomeObj someObj) throws IOException {
        jsonPingDeleteForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingDelete(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingDeleteForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingDeleteForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

      public HttpResponse jsonPingDeleteForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
      }

    public HttpResponse jsonPingDeleteForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingHead(SomeObj someObj) throws IOException {
        jsonPingHeadForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingHead(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingHeadForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingHeadForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }

      public HttpResponse jsonPingHeadForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
      }

    public HttpResponse jsonPingHeadForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingOptions(SomeObj someObj) throws IOException {
        jsonPingOptionsForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingOptions(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingOptionsForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingOptionsForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }

      public HttpResponse jsonPingOptionsForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
      }

    public HttpResponse jsonPingOptionsForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPatch(SomeObj someObj) throws IOException {
        jsonPingPatchForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPatch(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingPatchForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingPatchForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse jsonPingPatchForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse jsonPingPatchForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPost(SomeObj someObj) throws IOException {
        jsonPingPostForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPost(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingPostForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingPostForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse jsonPingPostForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse jsonPingPostForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPut(SomeObj someObj) throws IOException {
        jsonPingPutForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingPut(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingPutForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingPutForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse jsonPingPutForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse jsonPingPutForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(someObj);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param someObj The someObj parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingTrace(SomeObj someObj) throws IOException {
        jsonPingTraceForHttpResponse(someObj);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void jsonPingTrace(SomeObj someObj, Map<String, Object> params) throws IOException {
        jsonPingTraceForHttpResponse(someObj, params);
    }

    public HttpResponse jsonPingTraceForHttpResponse(SomeObj someObj) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }

      public HttpResponse jsonPingTraceForHttpResponse(java.io.InputStream someObj, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = someObj == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, someObj);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
      }

    public HttpResponse jsonPingTraceForHttpResponse(SomeObj someObj, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/jsonPing");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingDelete(String custom) throws IOException {
        pingDeleteForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingDelete(Map<String, Object> params) throws IOException {
        pingDeleteForHttpResponse(params);
    }

    public HttpResponse pingDeleteForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse pingDeleteForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingGet(String custom) throws IOException {
        pingGetForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingGet(Map<String, Object> params) throws IOException {
        pingGetForHttpResponse(params);
    }

    public HttpResponse pingGetForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse pingGetForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingHead(String custom) throws IOException {
        pingHeadForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingHead(Map<String, Object> params) throws IOException {
        pingHeadForHttpResponse(params);
    }

    public HttpResponse pingHeadForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }

    public HttpResponse pingHeadForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.HEAD, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingOptions(String custom) throws IOException {
        pingOptionsForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingOptions(Map<String, Object> params) throws IOException {
        pingOptionsForHttpResponse(params);
    }

    public HttpResponse pingOptionsForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }

    public HttpResponse pingOptionsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.OPTIONS, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPatch(String custom) throws IOException {
        pingPatchForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPatch(Map<String, Object> params) throws IOException {
        pingPatchForHttpResponse(params);
    }

    public HttpResponse pingPatchForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

    public HttpResponse pingPatchForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPost(String custom) throws IOException {
        pingPostForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPost(Map<String, Object> params) throws IOException {
        pingPostForHttpResponse(params);
    }

    public HttpResponse pingPostForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse pingPostForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPut(String custom) throws IOException {
        pingPutForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingPut(Map<String, Object> params) throws IOException {
        pingPutForHttpResponse(params);
    }

    public HttpResponse pingPutForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

    public HttpResponse pingPutForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - OK
    * @param custom The custom parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingTrace(String custom) throws IOException {
        pingTraceForHttpResponse(custom);
    }

  /**
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void pingTrace(Map<String, Object> params) throws IOException {
        pingTraceForHttpResponse(params);
    }

    public HttpResponse pingTraceForHttpResponse(String custom) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");
        if (custom != null) {
            String key = "custom";
            Object value = custom;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }

    public HttpResponse pingTraceForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ipsum/ping");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.TRACE, genericUrl, content).execute();
    }


}

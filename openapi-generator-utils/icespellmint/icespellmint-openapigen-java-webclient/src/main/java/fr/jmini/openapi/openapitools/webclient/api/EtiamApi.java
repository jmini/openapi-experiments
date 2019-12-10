package fr.jmini.openapi.openapitools.webclient.api;

import fr.jmini.openapi.openapitools.webclient.ApiClient;

import fr.jmini.openapi.openapitools.webclient.model.SomeObj;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


public class EtiamApi {
    private ApiClient apiClient;

    public EtiamApi() {
        this(new ApiClient());
    }

    @Autowired
    public EtiamApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> getInt() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/etiam/getInt", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getIntList() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI("/etiam/getIntList", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return Map&lt;String, Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Integer>> getIntMap() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Map<String, Integer>> returnType = new ParameterizedTypeReference<Map<String, Integer>>() {};
        return apiClient.invokeAPI("/etiam/getIntMap", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return SomeObj
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<SomeObj> getSomeObj() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SomeObj> returnType = new ParameterizedTypeReference<SomeObj>() {};
        return apiClient.invokeAPI("/etiam/getSomeObj", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return List&lt;SomeObj&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<SomeObj> getSomeObjList() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SomeObj> returnType = new ParameterizedTypeReference<SomeObj>() {};
        return apiClient.invokeFluxAPI("/etiam/getSomeObjList", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return Map&lt;String, SomeObj&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, SomeObj>> getSomeObjMap() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Map<String, SomeObj>> returnType = new ParameterizedTypeReference<Map<String, SomeObj>>() {};
        return apiClient.invokeAPI("/etiam/getSomeObjMap", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<String> getString() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/etiam/getString", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<String> getStringList() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeFluxAPI("/etiam/getStringList", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @return Map&lt;String, String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, String>> getStringMap() throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();


        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Map<String, String>> returnType = new ParameterizedTypeReference<Map<String, String>>() {};
        return apiClient.invokeAPI("/etiam/getStringMap", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}

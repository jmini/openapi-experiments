package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.openapi.openapitools.feign.EncodingUtils;

import fr.jmini.openapi.openapitools.feign.model.SomeObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface IpsumApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("DELETE /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingDelete(SomeObj someObj);

  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("HEAD /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingHead(SomeObj someObj);

  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("OPTIONS /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingOptions(SomeObj someObj);

  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("PATCH /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingPatch(SomeObj someObj);

  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("POST /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingPost(SomeObj someObj);

  /**
   * 
   * 
   * @param someObj  (optional)
   */
  @RequestLine("PUT /ipsum/jsonPing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void jsonPingPut(SomeObj someObj);

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("DELETE /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingDelete(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingDelete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingDeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("DELETE /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingDelete(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingDelete</code> method in a fluent style.
   */
  public static class PingDeleteQueryParams extends HashMap<String, Object> {
    public PingDeleteQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("GET /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingGet(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("GET /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingGet</code> method in a fluent style.
   */
  public static class PingGetQueryParams extends HashMap<String, Object> {
    public PingGetQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("HEAD /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingHead(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingHead</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingHeadQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("HEAD /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingHead(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingHead</code> method in a fluent style.
   */
  public static class PingHeadQueryParams extends HashMap<String, Object> {
    public PingHeadQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("OPTIONS /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingOptions(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingOptions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingOptionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("OPTIONS /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingOptions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingOptions</code> method in a fluent style.
   */
  public static class PingOptionsQueryParams extends HashMap<String, Object> {
    public PingOptionsQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("PATCH /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingPatch(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingPatch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingPatchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("PATCH /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingPatch(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingPatch</code> method in a fluent style.
   */
  public static class PingPatchQueryParams extends HashMap<String, Object> {
    public PingPatchQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("POST /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingPost(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingPost</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingPostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("POST /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingPost(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingPost</code> method in a fluent style.
   */
  public static class PingPostQueryParams extends HashMap<String, Object> {
    public PingPostQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param custom  (optional)
   */
  @RequestLine("PUT /ipsum/ping?custom={custom}")
  @Headers({
    "Accept: application/json",
  })
  void pingPut(@Param("custom") String custom);

  /**
   * 
   * 
   * Note, this is equivalent to the other <code>pingPut</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PingPutQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>custom -  (optional)</li>
   *   </ul>
   */
  @RequestLine("PUT /ipsum/ping?custom={custom}")
  @Headers({
  "Accept: application/json",
  })
  void pingPut(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pingPut</code> method in a fluent style.
   */
  public static class PingPutQueryParams extends HashMap<String, Object> {
    public PingPutQueryParams custom(final String value) {
      put("custom", EncodingUtils.encode(value));
      return this;
    }
  }
}

package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.openapi.openapitools.feign.EncodingUtils;

import fr.jmini.openapi.openapitools.feign.model.SomeObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface EtiamApi extends ApiClient.Api {


  /**
   * 
   * 
   * @return Integer
   */
  @RequestLine("GET /etiam/getInt")
  @Headers({
    "Accept: application/json",
  })
  Integer getInt();

  /**
   * 
   * 
   * @return List&lt;Integer&gt;
   */
  @RequestLine("GET /etiam/getIntList")
  @Headers({
    "Accept: application/json",
  })
  List<Integer> getIntList();

  /**
   * 
   * 
   * @return Map&lt;String, Integer&gt;
   */
  @RequestLine("GET /etiam/getIntMap")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Integer> getIntMap();

  /**
   * 
   * 
   * @return SomeObj
   */
  @RequestLine("GET /etiam/getSomeObj")
  @Headers({
    "Accept: application/json",
  })
  SomeObj getSomeObj();

  /**
   * 
   * 
   * @return List&lt;SomeObj&gt;
   */
  @RequestLine("GET /etiam/getSomeObjList")
  @Headers({
    "Accept: application/json",
  })
  List<SomeObj> getSomeObjList();

  /**
   * 
   * 
   * @return Map&lt;String, SomeObj&gt;
   */
  @RequestLine("GET /etiam/getSomeObjMap")
  @Headers({
    "Accept: application/json",
  })
  Map<String, SomeObj> getSomeObjMap();

  /**
   * 
   * 
   * @return String
   */
  @RequestLine("GET /etiam/getString")
  @Headers({
    "Accept: application/json",
  })
  String getString();

  /**
   * 
   * 
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /etiam/getStringList")
  @Headers({
    "Accept: application/json",
  })
  List<String> getStringList();

  /**
   * 
   * 
   * @return Map&lt;String, String&gt;
   */
  @RequestLine("GET /etiam/getStringMap")
  @Headers({
    "Accept: application/json",
  })
  Map<String, String> getStringMap();
}

package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.openapi.openapitools.feign.EncodingUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface LoremApi extends ApiClient.Api {


  /**
   * 
   * 
   */
  @RequestLine("DELETE /lorem/deleteEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyDelete();

  /**
   * 
   * 
   */
  @RequestLine("GET /lorem/getEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyGet();

  /**
   * 
   * 
   */
  @RequestLine("HEAD /lorem/headEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyHead();

  /**
   * 
   * 
   */
  @RequestLine("OPTIONS /lorem/optionsEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyOptions();

  /**
   * 
   * 
   */
  @RequestLine("PATCH /lorem/patchEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyPatch();

  /**
   * 
   * 
   */
  @RequestLine("POST /lorem/postEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyPost();

  /**
   * 
   * 
   */
  @RequestLine("PUT /lorem/putEmpty")
  @Headers({
    "Accept: application/json",
  })
  void emptyPut();
}

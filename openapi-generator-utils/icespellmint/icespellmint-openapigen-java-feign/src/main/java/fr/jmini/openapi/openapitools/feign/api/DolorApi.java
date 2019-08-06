package fr.jmini.openapi.openapitools.feign.api;

import fr.jmini.openapi.openapitools.feign.ApiClient;
import fr.jmini.openapi.openapitools.feign.EncodingUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;


public interface DolorApi extends ApiClient.Api {


  /**
   * 
   * 
   */
  @RequestLine("POST /dolor/basicSecurity")
  @Headers({
    "Accept: application/json",
  })
  void dolorBasicSec();

  /**
   * 
   * 
   */
  @RequestLine("POST /dolor/bearerSecurity")
  @Headers({
    "Accept: application/json",
  })
  void dolorBearerSec();
}

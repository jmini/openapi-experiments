package fr.jmini.openapi.openapitools.feign.api;

import feign.Headers;
import feign.RequestLine;
import fr.jmini.openapi.openapitools.feign.ApiClient;


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

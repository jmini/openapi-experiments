package fr.jmini.openapi.openapitools.api.impl;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import java.util.Map;
import fr.jmini.openapi.openapitools.model.Order;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class StoreApiServiceImpl implements StoreApi {
      public Response deleteOrder(String orderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getInventory(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getOrderById(String orderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response placeOrder(Order order,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}

package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;


import java.util.Map;
import fr.jmini.openapi.openapitools.model.Order;

import java.util.List;
import fr.jmini.openapi.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface StoreApiService {
      Response deleteOrder(String orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getInventory(SecurityContext securityContext)
      throws NotFoundException;
      Response getOrderById(String orderId,SecurityContext securityContext)
      throws NotFoundException;
      Response placeOrder(Order order,SecurityContext securityContext)
      throws NotFoundException;
}

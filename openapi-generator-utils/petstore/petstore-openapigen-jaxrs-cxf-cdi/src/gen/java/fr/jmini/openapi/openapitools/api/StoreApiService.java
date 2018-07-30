package fr.jmini.openapi.openapitools.api;

import fr.jmini.openapi.openapitools.api.*;
import fr.jmini.openapi.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import fr.jmini.openapi.openapitools.model.Order;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface StoreApiService {
      public Response deleteOrder(String orderId, SecurityContext securityContext);
      public Response getInventory(SecurityContext securityContext);
      public Response getOrderById(String orderId, SecurityContext securityContext);
      public Response placeOrder(Order order, SecurityContext securityContext);
}

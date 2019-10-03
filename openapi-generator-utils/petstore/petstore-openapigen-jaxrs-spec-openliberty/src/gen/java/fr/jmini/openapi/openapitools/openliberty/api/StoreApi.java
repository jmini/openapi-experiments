package fr.jmini.openapi.openapitools.openliberty.api;

import java.util.Map;
import fr.jmini.openapi.openapitools.openliberty.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/store")
public class StoreApi {

    @DELETE
    @Path("/order/{orderId}")
    public Response deleteOrder(@PathParam("orderId") String orderId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/inventory")
    @Produces({ "application/json", "application/xml" })
    public Response getInventory() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/order/{orderId}")
    @Produces({ "application/json", "application/xml" })
    public Response getOrderById(@PathParam("orderId") String orderId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/order")
    @Produces({ "application/json", "application/xml" })
    public Response placeOrder(@Valid Order order) {
        return Response.ok().entity("magic!").build();
    }
}

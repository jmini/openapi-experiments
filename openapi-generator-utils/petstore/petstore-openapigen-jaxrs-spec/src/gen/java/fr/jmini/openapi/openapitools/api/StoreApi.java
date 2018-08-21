package fr.jmini.openapi.openapitools.api;

import java.util.Map;
import fr.jmini.openapi.openapitools.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/store")
@Api(description = "the store API")
public class StoreApi {

    @DELETE
    @Path("/order/{orderId}")
    @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", response = Void.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    public Response deleteOrder(@PathParam("orderId") @ApiParam("ID of the order that needs to be deleted") String orderId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/inventory")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map")
    })
    public Response getInventory() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/order/{orderId}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", response = Order.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class)
    })
    public Response getOrderById(@PathParam("orderId") @ApiParam("ID of pet that needs to be fetched") String orderId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/order")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class, tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order", response = Void.class)
    })
    public Response placeOrder(@Valid Order order) {
        return Response.ok().entity("magic!").build();
    }
}

package io.swagger.sample.resource;

import io.swagger.sample.exception.ApiException;
import io.swagger.sample.exception.BadRequestException;
import io.swagger.sample.exception.NotFoundException;
import io.swagger.sample.model.ApiResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class SampleExceptionMapper implements ExceptionMapper<Exception> {
    public Response toResponse(Exception exception) {
        if (exception instanceof javax.ws.rs.WebApplicationException) {
            javax.ws.rs.WebApplicationException e = (javax.ws.rs.WebApplicationException) exception;
            return Response.status(e.getResponse().getStatus()).entity(new ApiResponse(e.getResponse().getStatus(), exception.getMessage())).build();
        }
        else if (exception instanceof com.fasterxml.jackson.core.JsonParseException) {
            return Response.status(400).entity(new ApiResponse(400, "bad input")).build();
        }
        else if (exception instanceof NotFoundException) {
            return Response.status(Status.NOT_FOUND).entity(new ApiResponse(ApiResponse.ERROR, exception.getMessage())).build();
        }
        else if (exception instanceof BadRequestException) {
            return Response.status(Status.BAD_REQUEST).entity(new ApiResponse(ApiResponse.ERROR, exception.getMessage())).build();
        }
        else if (exception instanceof ApiException) {
            return Response.status(Status.BAD_REQUEST).entity(new ApiResponse(ApiResponse.ERROR, exception.getMessage())).build();
        }
        else {
            return Response.status(500).entity(new ApiResponse(500, "something bad happened")).build();
        }
    }
}
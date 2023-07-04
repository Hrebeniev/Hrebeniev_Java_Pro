package com.hillel.hrebeniev.homeworks.homework_29;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;


@Path("/orders")
public class OrderController {
    private final OrderService service = new OrderService();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addOrder(Order order) {
        return Response.ok(service.addOrder(order)).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrderById(@PathParam("id") UUID id) {
        return Response.ok(service.getOrderById(id)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrders() {
        return Response.ok(service.getAllOrders()).build();
    }
}
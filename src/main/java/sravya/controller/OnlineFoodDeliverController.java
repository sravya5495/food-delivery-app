package sravya.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Controller;

import sravya.commonVO..Destination;
import sravya.commonVO..Menu;
import sravya.commonVO..OrderDetails;
import sravya.commonVO..Restaurant;

@Controller
public class OnlineFoodDeliverController {

	@Inject
	private OnlineFoodDeliveryCommonService onlineFoodDeliveryCommonService;   

	@GET
	@Path("/get-desired-destination/{origin}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDesiredDestination(@PathParam("origin") Long originId, @Context HttpHeaders headers){
		List<Destination> destination=onlineFoodDeliveryCommonService.getDesiredDestination(originId);
		return Response.status(Status.ACCEPTED).entity(destination).build();
	}

	@GET
	@Path("/get-restaurants/{destinationId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRestaurants(@PathParam("destinationId") Long destinationId, @Context HttpHeaders headers){
		List<Restaurant> restaurants=onlineFoodDeliveryCommonService.getRestaurantsByDestinationId(destinationId);
		return Response.status(Status.ACCEPTED).entity(restaurants).build();
	}

	@POST
	@Path("/order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response order(OrderDetails orderDetails, @Context HttpHeaders headers){
		OrderDetails order=onlineFoodDeliveryCommonService.order(orderDetails);
		return Response.status(Status.ACCEPTED).entity(order).build();
	}

	@PUT
	@Path("/order/{orderId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateOrder(OrderDetails orderDetails,@PathParam("orderId") String orderId, @Context HttpHeaders headers){
		OrderDetails order=onlineFoodDeliveryCommonService.updateOrder(orderDetails);
		return Response.status(Status.ACCEPTED).entity(order).build();
	}

	@GET
	@Path("/order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrder(@PathParam("orderId") Long orderId,@Context HttpHeaders headers){
		OrderDetails order=onlineFoodDeliveryCommonService.getOrder(orderId);
		return Response.status(Status.ACCEPTED).entity(order).build();
	}
}

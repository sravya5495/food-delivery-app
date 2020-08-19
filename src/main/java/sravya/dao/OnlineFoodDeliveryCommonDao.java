package sravya.dao;

import java.util.List;

import sravya.entity.Destination;
import sravya.entity.OrderDetails;
import sravya.entity.Restaurant;

public interface OnlineFoodDeliveryCommonDao {
	public List<Destination> getDesiredDestination(Long originId);
	public List<Restaurant> getRestaurantsByDestinationId(Long destinationId);
	public OrderDetails saveOrder(OrderDetails orderDetails);
	public OrderDetails updateOrder(OrderDetails orderDetails);
	public OrderDetails getOrder(Long orderId);
}

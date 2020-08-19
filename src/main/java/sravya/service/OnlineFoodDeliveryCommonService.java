package sravya.service;

import java.util.List;

import sravya.commonVO.Destination;
import sravya.commonVO.Menu;
import sravya.commonVO.OrderDetails;
import sravya.commonVO.Restaurant;

public interface OnlineFoodDeliveryCommonService {

	public List<Destination> getDesiredDestination(Long originId);
	public List<Restaurant> getRestaurantsByDestinationId(Long destinationId);
	public OrderDetails order(OrderDetails orderDetails);
	public OrderDetails updateOrder(OrderDetails orderDetails);
	public OrderDetails getOrder(Long orderId);
}

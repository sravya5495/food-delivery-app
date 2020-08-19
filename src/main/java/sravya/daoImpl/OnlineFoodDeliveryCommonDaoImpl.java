package sravya.daoImpl;

import java.util.List;

import javax.inject.Inject;

import sravya.entity.Destination;
import sravya.repo.DestinationRepository;
import sravya.entity.OrderDetails;
import sravya.repo.OrderDetailsRepository;
import sravya.entity.Restaurant;
import sravya.repo.RestaurantRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OnlineFoodDeliveryCommonDaoImpl implements OnlineFoodDeliveryCommonDao{

	@Inject
	private DestinationRepository restinationRepo;
	@Inject
	private RestaurantRepository restaurantRepo;
	@Inject 
	private OrderDetailsRepository orderDetailsRepo;

	@Override
	public List<Destination> getDesiredDestination(Long originId) {
		return restinationRepo.findByOriginId(originId);
	}

	@Override
	public List<Restaurant> getRestaurantsByDestinationId(Long destinationId) {
		return restaurantRepo.findById(destinationId);
	}


	@Override
	public OrderDetails saveOrder(OrderDetails orderDetails) {
		return orderDetailsRepo.save(orderDetails);
	}

	@Override
	public OrderDetails updateOrder(OrderDetails orderDetails) {
		return orderDetailsRepo.save(orderDetails);
	}

	@Override
	public OrderDetails getOrder(Long orderId) {
		return orderDetailsRepo.getOne(orderId);
	}

}

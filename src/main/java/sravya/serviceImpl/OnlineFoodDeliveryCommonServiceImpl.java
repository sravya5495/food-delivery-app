package sravya.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import sravya.commonVO.Destination;
import sravya.commonVO.OrderDetails;
import sravya.commonVO.Restaurant;

@Component
public class OnlineFoodDeliveryCommonServiceImpl implements OnlineFoodDeliveryCommonService {
	
	 @Inject 
	 private OnlineFoodDeliveryCommonDao onlineFoodDeliveryCommonDao;
	 
	@Override
	public List<Destination> getDesiredDestination(Long originId) {
		
		List<sravya.entity.Destination> listOfDestinations =onlineFoodDeliveryCommonDao.getDesiredDestination(originId);
		List<Destination> listOfDestinationsVo=new ArrayList<Destination>();
        //TODO: Copy data from listOfDestinations to listOfDestinationsVo 
		return listOfDestinationsVo;
	}

	@Override
	public List<Restaurant> getRestaurantsByDestinationId(Long destinationId) {
		List<sravya.entity.Restaurant> restaurants=onlineFoodDeliveryCommonDao.getRestaurantsByDestinationId(destinationId);
		List<Restaurant> listOfRestaurants=new ArrayList<Restaurant>();
		//Copy restaurants data to listOfRestaurants;
		return listOfRestaurants;
	}


	@Override
	public OrderDetails order(OrderDetails orderDetails) {
		sravya.entity.OrderDetails beforePersist = new sravya.entity.OrderDetails();
		//copy orderDetailsto object beforePersist to persist into db.
		sravya.entity.OrderDetails order=onlineFoodDeliveryCommonDao.saveOrder(beforePersist);
		OrderDetails orderDetailsVo =new OrderDetails();
		//Copy order data to orderDetailsVo;
		return orderDetailsVo;
	}

	@Override
	public OrderDetails getOrder(Long orderId) {
		sravya.entity.OrderDetails order=onlineFoodDeliveryCommonDao.getOrder(orderId);
		OrderDetails orderDetailsVo =new OrderDetails();
		//Copy order data to orderDetailsVo;
		return orderDetailsVo;
	}
	@Override
	public OrderDetails updateOrder(OrderDetails orderDetails) {
		sravya.entity.OrderDetails beforePersist= new sravya.entity.OrderDetails();
		//copy orderDetailsto object beforePersist to persist into db.
		sravya.entity.OrderDetails order=onlineFoodDeliveryCommonDao.updateOrder(beforePersist);
		OrderDetails orderDetailsVo =new OrderDetails();
		//Copy order data to orderDetailsVo;
		return orderDetailsVo;
	}

	

}

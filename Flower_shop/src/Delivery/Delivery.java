package Delivery;

import java.util.List;

public class Delivery {
	
	DeliveryStrategy deliveryStrategy;
	
	public Delivery(DeliveryStrategy delivery) {
		this.deliveryStrategy = delivery ;
	}
	
	public boolean delivery(List products) {
		return deliveryStrategy.deliver(products);
	}
	
}

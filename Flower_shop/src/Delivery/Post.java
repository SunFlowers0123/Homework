package Delivery;

import java.util.List;

public class Post  implements DeliveryStrategy {
	
	@Override
	public boolean deliver(List list) {
		System.out.println("Products will be delivered");
		return true;
	}
	
	
}

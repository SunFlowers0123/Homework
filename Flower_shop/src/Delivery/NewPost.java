package Delivery;

import java.util.List;

public class NewPost implements DeliveryStrategy {
	
	@Override
	public boolean deliver(List list) {
		System.out.println("Products will be delivered");
		return true;
	}

}

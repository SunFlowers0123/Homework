package Payment;

import java.util.List;


public class Payment {
	PaymentStrategy paymentStrategy;
	
	public Payment(PaymentStrategy payment) {
		this.paymentStrategy = payment ;
	}
	
	public boolean pay() {
		return paymentStrategy.pay();
	}
	
}

package Payment;

public class Paypal implements PaymentStrategy {
	
	@Override
	public boolean pay() {
		return true;
	}
	
}

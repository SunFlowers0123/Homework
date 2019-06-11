package Payment;

public class Cash implements PaymentStrategy {
	
	@Override
	public boolean pay() {
		return true;
	}
	
}

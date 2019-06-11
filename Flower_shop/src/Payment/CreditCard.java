package Payment;

public class CreditCard implements PaymentStrategy {
	
	@Override
	public boolean pay() {
		return true;
	}

}

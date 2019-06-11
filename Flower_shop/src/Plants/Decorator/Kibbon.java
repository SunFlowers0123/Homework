package Plants.Decorator;

import Plants.Product;

public class Kibbon extends Product {
	
	private Product product;
	
	public Kibbon(String nameKibbon , Product product , double priceKibbon) {
		super(nameKibbon , priceKibbon);
		this.product = product;
	}

	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public double getPrice() {
		return super.getPrice();
	}
	
	private double getTotalPrice() {
		return super.getPrice() + product.getPrice();
	}
	
	@Override
	public String getDescription() {
		return String.format("Name : %s Price : %.2f   %s Total price  %.2f  ",getName() , getPrice(), 
				product.getDescription() ,getTotalPrice() );	
	}

	
}

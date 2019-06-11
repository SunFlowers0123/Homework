package Plants.Decorator;

import Plants.Product;

public class Paper extends Product {
	
	private Product product;
	
	public Paper(String namePaper , Product product , double pricePaper) {
		super(namePaper , pricePaper);
		this.product = product;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() ;
	}
	
	private double getTotalPrice() {
		return super.getPrice() + product.getPrice();
	}
	
	
	@Override
	public String getDescription() {
		return String.format("Name : %s Price : %.2f   %s  Total price : %.2f ",getName() , getPrice(), 
				product.getDescription() , getTotalPrice() );
		
	}
	
}

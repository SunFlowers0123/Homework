package Plants.Decorator;

import Plants.Product;

public class Kibbon extends Product {
	
	private Product product;
	private String name;
	
	public Kibbon(String nameKibbon , Product product , double priceKibbon) {
		super(nameKibbon , priceKibbon);
		this.product = product;
		this.name = nameKibbon;
	}

	@Override
	public String getName() {
		return super.getName();
	}
	
	private String getNamePaper() {
		return name;
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
	
//		return String.format("Name : %s Price : %.2f   %s Total price  %.2f  Name goods : %s Price goods : %.2f",getName() , getPrice(), 
//				product.getDescription() ,getTotalPrice() , getNamePaper() , super.getPrice());	

	}

	
}

package Plants.Decorator;

import Plants.Product;

public abstract class GoodsDecorator extends Product {
	
	private Product product; 
	
	public GoodsDecorator(String nameGoods , Product product ,  double priceGoods) {
	
		super(nameGoods , priceGoods) ;
		this.product = product;
		
	}
	
	@Override
	public String getName() {
		return product.getName();
	}

	@Override
	public double getPrice() {
		return product.getPrice();
	}
	
	
}

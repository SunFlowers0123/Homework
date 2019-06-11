package Plants;

import java.util.LinkedList;
import java.util.List;


public class FlowerBouequet extends Product {
	
	private List<Flower> flowers = new LinkedList(); 
	
	public FlowerBouequet(String nameBoueqet , double priceBouequet) {
		super(nameBoueqet , priceBouequet);
	}
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}
	
	public void addFlowers(List flowers) {
		flowers.addAll(flowers);
	}
	
	@Override
	public double getPrice() {
		return bouquetSum();
	}
	
	public List<Flower> getBouequet(){
		return flowers;
	}
	
	public Double bouquetSum() {
		return flowers.stream()
		.map(Product::getPrice)
		.mapToDouble(Double::doubleValue)
		.sum();
	}
	
	@Override 
	public String getDescription() {
		return String.format(" Name : %s  Price : %.2f",getName() , getPrice());
		
	}

	@Override
	public String toString() {
		return "FlowerBouequet [flowers=" + flowers +  "]";
	}
	
	
}

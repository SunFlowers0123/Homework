package Plants;

import Property.Property;

public class Flowerpot extends Plant{

	public Flowerpot(String nameFlower , Property propertyFlower ,double price  ) {
		
		super(nameFlower, propertyFlower , price);
		
	}
	

	@Override
	public String getDescription() {
		return "Name " + getName() + " " +  super.getDescription() + " Price : " + getPrice() ;
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() ;
	}
	
	@Override
	public String toString() {
		return String.format("Name : %s Describe - %s  \n Price %s ", getName() , getDescription() , getPrice());
	}
	
	

	
}

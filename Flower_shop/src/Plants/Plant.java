package Plants;

import Property.Property;

public abstract class Plant extends Product {

	private String namePlant;
	private Property property;
	private double price;
	
	public Plant(String namePlant , Property property , double price) {
		
		super(namePlant , price);
		this.namePlant = namePlant ;
		this.property = property ;
		this.price = price ;

	}
	
	public String getNamePlant() {
		return namePlant;
	}
	
	public String getProperty () {
		return property.getDescription();
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String getDescription() {
		return property.getDescription();
	}
	
}

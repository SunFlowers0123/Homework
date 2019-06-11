package Property;

import Enums.ESizePlant;

public class PropertyChamomile extends Property{

	private int ageFlower;
	private int numberLeaf;
	private ESizePlant sizePlant;
	
	public PropertyChamomile(int ageFlower , int numberLeaf , ESizePlant sizePlant) {
	
		this.ageFlower = ageFlower;
		this.numberLeaf = numberLeaf;
		this.sizePlant = sizePlant;
		
	}
	
	public int getAgeFlower() {
		return ageFlower;
	}
	
	public int getNumberLeaf() {
		return numberLeaf;
	}

	public ESizePlant getSizePlant() {
		return sizePlant;
	}
	
	@Override
	public String getDescription() {
		return  "Number of throrns : " + getNumberLeaf() + " Age plant : " + getAgeFlower() + "  Size Plant : " + getSizePlant() ;
	}
	
	
	@Override
	boolean equals(Property property) {
		
		if (property instanceof PropertyChamomile) {
			return  property.getDescription().equals(getDescription());
	    }
		return false;
	}
	
}





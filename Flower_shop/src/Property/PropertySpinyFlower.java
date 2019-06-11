package Property;

import Enums.EColor;
import Enums.ESizePlant;

public class PropertySpinyFlower extends Property {
	
	private int ageFlower;
	private int numberOfThorns;
	private ESizePlant sizePlant;
	private EColor color;
	
	public PropertySpinyFlower(int ageFlower , int numberOfThorns , ESizePlant sizePlant , EColor color) {
		
		this.ageFlower = ageFlower;
		this.numberOfThorns = numberOfThorns;
		this.sizePlant = sizePlant;
		this.color = color;
		
	}
	
	public int getNumberThorns() {
		return numberOfThorns;
	}
	
	public ESizePlant getSizePlant() {
		return sizePlant;
	}
	
	public EColor getColor() {
		return color;
	}
	
	@Override
	public String getDescription() {
		return "Number of throrns : " + getNumberThorns() + "  Size Plant : " + getSizePlant() + "   Color : " + getColor();
	}
	
	@Override
	boolean equals(Property property) {
		
		if (property instanceof PropertySpinyFlower) {
			return property.getDescription().equals(getDescription());
	    }
		return false;
	}
	
	
}

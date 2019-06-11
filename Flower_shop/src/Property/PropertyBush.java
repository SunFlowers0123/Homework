package Property;

import Enums.ESizePlant;

public class PropertyBush extends Property{

	private int ageTree;
	private ESizePlant sizePlant;

	public PropertyBush(int ageTree , ESizePlant sizeTree ) {
		
		this.ageTree = ageTree;
		this.sizePlant = sizeTree;
		
	}
	
	public int getAgeTree() {
		return ageTree;
	}
	
	public ESizePlant getSizePlant() {
		return sizePlant;
	}
	
	@Override
	public String getDescription() {
		return "Age of tree : "  + getAgeTree() + " Size Plant : " + getSizePlant();
	}
	
	
	@Override
	boolean equals(Property property) {
		
		if (property instanceof PropertyBush) {
			return property.getDescription().equals(getDescription());
	    }
		return false;
	}
	
}

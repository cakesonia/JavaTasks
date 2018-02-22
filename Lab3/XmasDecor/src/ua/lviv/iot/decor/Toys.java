package ua.lviv.iot.decor;

import ua.lviv.iot.decor.enums.MaterialOfToys;
import ua.lviv.iot.decor.enums.TypeOfToys;

public class Toys extends Decoration {
	
	public Toys(String decorType) {
		super(decorType);
	}
	
	protected TypeOfToys typeOfToys;
	protected MaterialOfToys materialOfToys;
	
	public Toys (String decorType, TypeOfToys typeOfToys, MaterialOfToys materialOfToys) {
		super(decorType);
	}
}

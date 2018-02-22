/**
 * 
 */
package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.MaterialOfToys;
import ua.lviv.iot.decor.enums.TypeOfToys;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Toys extends Decoration {

	private MaterialOfToys materialOfToys;
	private TypeOfToys typeOfToys;

	public Toys(String decorType) {
		super(decorType);
	}

	public Toys(String decorType, TypeOfToys typeOfToys, MaterialOfToys materialOfToys) {
		super(decorType);
		this.setMaterialOfToys(materialOfToys);
        this.setTypeOfToys(typeOfToys);	
	}

	public MaterialOfToys getMaterialOfToys() {
		return materialOfToys;
	}

	public TypeOfToys getTypeOfToys() {
		return typeOfToys;
	}

	public void setMaterialOfToys(MaterialOfToys materialOfToys) {
		this.materialOfToys = materialOfToys;
	}

	public void setTypeOfToys(TypeOfToys typeOfToys) {
		this.typeOfToys = typeOfToys;
	}

}

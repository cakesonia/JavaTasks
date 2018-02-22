/**
 * 
 */
package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.MaterialOfWreath;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Wreath extends Decoration {
	
	private MaterialOfWreath materialOfWreath;
	private int radius;

	public Wreath(String decorType) {
		super(decorType);
	}

	public Wreath(String decorType, int radius, MaterialOfWreath materialOfWreath) {
		super(decorType);
		this.radius = radius;
		this.materialOfWreath = materialOfWreath;
	}

	public MaterialOfWreath getMaterialOfWreath() {
		return materialOfWreath;
	}

	public int getRadius() {
		return radius;
	}

	public void setMaterialOfWreath(MaterialOfWreath materialOfWreath) {
		this.materialOfWreath = materialOfWreath;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

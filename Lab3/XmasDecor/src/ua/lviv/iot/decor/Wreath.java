/**
 * 
 */
package ua.lviv.iot.decor;

import ua.lviv.iot.decor.enums.MaterialOfWreath;


/**
 * @author Dell
 *
 */

public class Wreath extends Decoration {
    public int radius;

    protected MaterialOfWreath materialOfWreath; 
    
	public Wreath(String decorType) {
		super(decorType);
	}

	public Wreath(String decorType, int radius, MaterialOfWreath materialOfWreath) {
		super(decorType);
		this.radius = radius;
		this.materialOfWreath = materialOfWreath;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

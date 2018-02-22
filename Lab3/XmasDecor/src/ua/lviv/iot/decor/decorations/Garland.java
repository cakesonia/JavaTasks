/**
 * 
 */
package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Garland extends Decoration {

	private Color color;

	private int length;

	public Garland(String decorType) {
		super(decorType);
	}

	public Garland(String decorType, Color color, int length) {
		super(decorType);
		this.color = color;
		this.length = length;
	}

	public Garland(String decorType, int length, Color color) {
		super(decorType);
		this.length = length;
	}

	public Color getColor() {
		return color;
	}

	public int getLength() {
		return length;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setLength(int length) {
		this.length = length;
	}

}

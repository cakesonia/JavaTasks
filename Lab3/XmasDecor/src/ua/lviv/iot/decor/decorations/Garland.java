/**
 * 
 */
package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

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

	public Garland(String decorType, int length, Color color) {
		super(decorType, TypeOfDecorations.GARLAND);
		this.color = color;
		this.length = length;
	}

	public Garland(String decorType, TypeOfDecorations typeOfDecorations) {
		super(decorType, typeOfDecorations);
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

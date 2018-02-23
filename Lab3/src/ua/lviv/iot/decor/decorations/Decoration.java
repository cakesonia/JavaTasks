/**
 * 
 */
package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Decoration {

	private String decorType;
	private TypeOfDecorations typeOfDecorations;

	public Decoration(String decorType) {
		super();
		this.decorType = decorType;
	}

	public Decoration(String decorType, TypeOfDecorations typeOfDecorations) {
		super();
		this.decorType = decorType;
		this.typeOfDecorations = typeOfDecorations;
	}

	public String getDecorType() {
		return decorType;
	}

	public TypeOfDecorations getTypeOfDecorations() {
		return typeOfDecorations;
	}

	public void setDecorType(String decorType) {
		this.decorType = decorType;
	}

	public void setTypeOfDecorations(TypeOfDecorations typeOfDecorations) {
		this.typeOfDecorations = typeOfDecorations;
	}

	public String toString() {
		return typeOfDecorations + "";
	}

}

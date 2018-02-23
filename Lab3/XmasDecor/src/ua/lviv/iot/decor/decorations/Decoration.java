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

	private String decorationPlace;
	private TypeOfDecorations typeOfDecorations;

	public Decoration(String decorationPlace) {
		super();
		this.decorationPlace = decorationPlace;
	}

	public Decoration(String decorationPlace, TypeOfDecorations typeOfDecorations) {
		super();
		this.decorationPlace = decorationPlace;
		this.typeOfDecorations = typeOfDecorations;
	}

	public String getDecorationPlace() {
		return decorationPlace;
	}

	public TypeOfDecorations getTypeOfDecorations() {
		return typeOfDecorations;
	}

	public void setDecorationPlace(String decorationPlace) {
		this.decorationPlace = decorationPlace;
	}

	public void setTypeOfDecorations(TypeOfDecorations typeOfDecorations) {
		this.typeOfDecorations = typeOfDecorations;
	}

	public String toString() {
		return typeOfDecorations + "";
	}

}

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

    Decoration(final String decorationPlace) {
        super();
        this.decorationPlace = decorationPlace;
    }

    Decoration(final String decorationPlace, final TypeOfDecorations typeOfDecorations) {
        super();
        this.decorationPlace = decorationPlace;
        this.typeOfDecorations = typeOfDecorations;
    }

    public final String getDecorationPlace() {
        return decorationPlace;
    }

    public final String toString() {
        return typeOfDecorations + "";
    }

}

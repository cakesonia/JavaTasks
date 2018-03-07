package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Decoration {
    private String decorationPlace;
    private TypeOfDecorations typeOfDecorations;

    Decoration(final String decorationPlace, final TypeOfDecorations typeOfDecorations) {
        super();
        this.decorationPlace = decorationPlace;
        this.typeOfDecorations = typeOfDecorations;
    }

    public final String getDecorationPlace() {
        return decorationPlace;
    }
}

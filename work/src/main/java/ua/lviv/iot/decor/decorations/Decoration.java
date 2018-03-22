package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Decoration {
    private String decorationPlace;
    private TypeOfDecorations typeOfDecorations;
    private Color color;

    Decoration(final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color) {
        super();
        this.decorationPlace = decorationPlace;
        this.typeOfDecorations = typeOfDecorations;
        this.color = color;
    }

    public final String getDecorationPlace() {
        return decorationPlace;
    }

    public String getHeaders() {
        return "decoration place, " + "type of decorations, " + " color, ";
    }

    public String toCSV() {
        return decorationPlace + "," + typeOfDecorations + "," + color + ",";
    }
}

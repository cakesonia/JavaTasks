package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Lighting extends Decoration {

    private int length;
    private int quantityOfLamps;

    public Lighting(final String decorationPlace, TypeOfDecorations typeOfDecorations, Color color, int length,
                    int quantityOfLamps) {
        super(decorationPlace, TypeOfDecorations.LIGHTING);
        this.quantityOfLamps = quantityOfLamps;
        this.length = length;
    }

    /*public String toString() {
        return TypeOfDecorations.LIGHTING + ": color " + Color.BLUE + ", length = " + length
                + ", quantity of lamps = " + quantityOfLamps + "\n";
    }*/
}

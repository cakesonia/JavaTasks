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

    public Lighting(final String decorationPlace, final TypeOfDecorations typeOfDecorations,
                    final Color color, final int length, final int quantityOfLamps) {
        super(decorationPlace, TypeOfDecorations.LIGHTING, Color.BLUE);
        this.quantityOfLamps = quantityOfLamps;
        this.length = length;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "length, " + "quantity of lamps";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + length + "," + quantityOfLamps;
    }

    /*public String toString() {
        return TypeOfDecorations.LIGHTING + ": color " + Color.BLUE + ", length = " + length
                + ", quantity of lamps = " + quantityOfLamps + "\n";
    }*/
}

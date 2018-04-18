package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Garland extends Decoration {

    private int length;

    public Garland(final Integer id, final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color,
                   final int length) {
        super(id, decorationPlace, TypeOfDecorations.GARLAND, Color.RED);
        this.length = length;
    }

    public final int getLength(){
        return length;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "length";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + length;
    }

    /*public String toString() {
        return TypeOfDecorations.GARLAND + ": color " + Color.RED + ", length = " + length
                + "\n";
    }*/

}

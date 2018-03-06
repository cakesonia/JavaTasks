package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

public class Garland extends Decoration {

    private int length = 10;

    public Garland(String decorationPlace, TypeOfDecorations typeOfDecorations, Color color, int length) {
        super(decorationPlace, TypeOfDecorations.GARLAND);
        this.length = length;
    }

    /*public String toString() {
        return TypeOfDecorations.GARLAND + ": color " + Color.RED + ", length = " + length
                + "\n";
    }*/

}

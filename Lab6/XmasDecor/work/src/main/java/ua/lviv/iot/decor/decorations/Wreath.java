package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.MaterialOfWreath;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

public class Wreath extends Decoration {

    private double radius;

    public Wreath(final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color,
                  final MaterialOfWreath materialOfWreath, final double radius) {
        super(decorationPlace, TypeOfDecorations.WREATH);
        this.radius = radius;
    }

    /*public String toString() {
        return TypeOfDecorations.WREATH + ": color " + Color.GREEN + ", material of wreath "
                + MaterialOfWreath.CONES + ", radius = " + radius + "\n";
    }*/
}

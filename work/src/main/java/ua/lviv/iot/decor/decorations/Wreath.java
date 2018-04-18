package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.MaterialOfWreath;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Wreath extends Decoration {

    private double radius = 0.5;
    private MaterialOfWreath materialOfWreath;

    public Wreath(final Integer id, final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color,
                  final MaterialOfWreath materialOfWreath, final double radius) {
        super(id, decorationPlace, TypeOfDecorations.WREATH, Color.GREEN);
        this.radius = radius;
        this.materialOfWreath = materialOfWreath;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "material of wreath, " + "radius";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + materialOfWreath + "," + radius;
    }

    /*public String toString() {
        return TypeOfDecorations.WREATH + ": color " + Color.GREEN + ", material of wreath "
                + MaterialOfWreath.CONES + ", radius = " + radius + "\n";
    }*/
}

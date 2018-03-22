package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.MaterialOfToys;
import ua.lviv.iot.decor.enums.TypeOfDecorations;
import ua.lviv.iot.decor.enums.TypeOfToys;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class Toys extends Decoration {

    private MaterialOfToys materialOfToys;
    private TypeOfToys typeOfToys;

    public Toys(final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color,
                final MaterialOfToys materialOfToys, final TypeOfToys typeOfToys) {
        super(decorationPlace, TypeOfDecorations.TOYS, Color.YELLOW);
        this.materialOfToys = materialOfToys;
        this.typeOfToys = typeOfToys;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "material of toys, " + "type of toys";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + materialOfToys + "," + typeOfToys;
    }

    /*public String toString() {
        return TypeOfDecorations.TOYS + ": color " + Color.YELLOW + ", material of toys "
                + MaterialOfToys.GLASS + ", type of toys " + TypeOfToys.ROUND + "\n";
    }*/
}

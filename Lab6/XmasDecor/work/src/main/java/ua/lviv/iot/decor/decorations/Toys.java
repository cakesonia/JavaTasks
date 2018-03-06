package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.*;

public class Toys extends Decoration {

    public Toys(final String decorationPlace, TypeOfDecorations typeOfDecorations, Color color,
                MaterialOfToys materialOfToys, TypeOfToys typeOfToys) {
        super(decorationPlace, TypeOfDecorations.TOYS);
    }

    /*public String toString() {
        return TypeOfDecorations.TOYS + ": color " + Color.YELLOW + ", material of toys "
                + MaterialOfToys.GLASS + ", type of toys " + TypeOfToys.ROUND + "\n";
    }*/
}

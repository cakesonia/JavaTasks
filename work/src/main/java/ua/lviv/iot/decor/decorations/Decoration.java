package ua.lviv.iot.decor.decorations;

import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.TypeOfDecorations;

import javax.persistence.*;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */

public class Decoration {

    private Integer id;

    private String decorationPlace;

    private TypeOfDecorations typeOfDecorations;

    private Color color;

    public Decoration() {
    }

    public Decoration(final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color) {
        super();
        this.decorationPlace = decorationPlace;
        this.typeOfDecorations = typeOfDecorations;
        this.color = color;
    }

    public Decoration(final Integer id, final String decorationPlace, final TypeOfDecorations typeOfDecorations, final Color color) {
        super();
        this.decorationPlace = decorationPlace;
        this.typeOfDecorations = typeOfDecorations;
        this.color = color;
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeOfDecorations getTypeOfDecorations() {
        return typeOfDecorations;
    }

    public void setTypeOfDecorations(TypeOfDecorations typeOfDecorations) {
        this.typeOfDecorations = typeOfDecorations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public final String getDecorationPlace() {
        return decorationPlace;
    }

    public void setDecorationPlace(String decorationPlace) {
        this.decorationPlace = decorationPlace;
    }

    public String getHeaders() {
        return "decoration place, " + "type of decorations, " + " color, ";
    }

    public String toCSV() {
        return decorationPlace + "," + typeOfDecorations + "," + color + ",";
    }
}

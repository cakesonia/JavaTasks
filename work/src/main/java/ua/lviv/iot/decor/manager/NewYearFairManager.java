package ua.lviv.iot.decor.manager;

import ua.lviv.iot.decor.decorations.Decoration;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NewYearFairManager {
    class DecorTypeComparator implements Comparator<Decoration> {
        @Override
        public int compare(final Decoration decor0, final Decoration decor1) {
            return decor0.getDecorationPlace().compareTo(decor1.getDecorationPlace());
        }
    }

    private List<Decoration> decorations = new LinkedList<>();

    private List<Decoration> parameterDecorationsList = new LinkedList<>();

    public NewYearFairManager() {
    }

    /**
     * Constructor
     *
     * @param decorations              is list of decorations
     * @param parameterDecorationsList list of found decorations
     */
    public NewYearFairManager(final List<Decoration> decorations, final List<Decoration> parameterDecorationsList) {
        super();
        this.decorations = decorations;
        this.parameterDecorationsList = parameterDecorationsList;
    }

    public final void addDecoration(final Decoration decoration) {
        this.decorations.add(decoration);

    }

    public final List<Decoration> getDecorations() {
        return decorations;
    }

    public final List<Decoration> getParameterDecorationsList() {
        return parameterDecorationsList;
    }

    /**
     * Search decorations by type of decoration
     *
     * @param decorationPlaces is type of decoration
     * @return decorations list with found decorations
     */

    public final List<Decoration> searchByDecorationPlace(final String... decorationPlaces) {
        for (Decoration decoration : decorations) {
            /*
             * if (decorations.get(i).getDecorType().equalsIgnoreCase(decorType)) {
             * parameterDecorationsList.add(decorations.get(i)); }
             */
            for (String string : decorationPlaces) {
                if (decoration.getDecorationPlace().equalsIgnoreCase(string)) {
                    parameterDecorationsList.add(decoration);
                }
            }
        }
        return parameterDecorationsList;
    }

    public final void setDecorations(final List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public final void setParameterDecorationsList(final List<Decoration> parameterDecorationsList) {
        this.parameterDecorationsList = parameterDecorationsList;
    }

    public final List<Decoration> sortByDecorType() {

        decorations.sort(new DecorTypeComparator());
        return decorations;
    }

}

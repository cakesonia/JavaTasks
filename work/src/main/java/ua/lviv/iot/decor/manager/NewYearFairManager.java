package ua.lviv.iot.decor.manager;

import ua.lviv.iot.decor.decorations.Decoration;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */
public class NewYearFairManager {
    private List<Decoration> decorationList = new LinkedList<>();


    public NewYearFairManager() {
    }

    public final List<Decoration> getDecorationList() {
        return decorationList;
    }

    /**
     * Add decoration to decoration's list
     *
     * @param decoration object of the parent class of all decorations
     */
    public final void addDecoration(final Decoration decoration) {
        this.decorationList.add(decoration);
    }

    /**
     * Search decorations by decoration place
     *
     * @param decorationPlaces is places which can be decorated by decorations
     * @return list with found decorations
     */

    public final List<Decoration> searchByDecorationPlace(final String decorationPlaces) {
        List<Decoration> resultList = new LinkedList<>();
        for (Decoration decoration : decorationList) {
            if (decoration.getDecorationPlace().equalsIgnoreCase(decorationPlaces)) {
                resultList.add(decoration);
            }
        }
        return resultList;
    }

    /**
     * Sort decoration by decoration place
     *
     * @param resultList is list with found decorations
     * @return list with found and sorted decorations
     */
    public final List<Decoration> sortByDecorationPlace(final List<Decoration> resultList) {
        resultList.sort(Comparator.comparing(Decoration::getDecorationPlace));
        return resultList;
    }
}

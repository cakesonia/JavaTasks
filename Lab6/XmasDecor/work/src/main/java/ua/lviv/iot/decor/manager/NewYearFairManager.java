package ua.lviv.iot.decor.manager;

import ua.lviv.iot.decor.decorations.Decoration;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NewYearFairManager {
    private List<Decoration> decorations = new LinkedList<>();

    public NewYearFairManager() {
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    /**
     * Search decorations by type of decoration
     *
     * @param decorationPlaces is type of decoration
     * @return decorations list with found decorations
     */

    public List<Decoration> searchByDecorationPlace(final String decorationPlaces) {
        List<Decoration> resultList = new LinkedList<>();
        for (Decoration decoration : decorations) {
            if (decoration.getDecorationPlace().equalsIgnoreCase(decorationPlaces)) {
                resultList.add(decoration);
            }
        }
        return resultList;
    }

    public final List<Decoration> sortByDecorType(final List<Decoration> parameterDecorationsList) {
        parameterDecorationsList.sort(Comparator.comparing(Decoration::getDecorationPlace));
        return parameterDecorationsList;
    }
}

package ua.lviv.iot.decor.manager;

import ua.lviv.iot.decor.decorations.Decoration;
import ua.lviv.iot.decor.persistence.dao.DecorationDao;

import javax.enterprise.context.Dependent;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sonia
 * @version 3.0
 * @since 2018-03-06
 */

public class NewYearFairManager implements Serializable {

    private static final long serialVersionUID = 1L;

    public DecorationDao decorationDao;

    private static Map<Integer, Decoration> decorationMap = new HashMap<>();

    public NewYearFairManager() {
    }

    public Map<Integer, Decoration> getDecorationMap() {
        return decorationMap;
    }

    public void setDecorationMap(Map<Integer, Decoration> decorationList) {
        NewYearFairManager.decorationMap = decorationList;
    }

    public Decoration getDecoration(Integer id) {
        return decorationDao.findById(id);
    }

    public final void addDecoration(final Decoration newDecoration) {
        decorationDao.persist(newDecoration);
    }

    public  void updateDecoration(Decoration newDecoration) {
        decorationDao.update(newDecoration);
    }

    public  void deleteDecoration(Integer id) {
        decorationDao.delete(id);
    }

    public final Map<Integer, Decoration> searchByDecorationPlace(final String decorationPlaces) {
        Map<Integer, Decoration> resultList = new HashMap<>();
        for (Map.Entry<Integer, Decoration> decoration : decorationMap.entrySet()) {
            if (decoration.getValue().getDecorationPlace().equalsIgnoreCase(decorationPlaces)) {
                resultList.put(decoration.getValue().getId(), decoration.getValue());
            }
        }
        return resultList;
    }

    public final List<Decoration> sortByDecorationPlace(final List<Decoration> resultList) {
        resultList.sort(Comparator.comparing(Decoration::getDecorationPlace));
        return resultList;
    }
}

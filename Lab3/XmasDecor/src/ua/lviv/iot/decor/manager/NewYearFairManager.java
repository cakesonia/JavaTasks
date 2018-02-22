/**
 * 
 */

package ua.lviv.iot.decor.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.decor.decorations.Decoration;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class NewYearFairManager {
	class DecorTypeComparator implements Comparator<Decoration> {

		@Override
		public int compare(Decoration decor0, Decoration decor1) {
			return decor0.getDecorType().compareTo(decor1.getDecorType());
		}
	}

	private List<Decoration> decorations = new LinkedList<>();

	List<Decoration> parameterDecorationsList = new LinkedList<>();

	public NewYearFairManager() {
	}

	public NewYearFairManager(List<Decoration> decorations) {
		super();
		this.decorations = decorations;
	}

	/**
	 * Constructor
	 * 
	 * @param decorations
	 *            is list of decorations
	 * @param parameterDecorationsList
	 *            list of found decorations
	 */
	public NewYearFairManager(List<Decoration> decorations, List<Decoration> parameterDecorationsList) {
		super();
		this.decorations = decorations;
		this.parameterDecorationsList = parameterDecorationsList;
	}

	public List<Decoration> getDecorations() {
		return decorations;
	}

	public List<Decoration> getParameterDecorationsList() {
		return parameterDecorationsList;
	}

	/**
	 * overloading
	 * 
	 * @param decorTypes
	 * @return
	 */
	public List<Decoration> searchByDecorType(List<String> decorTypes) {
		for (int i = 0; i < decorations.size(); i++) {
			/*
			 * if (decorations.get(i).getDecorType().equalsIgnoreCase(decorType)) {
			 * parameterDecorationsList.add(decorations.get(i)); }
			 */
			for (String string : decorTypes) {
				if (decorations.get(i).getDecorType().equalsIgnoreCase(string)) {
					parameterDecorationsList.add(decorations.get(i));
				}
			}
		}
		return parameterDecorationsList;
	}

	/**
	 * Search decorations by type of decoration
	 * 
	 * @param decorType
	 *            is type of decoration
	 * @return decorations list with found decorations
	 */
	public List<Decoration> searchByDecorType(String decorType) {
		for (int i = 0; i < decorations.size(); i++) {
			if (decorations.get(i).getDecorType().equalsIgnoreCase(decorType)) {
				parameterDecorationsList.add(decorations.get(i));
			}
		}
		return parameterDecorationsList;
	}

	public void setDecorations(List<Decoration> decorations) {
		this.decorations = decorations;
	}

	public void setParameterDecorationsList(List<Decoration> parameterDecorationsList) {
		this.parameterDecorationsList = parameterDecorationsList;
	}

	public void sortByDecorType() {

		Collections.sort(decorations, new DecorTypeComparator());
	}
}

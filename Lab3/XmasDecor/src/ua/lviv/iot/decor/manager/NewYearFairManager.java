/**
 * 
 */
package ua.lviv.iot.decor.manager;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

import ua.lviv.iot.decor.Decoration;

/**
 * @author Dell
 *
 */
public class NewYearFairManager {
    public NewYearFairManager(List<Decoration> decorations) {
		super();
		this.decorations = decorations;
	}
    
    public NewYearFairManager() {
    }

	private List<Decoration> decorations = new LinkedList<>();
	List<Decoration> parameterDecorationsList = new LinkedList<>();
	
	public List<Decoration> getDecorations() {
		return decorations;
	}

	public void setDecorations(List<Decoration> decorations) {
		this.decorations = decorations;
	}
	
	public List<Decoration> searchByDecorType (String decorType){
		for (int i = 0; i < decorations.size(); i++) {
			if (decorations.get(i).getDecorType().equalsIgnoreCase(decorType)) {
				parameterDecorationsList.add(decorations.get(i));
			}
		}
		return parameterDecorationsList;
	} 
	
	public List<Decoration> searchByDecorType (List <String> decorTypes){
	    for (int i = 0; i < decorations.size(); i++) {
	      /*if (decorations.get(i).getDecorType().equalsIgnoreCase(decorType)) {
	        parameterDecorationsList.add(decorations.get(i));
	      }*/
	      for (String string : decorTypes) {
	        if (decorations.get(i).getDecorType().equalsIgnoreCase(string)) {
	          parameterDecorationsList.add(decorations.get(i));
	        }
	      }
	    }
	    return parameterDecorationsList;
	  }
    
	public NewYearFairManager(List<Decoration> decorations, List<Decoration> parameterDecorationsList) {
		super();
		this.decorations = decorations;
		this.parameterDecorationsList = parameterDecorationsList;
	}

	public List<Decoration> getParameterDecorationsList() {
		return parameterDecorationsList;
	}

	public void setParameterDecorationsList(List<Decoration> parameterDecorationsList) {
		this.parameterDecorationsList = parameterDecorationsList;
	}

	class DecorTypeComparator implements Comparator<Decoration> {

		@Override
		public int compare(Decoration decor0, Decoration decor1) {
			return decor0.getDecorType().compareTo(decor1.getDecorType());
		}
	}
	
	public void sortByDecorType () {
	
		Collections.sort(decorations, new DecorTypeComparator());
	}	
}

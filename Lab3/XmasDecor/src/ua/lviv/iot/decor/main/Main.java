/**
 * 
 */

package ua.lviv.iot.decor.main;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.decor.decorations.Decoration;
import ua.lviv.iot.decor.decorations.Garland;
import ua.lviv.iot.decor.decorations.Lighting;
import ua.lviv.iot.decor.decorations.Toys;
import ua.lviv.iot.decor.decorations.Wreath;
import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.MaterialOfToys;
import ua.lviv.iot.decor.enums.MaterialOfWreath;
import ua.lviv.iot.decor.enums.TypeOfToys;
import ua.lviv.iot.decor.manager.NewYearFairManager;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Main {

	public static void main(String[] args) {
		NewYearFairManager kate = new NewYearFairManager();

		kate.addDecoration(new Garland("House", 3, Color.BLUE));
		kate.addDecoration(new Lighting("Yard", 2, 150));
		kate.addDecoration(new Toys("Xmas Tree", TypeOfToys.ANGELS, MaterialOfToys.PAPER));
		kate.addDecoration(new Wreath("House", 50, MaterialOfWreath.BRANCHES));

		List<String> someType = new LinkedList<>();
		someType.add("House");
		someType.add("Yard");

		List<Decoration> arrayList = kate.searchByDecorationPlace(someType);
		System.out.println("Find by decoration for " + someType);
		System.out.println(arrayList);
		/* System.out.println(kate.getDecorations()); */
	}

}

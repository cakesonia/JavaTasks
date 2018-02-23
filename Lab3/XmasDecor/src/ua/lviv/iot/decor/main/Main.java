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

		Decoration objGarland = new Garland("House", 3, Color.BLUE);
		Decoration objLighting = new Lighting("Yard", 2, 150);
		Decoration objToys = new Toys("Xmas Tree", TypeOfToys.ANGELS, MaterialOfToys.PAPER);
		Decoration objWreath = new Wreath("House", 50, MaterialOfWreath.BRANCHES);

		kate.getDecorations().add(objGarland);
		kate.getDecorations().add(objLighting);
		kate.getDecorations().add(objToys);
		kate.getDecorations().add(objWreath);

		LinkedList<String> someType = new LinkedList<String>();
		someType.add("House");
		someType.add("Yard");

		List<Decoration> arrayList = kate.searchByDecorType(someType);
		System.out.println("Find by decoration for " + someType);
		System.out.println(arrayList);
		/* System.out.println(kate.getDecorations()); */
	}

}

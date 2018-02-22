package ua.lviv.iot.decor.main;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.decor.Decoration;
import ua.lviv.iot.decor.Garland;
import ua.lviv.iot.decor.Lighting;
import ua.lviv.iot.decor.Toys;
import ua.lviv.iot.decor.Wreath;
import ua.lviv.iot.decor.enums.Color;
import ua.lviv.iot.decor.enums.MaterialOfToys;
import ua.lviv.iot.decor.enums.MaterialOfWreath;
import ua.lviv.iot.decor.enums.TypeOfToys;
import ua.lviv.iot.decor.manager.NewYearFairManager;

public class Main {

	public static void main(String[] args) {
		NewYearFairManager kate = new NewYearFairManager();
		
		Decoration objGarland = new Garland("Xmas Tree", 3, Color.BLUE);
		Decoration objLighting = new Lighting("Yard", 2, 150);
		Decoration objToys = new Toys("Xmas Tree", TypeOfToys.ANGELS, MaterialOfToys.PAPER);
		Decoration objWreath = new Wreath("House", 50, MaterialOfWreath.BRANCHES);
		
		kate.getDecorations().add(objGarland);
		kate.getDecorations().add(objLighting);
		kate.getDecorations().add(objToys);
		kate.getDecorations().add(objWreath);
		
		LinkedList<String> somesome = new LinkedList<String>();
	    somesome.add("Xmas Tree");
	    somesome.add("Yard");

	    List<Decoration> arrayList = kate.searchByDecorType(somesome);
	    System.out.println(arrayList);
		/*System.out.println(kate.getDecorations());*/
	}

}

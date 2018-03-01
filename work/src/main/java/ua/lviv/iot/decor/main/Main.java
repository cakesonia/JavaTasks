package ua.lviv.iot.decor.main;

import ua.lviv.iot.decor.decorations.Decoration;
import ua.lviv.iot.decor.decorations.Wreath;
import ua.lviv.iot.decor.decorations.Toys;
import ua.lviv.iot.decor.decorations.Lighting;
import ua.lviv.iot.decor.decorations.Garland;
import ua.lviv.iot.decor.manager.NewYearFairManager;

import java.util.List;

public class Main {

    public static void main(final String... args) {

        NewYearFairManager kate = new NewYearFairManager();

        kate.addDecoration(new Garland("House"));
        kate.addDecoration(new Lighting("Yard"));
        kate.addDecoration(new Toys("Xmas Tree"));
        kate.addDecoration(new Wreath("House"));

        List<Decoration> resultList;
        resultList = kate.searchByDecorationPlace("House", "Yard");
        System.out.println("Find by decoration for types: House, Yard ");
        System.out.println(resultList);

        resultList = kate.searchByDecorationPlace("House");
        System.out.println("Find by decoration for types: House ");
        System.out.println(resultList);
        System.out.println(kate.sortByDecorType());
    }
}

package ua.lviv.iot.decor.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.decor.decorations.*;
import ua.lviv.iot.decor.enums.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sonia
 * @version 1.2
 * @since 2018-03-06
 */
class NewYearFairManagerTest {
    /*private static NewYearFairManager manager;
    private static Decoration decor = new Toys(0, "DecorationPlace",
            TypeOfDecorations.TOYS,  Color.YELLOW, MaterialOfToys.GLASS, TypeOfToys.ROUND);
    private static Decoration decor1 = new Garland(1, "DecorationPlace1",
            TypeOfDecorations.GARLAND,  Color.RED, 10);
    private static Decoration decor2 = new Lighting(2,"DecorationPlace2",
            TypeOfDecorations.LIGHTING, Color.BLUE, 8, 55);
    private static Decoration decor3 = new Wreath(3,"DecorationPlace3",
            TypeOfDecorations.WREATH, Color.GREEN, MaterialOfWreath.CONES, 0.5);
    private Lighting lighting;
    private Map<Integer, Decoration> testList = new HashMap<>();

    @BeforeAll
    static void addDecorationsForTest() {
        manager = new NewYearFairManager();
        manager.addDecoration(0, decor);
        manager.addDecoration(1, decor1);
        manager.addDecoration(2, decor2);
        manager.addDecoration(3, decor3);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addDecoration() {
        Integer id = 2;
        NewYearFairManager testManager = new NewYearFairManager();
        testManager.addDecoration(id, lighting);
        assertEquals(lighting, testManager.getDecorationMap().get(0));
    }

    @Test
    void searchByDecorationPlace() {
        testList = manager.searchByDecorationPlace(decor.getDecorationPlace());
        assertEquals(1, testList.size());
        assertEquals(decor, testList.get(0));
        testList = manager.searchByDecorationPlace(decor1.getDecorationPlace());
        assertEquals(1, testList.size());
        testList = manager.searchByDecorationPlace(decor2.getDecorationPlace());
        assertEquals(1, testList.size());
        testList = manager.searchByDecorationPlace(decor3.getDecorationPlace());
        assertEquals(1, testList.size());
        testList = manager.searchByDecorationPlace(" ");
        assertEquals(0, testList.size());
    }

    @Test
    void sortByDecorType() {
        *//*testList = manager.sortByDecorationPlace(manager.getDecorationList());
        assertEquals(4, testList.size());
        assertEquals(decor.getDecorationPlace(), testList.get(0).getDecorationPlace());
        assertEquals(decor1.getDecorationPlace(), testList.get(1).getDecorationPlace());
        assertEquals(decor2.getDecorationPlace(), testList.get(2).getDecorationPlace());
        assertEquals(decor3.getDecorationPlace(), testList.get(3).getDecorationPlace());*//*
    }

    @Test
    void writeToFile() {
        *//*try {
            DecorationsWriter decorationsWriter = new DecorationsWriter();
            decorationsWriter.writeToFile(manager.getDecorationList());
        } catch (IOException e) {
            assertTrue(false);
        }
        File file = new File("E:\\IdeaProjects\\decoration.csv");
        assertEquals(true, file.exists());*//*
    }*/
}

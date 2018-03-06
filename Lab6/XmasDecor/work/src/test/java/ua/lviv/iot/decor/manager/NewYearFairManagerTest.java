package ua.lviv.iot.decor.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.decor.decorations.*;
import ua.lviv.iot.decor.enums.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sonia
 * @version 1.2
 * @since 2018-03-06
 */
class NewYearFairManagerTest {
    static NewYearFairManager manager;
    private static Decoration decor = new Toys("DecorationPlace", TypeOfDecorations.TOYS,
            Color.YELLOW, MaterialOfToys.GLASS, TypeOfToys.ROUND);
    private static Decoration decor1 = new Garland("DecorationPlace1", TypeOfDecorations.GARLAND,
            Color.RED, 10);
    private static Decoration decor2 = new Lighting("DecorationPlace2", TypeOfDecorations.LIGHTING,
            Color.BLUE, 8, 55);
    private static Decoration decor3 = new Wreath("DecorationPlace3", TypeOfDecorations.WREATH,
            Color.GREEN, MaterialOfWreath.CONES, 0.5);
    Lighting lighting;
    private List<Decoration> testList = new LinkedList<>();

    @BeforeAll
    static void addDecorationsForTest() {
        manager = new NewYearFairManager();
        manager.addDecoration(decor);
        manager.addDecoration(decor1);
        manager.addDecoration(decor2);
        manager.addDecoration(decor3);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addDecoration() {
        NewYearFairManager testManager = new NewYearFairManager();
        testManager.addDecoration(lighting);
        assertEquals(lighting, testManager.getDecorations().get(0));

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
        testList = manager.sortByDecorType(manager.getDecorations());
        assertEquals(4, testList.size());
        assertEquals(decor.getDecorationPlace(), testList.get(0).getDecorationPlace());
        assertEquals(decor1.getDecorationPlace(), testList.get(1).getDecorationPlace());
        assertEquals(decor2.getDecorationPlace(), testList.get(2).getDecorationPlace());
        assertEquals(decor3.getDecorationPlace(), testList.get(3).getDecorationPlace());
    }
}
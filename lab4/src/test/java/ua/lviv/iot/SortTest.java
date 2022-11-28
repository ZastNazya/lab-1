package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.tools.*;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.Material.*;

class SortTest {
    private final Sort sort = new Sort();
    private final TwoHandedSaw obj1 = new TwoHandedSaw(12, Steel);
    private final Scrap obj2=new Scrap(10, Iron);
    private final Roadaxe obj3 = new Roadaxe(7, Titan);
    private final Pickaex obj4 = new Pickaex(8, Aluminum);
    private final SapperShovel obj5 = new SapperShovel(9, Brass);
    private final SmallInfantryShovel obj6 = new SmallInfantryShovel(10, Aluminum);

    @Test
    void sortUpByMass() {
        sort.addElement(obj1);
        sort.addElement(obj2);
        sort.addElement(obj3);
        sort.addElement(obj4);
        sort.addElement(obj5);
        sort.addElement(obj6);
        List<Tool> list2 = Arrays.asList(obj3, obj4, obj5, obj2, obj6, obj1);
        assertEquals(list2, sort.sortUpByMass());

    }

    @Test
    void sortDownByMass() {
        sort.addElement(obj1);
        sort.addElement(obj2);
        sort.addElement(obj3);
        sort.addElement(obj4);
        sort.addElement(obj5);
        sort.addElement(obj6);
        List<Tool> list2 = Arrays.asList(obj1, obj2, obj6, obj5, obj4, obj3);
        assertEquals(list2, sort.sortDownByMass());
    }

    @Test
    void sortUpByDensity() {
        sort.addElement(obj1);
        sort.addElement(obj2);
        sort.addElement(obj3);
        sort.addElement(obj4);
        sort.addElement(obj5);
        sort.addElement(obj6);
        List<Tool> list2 = Arrays.asList(obj4, obj6, obj3, obj2, obj1, obj5);
        assertEquals(list2, sort.sortUpByDensity());
    }

    @Test
    void sortDownByDensity() {
        sort.addElement(obj1);
        sort.addElement(obj2);
        sort.addElement(obj3);
        sort.addElement(obj4);
        sort.addElement(obj5);
        sort.addElement(obj6);
        List<Tool> list2 = Arrays.asList(obj5, obj1, obj2, obj3, obj4, obj6);
        assertEquals(list2, sort.sortDownByDensity());
    }
}
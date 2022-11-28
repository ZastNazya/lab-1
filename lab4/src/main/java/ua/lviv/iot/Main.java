package ua.lviv.iot;

import ua.lviv.iot.tools.*;

import java.util.Arrays;
import java.util.List;

import static ua.lviv.iot.Material.*;
import static ua.lviv.iot.Type.ToolsForLand;

public class Main {
    public static void main(String[] args) {
        TwoHandedSaw obj1 = new TwoHandedSaw(12, Steel);
        Scrap obj2 = new Scrap(10, Iron);
        Roadaxe obj3 = new Roadaxe(7, Titan);
        Pickaex obj4 = new Pickaex(8, Aluminum);
        SapperShovel obj5 = new SapperShovel(9, Brass);
        SmallInfantryShovel obj6 = new SmallInfantryShovel(10, Aluminum);
        Sort sort = new Sort();
        sort.addElement(obj1);
        sort.addElement(obj2);
        sort.addElement(obj3);
        sort.addElement(obj4);
        sort.addElement(obj5);
        sort.addElement(obj6);
        sort.sort();
        sort.searchTools(ToolsForLand);
        IToolWriter iToolWriter = new IToolWriter();
        List<Tool> list2 = Arrays.asList(obj3, obj4, obj5, obj2, obj6, obj1);
        iToolWriter.writeToFile(list2);

        System.out.println(Test.c == Test.d );
        System.out.println(Test.c.equals(Test.d));
    }
}
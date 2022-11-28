package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.tools.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.Material.*;
import static ua.lviv.iot.Material.Aluminum;

class IToolWriterTest {

    private final TwoHandedSaw obj1 = new TwoHandedSaw(12, Steel);
    private final Scrap obj2=new Scrap(10, Iron);
    private final Roadaxe obj3 = new Roadaxe(7, Titan);
    private final Pickaex obj4 = new Pickaex(8, Aluminum);
    private final SapperShovel obj5 = new SapperShovel(9, Brass);
    private final SmallInfantryShovel obj6 = new SmallInfantryShovel(10, Aluminum);

    @Test
    void writeToFile() {
        IToolWriter iToolWriter = new IToolWriter();
        List<Tool> list2 = Arrays.asList(obj3, obj4, obj5, obj2, obj6, obj1);
        iToolWriter.writeToFile(list2);
        String readerEx = String.format("example.csv");
        String readerRes = String.format("result.csv");
         try {
             BufferedReader readerResult = new BufferedReader(new FileReader(readerRes));
             BufferedReader readerExample = new BufferedReader(new FileReader(readerEx));
             assertEquals(readerExample.readLine(), readerResult.readLine());
             assertNotEquals(null, readerResult.readLine());
             assertNotEquals(readerExample.readLine(), null);
         }
         catch (IOException e) {
             e.printStackTrace();
         }
    }
}
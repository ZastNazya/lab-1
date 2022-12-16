package main.java.ua.lviv.iot;

import java.util.Comparator;

public class ByMaterials implements Comparator<TwoHandedSaw> {

    @Override
    public int compare(TwoHandedSaw a, TwoHandedSaw b) {
        return a.GetMaterial().compareTo(b.GetMaterial());
    }
}



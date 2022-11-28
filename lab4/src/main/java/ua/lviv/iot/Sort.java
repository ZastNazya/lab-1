package ua.lviv.iot;

import ua.lviv.iot.tools.Tool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    private ArrayList<Tool> list = new ArrayList<Tool>();
    private ArrayList<Tool> list1 = new ArrayList<Tool>();

    public final void addElement(final Tool object) {
        list.add(object);
    }
    public final void output(final List<Tool> a) {
        for (int i = 0; i < a.size(); i++) {
            int b = i + 1;
            System.out.println(b + "." + a.get(i));
        }
        System.out.println();
    }
    public final List<Tool> sortUpByMass() {
        Collections.sort(list);
        System.out.println("Top Mass:" + "\n");
        output(list);
        return list;
    }
    public final ArrayList<Tool> sortDownByMass() {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Less Mass:" + "\n");
        output(list);
        return list;
    }
    public final ArrayList<Tool> sortUpByDensity() {
        Collections.sort(list, new SortByMaterials());
        System.out.println("Top Density:" + "\n");
        output(list);
        return list;
    }
    public final ArrayList<Tool> sortDownByDensity() {
        Collections.sort(list, Collections.reverseOrder(new SortByMaterials()));
        System.out.println("Less Density:" + "\n");
        output(list);
        return list;
    }
    public final void sort() {
        sortDownByMass();
        sortUpByMass();
        sortDownByDensity();
        sortUpByDensity();
    }
    public final void searchTools(final Type type) {
        list1.clear();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType() == type) {
                list1.add(list.get(i));
            }
        }
        System.out.println("\n" + type + ":\n");
        output(list1);
    }
}
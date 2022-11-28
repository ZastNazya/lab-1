package ua.lviv.iot;
import ua.lviv.iot.tools.Tool;
import java.util.Comparator;

public class SortByMaterials implements Comparator<Tool> {
    @Override
    public final int compare(final Tool a, final Tool b) {
        return a.getMaterials().compareTo(b.getMaterials());
    }
}

package ua.lviv.iot.tools;
import ua.lviv.iot.Material;
import static ua.lviv.iot.Type.ToolsForRock;

public class Scrap extends Tool {

    public Scrap(final int mass, final Material materials) {
        super(mass, materials, ToolsForRock);
    }
    public Scrap(final int mass, final Material materials,
                 final ua.lviv.iot.Type type) {
        super(mass, materials, type);
    }

    @Override
    public  String toString() {
        return "Scrap{"
                + "Mass=" + getMass()
                + ", Materials=" + getMaterials()
                + '}';
    }
}

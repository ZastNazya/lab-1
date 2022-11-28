package ua.lviv.iot.tools;
import ua.lviv.iot.Material;
import static ua.lviv.iot.Type.ToolsForTree;

public class Roadaxe extends Tool {
    public Roadaxe(final int mass, final Material materials) {
        super(mass, materials, ToolsForTree);
    }
    public Roadaxe(final int mass, final Material materials,
                   final ua.lviv.iot.Type type) {
        super(mass, materials, type);
    }

    @Override
    public String toString() {
        return "Вroadaxe{"
                + "Mass=" + getMass()
                + ", Materials=" + getMaterials()
                + '}';
    }
}


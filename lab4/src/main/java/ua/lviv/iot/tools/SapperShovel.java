package ua.lviv.iot.tools;
import ua.lviv.iot.Material;
import static ua.lviv.iot.Type.ToolsForLand;

public class SapperShovel extends Tool {
    public SapperShovel(final int mass, final Material materials) {
        super(mass, materials, ToolsForLand);
    }
    public SapperShovel(final int mass, final Material materials,
                        final ua.lviv.iot.Type type) {
        super(mass, materials, type);
    }

    @Override
    public String toString() {
        return "SapperShovel{"
                + "Mass=" + getMass()
                + ", Materials=" + getMaterials()
                + '}';
    }
}

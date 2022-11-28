package ua.lviv.iot.tools;
import ua.lviv.iot.Material;
import static ua.lviv.iot.Type.ToolsForTree;

public class TwoHandedSaw extends Tool   {
    public TwoHandedSaw(final int mass, final Material material) {
        super(mass, material, ToolsForTree);
    }
    public TwoHandedSaw(final int mass, final Material materials,
                   final ua.lviv.iot.Type type) {
        super(mass, materials, type);
    }

    @Override
    public String toString() {
        return "TwoHandedSaw{"
                + "Mass=" + getMass()
                + ", Materials='" + getMaterials() + '\''
                + '}';
    }

}

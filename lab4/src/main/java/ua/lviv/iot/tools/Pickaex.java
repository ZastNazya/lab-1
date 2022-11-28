package ua.lviv.iot.tools;

import ua.lviv.iot.Material;

import static ua.lviv.iot.Type.ToolsForRock;
public class Pickaex extends Tool {
    public Pickaex(final int mass, final Material materials) {
        super(mass, materials, ToolsForRock);
    }
    public Pickaex(final int mass, final Material materials,
                   final ua.lviv.iot.Type type) {
        super(mass, materials, type);
    }

    @Override
    public  String toString() {
        return "Pickaex{"
                + "Mass=" + getMass()
                + ", Materials=" + getMaterials()
                + '}';
    }
}

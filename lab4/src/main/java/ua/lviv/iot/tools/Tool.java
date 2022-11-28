package ua.lviv.iot.tools;

import ua.lviv.iot.Material;
import ua.lviv.iot.Type;


public abstract class Tool implements Comparable<Tool> {
    private int mass;
    private Material materials;
    private Type type;

    public int getMass() {
        return mass;
    }

    public void setMass(final int mass) {
        this.mass = mass;
    }

    public void setMaterials(final Material materials) {
        this.materials = materials;
    }

    public Material getMaterials() {
        return materials;
    }

    public Type getType() {
        return type;
    }

    public Tool(final int mass, final Material materials,
                        final Type type) {
        this.mass = mass;
        this.materials = materials;
        this.type = type;
    }
    @Override
    public int compareTo(final Tool a) {
        return this.mass - a.mass;
    }

    public String getHeader() {
        return String.format("%s, %s, %s\n", "mass", "materials", "type");
    }

    public String toCSV() {
        return String.format("%s, %s, %s\n", getMass(),
                getMaterials(), getType());
    }

}

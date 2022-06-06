package main.java.ua.lviv.iot;

public class Pickaxe extends TwoHandedSaw{

    public Pickaxe(int Mass, Materials Material) {
        super(Mass, Material);
    }

    @Override
    public String toString() {
        return "Pickaxe";
    }
}

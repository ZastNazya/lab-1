package main.java.ua.lviv.iot;

public class Scrap extends Pickaxe{

    public Scrap(int Mass, Materials Material) {
        super(Mass, Material);
    }

    @Override
    public String toString() {
        return "Scrap" ;
    }
}

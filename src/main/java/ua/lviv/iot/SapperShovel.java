package main.java.ua.lviv.iot;

public class SapperShovel extends SmallInfantryShovel {

    public SapperShovel(int Mass, Materials Material) {
        super(Mass, Material);
    }

    @Override
    public String toString() {
        return "SapperShovel" ;
    }
}

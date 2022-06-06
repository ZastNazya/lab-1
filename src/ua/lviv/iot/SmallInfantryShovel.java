package ua.lviv.iot;

public class SmallInfantryShovel extends Scrap {

    public SmallInfantryShovel(int Mass, Materials Material) {
        super(Mass, Material);
    }

    @Override
    public String toString() {
        return "SmallInfantryShovel" ;
    }
}

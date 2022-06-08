package main.java.ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        TwoHandedSaw obj1 = new TwoHandedSaw(9, Materials.Aluminum);
        Pickaxe obj2 = new Pickaxe(12, Materials.Steel);
        SapperShovel obj3 = new SapperShovel(10, Materials.Brass);
        Scrap obj4 = new Scrap(15, Materials.Iron);
        Вroadaxe obj5 = new Вroadaxe(6, Materials.Titan);
        Sortuvannia sort = new Sortuvannia();
        sort.AddElements(obj1);
        sort.AddElements(obj2);
        sort.AddElements(obj3);
        sort.AddElements(obj4);
        sort.AddElements(obj5);
        sort.BestDensity(7750);
        sort.BestMass(13);
        sort.MassLessThen(13);
        sort.DensityLessThen(8000);
    }
}

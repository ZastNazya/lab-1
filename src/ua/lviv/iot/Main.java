package ua.lviv.iot;

import static ua.lviv.iot.Materials.*;


public class Main {

    public static void main(String[] args) {
        TwoHandedSaw obj1 = new TwoHandedSaw(9,Aluminum);
        Pickaxe obj2 = new Pickaxe(12, Steel);
        SapperShovel obj3 = new SapperShovel(10,Brass);
        Scrap obj4 = new Scrap(15, Iron);
        Вroadaxe obj5 = new Вroadaxe(6,Titan);
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

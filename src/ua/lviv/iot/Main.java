package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        Zoo FirstZoo = new Zoo(36400,"Lviv\'s",85,10,23,43);
        Zoo SecondZoo = new Zoo(12,54,15);
        Zoo ThirdZoo = new Zoo();
        System.out.println(FirstZoo);
        System.out.println(SecondZoo);
        System.out.println(ThirdZoo);
    }
}

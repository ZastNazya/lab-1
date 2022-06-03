package ua.lviv.iot;

public record Zoo(int CountVisitors, String Name, int CountAnimals,
                  int Price, int CountMammals , int CountBirds ) {
    static String NewAnimal ="Elephant";

    public static String GetNewAnimal(){
        return NewAnimal ;
    }

    public Zoo(int Price, int CountMammals , int CountBirds){
        this(50456,"Medenychi",98,Price,CountMammals,CountBirds);
    }

    public Zoo(){
        this(127355,"Askania Nova",1395,15,456,286);
    }

    @Override
    public String toString() {
        return "Every year "+CountVisitors+" visitors visit zoo \""+ Name
                +"\" there are "+CountAnimals+" animals: "+CountMammals+" mammmals and "
                + CountBirds+" birds. Ticket prise is "+Price+"$";
    }
}

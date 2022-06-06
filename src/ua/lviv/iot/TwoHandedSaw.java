package ua.lviv.iot;

public class TwoHandedSaw  {
    protected int Mass;
    protected String Material;
    public TwoHandedSaw(int Mass, String Material) {
        this.Material = Material;
        this.Mass=Mass;
    }
    public void SetMass(int Mass){
        this.Mass=Mass;
    }
    public int GetMass(){
        return Mass;
    }
    public void SetMaterial(String Material){
        this.Material=Material;
    }
    public String GetMaterial(){
        return Material;
    }

}

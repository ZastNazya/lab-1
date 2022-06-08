package ua.lviv.iot;

public class TwoHandedSaw implements Comparable<TwoHandedSaw>  {
    protected int Mass;
    protected Materials Material;
    public TwoHandedSaw(int Mass, Materials Material) {
        this.Material = Material;
        this.Mass=Mass;
    }
    public void SetMass(int Mass){
        this.Mass=Mass;
    }
    public int GetMass(){
        return Mass;
    }
    public void SetMaterial(Materials Material){
        this.Material=Material;
    }
    public Materials GetMaterial(){
        return Material;
    }

    @Override
    public String toString() {
        return "TwoHandedSaw";
    }

    @Override
    public int compareTo(TwoHandedSaw o) {
        TwoHandedSaw a = o;
        return this.Mass - a.Mass;
    }
}

package ua.lviv.iot;

public enum Materials {
     Brass(8500), Steel(7800), Iron(7700), Titan(4500), Aluminum(2700);
     int density;
    Materials(int density){
        this.density=density;
    }

    public int GetDensity() {
        return density;
    }
}

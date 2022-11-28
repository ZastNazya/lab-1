package ua.lviv.iot;

public enum Material {
    Aluminum(2700), Titan(4500), Iron(7700), Steel(7800), Brass(8500);
    private final int density;
    Material(int density) {
        this.density = density;
    }

    public int getDensity() {
        return density;
    }
}

package az.edu.bhos.lesson11;

public enum Species {
    DOG(false, 4, true),
    DOMESTIC_CAT(false, 4, true),
    ROBO_CAT(false, 4, false),
    FISH(false, 0, false),
    BIRD(true, 2, false),
    UNKNOWN(false,-1,false);

    final boolean canFly;
    final int numberOfLegs;
    final boolean hasFur;
    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

}

package az.edu.bhos.lesson11;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    FISH(false, 0, false),
    BIRD(true, 2, false),
    NO_SPECIES(false,-1,false);

    final boolean canFly;
    final int numberOfLegs;
    final boolean hasFur;
    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

}

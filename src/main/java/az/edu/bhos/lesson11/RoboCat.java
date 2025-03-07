package az.edu.bhos.lesson11;

public class RoboCat extends Pet{
    @Override
    public void respond() {
        System.out.println("RoboCat is meowing worse than DomesticCat");
    }
    @Override public Species getSpecies() {
        return Species.ROBO_CAT;
    }
}
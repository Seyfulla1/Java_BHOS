package az.edu.bhos.lesson11;

public class DomesticCat extends Pet{
    @Override
    public void respond() {
        System.out.println("DomesticCat is meowing");
    }
    @Override public Species getSpecies() {
        return Species.DOMESTIC_CAT;
    }
}
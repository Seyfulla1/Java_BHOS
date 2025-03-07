package az.edu.bhos.lesson11;

public class DomesticCat extends Pet implements CanFoul{
    Species species;
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.DOMESTIC_CAT;
    }
    @Override
    public void respond() {
        System.out.println("DomesticCat"+getNickName()+" is meowing");
    }
    @Override public Species getSpecies() {
        return species;
    }
    @Override
    public void foul() {
        System.out.println("I need to cover it up with Domestic Cat sand");
    }
}
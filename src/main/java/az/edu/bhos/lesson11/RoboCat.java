package az.edu.bhos.lesson11;

public class RoboCat extends Pet implements CanFoul{
    Species species;
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.ROBO_CAT;
    }
    @Override
    public void respond() {
        System.out.println("RoboCat is meowing worse than DomesticCat");
    }
    @Override public Species getSpecies() {
        return Species.ROBO_CAT;
    }
    @Override
    public void foul() {
        System.out.println("I need to cover it up with RoboCat sand");
    }
}
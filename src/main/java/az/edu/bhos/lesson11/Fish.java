package az.edu.bhos.lesson11;

public class Fish extends Pet{
    Species species;
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.FISH;
    }
    @Override
    public void respond() {
        System.out.println("Fish cannot talk");
    }
    @Override public Species getSpecies() {
        return Species.FISH;
    }
}
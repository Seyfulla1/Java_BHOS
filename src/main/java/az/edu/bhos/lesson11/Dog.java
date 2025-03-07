package az.edu.bhos.lesson11;

public class Dog extends Pet implements CanFoul{

    Species species;
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.DOG;
    }
    @Override
    public void respond() {
        System.out.println("Dog is barking");
        // System.out.println("Hello, owner. I am - "+super.getNickName()+". I miss you!");
    }
    @Override public Species getSpecies() {
        return Species.DOG;
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

}

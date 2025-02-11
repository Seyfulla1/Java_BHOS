package az.edu.bhos.lesson05;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
        this.species = "N/A";
        this.nickname = "N/A";
        this.age = -1;
        this.trickLevel = -1;
        this.habits = new String[0];
    }
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
        this.age = -1;
        this.trickLevel = -1;
        this.habits = new String[0];
    }
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }
    public String getSpecies() {
        return species;
    }
    public String getNickName() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    private String[] getHabits(){return habits;}
    private void setSpecies(String species){this.species = species;}
    private void setNickname(String nickname){this.nickname = nickname;}
    private void setAge(int age){this.age = age;}
    private void setTrickLevel(int trickLevel){this.trickLevel = trickLevel;}
    private void setHabits(String[] habits){this.habits = habits;}
    public void eat() {
        System.out.println("I am eating");
    }
    public void respond() {
        System.out.println("Hello, owner. I am - "+nickname+". I miss you!");

    }
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if(that==null || this.getClass()!=that.getClass()) {
            return false;
        }
        Pet thatPet = (Pet)that;
        return Objects.equals(species, thatPet.species) &&
                Objects.equals(nickname, thatPet.nickname) &&
                age==thatPet.age && trickLevel==thatPet.trickLevel;
    }
    @Override
    public int hashCode() {
        int result=17;
        result = 31 * result + species.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + age;
        result = 31 * result + trickLevel;
        return result;
    }
    @Override
    public String toString() {
        return species+"{nickname='" + nickname +"', age="+age+", trickLevel="+trickLevel+", habits="+ Arrays.toString(habits)+"}";
    }




}

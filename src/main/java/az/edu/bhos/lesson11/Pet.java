package az.edu.bhos.lesson11;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static{
        System.out.println("Pet class is loaded.");
    }
    {
        System.out.println("A new Pet object is created.");
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public abstract Species getSpecies();

    public String getNickName() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    public String[] getHabits(){return habits;}
    public void setNickname(String nickname){this.nickname = nickname;}
    public void setAge(int age){this.age = age;}
    public void setTrickLevel(int trickLevel){this.trickLevel = trickLevel;}
    public void setHabits(String[] habits){this.habits = habits;}

    public void eat() {
        System.out.println("I am eating");
    }
    public abstract void respond();


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if(that==null || this.getClass()!=that.getClass()) {
            return false;
        }
        Pet thatPet = (Pet)that;
        return Objects.equals(getSpecies(), thatPet.getSpecies()) &&
                Objects.equals(nickname, thatPet.nickname) &&
                age==thatPet.age && trickLevel==thatPet.trickLevel;
    }
    @Override
    public int hashCode() {
        int result=17;
        result = 31 * result + getSpecies().hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + age;
        result = 31 * result + trickLevel;
        return result;
    }
    @Override
    public String toString() {
        String canfly=getSpecies().canFly?"can fly":"can't fly";
        String hasFur=getSpecies().hasFur?"has fur":"doesn't have fur";
        return getSpecies()+"{nickname='" + nickname +"', age="+age+
                ", trickLevel="+trickLevel+
                ", habits="+ Arrays.toString(habits)+
                ", characteristics="+canfly+", has "+getSpecies().numberOfLegs+" legs, "+hasFur+"}";
    }
    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");

    }



}

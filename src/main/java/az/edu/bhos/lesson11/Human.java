package az.edu.bhos.lesson11;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    static{
        System.out.println("Human class is loaded.");
    }
    {
        System.out.println("A new Human object is created.");
    }

    public Human() {
        this.name="Not";
        this.surname="Applicable";
        this.year=-1;
        this.iq=-1;
        this.schedule=new String[0][0];
        this.family=null;
    }
    public Human(String name, String surname, int year) {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=-1;
        this.schedule=new String[0][0];
        this.family=null;
    }
    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = null;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getYear()
    {
        return year;
    }
    public int getIq()
    {
        return iq;
    }
    public String[][] getSchedule() { return schedule;}
    public Family getFamily() { return family;}

    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setYear(int year) {this.year = year;}
    public void setIq(int iq) {this.iq = iq;}
    public void setSchedule(String[][] schedule) {this.schedule = schedule;}
    public void setFamily(Family family) {this.family = family;}

    public void greetPet()
    {
        System.out.println("Hello, " + family.getPet().getNickName());
    }
    public void describePet() {
        String isSly= family.getPet().getTrickLevel()>50 ? "very sly" : "almost not sly";
        System.out.println("I have a "+family.getPet().getSpecies()+". It is "
                +family.getPet().getAge()+" years old, he is "+isSly);
    }
    public boolean feedPet(boolean isFeedingTime) {

        if(!isFeedingTime)
        {
            Random rand = new Random();
            int randomNum = rand.nextInt(101);
            if(family.getPet().getTrickLevel()>randomNum)
            {
                isFeedingTime=true;
            }

        }
        String output=isFeedingTime?"Hm... I will feed "+name+"'s "+family.getPet().getNickName():"I think "+name+"'s "+family.getPet().getNickName()+" is not hungry.";
        System.out.println(output);
        return isFeedingTime;

    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if(that==null || this.getClass()!=that.getClass()){
            return false;
        }
        Human thatHuman = (Human)that;
        return Objects.equals(name, thatHuman.name) &&
                Objects.equals(surname, thatHuman.surname) &&
                year==thatHuman.year && iq==thatHuman.iq;
    }
    @Override
    public int hashCode() {
        int result=17;
        result=31*result+Objects.hashCode(name);
        result=31*result+Objects.hashCode(surname);
        result=31*result+year;
        result=31*result+iq;
        return result;
        //I could've used Objects.hash(name,surname,year,iq), but the manual method was more fun :)
    }
    @Override
    public String toString() {
        return "Human{name='"+name+"', surname='"+surname+"', year="+year+", iq="+iq+
                ", schedule="+Arrays.deepToString(schedule)+"}";
    }
    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
    }


}

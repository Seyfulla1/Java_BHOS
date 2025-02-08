package az.edu.bhos.lesson05;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    public Human() {
        this.name="Not";
        this.surname="Applicable";
        this.year=-1;
        this.iq=-1;
        this.pet=null;
        this.mother=null;
        this.father=null;
        this.schedule=new String[][]{{"N/A","N/A"}};
    }
    public Human(String name, String surname, int year) {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=-1;
        this.pet=new Pet();
        this.mother=new Human();
        this.father=new Human();
        this.schedule=new String[][]{{"N/A","N/A"}};
    }
    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;
        this.iq=-1;
        this.pet=new Pet();
        this.schedule=new String[][]{{"N/A","N/A"}};


    }
    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;


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
    public Pet getPet()
    {
        return pet;
    }
    public Human getMother()
    {
        return mother;
    }
    public Human getFather()
    {
        return father;
    }
    public String[][] getSchedule() { return schedule;}
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {this.surname = surname;}
    public void setYear(int year) {this.year = year;}
    public void setIq(int iq) {this.iq = iq;}
    public void setPet(Pet pet) {this.pet = pet;}
    public void setMother(Human mother) {this.mother = mother;}
    public void setFather(Human father) {this.father = father;}
    public void setSchedule(String[][] schedule) {this.schedule = schedule;}







    public void greetPet() {
        System.out.println("Hello, " + pet.getNickName());
    }
    public void describePet() {
        String isSly= pet.getTrickLevel()>50 ? "very sly" : "almost not sly";
        System.out.println("I have a "+pet.getSpecies()+". It is "
                +pet.getAge()+" years old, he is "+isSly);
    }
    public boolean feedPet(boolean isFeedingTime) {

        if(!isFeedingTime)
        {
            Random rand = new Random();
            int randomNum = rand.nextInt(101);
            if(pet.getTrickLevel()>randomNum)
            {
                isFeedingTime=true;
            }

        }
        String output=isFeedingTime?"Hm... I will feed "+name+"'s "+pet.getNickName():"I think "+name+"'s "+pet.getNickName()+" is not hungry.";
        System.out.println(output);
        return isFeedingTime;

    }

    @Override
    public String toString() {
        return "Human{name='"+name+"', surname='"+surname+"', year="+year+", iq="+iq+
                ", mother="+mother.getName()+" "+mother.getSurname()+", father="+father.getName()+" "+father.getSurname()+", pet="+pet.toString()+'}';
    }

}

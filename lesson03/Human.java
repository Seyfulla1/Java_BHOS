public class Human {
    private String name;
    private String surname;
    private int year;
    private byte iq;
    private Pet pet;
    private Human mother;
    private Human father;
    public Human(String name, String surname, int year, byte iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;


    }
    public void greetPet()
    {
        System.out.println("Hello, " + pet.getName());
    }
    public void describePet()
    {
        String isSly= pet.getTrickLevel()>50 ? "very sly" : "almost not sly";
        System.out.println("I have an "+pet.getSpecies()+" is "
                +pet.getAge()+" years old, he is "+isSly);
    }
   // @Override
//    public String toString() {
//
//    }

}

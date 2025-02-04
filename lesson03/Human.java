public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    public Human()
    {}
    public Human(String name,String surname,int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name,String surname,int year, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;

    }
    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
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
    @Override
    public String toString() {
        return "Human{name='"+name+"', surname='"+surname+"', year="+year+", iq="+iq+
                ", mother="+mother+", father="+father+", pet="+pet.toString()+'}';
    }

}

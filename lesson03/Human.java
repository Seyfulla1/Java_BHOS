public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    public Human()
    {
        this.name="Not";
        this.surname="Applicable";
        this.year=-1;
        this.iq=-1;
        this.pet=null;
        this.mother=null;
        this.father=null;
    }
    public Human(String name,String surname,int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iq=-1;
        this.pet=new Pet();
        this.mother=new Human();
        this.father=new Human();
    }
    public Human(String name,String surname,int year, Human mother, Human father)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.mother=mother;
        this.father=father;
        this.iq=-1;
        this.pet=new Pet();


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
    public String getName()
    {

        return name;
    }
    public String getSurname()
    {

        return surname;
    }


    public void greetPet()
    {
        System.out.println("Hello, " + pet.getName());
    }
    public void describePet()
    {
        String isSly= pet.getTrickLevel()>50 ? "very sly" : "almost not sly";
        System.out.println("I have a "+pet.getSpecies()+". It is "
                +pet.getAge()+" years old, he is "+isSly);
    }
    @Override
    public String toString() {
        return "Human{name='"+name+"', surname='"+surname+"', year="+year+", iq="+iq+
                ", mother="+mother.getName()+" "+mother.getSurname()+", father="+father.getName()+" "+father.getSurname()+", pet="+pet.toString()+'}';
    }

}

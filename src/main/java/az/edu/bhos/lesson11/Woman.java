package az.edu.bhos.lesson11;

public final class Woman extends Human {
    final String gender;
    {
        gender="Female";
    }
    public Woman() {
        super();
    }
    public Woman(String name, String surname, int year)
    {
        super(name, surname, year);
    }
    @Override
    public void greetPet()
    {
        System.out.println("Hello, " + getFamily().getPet().getNickName()+", but i can't drive.");
    }
    public void makeUp()
    {
        System.out.println("I'm making up however i want, because i'm strong and independent");
    }
}

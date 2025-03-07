package az.edu.bhos.lesson11;

public final class Man extends Human {
    final String gender;
    {
        gender="Male";
    }
    public Man()
    {
        super("Not", "Applicable", -1, -1, new String[0][0]);
    }
    public Man(String name, String surname, int year)
    {
        super(name, surname, year, -1, new String[0][0]);
    }
    public Man(String name, String surname, int year, int iq, String[][] schedule)
    {
        super(name, surname, year, iq, schedule);
    }
    @Override
    public void greetPet()
    {
        System.out.println("Hello, " + getFamily().getPet().getNickName());
    }
    public void repairCar()
    {
        System.out.println("I'm repairing my wife's car, as, apparently, i'm the only one who can do it.");
    }
}

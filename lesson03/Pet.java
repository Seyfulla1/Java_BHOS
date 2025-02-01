
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private byte trickLevel;
    private String[] habits;


    public Pet(String species, String nickname, int age, byte trickLevel, String[] habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }
    public String getName()
    {
        return nickname;
    }
    public String getSpecies()
    {
        return species;
    }
    public int getAge()
    {
        return age;
    }
    public byte getTrickLevel()
    {
        return trickLevel;
    }
//    private String[] getHabits()
//    {
//        return habits;
//    }
    public void eat()
    {
        System.out.println("I am eating");
    }
    public void respond()
    {
        System.out.println("Hello, owner. I am - "+nickname+". I miss you!");

    }
    public void foul() {
        System.out.println("I need to cover it up");
    }
    public String contentHabits()
    {
        String content = "[";
        for (String habit : habits)
        {
            content =content+habit", ";
        }
    }

    @Override
    public String toString()
    {

        return "nickname='" + nickname +"', age="+age+", trickLevel="+trickLevel+", habits=[";
    }




}

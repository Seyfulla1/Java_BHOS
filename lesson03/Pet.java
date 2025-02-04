
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet()
    {
        this.species = "";
        this.nickname = "";
        this.age = -1;
        this.trickLevel = -1;
        this.habits = new String[]{"N/A"};
    }
    public Pet(String species, String nickname)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = -1;
        this.trickLevel = -1;
        this.habits = new String[]{"N/A"};
    }
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits)
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
    public int getTrickLevel()
    {
        return trickLevel;
    }

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
    public String formatHabits()
    {
        String content = "[";
        int len=habits.length;
        for (int i=0;i<len-1;i++)
        {
            content+=habits[i]+", ";
        }
        content+=habits[len-1]+"]";
        return content;
    }

    @Override
    public String toString()
    {

        return species+"{nickname='" + nickname +"', age="+age+", trickLevel="+trickLevel+", habits="+formatHabits()+"}";
    }




}

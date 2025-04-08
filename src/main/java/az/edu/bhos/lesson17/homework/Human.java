package az.edu.bhos.lesson17.homework;

public class Human {
    private final String name;
    private final String surname;
    private boolean isMale;
    private int age;

    public Human(String name, String surname, int age,boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

}

package az.edu.bhos.lesson17.homework;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Human {
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
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }
    @JsonProperty("Gender")
    public String isMale() {
        return isMale?"Male":"Female";
    }
    @JsonProperty("age")
    public int getAge() {
        return age;
    }

}

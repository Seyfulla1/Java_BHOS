package az.edu.bhos.lesson17.homework;

public class Teacher extends Human implements Teachable {
    private double salary;
    private int teacherID;
    private Course courseTaught;
    public Teacher(String name, String surname, int age, double salary, int teacherID, Course courseTaught) {
        super(name, surname, age);
        this.salary = salary;
        this.teacherID = teacherID;
        this.courseTaught = courseTaught;
    }
}

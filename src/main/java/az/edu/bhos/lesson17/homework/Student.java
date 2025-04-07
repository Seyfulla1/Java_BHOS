package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;

public class Student extends Human implements Gradable {
    private double scholarship;
    private int studentID;
    private ArrayList<Course> coursesTaken;
    public Student(String name, String surname, int age, double scholarship, int studentID) {
        super(name, surname, age);
        this.scholarship = scholarship;
        this.studentID = studentID;
        this.coursesTaken = new ArrayList<>();
    }

}

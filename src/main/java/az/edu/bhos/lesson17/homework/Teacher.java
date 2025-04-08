package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;

public class Teacher extends Human implements Teachable {
    private double salary;
    private final int teacherID;
    private ArrayList<Course> coursesTaught;
    public Teacher(String name, String surname, int age, double salary, int teacherID) {
        super(name, surname, age);
        this.salary = salary;
        this.teacherID = teacherID;
        this.coursesTaught = new ArrayList<>();
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getTeacherID() {
        return teacherID;
    }
    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }
    public boolean assignCourse(Course course){
        if (course != null && !coursesTaught.contains(course)) {
            this.coursesTaught.add(course);
            return true;
        }
        return false;
    }
    public boolean setExam(Exam exam){
        if (exam != null && coursesTaught.contains(exam.getExamCourse())) {

            return true;
        }
        return false;
    }


}

package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;

public class Teacher extends Human implements Teachable {
    private double salary;
    private final int teacherID;
    public int experience;
    private ArrayList<Course> coursesTaught;
    public Teacher(String name, String surname, int age, boolean isMale, double salary, int teacherID) {
        super(name, surname, age,isMale);
        this.salary = salary;
        this.teacherID = teacherID;
        this.experience = 0;
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
    public int getExperience() {
        return experience;
    }
    public void increaseExperience() {
        this.experience++;
    }
    @Override
    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }
    @Override
    public boolean assignCourse(Course course){
        if (course != null && !coursesTaught.contains(course)) {
            this.coursesTaught.add(course);
            return true;
        }
        return false;
    }
    public boolean setExamTime(Exam exam){
        if (exam != null && coursesTaught.contains(exam.getExamCourse())) {
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object that) {
      if(this==that){
          return true;
      }
      if(!(that instanceof Teacher)){
            return false;
      }
        Teacher thatTeacher = (Teacher) that;
        return this.teacherID == thatTeacher.teacherID;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(teacherID);
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", teacherID=" + teacherID +
                ", experience=" + experience +
                ", coursesTaught=" + coursesTaught +
                '}';
    }


}

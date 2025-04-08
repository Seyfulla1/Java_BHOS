package az.edu.bhos.lesson17.homework;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    @JsonProperty("salary")
    public double getSalary() {
        return salary;
    }
    @JsonProperty("ID")
    public int getTeacherID() {
        return teacherID;
    }
    @JsonProperty("experience")
    public int getExperience() {
        return experience;
    }
    @JsonProperty("coursesTaught")
    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseExperience() {
        this.experience++;
    }
    @Override
    public boolean assignCourse(Course course){
        try{
            if (course == null) {
                throw new IllegalArgumentException("Course cannot be null.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (!coursesTaught.contains(course)) {
            this.coursesTaught.add(course);
            course.assignTeacher(this);
            return true;
        }
        return false;
    }
    public boolean setExam(Course course, int duration, LocalDateTime examDateTime) {
        try {
            if (examDateTime.isBefore(LocalDateTime.now())) {
                throw new IllegalArgumentException("Exam date and time cannot be in the past.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (course != null && coursesTaught.contains(course)){
            course.getExam().setExamDuration(duration);
            course.getExam().setExamDateTime(examDateTime);

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

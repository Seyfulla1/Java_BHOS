package az.edu.bhos.lesson17.homework;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;
    private int credits;
    private ArrayList<Student> studentsTakingCourse;
    private Teacher teacherTeachingCourse;
    @JsonIgnore
    private Exam exam;

    public Course(String courseName, String courseID, int credits) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
        this.studentsTakingCourse = new ArrayList<>();
        this.teacherTeachingCourse =new Teacher("n/a","n/a",0,false,0,0);
        this.exam =new Exam(this);
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseID() {
        return courseID;
    }
    public int getCredits() {
        return credits;
    }
    public Exam getExam() {
        return exam;
    }
    public boolean registerStudent(Student student) {
        if (student != null && !studentsTakingCourse.contains(student)) {
            studentsTakingCourse.add(student);
            return true;
        }
        return false;
    }
    public boolean removeStudent(Student student) {
        try {
            if (student == null) {
                throw new IllegalArgumentException("Student cannot be null.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (studentsTakingCourse.contains(student)) {
            studentsTakingCourse.remove(student);
            return true;
        }
        return false;
    }
    public void assignTeacher(Teacher teacher) {
        teacherTeachingCourse=teacher;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName=" + courseName  +
                ", courseID=" + courseID  +
                ", credits=" + credits +
                ", exam=" + exam +
                "}";
    }
}

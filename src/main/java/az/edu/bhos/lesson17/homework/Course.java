package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;
    private int credits;
    private ArrayList<Student> studentsTakingCourse;

    public Course(String courseName, String courseID, int credits) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
        this.studentsTakingCourse = new ArrayList<>();
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
    public ArrayList<Student> getStudentsTakingCourse() {
        return studentsTakingCourse;
    }
    public boolean registerStudent(Student student) {
        if (student != null && !studentsTakingCourse.contains(student)) {
            studentsTakingCourse.add(student);
            return true;
        }
        return false;
    }
    public boolean removeStudent(Student student) {
        if (student != null && studentsTakingCourse.contains(student)) {
            studentsTakingCourse.remove(student);
            return true;
        }
        return false;
    }
}

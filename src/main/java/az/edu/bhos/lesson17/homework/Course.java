package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;
    private int credits;
    private ArrayList<Student> studentsTakingCourse;
    private Teacher teacherTeachingCourse;
    private Exam exam;

    public Course(String courseName, String courseID, int credits) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
        this.studentsTakingCourse = new ArrayList<>();
        this.teacherTeachingCourse =null;
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
    public ArrayList<Student> getStudentsTakingCourse() {
        return studentsTakingCourse;
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
        if (student != null && studentsTakingCourse.contains(student)) {
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

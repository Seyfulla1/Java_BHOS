package az.edu.bhos.lesson17.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Exam {
    private Course examCourse;
    private String examName;
    private int examDuration;
    private LocalDateTime examDateTime;
    private HashMap<Student,Integer> studentsTakingExam;
    public Exam(Course examCourse, String examName, int examDuration, LocalDateTime examDateTime) {
        this.examCourse = examCourse;
        this.examName = examName;
        this.examDuration = examDuration;
        this.examDateTime = examDateTime;
        this.studentsTakingExam = new HashMap<>();
    }
    public Course getExamCourse(){
        return examCourse;
    }
public String getExamName(){
        return examName;
    }
    public int getExamDuration(){
        return examDuration;
    }
    public String getExamDateTime(){
        return examDateTime.toString();
    }
    public HashMap<Student,Integer> getStudentsTakingExam(){
        return studentsTakingExam;
    }
    public boolean addStudentToExam(Student student, int score){
        if (student != null) {
            studentsTakingExam.putIfAbsent(student,score);
        }
        return false;
    }



}

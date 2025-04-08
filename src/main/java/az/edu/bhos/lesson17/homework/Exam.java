package az.edu.bhos.lesson17.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Exam {
    private Course examCourse;
    private ExamType examType;
    private int examDuration;
    private LocalDateTime examDateTime;
    private HashMap<Student,Integer> studentsTakingExam;
    public Exam(Course examCourse, ExamType examType) {
        this.examCourse = examCourse;
        this.examType = examType;
        this.examDuration = -1;
        this.examDateTime=null;
        this.studentsTakingExam = new HashMap<>();
    }
    public Course getExamCourse(){
        return examCourse;
    }
public ExamType getExamType(){
        return examType;
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
            return true;
        }
        return false;
    }
    public int getAverageScore(){
        int totalScore = 0;
        for (int score : studentsTakingExam.values()) {
            totalScore += score;
        }
        return totalScore / studentsTakingExam.size();
    }




}

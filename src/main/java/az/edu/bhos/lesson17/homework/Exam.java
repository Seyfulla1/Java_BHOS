package az.edu.bhos.lesson17.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Exam {
    private Course examCourse;
    private int examDuration;
    private LocalDateTime examDateTime;
    private HashMap<Student,Integer> studentsTakingExam;
    public Exam(Course examCourse) {
        this.examCourse = examCourse;
        this.examDuration = 0;
        this.examDateTime=null;
        this.studentsTakingExam = new HashMap<>();
    }
    public Course getExamCourse(){
        return examCourse;
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
    public int getMaxScore(){
        int maxScore = 0;
        for (int score : studentsTakingExam.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
    public int getMinScore(){
        int minScore = 100;
        for (int score : studentsTakingExam.values()) {
            if (score < minScore) {
                minScore = score;
            }
        }
        return minScore;
    }




}

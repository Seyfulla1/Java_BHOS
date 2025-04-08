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
    public void setExamDuration(int examDuration){
        this.examDuration = examDuration;
    }
    public void setExamDateTime(LocalDateTime examDateTime){
        this.examDateTime = examDateTime;
    }
    public HashMap<Student,Integer> getStudentsTakingExam(){
        return studentsTakingExam;
    }
    public boolean addStudentToExam(Student student, int score){
        try {
            if (student == null || score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid student or score");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
            studentsTakingExam.putIfAbsent(student, score);
            return true;
        }
    public int getAverageScore(){
        int totalScore = 0;
        try{
            if (studentsTakingExam.isEmpty()) {
                throw new ArithmeticException("No students have taken the exam");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
        for (int score : studentsTakingExam.values()) {
            totalScore += score;
        }
        return totalScore / studentsTakingExam.size();
    }
    public int getMaxScore(){
        int maxScore = 0;
        try {
            if (studentsTakingExam.isEmpty()) {
                throw new ArithmeticException("No students have taken the exam");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
        for (int score : studentsTakingExam.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
    public int getMinScore(){
        int minScore = 100;
        try {
            if (studentsTakingExam.isEmpty()) {
                throw new ArithmeticException("No students have taken the exam");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
        for (int score : studentsTakingExam.values()) {
            if (score < minScore) {
                minScore = score;
            }
        }
        return minScore;
    }
    @Override
    public String toString() {
        return "Exam{" +
                "examCourse=" + examCourse.getCourseName() +
                ", examDuration=" + examDuration +
                ", examDateTime=" + examDateTime+"}";
    }
}

package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Student extends Human implements Gradable {
    private double scholarship;
    private int studentID;
    private ArrayList<Course> coursesTaken;
    private HashMap<Exam,Integer> examsTaken;
    public Student(String name, String surname, int age, double scholarship, int studentID) {
        super(name, surname, age);
        this.scholarship = scholarship;
        this.studentID = studentID;
        this.coursesTaken = new ArrayList<>();
        this.examsTaken = new HashMap<>();
    }
    @Override
    public boolean takeCourse(Course course){
        if (course != null && !coursesTaken.contains(course)) {
            coursesTaken.add(course);
            return true;
        }
        return false;
    }
    @Override
    public int takeExam(Exam exam){
        if (exam != null && coursesTaken.contains(exam.getExamCourse())) {
            Random random = new Random();
            int possibleScore = (exam.getAverageScore()+this.getAverageScore())/2;
            int score = random.nextInt(possibleScore-10, possibleScore+10);
            examsTaken.put(exam,score);
            exam.addStudentToExam(this, score);
        }
        return -1;
    }
    @Override
    public double getGPA(){
        int totalScore = 0;
        for (int score : examsTaken.values()) {
            totalScore += score;
        }
        return (double) totalScore / examsTaken.size();
    }
    public boolean dropCourse(Course course){
        if (course != null && coursesTaken.contains(course)) {
            coursesTaken.remove(course);
            return true;
        }
        return false;
    }
    public int getAverageScore(){
        int totalScore = 0;
        for (int score : examsTaken.values()) {
            totalScore += score;
        }
        return totalScore / examsTaken.size();
    }

}

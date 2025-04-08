package az.edu.bhos.lesson17.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Student extends Human implements Gradable {
    private int scholarship;
    private int studentID;
    private ArrayList<Course> coursesTaken;
    private HashMap<Exam,Integer> examsTaken;
    public Student(String name, String surname, int age,boolean isMale, int scholarship, int studentID) {
        super(name, surname, age,isMale);
        this.scholarship = scholarship;
        this.studentID = studentID;
        this.coursesTaken = new ArrayList<>();
        this.examsTaken = new HashMap<>();
    }
    @Override
    public boolean takeCourse(Course course){
        if (course != null && !coursesTaken.contains(course)) {
            coursesTaken.add(course);
            course.registerStudent(this);
            return true;
        }
        return false;
    }
    @Override
    public int takeExam(Exam exam){
        if (exam != null && coursesTaken.contains(exam.getExamCourse())) {
            Random random = new Random();
            int minPossibleScore = (exam.getAverageScore()+this.getAverageScore())/2-10;

            int score = random.nextInt(20)+minPossibleScore;
            if (score < 0) {
                score = 0;
            } else if (score > 100) {
                score = 100;
            }
            examsTaken.put(exam,score);
            exam.addStudentToExam(this, score);
        }
        return -1;
    }
    public int getScholarship() {
        return scholarship;
    }
    public int getStudentID() {
        return studentID;
    }
    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
    public HashMap<Exam, Integer> getExamsTaken() {
        return examsTaken;
    }
    @Override
    public double getGPA(){
        double totalScore = 0;
        int totalCredits=0;
        for(Course course : coursesTaken) {
            totalCredits+= course.getCredits();
        }
        for (Exam exam : examsTaken.keySet()) {
            totalScore += exam.getExamCourse().getCredits()*examsTaken.get(exam)/(double)totalCredits;
        }
        return totalScore;
    }
    public boolean dropCourse(Course course){
        if (course != null && coursesTaken.contains(course)) {
            coursesTaken.remove(course);
            course.removeStudent(this);
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
    @Override
    public boolean equals(Object that) {
        if(this==that){
            return true;
        }
        if(!(that instanceof Student)){
            return false;
        }
        Student thatStudent = (Student) that;
        return this.studentID == thatStudent.studentID;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(studentID);
    }
    @Override
    public String toString() {
        return "Student{" +
                "scholarship=" + scholarship +
                ", studentID=" + studentID +
                ", coursesTaken=" + coursesTaken +
                ", examsTaken=" + examsTaken +
                '}';
    }
}

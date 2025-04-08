package az.edu.bhos.lesson17.homework;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Student extends Human implements Gradable {
    private int scholarship;
    private int studentID;
    private double gpa;
    private ArrayList<Course> coursesTaken;
    private HashMap<Course, Integer> studyTime;
    private HashMap<Exam,Integer> examsTaken;
    public Student(String name, String surname, int age,boolean isMale, int scholarship, int studentID) {
        super(name, surname, age,isMale);
        this.scholarship = scholarship;
        this.studentID = studentID;
        this.coursesTaken = new ArrayList<>();
        this.examsTaken = new HashMap<>();
        this.studyTime = new HashMap<>();
    }

    @JsonProperty("scholarship")
    public int getScholarship() {
        return scholarship;
    }
    @JsonProperty("studentID")
    public int getStudentID() {
        return studentID;
    }
    @JsonProperty("gpa")
    public double getGpa() {
        return gpa;
    }
    @JsonProperty("coursesTaken")
    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }
    @JsonIgnore
    public HashMap<Exam, Integer> getExamsTaken() {
        return examsTaken;
    }
    @Override
    public boolean takeCourse(Course course){
        if (course != null && !coursesTaken.contains(course)) {
            coursesTaken.add(course);
            studyTime.put(course,0);
            course.registerStudent(this);
            return true;
        }
        return false;
    }
    @Override
    public void study(Course course, int hours){
        if (course != null && coursesTaken.contains(course)) {
            studyTime.putIfAbsent(course,0);
            studyTime.put(course,studyTime.get(course)+hours);
        }
    }

    @Override
    public int takeExam(Exam exam){
        if (exam != null && coursesTaken.contains(exam.getExamCourse())) {
            Random random = new Random();
            int studentAverageScore;
            int examAverageScore;
            if(examsTaken.isEmpty()){
                studentAverageScore=50;
            }else{
                studentAverageScore = this.findAverageScore();
            }
            if(exam.getStudentsTakingExam().isEmpty()) {
                examAverageScore = 50;
            }else{
                examAverageScore = exam.findAverageScore();
            }
            int minPossibleScore = (examAverageScore+studentAverageScore+studyTime.get(exam.getExamCourse()))/2-10;
            int score = random.nextInt(20)+minPossibleScore;
            if (score < 0) {
                score = 0;
            } else if (score > 100) {
                score = 100;
            }
            examsTaken.put(exam,score);
            exam.addStudentToExam(this, score);
            return score;
        }
        return -1;
    }


    @Override
    public void findGPA(){
        double totalScore = 0;
        int totalCredits=0;
        for(Course course : coursesTaken) {
            totalCredits+= course.getCredits();
        }
        try {
            for (Exam exam : examsTaken.keySet()) {
                totalScore += exam.getExamCourse().getCredits() * examsTaken.get(exam) / (double) totalCredits;
            }
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: Division by zero. No courses taken.");
        }
        gpa=totalScore;
    }
    public boolean dropCourse(Course course){
        try{
            if (course == null) {
                throw new IllegalArgumentException("Course cannot be null.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (coursesTaken.contains(course)) {
            coursesTaken.remove(course);
            course.removeStudent(this);
            return true;
        }
        return false;
    }
    public int findAverageScore() {
        int totalScore = 0;
        try {
            for (int score : examsTaken.values()) {
                totalScore += score;
            }
            return totalScore / examsTaken.size();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero. No exams taken.");
            return 0;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: No exams taken.");
            return 0;
        }
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

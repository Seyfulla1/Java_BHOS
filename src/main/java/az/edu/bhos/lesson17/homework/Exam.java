package az.edu.bhos.lesson17.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Exam {
    private Course examCourse;
    private String examName;
    private int examDuration;
    private LocalDateTime examDateTime;
    private HashMap<Student,Double> studentsTakingExam;
    public Exam(Course examCourse, String examName, int examDuration, LocalDateTime examDateTime) {
        this.examCourse = examCourse;
        this.examName = examName;
        this.examDuration = examDuration;
        this.examDateTime = examDateTime;
        this.studentsTakingExam = new HashMap<>();
    }

}

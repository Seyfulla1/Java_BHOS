package az.edu.bhos.lesson17.homework;

public interface Gradable {
    double getGPA();
    int takeExam(Exam exam);
    boolean takeCourse(Course course);
    void study(Course course, int hours);


}

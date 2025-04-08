package az.edu.bhos.lesson17.homework;

public enum ExamType {
    MIDTERM(0.3),
    FINAL(0.4),
    QUIZ(0.1),
    PROJECT(0.2);

    double weight;
    ExamType(double weight) {
        this.weight=weight;
    }
    public double getWeight() {
        return weight;
    }


}

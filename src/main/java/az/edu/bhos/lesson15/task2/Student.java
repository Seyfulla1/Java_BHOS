package az.edu.bhos.lesson15.task2;

public class Student implements Comparable<Student> {
    private final long id;
    private final String name;
    private final String surname;
    private final boolean isMale;
    private double grade;
    private final int birthYear;

    public Student(long id, String name, String surname, boolean isMale, double grade, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isMale = isMale;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public double getGrade() {
        return grade;
    }
    public int getBirthYear() {return birthYear;}

    public void setGrade(double grade) {
        this.grade = grade;
    } // I added this just in case we want to change the grade


    @Override
    public int compareTo(Student that) {
        return Long.compare(id, that.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", birthYear=" + birthYear +
                ", name='" + name +
                ", surname='" + surname +
                ", gender=" + (isMale?"Male":"Female") +
                ", grade=" + grade;

    }
}
package az.edu.bhos.lesson15.task2;


import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(13L, "Alma", "Albali", true, 100,2000);
        Student s2 = new Student(5L, "Qiz", "Aliyeva", false, 100,2000);
        Student s3 = new Student(12L, "Balaeli", "Mestagali", true, 99,2001);
        Student s4 = new Student(7L, "Jahangir", "Qelemov", true, 50,1998);
        Student s5 = new Student(8L, "Davud", "Abdulbari", true, 75,1956);
        Student s6 = new Student(11L, "Eltural", "Xanov", true, 75,1999);
        Student s7 = new Student(3L, "Firengiz", "Zalova", false, 99,2002);
        Student s8 = new Student(2L, "Gulember", "Xanqizi", false, 50,1899);
        Student s9 = new Student(4L, "Hasan", "Huseynov", true, 75,1940);
        Student s10 = new Student(9L, "Ibrahim", "Ismayilov", true, 75.1,2005);
        Student s11 = new Student(1L, "Jalil", "Jamilov", true, 9.5,2003);
        Student s12 = new Student(10L, "Almaxanim", "Sahqizi", false, 50,1899);
        Student s13 = new Student(15L, "Camal", "Jamilov", true, 9.5,2003);
        Student s14 = new Student(14L, "Camal", "Jamilov", true, 9.5,2003);
        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11,s12,s13,s14};
        Checker checker = new Checker();
        Arrays.sort(students, checker);
        for (Student student : students) {
            System.out.println(student);

        }
        Arrays.sort(students);
        System.out.println("-------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.println(student);

        }

    }
}

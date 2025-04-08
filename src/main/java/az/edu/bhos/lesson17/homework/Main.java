package az.edu.bhos.lesson17.homework;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Ali", "Aliyev", 17,true,143,230104001);
        Student s2=new Student("Shahmerdan","Balayev",19,true,170,210105003);
        Student s3=new Student("Nigar","Caniyeva",18,false,181,220104001);
        Student s4=new Student("Xanqiz","Qarali",21,false,133,200105021);
        Student s5=new Student("Aysel","Quliyeva",20,false,120,240102017);
        Teacher t1=new Teacher("Rashad","Xanbabazade",35,true,2000,101);
        Teacher t2=new Teacher("Zerrin","Qemberova",30,false,1500,102);
        Course java=new Course("Java","CS101",5);
        Course python=new Course("Python","CS102",4);
        Course cpp=new Course("C++","CS103",5);
        Course calc1=new Course("Calculus I","MATH101",4);
        Course calc2=new Course("Calculus II","MATH102",6);
        Course phy1=new Course("Physics I","PHYS101",3);
        Course phy2=new Course("Physics II","PHYS102",4);
        Course hist=new Course("History","HIST101",3);
        Course geo=new Course("Geography","GEOG101",2);
        Course civilDef=new Course("Civil Defense","CIV101",2);
        s1.takeCourse(java);
        s1.takeCourse(calc2);
        s1.takeCourse(hist);
        s2.takeCourse(cpp);
        s2.takeCourse(java);
        s2.takeCourse(phy1);
        s3.takeCourse(hist);
        s3.takeCourse(phy2);
        s3.takeCourse(calc2);
        s4.takeCourse(calc1);
        s4.takeCourse(phy1);
        s4.takeCourse(python);
        s5.takeCourse(phy2);
        s5.takeCourse(geo);
        s5.takeCourse(civilDef);
        s1.study(java,40);
        int e1= s1.takeExam(java.getExam());
        int e2= s1.takeExam(calc2.getExam());
        int e3=s1.takeExam(phy2.getExam());
        int e4= s1.takeExam(hist.getExam());
        t1.assignCourse(java);
        t1.assignCourse(cpp);
        t2.assignCourse(calc1);
        t2.assignCourse(calc2);
        t1.setExam(java,120, LocalDateTime.of(2025,4,10,14,0));
        t1.setExam(cpp,90,LocalDateTime.of(2025,4,11,14,0));
        t2.setExam(calc1,60,LocalDateTime.of(2025,4,12,14,0));
        t2.setExam(calc2,75,LocalDateTime.of(2025,4,13,14,0));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            objectMapper.writeValue(new File("student.json"), new Student[]{s1, s2, s3, s4, s5});
            objectMapper.writeValue(new File("teacher.json"), new Teacher[]{t1, t2});
            objectMapper.writeValue(new File("course.json"), new Course[]{java, cpp, calc1, calc2, phy1, phy2, hist, geo, civilDef});
            objectMapper.writeValue(new File("exam.json"), new Exam[]{java.getExam(), calc1.getExam(), calc2.getExam()});
        }catch (Exception e){
            System.out.println("An error occurred while writing to files ");
        }

    }
}

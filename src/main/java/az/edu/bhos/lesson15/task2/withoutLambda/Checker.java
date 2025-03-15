package az.edu.bhos.lesson15.task2.withoutLambda;

import java.util.Comparator;

public class Checker implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if(a.getGrade() != b.getGrade()){
            return Double.compare(b.getGrade(), a.getGrade());
        }
        if(a.getBirthYear() != b.getBirthYear()){
            return Integer.compare(a.getBirthYear(), b.getBirthYear());
        }
        if(a.getIsMale() != b.getIsMale()){
            return a.getIsMale()? -1 : 1;
        }
        if(!a.getSurname().equals( b.getSurname())){
            return a.getSurname().compareTo(b.getSurname());
        }
        if(!a.getName().equals( b.getName())){
            return b.getName().compareTo(a.getName());
        }
        else{
            return Long.compare(a.getId(), b.getId());
        }


    }
}

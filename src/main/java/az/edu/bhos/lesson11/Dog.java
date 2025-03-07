package az.edu.bhos.lesson11;

public class Dog extends Pet{
    @Override
    public void respond() {
        System.out.println("Dog is barking");
       // System.out.println("Hello, owner. I am - "+super.getNickName()+". I miss you!");
    }

}

package az.edu.bhos.lesson17;

public class StackOverflowApp {
    public static void main(String[] args) {
        try {
            int a = method(5, 7);
        }catch(StackOverflowError e){
            System.out.println("Stack overflow error!!!!");
        }
    }
    public static int method(int a,int  b) {
        return a+method(a, b);
    }

}

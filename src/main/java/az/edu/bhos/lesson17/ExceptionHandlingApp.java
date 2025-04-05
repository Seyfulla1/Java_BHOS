package az.edu.bhos.lesson17;

public class ExceptionHandlingApp {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            arr[4] = 3;
            int a=5/0;
        }catch(ArithmeticException ex){
            System.out.println("Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
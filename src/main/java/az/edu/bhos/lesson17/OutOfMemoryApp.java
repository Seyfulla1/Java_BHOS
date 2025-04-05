package az.edu.bhos.lesson17;

public class OutOfMemoryApp {
    public static void main(String[] args) {
        try {
            String[] str = new String[1000000 * 100000];
        }catch(OutOfMemoryError e) {
            System.out.println("Out of memory error!!!!");
        }
    }
}

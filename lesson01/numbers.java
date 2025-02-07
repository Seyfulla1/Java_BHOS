import java.util.Scanner;
import java.util.Random;
public class numbers {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Random rand = new Random();
        int rand_num = rand.nextInt(101);
        String name=new Scanner(System.in).nextLine();
        System.out.println("Let the game begin!");
        while(true){
            System.out.print("Enter your guess: ");
            int guess=new Scanner(System.in).nextInt();
            if(guess==rand_num){
                System.out.println("Congratulations, "+name+"!");
                break;
            }
            else{
                System.out.println("Your number is too "+(guess>rand_num?"big":"small")+". Please try again.");
            }

        }


    }
}

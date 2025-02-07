import java.util.Scanner;
import java.util.Random;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rand_num = rand.nextInt(101);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Let the game begin!");
        while(true){
            System.out.print("Enter your guess: ");
            if(!(sc.hasNextInt()))
            {
                sc.next();
                continue;
            }
            int guess=sc.nextInt();

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

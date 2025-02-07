import java.util.Scanner;
import java.util.Random;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rand_num = rand.nextInt(101);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        int[] nums = new int[101];
        int index=0;
        System.out.println("Let the game begin!");
        while(true) {
            System.out.print("Enter your guess: ");
            String str_guess=sc.nextLine();
            if (!isInt(str_guess)) {
                continue;
            }
            int guess = Integer.parseInt(str_guess);
            nums[index++] = guess;

            if (guess == rand_num) {
                System.out.println("Congratulations, " + name + "!");
                break;
            } else {
                System.out.println("Your number is too " + (guess > rand_num ? "big" : "small") + ". Please try again.");
            }

        }
        sortArray(nums, index);
        System.out.print("Your numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }


    }
    public static boolean isInt(String str) {
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static void sortArray(int[] nums,int index) {
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

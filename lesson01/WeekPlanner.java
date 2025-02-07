import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0]="Sunday";
        schedule[0][1]="do homework";
        schedule[1][0]="Monday";
        schedule[1][1]="go to courses; watch a film";
        boolean wantToExit = false;
        while(!wantToExit)
        {
            System.out.print("Please, input the day of the week: ");
            String day = sc.nextLine().trim().toUpperCase();
            switch(day){
                case "SUNDAY":
                    System.out.println("Your text for Sunday: "+schedule[1][1]);
                    break;
                    case "MONDAY":
                        System.out.println("Your text for Monday: "+schedule[0][1]);
                        break;
                        case "EXIT":
                            wantToExit = true;
                            break;
                            default:
                                System.out.println("Soory, I don't understand you, please try again.");

            }
            if(wantToExit)
            {
                break;
            }
        }

    }
}

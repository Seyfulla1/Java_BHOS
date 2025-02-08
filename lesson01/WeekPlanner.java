import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0]="Sunday";
        schedule[0][1]="do homework";
        schedule[1][0]="Monday";
        schedule[1][1]="go to courses; watch a film";
        schedule[2][0]="Tuesday";
        schedule[2][1]="play football";
        schedule[3][0]="Wednesday";
        schedule[3][1]="read a book";
        schedule[4][0]="Thursday";
        schedule[4][1]="doing nothing";
        schedule[5][0]="Friday";
        schedule[5][1]="blaabla";
        schedule[6][0]="Saturday";
        schedule[6][1]="partying";


        boolean wantToExit = false;
        while(!wantToExit)
        {
            System.out.print("Please, input the day of the week: ");
            String day = sc.nextLine().trim().toUpperCase();
            switch(day){
                case "SUNDAY":
                    System.out.println("Your text for Sunday: "+schedule[0][1]);
                    break;
                    case "MONDAY":
                        System.out.println("Your text for Monday: "+schedule[1][1]);
                        break;
                        case "TUESDAY":
                            System.out.println("Your text for Tuesday: "+schedule[2][1]);
                            break;
                            case "WEDNESDAY":
                                System.out.println("Your text for Wednesday: "+schedule[3][1]);
                                break;
                                case "THURSDAY":
                                    System.out.println("Your text for Thursday: "+schedule[4][1]);
                                    break;
                                    case "FRIDAY":
                                        System.out.println("Your text for Friday: "+schedule[5][1]);
                                        break;
                                        case "SATURDAY":
                                            System.out.println("Your text for Saturday: "+schedule[6][1]);
                                            break;
                                            case "EXIT":
                                                wantToExit = true;
                                                break;
                                            default:
                                                if(day.startsWith("CHANGE")||day.startsWith("RESCHEDULE"))
                                                {
                                                    String dayToChange = day.substring(day.indexOf(" ")+1);
                                                    int i;
                                                    for(i=0; i< schedule.length; i++)
                                                    {
                                                        if(schedule[i][0].toUpperCase().equals(dayToChange))
                                                        {
                                                            System.out.println("Please, input the new tasks for "+schedule[i][0]);
                                                            schedule[i][1]=sc.nextLine();
                                                            break;
                                                        }
                                                    }
                                                    if(i== schedule.length)
                                                    {
                                                        System.out.println("Sorry, I don't understand you, please try again.");
                                                    }

                                                }else
                                                {
                                                    System.out.println("Sorry, I don't understand you, please try again.");
                                                }

            }
            if(wantToExit)
            {
                break;
            }
        }

    }
}

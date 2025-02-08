
import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_int= new Scanner(System.in);
        Random rand = new Random();
        int target_row = rand.nextInt(5);
        int target_col = rand.nextInt(5);
        int row;
        int col;
        String[][] board= new String[5][5];
        int[][] targets=new int[3][2];
        int rowOrCol=rand.nextInt(2);
        int constantPoint=rand.nextInt(5);
        int random_index=rand.nextInt(3);
        for(int i=0;i<3;i++){
            if(rowOrCol==0){
                targets[i][0]=constantPoint;
                targets[i][1]=random_index++;
            }
            else {
                targets[i][1]=constantPoint;
                targets[i][0]=random_index++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(targets[i][0]+" "+targets[i][1]);
        }

        initBoard(board);
        System.out.println("All set. Get ready to rumble!");
        System.out.println("Which mode do you want to play:\n1.Normal\n2.Area shooting");
        int mode = sc_int.nextInt();

        int shooting_needed=0;
        int counter=0;
        switch(mode){
            case 1:shooting_needed=1;break;
            case 2:shooting_needed=3;break;
            default:System.out.println("Invalid mode");
        }
        while(true){
            printBoard(board);
            while(true){
                System.out.print("Enter a line to fire(1-5): ");
                String str_line = sc.nextLine();
                    if(isInt(str_line)&&isInRange(Integer.parseInt(str_line),1,board.length)){
                        row=Integer.parseInt(str_line)-1;
                        break;
               }
            }
            while(true){
                System.out.print("Enter a bar to fire(1-5): ");
                String  str_bar = sc.nextLine();
                if(isInt(str_bar)&&isInRange(Integer.parseInt(str_bar),1,board.length)){
                    col=Integer.parseInt(str_bar)-1;
                    break;
                }
            }
            if(row==target_row&&col==target_col){
                if(!(board[row][col].equals("x")))
                {
                    board[row][col]="x";
                    counter++;
                    if(counter==shooting_needed)
                    {
                        break;
                    }
                }
            }
            else {
                board[row][col]="*";
            }
        }
        printBoard(board);
        System.out.println("You have won!");





    }
    public static void initBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "-";
            }
        }
    }
    public static void printBoard(String[][] board) {
        for (int i = 0; i <= board[0].length; i++) {
            System.out.print(i+" | ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i+1+" | ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
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
    public static boolean isInRange(int index,int min, int max) {
        return index >= min && index <= max;
    }

}

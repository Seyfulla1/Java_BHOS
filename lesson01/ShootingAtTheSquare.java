import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target_row = rand.nextInt(5);
        int target_col = rand.nextInt(5);
        String[][] board= new String[5][5];
        initBoard(board);
        printBoard(board);


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
}

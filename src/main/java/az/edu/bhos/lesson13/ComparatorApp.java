package az.edu.bhos.lesson13;

import java.util.Arrays;
public class ComparatorApp {
    public static void main(String[] args) {
        Player p1 = new Player("Alma", 100);
        Player p2 = new Player("Vali", 100);
        Player p3 = new Player("Balaeli", 200);
        Player p4 = new Player("Jahangir", 50);
        Player p5 = new Player("Davud", 150);
        Player p6 = new Player("Eltural", 150);
        Player p7 = new Player("Firengiz", 200);
        Player p8 = new Player("Gulember", 50);
        Player p9 = new Player("Hasan", 150);
        Player p10 = new Player("Ibrahim", 150);
        Player p11 = new Player("Jalil", 400);

        Player[] players = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,p11};

        Checker checker = new Checker();
        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}

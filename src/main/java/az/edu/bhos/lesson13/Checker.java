package az.edu.bhos.lesson13;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b){
        if(a.getScore() == b.getScore()){
            return a.getName().compareTo(b.getName());
        }
        return Integer.compare(a.getScore(), b.getScore());
    }
}

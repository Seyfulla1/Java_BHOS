package az.edu.bhos.lesson13;

public class Player {
    private final String name;
    private final int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return name + " " + score;
    }
}

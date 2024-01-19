package software.ulpgc.kata6;

public class Game {

    private final Shape p1;
    private final Shape p2;

    public Game(Shape p1, Shape p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public String play(){
        if (p1.play(p2) == 1) return "P1 Wins";
        if (p1.play(p2) == -1) return "P2 Wins";
        return "Draw";
    }
}

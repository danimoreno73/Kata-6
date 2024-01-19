package software.ulpgc.kata6;

public class Rock implements Shape{
    @Override
    public int play(Shape opponentShape) {
        if(opponentShape.getClass() == Scissor.class){
            return 1;
        } else if (opponentShape.getClass() == Paper.class) {
            return -1;


        }
        return 0;
    }
}

package software.ulpgc.kata6;

public class Paper implements  Shape{
    @Override
    public int play(Shape opponentShape) {
        if(opponentShape.getClass() == Rock.class){
            return 1;
        } else if (opponentShape.getClass() == Scissor.class) {
            return -1;

        }
        return 0;
    }
}



import org.junit.Test;
import software.ulpgc.kata6.Game;
import software.ulpgc.kata6.Paper;
import software.ulpgc.kata6.Rock;
import software.ulpgc.kata6.Scissor;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    @Test
    public void should_return_draw_when_both_players_plays_same_shape(){
        String state = new Game(new Rock(), new Rock()).play();
        assertThat(state).isEqualTo("Draw");
    }

    @Test
    public void should_return_P1Wins_when_P1_plays_Paper(){
        String state = new Game(new Paper(), new Rock()).play();
        assertThat(state).isEqualTo("P1 Wins");
    }

    @Test
    public void should_return_P2Wins_when_P2_plays_Scissor(){
        String state = new Game(new Paper(), new Scissor()).play();
        assertThat(state).isEqualTo("P2 Wins");
    }

    @Test
    public void should_return_P1Wins_when_P1_plays_Rock(){
        String state = new Game(new Rock(), new Scissor()).play();
        assertThat(state).isEqualTo("P1 Wins");
    }

    @Test
    public void should_return_P2Wins_when_P2_plays_Paper(){
        String state = new Game(new Rock(), new Paper()).play();
        assertThat(state).isEqualTo("P2 Wins");
    }
}

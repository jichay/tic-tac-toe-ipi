import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import service.GameUtils;

public class GameUtilsTest {

    @Test
    @DisplayName("Winner check test 1")
    public void checkWinnerTest1(){
        int[][] boardData = { {0, 0, 0} , { 0, 0, 0}, { 0, 0, 0} };
        assertFalse(GameUtils.checkWinner(boardData));
    }

    @Test
    @DisplayName("Winner check test 2")
    public void checkWinnerTest2(){
        int[][] boardData = { {1, 0, 0} , { 1, 0, 0}, { 1, 0, 0} };
        assertTrue(GameUtils.checkWinner(boardData));
    }

    @Test
    @DisplayName("Winner check test 3")
    public void checkWinnerTest3(){
        int[][] boardData = { {1, 0, 0} , { 0,1, 0}, { 0, 0, 1} };
        assertTrue(GameUtils.checkWinner(boardData));
    }

}

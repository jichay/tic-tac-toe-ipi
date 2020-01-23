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

    @Test
    @DisplayName("Winner check test 4")
    public void checkWinnerTest4(){
        int[][] boardData = { {1, 0, 0} , { 1, 0, 0}, { 1, 0, 0} };
        assertTrue(GameUtils.checkWinner(boardData));
    }

    @Test
    @DisplayName("Get Winner test 1")
    public void getWinnerTest1(){
        int[][] boardData = { {1, 0, 0} , { 1, 0, 0}, { 1, 0, 0} };
        int expected = 1;
        int actual = GameUtils.getWinner(boardData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get Winner test 2")
    public void getWinnerTest2(){
        int[][] boardData = { {2, 0, 1} , { 1, 2, 0}, { 1, 0, 0} };
        int expected = 0;
        int actual = GameUtils.getWinner(boardData);
        assertEquals(expected, actual);
    }

}

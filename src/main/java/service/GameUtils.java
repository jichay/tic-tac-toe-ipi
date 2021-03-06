package service;

public class GameUtils {

    /**
     * @param board state of the current game
     * @return boolean if there is a winner in vertical line
     */
    private static boolean checkVertical(int board[][]){
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0) return true;
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0) return true;
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0) return true;
        return false;
    }

    /**
     * @param board state of the current game
     * @return boolean if there is a winner in vertical line
     */
    private static boolean checkHorizontal(int board[][]){
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0) return true;
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0) return true;
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0) return true;
        return false;
    }

    /**
     * @param board state of the current game
     * @return boolean if there is a winner in vertical line
     */
    private static boolean checkDiagonal(int board[][]){
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) return true;
        return false;
    }

    /**
     * @param board state of the current game
     * @return return true if there is a winner according to the state
     */
    public static boolean checkWinner(int board[][]){
        if(checkVertical(board) || checkHorizontal(board) || checkDiagonal(board)) return true;
        return false;
    }

    /**
     * @param board state of the current game
     * @return return the number associated with the winning sign (0 if no winner)
     */
    public static int getWinner(int board[][]){
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0) return board[0][0];
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0) return board[0][1];
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0) return board[0][2];
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0) return board[0][0];
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0) return board[1][0];
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0) return board[2][0];
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) return board[0][0];
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) return board[0][2];
        return 0;
    }

}

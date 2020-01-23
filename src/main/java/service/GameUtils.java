package service;

public class GameUtils {
    public static boolean checkWinner(int board[][]){
        /**
         * Check Vertical win
         */
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0){
            return true;
        }
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0){
            return true;
        }
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0){
            return true;
        }
        /**
         * Check Horizontal win
         */
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0){
            return true;
        }
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0){
            return true;
        }
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0){
            return true;
        }
        /**
         * Check Vertical win
         */
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0){
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0){
            return true;
        }
        return false;
    }
}

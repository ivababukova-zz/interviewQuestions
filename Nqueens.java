/* solution to the nqueens problem */

import java.io.*;
java.lang.Math.*;

public class Nqueens {

    int[] board;
    int queens;

    public Nqueens(int[] board, int queens) {
        this.board = board;
        this.queens = queens;
    }
   
    // queens  = board size
    public void solve (int queens) {

                
        

        return board;
    } 

    private boolean check(int row, int col) {
        
    } 

    public static void main(String[] args) {
        int boardSize = Integer.parseInt(args[0]);
        System.out.println("board size: " + boardSize);
        int[] board = new int[boardSize];

        /* fill the board with 0s */   
        for (int i = 0; i < boardSize; i++) {
            board[i] = -1;
        }

        Nqueens nq = new Nqueens(board, boardSize);
        nq.solve(boardSize);
    }

}

package TictaktoGame;

import java.util.Scanner;

public class tictaktogame {

    public static void main(String[] args) {
        // Create a new instance of the game
        //Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];
        for(int row = 0 ; row< board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }

        }

        char currentPlayer = 'X';
        boolean gameOver = false;

        while(!gameOver){
            printBoard(board);

            for(int player = 1; player <= 2; player++) {
                System.out.println("Player " + player + ", enter your move (row and column): ");
                 Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();
              gameOver = haveWon(board, currentPlayer);

                if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                    System.out.println("Invalid move. Try again.");
                    player--; // Stay on the same player
                } else {
                    board[row][col] = currentPlayer;
                    if (haveWon(board, currentPlayer)) {
                        printBoard(board);
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameOver = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch players
                    }
                }
                
            }


        }
    }


    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }




    public static void printBoard(char[][] board) {
        System.out.println("Current board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("-----");
            }
        }
    }

}
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        char currentPlayer = 'X';

        Play(currentPlayer, board);

    }

    private static void Play(char current, char[][] board) {
        Scanner read = new Scanner(System.in);

        StartBoard(board);
        boolean ActveGame = true;

        while (ActveGame == true) {

            ShowBoard(board);
            
        }

    };

    public static void StartBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

    };

    public static void ShowBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
                if (j < 2) {
                    System.out.println("|");

                }

            }
            System.out.println();
            if (i < 2) {
                System.out.println("_____________");

            }
        }

    };

}

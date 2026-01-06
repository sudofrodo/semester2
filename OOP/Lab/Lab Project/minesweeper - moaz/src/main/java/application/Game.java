package application;

import java.util.Scanner;

public class Game {
    Board board;
    GameState gameState;
    //storing them just to validate user input.
    int rows; 
    int cols;

    public Game(int rows, int cols, int mines) {
        this.rows = rows; //will come from  class Main.
        this.cols = cols;
        board = new Board(rows , cols , mines);
        gameState = GameState.PLAYING;
    }
    
//    public void playGame() {
//        Scanner scanner = new Scanner(System.in);
//
//        while (gameState == GameState.PLAYING) {
//            board.printBoard();
//
//            System.out.println("Enter row (0-" + (rows-1) + ") and column (0-" + (cols-1) + "):");
//
//            int r = scanner.nextInt();
//            int c = scanner.nextInt();
//
//
//            Cell targetCell = board.revealCell(r, c);
//
//
//            if (targetCell != null) {
//
//                //targetCell.reveal();
//
//                if (targetCell.isMine) {
//                    //!!!
//                    gameState = GameState.LOST;
//                    System.out.println("BOOM! You hit a mine.");
//                }
//                if ( gameState != GameState.LOST && board.checkWin()==true){
//                    gameState = GameState.WON;
//                    System.out.println("You Won!!!");
//                }
//
//            } else {
//                System.out.println("Invalid coordinates!");
//            }
//        }
        
        
//        board.printBoard();//to show the last results.
//        System.out.println("Game has been Finished!");
//    }
}
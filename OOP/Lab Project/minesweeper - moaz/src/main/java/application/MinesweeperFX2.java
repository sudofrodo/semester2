package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.reflect.Field;
import java.util.Objects;

public class MinesweeperFX2 extends Application {

    // Game ke parameters jo Main mai use ho rahe hain
    private static final int ROWS = 10;
    private static final int COLS = 10;
    private static final int MINES = 10;

    private Game game;
    private Cell[][] gridSnapshot;           // reflection jb call hoga to uska snapshot lia jyega
    private Button[][] buttons;
    private Label minesLabel;
    private Label timerLabel;
    private Timeline timeline;
    private int secondsElapsed = 0;

    private GridPane gridPane;

   // private Stage stage;
    @Override
    public void start(Stage stage) {
        // game logic ka naya instance banate hain

        newGame();

        // bar k top pe counter, restart button aur timer hai
        minesLabel = new Label("Mines: " + MINES);
        minesLabel.setFont(Font.font(16));
        timerLabel = new Label("Time: 0");
        timerLabel.setFont(Font.font(16));

        Button restart = new Button("Restart");

        restart.setStyle("-fx-font-size: 14; -fx-border-color: black; -fx-focus-color: transparent; -fx-faint-focus-color: transparent");
        restart.setOnAction(e -> {
            stopTimer();
            newGame();
            stage.setTitle("MineSweeper");
            updateBoard();
            startTimer();
        });

        HBox topBar = new HBox(12, minesLabel, timerLabel, restart);
        topBar.setPadding(new Insets(10));

        // grid banate hain
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(8));
        gridPane.setHgap(2);
        gridPane.setVgap(2);

        buttons = new Button[ROWS][COLS];

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                Button btn = new Button();
                btn.setPrefSize(44, 44);
                btn.setFont(Font.font(18));

                final int row = r;
                final int col = c;

                btn.setOnMouseClicked(ev -> handleCellClick(ev, row, col, stage));
                buttons[r][c] = btn;
                gridPane.add(btn, c, r);
            }
        }

        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(gridPane);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Minesweeper");
        stage.setResizable(false);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("logo.png")));
        stage.getIcons().add(icon);
        stage.show();
       // updateBoard();
        startTimer();
    }

    
    //Naya Game instance banate hain aur private grid ko reflection se access karte hain.
    //Yeh sirf runtime pe reflection use karta hai, source file ko change nahi karta.

    private void newGame() {
        game = new Game(ROWS, COLS, MINES);
        refreshGridSnapshot();
    }


    //Reflection se Board ke andar private Cell[][] grid fetch karte hain.
    //gridSnapshot reference ko update rakhta hai jab game logic cells change karta hai.
    
    private void refreshGridSnapshot() {
        try {
            // Game class se board field access karte hain (package-private)
            Field boardField = Game.class.getDeclaredField("board");
            boardField.setAccessible(true);
            Object boardObj = boardField.get(game);

            // Board ke andar private 'grid' field access karte hain
            Field gridField = boardObj.getClass().getDeclaredField("grid");
            gridField.setAccessible(true);
            Object rawGrid = gridField.get(boardObj);

            // cast karte hain Cell[][] mai
            gridSnapshot = (Cell[][]) rawGrid;
        } catch (Exception e) {
            throw new RuntimeException("Reflection fail ho gaya: " + e.getMessage(), e);
        }
    }

    
    //UI ko update karte hain taa ke current game state dikhai de
    
    private void updateBoard() {
        // snapshot ko update karo
        refreshGridSnapshot();

        Platform.runLater(() -> {
            int flaggedCount = 0;
            for (int r = 0; r < ROWS; r++) {
                for (int c = 0; c < COLS; c++) {
                    Cell cell = gridSnapshot[r][c];
                    Button btn = buttons[r][c];

                    // default styling
                    btn.setDisable(false);
                    btn.setStyle(null);

                    if (cell.isRevealed) {
                        btn.setDisable(true);
                        if (cell.isMine) {
                            btn.setText("💣");
                            btn.setStyle("-fx-background-color: lightgray; -fx-border-color: gray;");
                        } else if (cell.adjacentMines > 0) {
                            btn.setText(String.valueOf(cell.adjacentMines));
                            btn.setStyle("-fx-background-color: lightgray; -fx-border-color: gray;");
                            colorNumber(btn, cell.adjacentMines);
                        } else {
                            btn.setText("");
                            btn.setStyle("-fx-background-color: lightgray; -fx-border-color: gray;");
                        }
                    } else {
                        // agar cell reveal nahi hua
                        if (cell.isFlagged) {
                            btn.setText("🏳");
                            flaggedCount++;
                            //btn.setStyle("-fx-font-size: 5;");
                        } else {
                            btn.setText("");
                        }
                    }

                    // agar game lost hai, to revealed mines ko red color do
                    if (game.gameState == GameState.LOST && cell.isMine && cell.isRevealed) {
                        btn.setStyle("-fx-background-color: red; -fx-border-color: gray;");
                    }
                }
            }
            minesLabel.setText("Mines: " + (MINES - flaggedCount));
        });
    }

    
    //Classic Minesweeper jaise numbers ko color do
    
    private void colorNumber(Button btn, int n) {
        // numbers 1-8 ke liye color assign karte hain
        String color = switch (n) {
            case 1 -> "blue";
            case 2 -> "green";
            case 3 -> "red";
            case 4 -> "darkblue";
            case 5 -> "brown";
            case 6 -> "turquoise";
            case 7 -> "orange";
            case 8 -> "gray";
            default -> "black";
        };
        btn.setStyle(btn.getStyle() + "-fx-text-fill: " + color + ";");
        btn.setStyle(btn.getStyle() + "-fx-font-weight: bold;");
    }

    //Sab mines ko reveal kar do (jab game lose ho)
    private void revealAllMines() {
        refreshGridSnapshot();
        Platform.runLater(() -> {
            for (int r = 0; r < ROWS; r++) {
                for (int c = 0; c < COLS; c++) {
                    Cell cell = gridSnapshot[r][c];
                    Button btn = buttons[r][c];
                    if (cell.isMine) {
                        btn.setText("💣");
                        btn.setStyle("-fx-background-color: red; -fx-border-color: gray;");
                    }
                }
            }
        });
    }

    //Timer simple hai, har second update hota hai */
    private void startTimer() {
        secondsElapsed = 0;
        timerLabel.setText("Time: 0");
        if (timeline != null) {
            timeline.stop();
        }
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
            // sirf tab run karo agar game chal raha ho
            if (game.gameState == GameState.PLAYING) {
                secondsElapsed++;
                timerLabel.setText("Time: " + secondsElapsed);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void stopTimer() {
        if (timeline != null) {
            timeline.stop();
        }
    }

    @Override
    public void stop() {
        stopTimer();
    }

    private void handleCellClick(MouseEvent ev, int row, int col, Stage stage) {
        // agar game khatam ho gaya hai toh clicks ignore karo
        if (game.gameState != GameState.PLAYING) return;

        try {
            // Refresh grid snapshot
            refreshGridSnapshot();

            Cell cell = gridSnapshot[row][col];

            if (ev.getButton() == MouseButton.PRIMARY) {
                handleLeftClick(row, col, cell);
            } else if (ev.getButton() == MouseButton.SECONDARY) {
                handleRightClick(cell);
            }

            updateBoard();
            checkGameEndState(stage);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void handleLeftClick(int row, int col, Cell cell) {
        // Reveal cell
        game.board.revealCell(row, col);

        if (cell.isMine) {
            game.gameState = GameState.LOST;
        } else if (game.board.checkWin()) {
            game.gameState = GameState.WON;
        }
    }

    private void handleRightClick(Cell cell) {
        // right click: flag toggle karo (sirf agar cell reveal nahi hua ho)
        if (!cell.isRevealed) {
            cell.isFlagged = !cell.isFlagged;
        }
    }

    private void checkGameEndState(Stage stage) {
        if (game.gameState == GameState.LOST) {
            stopTimer();
            revealAllMines();
            stage.setTitle("Game Over!");
        } else if (game.gameState == GameState.WON) {
            stopTimer();
            stage.setTitle("You Won!");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

    private void gameGUISetup(){

    }
}

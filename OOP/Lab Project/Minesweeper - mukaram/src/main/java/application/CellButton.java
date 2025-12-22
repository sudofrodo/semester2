package application;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

// INHERITANCE: CellButton IS-A Button
public class CellButton extends Button {
    private int row;
    private int col;

    // We can also store the Cell object directly to make updates easier!
    private Cell cell;

    public CellButton(int r, int c, Cell cell) {
        this.row = r;
        this.col = c;
        this.cell = cell;

        // Default styling
        this.setPrefSize(40, 40); // Size of the square
        this.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public Cell getCell() { return cell; }
}
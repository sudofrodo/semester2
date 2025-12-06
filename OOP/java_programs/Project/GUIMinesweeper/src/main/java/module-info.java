module application.guiminesweeper {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.guiminesweeper to javafx.fxml;
    exports application.guiminesweeper;
}
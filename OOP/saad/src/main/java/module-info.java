module application.saad {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.saad to javafx.fxml;
    exports application.saad;
}
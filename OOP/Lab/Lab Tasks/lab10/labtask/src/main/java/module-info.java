module application.labtask {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.labtask to javafx.fxml;
    exports application.labtask;
}
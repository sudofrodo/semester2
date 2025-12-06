module test.semester {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.semester to javafx.fxml;
    exports test.semester;
}
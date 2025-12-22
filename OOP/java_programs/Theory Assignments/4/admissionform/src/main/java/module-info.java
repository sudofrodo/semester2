module application.admissionform {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens application.admissionform to javafx.fxml;
    exports application.admissionform;
}
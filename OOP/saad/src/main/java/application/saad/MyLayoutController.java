package application.saad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class MyLayoutController {

    @FXML
    Button btnConfirm;

    @FXML
    Label response;

    @FXML
    ToggleGroup tg;

    @FXML
    void onClickHandler(ActionEvent event) {
        RadioButton rb = (RadioButton) tg.getSelectedToggle();
        response.setText(rb.getText() + " is confirmed.");
    }
}

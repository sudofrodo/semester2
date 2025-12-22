package application.admissionform;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import static javafx.collections.FXCollections.observableArrayList;

public class FormController {
    @FXML
    private ComboBox<String> campusesCombo;
    public void initliaze(){
        campusesCombo.setItems(observableArrayList("Lahore", "Islamabad", "Attock", "Abottabad","Sahiwal", "Vehari"));

    }
}

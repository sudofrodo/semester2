package application.labtask;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Task2 extends Application {


    @FXML
    private Button btnConfirm;
    @FXML
    private ToggleGroup tg;
    @FXML
    private Label response;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Lab JavaFX from FXML");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MyLayout.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();

    }

    public void onClickHandler(ActionEvent event){
        RadioButton rb = (RadioButton) tg.getSelectedToggle();
        response.setText(rb.getText() + " is confirmed.");
    }


}

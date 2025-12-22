package application.labtask;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Task1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{

        Label choose = new Label("Select your semester");
        Label response = new Label("No semester mentioned.");
        Button btnConfirm = new Button("Confirm Semester Selection");
        RadioButton rbOne = new RadioButton("One");
        RadioButton rbTwo = new RadioButton("Two");
        RadioButton rbThree = new RadioButton("Three");
        ToggleGroup tg = new ToggleGroup();
        rbOne.setToggleGroup(tg);
        rbTwo.setToggleGroup(tg);
        rbThree.setToggleGroup(tg);
        rbOne.setSelected(true);
        Separator separator = new Separator();
        separator.setPrefWidth(190);

        stage.setTitle("Lab JavaFX");

        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);

        btnConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RadioButton rb = (RadioButton) tg.getSelectedToggle();
                response.setText(rb.getText() + " is confirmed.");
            }
        });
        rootNode.getChildren().addAll(choose, rbOne, rbTwo, rbThree, separator, btnConfirm, response);


        Scene myScene = new Scene(rootNode, 300, 180);
        stage.setScene(myScene);
        stage.show();
        stage.centerOnScreen();


    }


}
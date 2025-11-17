package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        stage.setWidth(900);
        stage.setHeight(700);
        stage.setX(100);
        stage.setY(100);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
        Scene firstScene = new Scene(root);
        stage.setTitle("Parchian");
        stage.setScene(firstScene);

        stage.show();
       // stage.centerOnScreen();

    }



}

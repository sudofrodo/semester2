package application.saad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Lab JavaFX from FXML");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("MyLayout.fxml"));
        Parent rootNode = loader.load();

        Scene myScene = new Scene(rootNode);
        stage.setScene(myScene);
        stage.show();
    }
}

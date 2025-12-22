package application.admissionform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader =new FXMLLoader(getClass().getResource("AdmissionForm.fxml"));
        Parent root = loader.load();
        FormController controller = loader.getController();
        controller.initliaze();
        Scene scene = new Scene(root);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("logo.png")));
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("COMSATS");
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }

}

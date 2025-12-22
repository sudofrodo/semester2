


import javafx.Label;
import javafx.Stage;
import javafx.ToggleGroup;
public class Main extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{

        Label choose = Label("Select your semester");
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
        rootNode.setAlignment = (Pos.CENTER);
        rootNode.getChildren().addAll(choose, rbOne, rbTwo, rbThree, separator, btnConfirm, response);
        
        
        Scene myScene = new Scene(rootNode, 300, 180);
        stage.setScene(myScene);
        stage.show();
        stage.centerOnScreen();
       

    }
}
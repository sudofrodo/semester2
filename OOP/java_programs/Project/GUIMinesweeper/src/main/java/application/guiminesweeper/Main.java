package application.guiminesweeper;

import gameMechanism.Game;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    Game game = new Game(10,10,10);
    @Override
    public void start(Stage stage) throws Exception {
            stage.setWidth(900);
            stage.setHeight(900);
            stage.show();
            stage.centerOnScreen();



    }
    public ArrayList<Button> makeButtons(int no){
        ArrayList<Button> buttonList = new ArrayList<>();
        //cell array

        for(int i = 0 ; i < no ; i++){
            //status = cellarray[i];
            buttonList.add(new Button());
            //button.setId("minehere");
            //butoon.setId(number);
        }
        return buttonList;
    }
    public void buttonPressed(ActionEvent event){

    }
}

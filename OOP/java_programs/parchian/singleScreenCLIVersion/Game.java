import java.util.Scanner;
import java.util.ArrayList;
public class Game{
public static void main(String[] args)
{

    try (Scanner input = new Scanner(System.in)) {
        ArrayList<Player> playersList = SetupGame.setUpPlayers(input);
        ArrayList<Parchi> parchiList = SetupGame.setUpParchis(input);
        
        System.out.print("How many Rounds do you want to play: ");
        int rounds = input.nextInt();
        
        GamePlay g1 = new GamePlay(playersList, parchiList);
        
        for(int i = 0; i < rounds; i++){
            g1.gameFunction();
            g1.printRoundResult();
            g1.resetGame();
            if(i < rounds - 1){
                System.out.println("\n===========================Next Round=====================");
            }
        }
        
        g1.displayStandings();
    }
}
}

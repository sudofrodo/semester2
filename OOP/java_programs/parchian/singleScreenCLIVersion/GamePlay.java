import java.util.ArrayList;
import java.util.Collections;

public class GamePlay
{
    private final int noOfPlayers;
    private final ArrayList<Parchi> parchiHand;
    private ArrayList<Player> playerList;
    private ArrayList<Player> currentRoundScores = new ArrayList<>();
    public GamePlay(ArrayList<Player> playerList, ArrayList<Parchi> parchiHand)
    {
        noOfPlayers = playerList.size();
        this.parchiHand = parchiHand;
        this.playerList = playerList;
        Factory.distributeParchis(parchiHand, playerList);
        Factory.setStartingPlayer(playerList); 
    };
    
    public void resetGame()
    {
        Collections.shuffle(parchiHand);
        for(Player p: playerList){
            p.clearHand();
        }
        Factory.distributeParchis(parchiHand, playerList);
        Factory.setStartingPlayer(playerList);
    }

    public void gameFunction()
    {
        ArrayList<Player> runningPlayerList = new ArrayList<>(playerList); 
        System.out.println("\nPlayer " + runningPlayerList.get(0).getName() + " will start the game." );
        Factory.displayPassingOrder(runningPlayerList);
        while(!runningPlayerList.isEmpty())
        {
            int receiveIdx;
            for (int currentIdx = 0; currentIdx < runningPlayerList.size(); currentIdx++)
            {
                Player currentPlayer = runningPlayerList.get(currentIdx);
                receiveIdx = currentIdx + 1;
                currentPlayer.showHand();

                if(currentPlayer.allSameCheck(noOfPlayers))
                {
                    System.out.println("\nYOU WON. YOU'RE NOW OUT!!!");
                    currentPlayer.scoreSetter();
                    currentRoundScores.add(currentPlayer);
                    runningPlayerList.remove(currentIdx);
                    currentIdx = currentIdx - 1;
                    ConsoleUtility.clearScreen();
                    continue;
                }

                Parchi passedParchi = currentPlayer.passParchi();

                boolean winner = currentPlayer.allSameCheck(noOfPlayers);
                if(winner)
                    System.out.println("\nYOU WON. YOU'RE NOW OUT!!!");

                ConsoleUtility.clearScreen();

                if(receiveIdx == runningPlayerList.size())
                {
                receiveIdx = 0;
                runningPlayerList.get(receiveIdx).recieveParchi(passedParchi);
                } else 
                {
                    runningPlayerList.get(receiveIdx).recieveParchi(passedParchi);
                }

                if(winner)
                {
                  currentPlayer.scoreSetter();
                  currentRoundScores.add(currentPlayer);
                  runningPlayerList.remove(currentIdx);
                  currentIdx = currentIdx - 1;
                }
                
            }
            
        }
      
    }

    
    
    public void printRoundResult()
    {
    System.out.println("\n==================== Round Results ======================");
    System.out.println("=======================================================");
    System.out.printf("%-20s %-15s %-5s%n", "PLAYER NAME", "WINNING PARCHI", "POINTS");
    System.out.println("-------------------- --------------- -----");
    currentRoundScores = Factory.sortByHighestScore(currentRoundScores, 'r');
    for(Player p : currentRoundScores)
    {
        p.displayScore();
    }
    System.out.println("=======================================================\n");
    currentRoundScores.clear();
    }


    public void displayStandings() {
        playerList = Factory.sortByHighestScore(playerList, 's');
        System.out.println("                GAME FINISHED            ");
        System.out.println("=========================================");
        System.out.println("                FINAL SCORES             ");
        System.out.println("=========================================");
        System.out.printf("  %-3s | %-20s | %-5s\n", "No.", "PLAYER NAME", "SCORE");
        System.out.println("------------------------------------------");

        int count = 1;
        for (Player player : playerList) {
            String name = player.getName();
            int score = player.getTotalScore();
            System.out.printf("  %-3d | %-20s | %-5d\n", count++, name, score);
        }
        System.out.println("\nPlayer " + playerList.get(0).getName() + " is winner of the game.");
        System.out.println("=========================================");
    }
}
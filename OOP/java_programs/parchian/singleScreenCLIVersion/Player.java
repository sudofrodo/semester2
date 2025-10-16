import java.util.ArrayList;
import java.util.Scanner;
public class Player
{
    private final String name;
    private final ArrayList<Parchi> playerHand = new ArrayList<>();
    private int score;
    private int totalScore;
    private String winningParchi;
    private final Scanner input;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
        this.totalScore = 0;
        this.input = new Scanner(System.in);
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public int getTotalScore()
    {
        return totalScore;
    }
    public ArrayList<Parchi> getPlayerHand()
    {
        return playerHand;
    }

    public void clearHand()
    {
        playerHand.clear();
    }

    public void showHand()
    {
        System.out.println("\nPlayer : " + name);
        System.out.println();
        for(int i = 0; i < playerHand.size(); i++)
        {
            System.out.print((i + 1) + ": ");
            playerHand.get(i).displayParchi();
            System.out.println();
        }
    }

    public Parchi passParchi() {
    int num;
    int maxRange = playerHand.size();
    
    while (true) {
        System.out.print("Which Parchi you want to pass ?\nEnter the number!: ");
        
        while (!input.hasNextInt()) {
            System.out.println("Error: Input must be a number.");
            input.next(); 
            System.out.print("Which Parchi you want to pass ?\nEnter the number!: ");
        }
        
        num = input.nextInt();
        input.nextLine(); 
        
        if (num >= 1 && num <= maxRange) {
            break;
        } else {
            System.out.println("Error: Number must be between 1 and " + maxRange + ".");
        }
    }
    
    int indexToRemove = num - 1;
    Parchi passingParchi = playerHand.get(indexToRemove);
    playerHand.remove(indexToRemove);
    return passingParchi;
    }

    public void recieveParchi(Parchi p)
    {
        playerHand.add(p);
        showRecievedParchi();
      
    }

    public void showRecievedParchi()
    {
        Parchi recievedParchi = playerHand.get(playerHand.size() - 1);
        String message = name + " , you have recieved this parchi => " + recievedParchi.getParchiName() + "(" + recievedParchi.getParchiPoints() + ")";
        System.out.println(message);
    }

    public void addParchi(Parchi p)
    {
        playerHand.add(p);
    }

    public boolean allSameCheck(int players)
    {
        if(playerHand.size() != players)
            return false; 
        else
        {
        Parchi checkParchi = playerHand.get(0);
        for(int i = 0; i < playerHand.size(); i++)
        {
            if(playerHand.get(i).equals(checkParchi) == false)
            {
                return false;
            }
        }
        return true;
        }
    }

    public void scoreSetter()
    {
        winningParchi = playerHand.get(0).getParchiName();
        score = playerHand.get(0).getParchiPoints();
        totalScore += score;
    }

    public void displayScore()
    {
    System.out.printf("%-20s %-15s %-5d%n", name, winningParchi, score);
    }

    

}
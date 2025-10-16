import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class SetupGame
{
    private SetupGame(){};
    private static int numPlayers;
    public static ArrayList<String> getPlayersName(Scanner input)
    {
    System.out.print("Please enter the number of Players (4 or 5): ");
    ArrayList<String> playersName = new ArrayList<>();
    numPlayers = input.nextInt();
    input.nextLine();
    for(int i = 0 ; i < numPlayers; i++)
    {  
        System.out.print("Enter player name (" + (i+1) + "): ");
        String name = input.nextLine();
        playersName.add(name);
    }
    return playersName;
    }

    public static ArrayList<Player> setUpPlayers(Scanner input)
    {
        ArrayList<String> playersName = getPlayersName(input);
        Factory.setPlayersList(playersName);
        return Factory.getPlayersList();
    }

    public static Map<String, Integer> getCustomCities(Scanner input)
    {
        Map<String, Integer> cities = new HashMap<>();
        for(int i = 0 ; i < numPlayers; i++){
        System.out.println("Please enter city name: ");
        input.nextLine();
        String cityName = input.nextLine();
        System.out.println("Please enter city points: ");
        int points = input.nextInt();
        cities.put(cityName, points);
        if(i != numPlayers - 1){
            System.out.println("\nNext City: ");
        }
        }
        return cities;
    }

    public static ArrayList<Parchi> setUpParchis(Scanner input)
    {
    ArrayList<Parchi> parchiList;
    System.out.print("Do you want to make custom cities or go with default cities (c/d): ");
    char choice = input.next().charAt(0);
    if (choice == 'd')
    {
        Factory.setDefaultCities(numPlayers);
        parchiList = Factory.getAllParchis();   
    } else {
        Map<String, Integer> cities = getCustomCities(input);
        Factory.setCustomCities(cities);
        parchiList =  Factory.getAllParchis();
    }
    Collections.shuffle(parchiList);
    setStarterParchi(parchiList);
    return parchiList;
    }
    
    public static void setStarterParchi(ArrayList<Parchi> parchis)
    {
        int randomIdx = getRandomNumber(0, parchis.size() - 1);
        parchis.get(randomIdx).setStarting(true);   
    }

    public static int getRandomNumber(int min, int max) {
    int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
    return randomNumber;
    }

 
}

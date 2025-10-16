import java.util.ArrayList;
import java.util.Map;
public class Factory
{
    private Factory(){};
    private static int set = 0;
    private static final ArrayList<Parchi> allParchis = new ArrayList<>();
    private static final ArrayList<Player> playersList = new ArrayList<>();
    
    public static void setDefaultCities(int players)
    {
        set = players;
        if(players == 4)
        {
            cityInitiliazer("Karachi" , 40);
            cityInitiliazer("Lahore", 30);
            cityInitiliazer("Quetta", 20);
            cityInitiliazer("Peshawar", 10);
        }
        if(players == 5)
        {
            cityInitiliazer("Karachi", 50);
            cityInitiliazer("Lahore", 40);
            cityInitiliazer("Quetta", 30);
            cityInitiliazer("Peshawar", 20);
            cityInitiliazer("Islamabad", 10);
        }
    }

    public static void setCustomCities(Map<String, Integer> cities)
    {
        set = cities.size();
        cities.forEach((cityName, points) -> {
            cityInitiliazer(cityName, points);
        });
    }
    
    public static ArrayList<Parchi> getAllParchis()
    {
        return allParchis;
    }

    private static void cityInitiliazer(String cityName, int cityPoints)
    {
        for(int i = 0; i < set; i++)
        {
            Parchi p = new Parchi(cityName, cityPoints);
            allParchis.add(p);
        }
    }
    
    public static void setPlayersList(ArrayList<String> players)
    {
        for(String player: players)
        {
            Player p = new Player(player);
            playersList.add(p);
        }
        
    }

    public static ArrayList<Player> getPlayersList()
    {
        return playersList;
    }
    

    public static ArrayList<Player> distributeParchis(ArrayList<Parchi> parchis, ArrayList<Player> players)
    {
        
        int startIdx = 0;
        for(int round = 0; round < set; round++)
        {
            for(int innerIdx = startIdx; innerIdx < startIdx + set; innerIdx++ ){
            players.get(round).addParchi(parchis.get(innerIdx));
            }
            startIdx += set;
        }
        return players;
    }

    
    public static boolean checkStarter(Player p) 
    {
    ArrayList <Parchi> playerHand = p.getPlayerHand();
    
        for(Parchi parchi: playerHand){
            if(parchi.getStarting()) {
                return true;
            }
        }
        
        return false;
    }
    
   public static ArrayList<Player> sortByHighestScore(ArrayList<Player> playerList, char choice) {
    ArrayList<Player> sortedPlayers = new ArrayList<>(playerList);
    int n = sortedPlayers.size();
    for (int j = 0; j < n - 1; j++) { 
        for (int i = 0; i < n - j - 1; i++) { 
            Player first = sortedPlayers.get(i);
            Player second = sortedPlayers.get(i + 1);
            
            if(choice == 's')
            {
                if (second.getTotalScore() > first.getTotalScore())
                {
                Player temp = first;
                sortedPlayers.set(i, second);               
                sortedPlayers.set(i + 1, temp);
                }
            } else 
            {
            if (second.getScore() > first.getScore())
            {
                Player temp = first;
                sortedPlayers.set(i, second);               
                sortedPlayers.set(i + 1, temp);
            }
            }
        }
    }
    return sortedPlayers;
    }

   

    public static void setStartingPlayer(ArrayList<Player> playerList)
    {
        for(Player p: playerList){
            if(checkStarter(p)){
                int idx = playerList.indexOf(p);
                if(idx != 0){
                Player first = playerList.get(0);
                playerList.set(0,p);
                playerList.set(idx,first);
                }
                break;
            }
        }
    }

    public static void displayPassingOrder(ArrayList<Player> playerList)
    {
        String order = "\nThe passing order will be: ";
        for(Player p: playerList){
            order += p.getName() + " ---> ";
        }
        order += playerList.get(0).getName();
        System.out.println(order);
    }
   
}

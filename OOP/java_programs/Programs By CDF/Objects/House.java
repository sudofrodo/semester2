public class House{
    private int stories;
    private String material;
    private double price;

    public House(int stories , String material, double price){
        this.stories = stories;
        this.material = material;
        this.price = price;
    }

    public void upgradeHouse(int xp){
        System.out.println("Your house has been upgraded to " + xp + " xp.");
    }

    public void sellHouse(int price){
        System.out.println("Your house is sold at this price: " + price);
    }
}
public class Fruits{
    private String name;
    private int quantity;
    private double price;

    public Fruits(){};
    public Fruits(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args){
        Fruits f1 = new Fruits("kiwi" , 500 , 500);
        System.out.println(f1.toString());
        
    }
   @Override
    public String toString(){
        String message = "This is a Fruit instance: " + name + " " + price + " " + quantity;
        return message;
    }
    
    public void extra(){};
    public void ParentExtra(){
        System.out.println("this is parenet extar");
    }
}
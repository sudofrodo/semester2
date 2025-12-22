public class Animal{
    private String name;
    private int power;
    public Animal(String name){
        this.name = name;
        power = 1;
    }
    public void move(){
        System.out.println("moving");
    }

    public static void attack(){
        System.out.println("attacks");
    }
    
    public static void jump(){
        System.out.println("jumps");
    }
    public void eat(){
        System.out.println("eats");
        power++;
    }

    public int getPower() {
        return power;
    }

}
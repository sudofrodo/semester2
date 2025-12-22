public class Horse extends Animal{
    private String color;
    public Horse(String name , String color){
        super(name);
        this.color = color;
    }
    @Override
    public void move(){
        System.out.println("tak tak tak");
    }

    //overloading
    public void move(int n){
        for(int i = 0 ; i <= n ; i++){
            this.move();
        }
    }
    //static method can not be overrided , 
    public static void attack(){
        System.out.println("pulls up legs");
    }
    public void fitInCarriage(){
        System.out.println("Fitted in Carriage");
    }
}
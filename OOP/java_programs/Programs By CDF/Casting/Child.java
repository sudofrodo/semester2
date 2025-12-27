public class Child extends Parent{
    private int y;
    private String name;
    public Child(){};
    public Child(int x, int y, String name){
        super(x,name);
        this.y = y;
    }
    public Child(int y){
        super();
        this.y = y;
    }

    public int getY(){
        System.out.println("Child Specific Method");
        return y;
    }

    public static void show(){
        System.out.println("I am Child");
    }

 
    
    
}
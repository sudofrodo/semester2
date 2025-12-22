public class Horse{
    private int age;
    private String color;
    private static int no;
    private int stepsWalked;

    public Horse(int age, String color){
        this.age = age;
        this.color = color;
        no++;
    }

    public void walkAStep(){
       System.out.println("Walked a step");
       stepsWalked++;
    }

    public static int getNo(){
        return no;
    }

    public int getNum(){
        return no;
    }

    public int getStepsWalked(){
        return stepsWalked;
    }
    
    //static variable can be accessed from non static method as well as static method
    //non static variable can only be accessed from non static method
    
}
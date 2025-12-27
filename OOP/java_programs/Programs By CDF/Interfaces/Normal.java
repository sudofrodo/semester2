//normal interface
interface testInterface{
    //in interfaces variables are public static final by default;
    int a = 10;
    //default methods are feature of Interafaces , these are not like static functions
    //and are called on the object of the class. implementing interface.

    default void display(){
        System.out.println("athar" + a);
    }

    //interfaces  support static methods , they are not inherited by
    //classes implementing them.
    static void show(){
        System.out.println("showing: ");
    }

    //interfaces now have private methods. they also are not inherited ,
    //thus cannot be overriden

    private double test(){
        return Math.random();
    }
    
    


}
public class Normal implements testInterface{
    public static void main(String[] args){
        DefaultMethods dm = new DefaultMethods();
        dm.display();
        testInterface.show();
    }
}
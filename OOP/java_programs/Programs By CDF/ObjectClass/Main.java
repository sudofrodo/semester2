//every class in java extends from Object class , it have some special methods that can be overrided;
public class Main{
    public static void main(String[] args){
        Tower t1 = new Tower(20, "Daira Hisar");
        Tower t2 = new Tower(20, "Daira Hisar");
        System.out.println(t1.equals(t2));
        System.out.println(t1);
        //if toString() method is not overrided it prints object name and its address.
    }
}
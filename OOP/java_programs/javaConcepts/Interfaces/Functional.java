@FunctionalInterface
interface Calculator{
    int operate(int a , int b);
}
public class Functional{
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;
        Calculator subtract = (a,b) -> a - b;
        Calculator multiply = (a,b) -> a * b;
        Calculator divide = (a,b) -> a / b;

        System.out.println("add : " + add.operate(10,15));
   }
   

}


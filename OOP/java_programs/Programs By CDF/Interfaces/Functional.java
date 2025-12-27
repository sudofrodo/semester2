@FunctionalInterface
interface Calculator{
    int operate(int a , int b);
}
public class Functional{
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;
        Calculator subtract = (a,b) -> a - b;
        Calculator multiply = (a,b) -> a * b;
        Calculator divide = (a,b) -> {
            if(b == 0)
                throw new ArithmeticException("Cannot divide by zero");
            return a/b;
        };

        System.out.println("add : " + add.operate(10,15));
   }
   

}

//bts
/* class add implements Calculator{
@Override public int operate(int a , int b){
return a + b;
}
} */

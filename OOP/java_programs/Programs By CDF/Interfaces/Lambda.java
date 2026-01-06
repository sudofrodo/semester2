import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Lambda {
   public static void main(String[] args){
        //built in functional interfaces;
        Predicate<Integer> isEligible = (num) -> num > 18;
        System.out.println(isEligible.test(20));
        
        Function<String, Integer> stringToLength = (str) -> str.length();
        System.out.println(stringToLength.apply("lahore"));

        Consumer<String> printer = (msg) -> System.out.println("Working: " + msg);
        printer.accept(" on Java.");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



   } 
}

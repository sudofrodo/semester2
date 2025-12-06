import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try{
            System.out.println("Please enter an integer numerator : ");
            int numer = scanner.nextInt();
            System.out.println("Please enter an integer denominator: ");
            int denom = scanner.nextInt();

            int result = quotient(numer, denom);
            System.out.println("Numerator: " + numer + " Denominator: " + denom + "\nResult: " + result);
            continueLoop = false;
            } catch(InputMismatchException ime){
                System.err.println("Exception: " + ime);
                scanner.nextLine();
                System.out.println("You must enter integers: ");
            } catch(ArithmeticException ae){
                System.err.println("Exception: " + ae);
                System.out.println("Zero is an invalid denominator , try again");
            }
        
        } while(continueLoop);
    }
    
    public static int quotient(int numerator , int denominator) throws ArithmeticException{
        return numerator / denominator;
    }

    
    
}
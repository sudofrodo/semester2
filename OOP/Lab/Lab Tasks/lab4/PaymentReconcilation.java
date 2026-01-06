import java.util.Scanner;
public class PaymentReconcilation{
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of payments: ");
    int payments = input.nextInt();
    int[] paymentAmounts = new int[payments];
    for(int i = 0 ; i < payments; i++){
        System.out.print("Enter the payment amounts: ");
        paymentAmounts[i] = input.nextInt();
    }
    System.out.print("Enter the target sum: ");
    int targetSum = input.nextInt();
    boolean pairFound = false;
    for(int i = 0; i < payments; i++){
        int firstNum = paymentAmounts[i];
        if(i + 1 == payments){
            break;
        }
        else {
        for(int j = i + 1; j < payments; j++){
            int secondNum = paymentAmounts[j];
                if(firstNum + secondNum == targetSum){
                    System.out.print("(" + firstNum + ", " + secondNum + ")");
                    pairFound = true;
                }

        }
        }
    }
    if(!pairFound){
        System.out.print("NO pairs found.");
    }
}
}
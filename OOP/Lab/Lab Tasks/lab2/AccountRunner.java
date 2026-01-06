import java.util.Scanner;
public class AccountRunner{
public static void main(String args[]) {
    Account a1 = new Account("athar");
    a1.checkBalance();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter amout to deposit : ");
    a1.depositAmount(input.nextInt());
    a1.checkBalance();
    System.out.println("Enter the amount to withdraw : ");
    a1.withdrawAmount(input.nextInt());
    a1.checkBalance();

    Account a2 = new Account("ali" , 500);
   // a2.depositAmount(1300);
   // a2.withdrawAmount(300);
    //a2.checkBalance();

  }
}

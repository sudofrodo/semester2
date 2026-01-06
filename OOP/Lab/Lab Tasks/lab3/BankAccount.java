public class BankAccount{
  private int accountNumber;
  private String accountHolder;
  private double balance;
  private static int accountCounter;
  BankAccount(){
    accountCounter++;
  };
  BankAccount(int accountNum , String holder , double bal){
  accountNumber = accountNum;
  accountHolder = holder;
  balance = bal;
  accountCounter++;
  }
  public void deposit(double amount){
  showAccountStatus();
  balance += amount;
  System.out.println(amount + " PKR has been deposited in your account. Your current Account Status: ");
  showAccountStatus();
  }
  public void withdraw(double amount){
    if (balance - amount < 1000) {
      System.out.println("You cannot withdraw any amount. Minimum balance will be reached.");
      showAccountStatus();
      return;
    } else if (amount >= balance) {
      System.out.println("You cannot withdraw amount. Insufficient funds.");
      showAccountStatus();
      return;
    }
    showAccountStatus();
    balance -= amount;
    System.out.println(amount + " PKR has been withdrawn from your account. Your current Account Status: ");
    showAccountStatus();
  }
  public static void getTotalAccounts() {
    System.out.println("Total number of accounts created : " + accountCounter);
  }
  public void showAccountStatus() {
    System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance + " PKR" );
    
  }
  public static void main(String args[]) {
    BankAccount a1 = new BankAccount(1,"athar",1000);
    BankAccount a2 = new BankAccount(2,"ahmad", 2000);
    BankAccount a3 = new BankAccount(3,"moaz" , 3000);
    a1.deposit(1300);
    a1.withdraw(1100);
    a2.deposit(1400);
    a2.withdraw(1600);
    a3.deposit(300);
    a3.withdraw(2500);
    a3.getTotalAccounts();
  }
}

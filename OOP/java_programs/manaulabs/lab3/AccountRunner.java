class Account{
  private int balance;
  public Account(){
    balance = 0;
  };
  public Account(int bal) {
    balance = bal;
  }
  public void withdrawAmount(int amount) {
    balance -= amount;
    System.out.println(amount + " has been withdrawn from your account.");
  }
  public void depositAmount(int amount) {
    balance += amount;
    System.out.println(amount + " has been deposited in your account.");
  }
  public int getBalance() {
  return balance;
  }
  public void setBalance(int bal) {
  balance = bal;
  }
}

public class AccountRunner{
  public static void main(String args[]) {
  Account a1 = new Account(1200);
  Account a2 = new Account(a1.getBalance());
  System.out.println("Account a2 , Balance: " + a2.getBalance());
  }
}

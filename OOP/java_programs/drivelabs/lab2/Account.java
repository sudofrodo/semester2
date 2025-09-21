  public class Account{
  private int balance;
  private String title;
  public Account(){};
  public Account(String name){
    title = name;
    balance = 500;
  };
  public Account(String name , int bal) {
    balance = bal;
    title = name;
  }
  public void withdrawAmount(int amount) {
    balance -= amount;
    System.out.println(amount + " has been withdrawn from your account.");
  }
  public void depositAmount(int amount) {
    balance += amount;
    System.out.println(amount + " has been deposited in your account.");
  }
  public void checkBalance() {
    System.out.println("Account Name : " + title);
    System.out.println("Balance: " + balance);
  }
  
}

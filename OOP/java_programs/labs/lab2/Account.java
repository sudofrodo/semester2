public class Account{
  public int balance;
  public String name;
  public String accountType;
  public Account(){
    balance = 0;
  };
  public Account(String name, String accountType) {
    balance = 0;
    this.name = name;
    this.accountType = accountType;
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
    System.out.println("Balance: " + balance);
  }
  
  public static void main(String args[]) {
    Account a1 = new Account();
    a1.depositAmount(2000);
    a1.withdrawAmount(500);
    a1.checkBalance();

    Account a2 = new Account("athar" , "current");
    a2.depositAmount(1300);
    a2.withdrawAmount(300);
    a2.checkBalance();

  }


}

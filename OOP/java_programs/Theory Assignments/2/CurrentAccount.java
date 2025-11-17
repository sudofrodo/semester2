public class CurrentAccount{
    private int id;
    private double openingBalance;
    private String holderName;
    private int age;
    private boolean zakatOpt;
    private double balance = 0;

    public CurrentAccount(){};
    public CurrentAccount(int id, double openingBalance, String name, int age, boolean zakatOpt){
        this.id = id;
        this.openingBalance = openingBalance;
        this.balance += openingBalance;
        this.holderName = name;
        this.age = age;
        this.zakatOpt = zakatOpt;
    }

    public static void main(String[] args) {
        CurrentAccount a = new CurrentAccount(202 , 13400, "Ajmal Nasir" , 46, true);
        a.checkBalance();
        a.deposit(15000);
        a.withdraw(10000);
        a.deductZakat();
        a.checkBalance();
    }

    public void withdraw(double amount){
        System.out.println("\nWithdrawing money:");
        if(getBalance() > amount){
        balance -= amount;
        System.out.println("Amount: " + amount + " has been withdrawn from your account.\n" + "Your Current Balance is " + getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount){
        System.out.println("\nDepositing money:");
        balance += amount;
        System.out.println("Amount: " + amount + " has been deposited in your account.\n");
        System.out.println("Current status:");
        checkBalance();
    }

    
    public void checkBalance(){
        System.out.println("\nBalance Checking:");
        System.out.println("Name : " + holderName + "\nAccount Id: " +  id + "\nCurrent Balance: " + balance);
    }
    
    public double deductZakat(){
        System.out.println("\nDeducting Zakat.");
        if(zakatOpt){
            double zakat = EarningAccounts.bankersRound(balance * 0.025);
            balance -= zakat;
            return zakat;   
        }
        return 0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isZakatOpt() {
        return zakatOpt;
    }

    public void setZakatOpt(boolean zakatOpt) {
        this.zakatOpt = zakatOpt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
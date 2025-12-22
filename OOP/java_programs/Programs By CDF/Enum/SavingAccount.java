public class SavingAccount extends EarningAccounts{
    private enum Category {
        YOUNGSAVER(0.06), ADULTSAVER(0.07), SENIORCITIZENSAVER(0.08);
        private final double ratio;
        private Category(double ratio) {
            this.ratio = ratio;
        }
        public double getratio() {
            return ratio;
        }        
    };
    private final Category accountCategory;
   
    public SavingAccount(int id, double openingBalance, String name, int age, boolean zakatOpt,boolean filer){
        super(id,openingBalance,name,age,zakatOpt,filer);
        if (getAge() < 35){
            accountCategory = Category.YOUNGSAVER;
        } else if (getAge() >= 35 && getAge() <= 50){
            accountCategory = Category.ADULTSAVER;
        } else {
            accountCategory = Category.SENIORCITIZENSAVER;
        }
    }

    @Override
    public double calculateEarnings(){
        double saving = (accountCategory.getratio() * getBalance());
        if(isfiler()){
        saving -= (saving * 0.15); //capital gain taxes;
        } else {
            saving -= (saving * 0.25);
        }
        return bankersRound(saving);
    }
    
    @Override
    public void withdraw(double amount){
        System.out.println("\nWithdrawing money:");
        double profit = calculateEarnings();
        double totalBalance = getBalance() + profit;
        if(amount > totalBalance){
            System.out.println("Insufficient funds");
        } else {
            setBalance(totalBalance);
            double filerTax;
            String status;
            if(isfiler()){
                filerTax = bankersRound(profit * 0.02);
                status = "Filer";
            } else {
                filerTax = bankersRound(profit * 0.04);
                status = "Non-filer";
            }
            setBalance(bankersRound(getBalance() - (amount + filerTax))); 
            String message = String.format(
            "Name: %s\nAccount Id: %s\nAmount withdrawn: %.2f\nWithdrawal Tax(%s): %.2f\nCurrent Balance: %.2f\n",
            getHolderName(),
            getId(),
            amount,
            status,
            filerTax,
            getBalance());
            System.out.printf(message);
        }
    }
    
    @Override
    public void checkBalance(){
        System.out.println("\nBalance Checking:");
        System.out.println("Name : " + getHolderName() + "\nAccount Id: " + getId() + "\nCurrent Balance: " + getBalance() + "\nSavings: " + calculateEarnings());
    }

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(99,145000,"Kazim Shah", 76, true, true);
        s1.checkBalance();
        System.out.println("\nCurrent Earnings: " + s1.calculateEarnings());
        s1.deductZakat();
        s1.withdraw(34000);
    }
}
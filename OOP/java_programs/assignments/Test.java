public class Test{
    public static void main(String[] args) {
        // CurrentAccount b = new CurrentAccount(1,1000,"athar", 22,true );
 
        // b.checkBalance();
        // b.deposit(3000);
        // b.withdraw(5000);
        // b.deductZakat();
        // b.checkBalance();

        // SavingAccount s = new SavingAccount(106,10000,"bakar", 50,true,true);

        // s.checkBalance();
        // System.out.println("Current Earnings: " + s.calculateEarnings());
        // s.deposit(10000);
        // s.deductZakat();
        // s.withdraw(5000);
        // s.reinvest();
        // s.checkBalance();

        InvestmentAccount i = new InvestmentAccount(103,35000,"cassua", 45,true,false,5);
        i.checkBalance();
        System.out.println("\nCurrent Earnings: " + i.calculateEarnings());
        i.deductZakat();
        i.withdraw(5000);
        i.reinvest();
        i.checkBalance();

        System.out.println("\nTotal Liabilities: " + EarningAccounts.getTotalProfitPaid(i));
}
}
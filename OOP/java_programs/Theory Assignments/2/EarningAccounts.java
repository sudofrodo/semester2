import java.math.BigDecimal;
import java.math.RoundingMode; // for banking systems round off
public class EarningAccounts extends CurrentAccount{
    private boolean filer;
    
    public EarningAccounts(int id, double openingBalance, String name, int age, boolean zakatOpt, boolean filer){
        super(id,openingBalance,name,age,zakatOpt);
        this.filer = filer;
    }
    
    public double calculateEarnings(){
        return 0.0;
    };
   
    public static double getTotalProfitPaid(EarningAccounts... records){
        double liabilities = 0.0;
        for(EarningAccounts account: records){
            liabilities += account.calculateEarnings();
        }
        return bankersRound(liabilities);
    }

    public void reinvest(){
        System.out.println("\nReinvesting money:");
        double earnings = bankersRound(calculateEarnings());
        System.out.println("Current Earnings " + earnings + " are reinvested.");
        setBalance(bankersRound(getBalance() + earnings));
        System.out.println("Your current balance is : " + getBalance());
    }
    
    //to round off numbers by banking conventions. (AI written)
    public static double bankersRound(double value) {
    BigDecimal bd = new BigDecimal(String.valueOf(value));
    BigDecimal roundedBd = bd.setScale(2, RoundingMode.HALF_EVEN);
    return roundedBd.doubleValue();
    }

    public boolean isfiler() {
        return filer;
    }
    
    public void setfiler(boolean filer) {
        this.filer = filer;
    }  
}
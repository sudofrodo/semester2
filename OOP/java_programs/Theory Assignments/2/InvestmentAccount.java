public class InvestmentAccount extends EarningAccounts{

    private enum plans{ONEYEARPLAN(1,0.1), THREEYEARPLAN(3,0.12), FIVEYEARPLAN(5,0.14); 
        private final double ratio;
        private final int years;
        private plans(int years , double ratio) {
            this.years = years;
            this.ratio = ratio;
        }
        public double getRatio(){
            return this.ratio;
        }

        public int getYears() {
            return years;
        }
    };
    private plans investmentPlan;
    private Countries country;
    private int yearAccountOpened;
    //average inflation rates of different countries from previous 5 years.
    private enum Countries{
            PAKISTAN("pakistan" , 0.1650, 0.1650), CHINA("china", 0.0116, 0.15), LEBANON("lebanon", 1.3548,0.15), JAPAN("japan" , 0.0167,0.20), USA("usa", 0.0420,0.20) , UK("uk", 0.0430,0.20), FRANCE("france",0.0284,0.30);
            private final String country;
            private final double inflationRate;
            private final double capitalGainTax;
            private Countries(String country, double rate, double tax) {
            inflationRate = rate;
            this.country = country;
            this.capitalGainTax = tax;
            }
            
            public String getCountryName() {
                return country;
            }

            public double getInflationRate(){
                return inflationRate;
            }

            public double getCapitalGainTax() {
            return capitalGainTax;
            }
    }
    
    
    public InvestmentAccount(int id, double openingBalance, String name, int age, boolean zakatOpt,boolean filer, int plan){
        super(id,openingBalance,name,age,zakatOpt,filer);
        switch (plan) {
            case 1:
                investmentPlan = plans.ONEYEARPLAN;
                break;
            case 3:
                investmentPlan = plans.THREEYEARPLAN;
                break;
            case 5:
                investmentPlan = plans.FIVEYEARPLAN;
            default:
                break;
        }
    }

    public InvestmentAccount(int id, double openingBalance, String name, int age, boolean zakatOpt,boolean filer, int plan, int year , String countryName){
    this(id,openingBalance,name,age,zakatOpt,filer,plan);
        switch (countryName) {
            case "pakistan":
                this.country = Countries.PAKISTAN;
                break;
            case "china":
                this.country = Countries.CHINA;
                break;
            case "lebanon":
                this.country = Countries.LEBANON;
                break;
            case "japan":
                this.country = Countries.JAPAN;
                break;
            case "usa":
                this.country = Countries.USA;
                break;
            case "uk": 
                this.country = Countries.UK;
                break;
            case "france":
                this.country = Countries.FRANCE;
                break;
            default:
                this.country = null;
                break;
        }
            yearAccountOpened = year;
    }
    

    @Override
    public double calculateEarnings(){
        double currentBalance = getBalance();
        double profit = 0.0;
        double profitRate = investmentPlan.getRatio();
        for(int i = 1 ; i <= investmentPlan.getYears();i++){
            profit += currentBalance * profitRate;
            currentBalance += profit;
        }
        if(isfiler()){
        profit -= (profit * 0.15); //capital gain taxes;
        } else {
            profit -= (profit * 0.25);
        }
        return bankersRound(profit);
    }

    
    public double getRealProfitRatio(){
        double currentBalance = getBalance();
        double totalProfit = 0.0;
        double profitRate = investmentPlan.getRatio();
        int yearPlan = investmentPlan.getYears();
        for(int i = 1 ; i <= yearPlan ;i++){
            double yearlyProfit = currentBalance * profitRate;
            currentBalance += yearlyProfit;
            totalProfit += yearlyProfit;
        }
        totalProfit -= totalProfit * country.getCapitalGainTax();
        //inflation adjustment
        /*multiplicative factor is the factor by which the price of something will change by inflation rate,
        in base of pow function we have the inflation factor of price for 1 year ,
        to scale it to other years , we have that number in exponent of pow.*/
        double multiplicativeFactor = Math.pow((1 + country.getInflationRate()),yearPlan); 
        double realReturn = totalProfit / multiplicativeFactor;
        return bankersRound(realReturn);
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
            double surcharge = bankersRound(amount * 0.04);
            setBalance(getBalance() - (amount + filerTax + surcharge)); 
            String message = String.format(
            "Name: %s\nAccount Id: %s\nAmount withdrawn: %.2f\nWithdrawal Tax(%s): %.2f\nSurcharge: %.2f\nCurrent Balance: %.2f\n",
            getHolderName(),
            getId(),
            amount,
            status,
            filerTax,
            surcharge,
            getBalance());
            System.out.printf(message);
        }
    }

    @Override
    public void checkBalance(){
        System.out.println("\nBalance Checking:");
        System.out.println("Name : " + getHolderName() + "\nAccount Id: " + getId() + "\nCurrent Balance: " + getBalance() + "\nProfit: " + calculateEarnings());
    }

    public double getProfitRatio(){
        return investmentPlan.getRatio();
    }
    public String getCountryName(){
        return country.getCountryName();
    }
    public static void main(String[] args) {
        
        InvestmentAccount a = new InvestmentAccount(901, 1560000, "Hisham Khalil" , 76, true, true, 3);
        InvestmentAccount a2 = new InvestmentAccount(907, 89000, "Jasim Naeem" , 34, true, false,1);

        a.checkBalance();
        System.out.println("\nCurrent Earnings: " + a.calculateEarnings());
        a.withdraw(56000);
        System.out.println();
        a.reinvest();
        System.out.println("\nTotal Profit paid by the bank: " + getTotalProfitPaid(a,a2));
        


        //for checking highest return , --the extra feature.
       // int id, double openingBalance, String name, int age, boolean zakatOpt,boolean filer, int plan, int year , String countryName
        InvestmentAccount pak = new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"pakistan");
        InvestmentAccount usa = new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"usa");
        InvestmentAccount uk =  new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"uk");
        InvestmentAccount lebanon = new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"lebanon");
        InvestmentAccount france = new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"france");
        InvestmentAccount china =  new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"china");
        InvestmentAccount japan =  new InvestmentAccount(109,40000,"athar",49,false,false,5,2018,"japan");

        InvestmentAccount[] accounts = new InvestmentAccount[]{pak,usa,uk,lebanon,france,china,japan};   
        checkHighestReturn(accounts);


        //total Money paid by the bank

    }

    public static void checkHighestReturn(InvestmentAccount[] collection){
        double highestReturns = 0;
        String countryName = "";
            for(InvestmentAccount acc : collection){
                double returns = acc.getRealProfitRatio();
                if(returns > highestReturns){
                    highestReturns = returns;
                    countryName = acc.getCountryName();
                }
        }
        System.out.println("\nHighest return: "+ highestReturns +  "  is by country: " + countryName + " (over investement of 40000).");
    }

    public int getYearAccountOpened() {
        return yearAccountOpened;
    }

    public void setYearAccountOpened(int yearAccountOpened) {
        this.yearAccountOpened = yearAccountOpened;
    }
}
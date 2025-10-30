public class ResidentialConnection extends WaterConnection{
    private double resTax = 2000;
    private double paidBill;
    public ResidentialConnection(){};
    public ResidentialConnection(String id, double units){
        super(id, units);
    }

    public double calculateBill(){
        return ((getConsumedUnits() * 25) + resTax);
    }

    public String payBill(double amount){
       double bill =  calculateBill();
        String message = "";
        bill -= amount;
        paidBill = amount;

        
        message += "Rs: " + amount + " paid.";
        if(bill != 0){
            message += "\nRemaining balance : "+ bill;
        } else {
            message += "Bill fully paid. Thank you!";
        }
        return message;
    }

    public double getResTax(){
        return resTax;
    }

    public void setResTax(double tax){
        resTax = tax;
    }

    public void displayInfo(){
        String message = "===Residential Connection===" 
        + "\nConnection Id: " + this.getConnectionId() 
        + "\nWater Units Used: " + this.getConsumedUnits()
        + "\nResidential Tax: " + this.getResTax() 
        + "\nTotal Bill: " + this.calculateBill()
        + "\n" + this.payBill(paidBill);
        System.out.println(message);
    }

}
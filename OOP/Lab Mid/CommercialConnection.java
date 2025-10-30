public class CommercialConnection extends WaterConnection{
    private double comTax = 5000;
    private double paidBill;
    public CommercialConnection(){};
    public CommercialConnection(String id, double units){
        super(id,units);
    }
    
    public double calculateBill(){
        return ((getConsumedUnits() * 40) + comTax);
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

    public double getComTax(){
        return comTax;
    }

    public void setComTax(double tax){
        comTax = tax;
    }

    public void displayInfo(){
        String message = "===Commercial Connection===" 
        + "\nConnection Id: " + this.getConnectionId() 
        + "\nWater Units Used: " + this.getConsumedUnits()
        + "\nCommercial Tax: " + this.getComTax() 
        + "\nTotal Bill: " + this.calculateBill()
        + "\n" + this.payBill(paidBill);
        System.out.println(message);
    }
}
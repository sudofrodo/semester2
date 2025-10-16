public class PermanentEmployee extends Employee
{
    private double hourlyIncome;

    public PermanentEmployee(String name, int empID, double hourlyIncome)
    {
        super(name, empID);
        this.hourlyIncome = hourlyIncome;
    }

    public double calculateIncome()
    {
        return 180 * hourlyIncome;
    }

    public String toString()
    {
        
        String message = super.toString() + "\nThis month salary @500 PKR/Hour = " + calculateIncome();
        return message;
    }

}
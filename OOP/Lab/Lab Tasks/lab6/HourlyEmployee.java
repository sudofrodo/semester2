import java.util.Scanner;
public class HourlyEmployee extends Employee
{
    private double hourlyIncome;
    private int totalHours;
    private final Scanner input;

    public HourlyEmployee(String name, int empID, double hourlyIncome)
    {
        super(name, empID);
        this.hourlyIncome = hourlyIncome;
        input = new Scanner(System.in);
        System.out.print("Enter Total Working Hours: ");
        this.totalHours = input.nextInt();
    }

    public double calculateHourlyIncome()
    {
        return hourlyIncome * totalHours;
    }

    public String toString()
    {
       
        String message =  super.toString() +  "\nThis month salary = " + totalHours + " * " +  hourlyIncome + " = " + calculateHourlyIncome();
        return message;
    }

}

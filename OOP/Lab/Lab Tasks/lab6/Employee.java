public class Employee
{
    private String name;
    private int empID;
    public Employee(String name, int id)
    {
        this.name = name;
        empID = id;
    }
    @Override
    public String toString()
    {
        String info = "Employee: " + name + " (ID: " + empID + ")";
        return info;
    }

    public static void main(String[] args)
    {
        HourlyEmployee hr1 = new HourlyEmployee("athar" , 135 , 500);
        PermanentEmployee pr1 = new PermanentEmployee("izhaar", 129 , 500);
        System.out.println("Hr1 , income: " + hr1.calculateHourlyIncome());
        System.out.println("Pr1 , income: " + pr1.calculateIncome());
        System.out.println("Employee Info");
        System.out.println(hr1);
        System.out.print(pr1);

    }

}
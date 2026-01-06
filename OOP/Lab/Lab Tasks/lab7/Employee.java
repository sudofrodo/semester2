public class Employee{
    private String name;
    private int salary;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void showDetails(){
    System.out.println("Name: " + name + ", Salary: " + salary);
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }   
    public static void main(String[] args) {
        Employee e = new Employee("Azhar", 35000);
        e.showDetails();

        Manager m = new Manager("Ajmal" , 86000, "Sales");
        m.showDetails();
        
        SeniorManager sm = new SeniorManager("Abbas" , 115000, "Finance" , "Excellent");
        sm.showDetails();

        SeniorManager sm2 = new SeniorManager("Akram" , 90000, "IT Department", "nill");
        sm2.showDetails();
    }
}
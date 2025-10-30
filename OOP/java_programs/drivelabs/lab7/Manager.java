public class Manager extends Employee{
    private String department;
    public Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    @Override
    public void showDetails(){
        System.out.println("Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + department);
    }
    public String getDepartment(){
        return department;
    }
}
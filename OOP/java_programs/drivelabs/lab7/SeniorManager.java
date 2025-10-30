public class SeniorManager extends Manager{
    private String perfomanceRating;
    public SeniorManager(String name, int salary, String department, String perfomanceRating){
        super(name, salary, department);
        this.perfomanceRating = perfomanceRating;
    }
    @Override
    public void showDetails(){
              System.out.print("Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + this.getDepartment());
        if(this.getSalary() > 100000){
            System.out.println(", Perfomance Rating: " + perfomanceRating);
        } else {
        System.out.println(", Perfomance Rating: " + "Not Available");
        }
    }
}
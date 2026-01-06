public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }
    public int getYear(){
        return year;
    }
    public double getFee(){
        return fee;
    }

    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }

    @Override
    public String toString(){
        String msg = "Student[" + super.toString() + ",program = " + program + ", year = " + year + ", fee = " + fee + "]";
        return msg;
    }
    
    public static void main(String[] args){
        Student s = new Student("athar" , "okara" , "software engineering" , 2025, 146000);
        System.out.println(s);
    }
}
public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool(){
        return school;
    }
    public double getPay(){
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }
    public void setSchool(String school){
        this.school = school;
    }

    @Override
    public String toString(){
        String msg = "Staff[" + super.toString() + ", school = " + school + ", pay = " + pay + "]";
        return msg;
    }

    public static void main(String args[]){
        Staff s1 = new Staff("akbar" , "rehmat pura" , "M.C High" , 13000.00);
        System.out.println(s1);
    }

}
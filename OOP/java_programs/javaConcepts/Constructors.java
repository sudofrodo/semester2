public class Constructors{
    private int num1;
    private  int num2;
    public Constructors(){};
    public Constructors(int n){
        num1 = n;
    }
    public Constructors(int n, int n2){
        this(n);
        num2 = n2;
    }
    
    public Constructors(Constructors anotherObjectofthisClass){
        this(anotherObjectofthisClass.getNum1(), anotherObjectofthisClass.getNum2());
    }
    public static void main(String[] args) {
        Constructors c1 = new Constructors(10,20);
        Constructors c2 = new Constructors(c1);
        System.out.println(c1.getNum1()+ " " +c1.getNum2());
        System.out.println(c2.getNum1() + " "+ c2.getNum2());
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
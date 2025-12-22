public class Main{
    private int a;
    private int b;
    protected int c;
    public Main(){
        System.out.println("I am Inheritance Constructor");
    };
    public Main(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public void Display(){
        System.out.println("A: " + a + " B: " + b);
    }
}
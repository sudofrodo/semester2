public class Inheritance{
    private int a;
    protected int b;
    public Inheritance(){
        System.out.println("I am Inheritance Constructor");
    };
    public Inheritance(int a, int b){
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
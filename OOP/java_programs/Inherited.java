public class Inherited extends Inheritance{
    private int c;
    public Inherited(){};
    public Inherited(int a, int b){
        super(a,b);
    }
    public static void main(String[] args) {
        Inherited ab = new Inherited(10,20);
        ab.Display();
    }
    {
         super.Display();
    }
}
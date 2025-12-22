public class Inherited extends Main{
    private int d;
    public Inherited(){};
    public Inherited(int a, int b){
        super(a,b);
    }
    public Inherited(int a , int b, int d){
        super(a,b);
        this.d = d;
    }
    public static void main(String[] args) {
        Inherited ab = new Inherited(10,20);
        ab.c = 34; //able to do this because c is protected in parent class.
        System.out.println(ab.c);
        ab.Display(); //parent method being called.
    }
    {
         super.Display();
    }
}